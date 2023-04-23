package ma.zynerator.ecom.service.impl.admin;

import ma.zynerator.ecom.bean.core.Purchase;
import ma.zynerator.ecom.bean.history.PurchaseHistory;
import ma.zynerator.ecom.dao.criteria.core.PurchaseCriteria;
import ma.zynerator.ecom.dao.criteria.history.PurchaseHistoryCriteria;
import ma.zynerator.ecom.dao.facade.core.PurchaseDao;
import ma.zynerator.ecom.dao.facade.history.PurchaseHistoryDao;
import ma.zynerator.ecom.dao.specification.core.PurchaseSpecification;
import ma.zynerator.ecom.service.facade.admin.PurchaseAdminService;
import ma.zynerator.ecom.zynerator.service.AbstractServiceImpl;
import ma.zynerator.ecom.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.zynerator.ecom.bean.core.PurchaseItem;

import ma.zynerator.ecom.service.facade.admin.ClientAdminService ;
import ma.zynerator.ecom.service.facade.admin.PurchaseItemAdminService ;


import java.util.List;
@Service
public class PurchaseAdminServiceImpl extends AbstractServiceImpl<Purchase,PurchaseHistory, PurchaseCriteria, PurchaseHistoryCriteria, PurchaseDao,
PurchaseHistoryDao> implements PurchaseAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Purchase create(Purchase t) {
        super.create(t);
        if (t.getPurchaseItems() != null) {
                t.getPurchaseItems().forEach(element-> {
                    element.setPurchase(t);
                    purchaseItemService.create(element);
            });
        }
        return t;
    }

    public Purchase findWithAssociatedLists(Long id){
        Purchase result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPurchaseItems(purchaseItemService.findByPurchaseId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        purchaseItemService.deleteByPurchaseId(id);
    }


    public void updateWithAssociatedLists(Purchase purchase){
    if(purchase !=null && purchase.getId() != null){
            List<List<PurchaseItem>> resultPurchaseItems= purchaseItemService.getToBeSavedAndToBeDeleted(purchaseItemService.findByPurchaseId(purchase.getId()),purchase.getPurchaseItems());
            purchaseItemService.delete(resultPurchaseItems.get(1));
            ListUtil.emptyIfNull(resultPurchaseItems.get(0)).forEach(e -> e.setPurchase(purchase));
            purchaseItemService.update(resultPurchaseItems.get(0),true);
    }
    }

    public Purchase findByReferenceEntity(Purchase t){
        return  dao.findByReference(t.getReference());
    }

    public List<Purchase> findByClientId(Long id){
        return dao.findByClientId(id);
    }
    public int deleteByClientId(Long id){
        return dao.deleteByClientId(id);
    }

    public void configure() {
        super.configure(Purchase.class,PurchaseHistory.class, PurchaseHistoryCriteria.class, PurchaseSpecification.class);
    }

    @Autowired
    private ClientAdminService clientService ;
    @Autowired
    private PurchaseItemAdminService purchaseItemService ;
    public PurchaseAdminServiceImpl(PurchaseDao dao, PurchaseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ma.zynerator.ecom.service.impl.admin;

import ma.zynerator.ecom.bean.core.PurchaseItem;
import ma.zynerator.ecom.bean.history.PurchaseItemHistory;
import ma.zynerator.ecom.dao.criteria.core.PurchaseItemCriteria;
import ma.zynerator.ecom.dao.criteria.history.PurchaseItemHistoryCriteria;
import ma.zynerator.ecom.dao.facade.core.PurchaseItemDao;
import ma.zynerator.ecom.dao.facade.history.PurchaseItemHistoryDao;
import ma.zynerator.ecom.dao.specification.core.PurchaseItemSpecification;
import ma.zynerator.ecom.service.facade.admin.PurchaseItemAdminService;
import ma.zynerator.ecom.zynerator.service.AbstractServiceImpl;
import ma.zynerator.ecom.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.zynerator.ecom.service.facade.admin.ProductAdminService ;
import ma.zynerator.ecom.service.facade.admin.PurchaseAdminService ;


import java.util.List;
@Service
public class PurchaseItemAdminServiceImpl extends AbstractServiceImpl<PurchaseItem,PurchaseItemHistory, PurchaseItemCriteria, PurchaseItemHistoryCriteria, PurchaseItemDao,
PurchaseItemHistoryDao> implements PurchaseItemAdminService {



    public List<PurchaseItem> findByProductId(Long id){
        return dao.findByProductId(id);
    }
    public int deleteByProductId(Long id){
        return dao.deleteByProductId(id);
    }
    public List<PurchaseItem> findByPurchaseId(Long id){
        return dao.findByPurchaseId(id);
    }
    public int deleteByPurchaseId(Long id){
        return dao.deleteByPurchaseId(id);
    }

    public void configure() {
        super.configure(PurchaseItem.class,PurchaseItemHistory.class, PurchaseItemHistoryCriteria.class, PurchaseItemSpecification.class);
    }

    @Autowired
    private ProductAdminService productService ;
    @Autowired
    private PurchaseAdminService purchaseService ;
    public PurchaseItemAdminServiceImpl(PurchaseItemDao dao, PurchaseItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
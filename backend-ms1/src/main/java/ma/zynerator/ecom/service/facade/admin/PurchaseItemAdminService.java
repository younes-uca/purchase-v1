package ma.zynerator.ecom.service.facade.admin;

import java.util.List;
import ma.zynerator.ecom.bean.core.PurchaseItem;
import ma.zynerator.ecom.dao.criteria.core.PurchaseItemCriteria;
import ma.zynerator.ecom.dao.criteria.history.PurchaseItemHistoryCriteria;
import ma.zynerator.ecom.zynerator.service.IService;

public interface PurchaseItemAdminService extends  IService<PurchaseItem,PurchaseItemCriteria, PurchaseItemHistoryCriteria>  {

    List<PurchaseItem> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseItem> findByPurchaseId(Long id);
    int deleteByPurchaseId(Long id);



}

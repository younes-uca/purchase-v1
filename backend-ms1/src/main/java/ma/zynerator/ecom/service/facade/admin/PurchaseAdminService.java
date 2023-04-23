package ma.zynerator.ecom.service.facade.admin;

import java.util.List;
import ma.zynerator.ecom.bean.core.Purchase;
import ma.zynerator.ecom.dao.criteria.core.PurchaseCriteria;
import ma.zynerator.ecom.dao.criteria.history.PurchaseHistoryCriteria;
import ma.zynerator.ecom.zynerator.service.IService;

public interface PurchaseAdminService extends  IService<Purchase,PurchaseCriteria, PurchaseHistoryCriteria>  {

    List<Purchase> findByClientId(Long id);
    int deleteByClientId(Long id);



}

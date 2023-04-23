package  ma.zynerator.ecom.dao.specification.history;

import ma.zynerator.ecom.zynerator.specification.AbstractHistorySpecification;
import ma.zynerator.ecom.dao.criteria.history.PurchaseHistoryCriteria;
import ma.zynerator.ecom.bean.history.PurchaseHistory;


public class PurchaseHistorySpecification extends AbstractHistorySpecification<PurchaseHistoryCriteria, PurchaseHistory> {

    public PurchaseHistorySpecification(PurchaseHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseHistorySpecification(PurchaseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

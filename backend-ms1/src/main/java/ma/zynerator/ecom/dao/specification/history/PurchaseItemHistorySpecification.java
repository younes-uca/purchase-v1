package  ma.zynerator.ecom.dao.specification.history;

import ma.zynerator.ecom.zynerator.specification.AbstractHistorySpecification;
import ma.zynerator.ecom.dao.criteria.history.PurchaseItemHistoryCriteria;
import ma.zynerator.ecom.bean.history.PurchaseItemHistory;


public class PurchaseItemHistorySpecification extends AbstractHistorySpecification<PurchaseItemHistoryCriteria, PurchaseItemHistory> {

    public PurchaseItemHistorySpecification(PurchaseItemHistoryCriteria criteria) {
        super(criteria);
    }

    public PurchaseItemHistorySpecification(PurchaseItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

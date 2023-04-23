package  ma.zynerator.ecom.dao.specification.history;

import ma.zynerator.ecom.zynerator.specification.AbstractHistorySpecification;
import ma.zynerator.ecom.dao.criteria.history.ProductHistoryCriteria;
import ma.zynerator.ecom.bean.history.ProductHistory;


public class ProductHistorySpecification extends AbstractHistorySpecification<ProductHistoryCriteria, ProductHistory> {

    public ProductHistorySpecification(ProductHistoryCriteria criteria) {
        super(criteria);
    }

    public ProductHistorySpecification(ProductHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

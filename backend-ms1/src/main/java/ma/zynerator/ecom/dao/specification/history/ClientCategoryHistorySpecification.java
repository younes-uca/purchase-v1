package  ma.zynerator.ecom.dao.specification.history;

import ma.zynerator.ecom.zynerator.specification.AbstractHistorySpecification;
import ma.zynerator.ecom.dao.criteria.history.ClientCategoryHistoryCriteria;
import ma.zynerator.ecom.bean.history.ClientCategoryHistory;


public class ClientCategoryHistorySpecification extends AbstractHistorySpecification<ClientCategoryHistoryCriteria, ClientCategoryHistory> {

    public ClientCategoryHistorySpecification(ClientCategoryHistoryCriteria criteria) {
        super(criteria);
    }

    public ClientCategoryHistorySpecification(ClientCategoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

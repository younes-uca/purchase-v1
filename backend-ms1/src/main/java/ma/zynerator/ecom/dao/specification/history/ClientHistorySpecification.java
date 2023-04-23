package  ma.zynerator.ecom.dao.specification.history;

import ma.zynerator.ecom.zynerator.specification.AbstractHistorySpecification;
import ma.zynerator.ecom.dao.criteria.history.ClientHistoryCriteria;
import ma.zynerator.ecom.bean.history.ClientHistory;


public class ClientHistorySpecification extends AbstractHistorySpecification<ClientHistoryCriteria, ClientHistory> {

    public ClientHistorySpecification(ClientHistoryCriteria criteria) {
        super(criteria);
    }

    public ClientHistorySpecification(ClientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

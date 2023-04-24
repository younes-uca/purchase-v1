package  ma.zynerator.ecom.dao.specification.core;

import ma.zynerator.ecom.zynerator.specification.AbstractSpecification;
import ma.zynerator.ecom.dao.criteria.core.PurchaseCriteria;
import ma.zynerator.ecom.bean.core.Purchase;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PurchaseSpecification extends  AbstractSpecification<PurchaseCriteria, Purchase>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("purchaseDate", criteria.getPurchaseDate(), criteria.getPurchaseDateFrom(), criteria.getPurchaseDateTo());
        addPredicateBigDecimal("total", criteria.getTotal(), criteria.getTotalMin(), criteria.getTotalMax());
        addPredicateFk("client","id", criteria.getClient()==null?null:criteria.getClient().getId());
        addPredicateFk("client","email", criteria.getClient()==null?null:criteria.getClient().getEmail());
        addPredicateFk("client","id", criteria.getClients());
    }

    public PurchaseSpecification(PurchaseCriteria criteria) {
        super(criteria);
    }

    public PurchaseSpecification(PurchaseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

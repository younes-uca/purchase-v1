package  ma.zynerator.ecom.dao.specification.core;

import ma.zynerator.ecom.zynerator.specification.AbstractSpecification;
import ma.zynerator.ecom.dao.criteria.core.ClientCategoryCriteria;
import ma.zynerator.ecom.bean.core.ClientCategory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClientCategorySpecification extends  AbstractSpecification<ClientCategoryCriteria, ClientCategory>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("label", criteria.getLabel(),criteria.getLabelLike());
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
    }

    public ClientCategorySpecification(ClientCategoryCriteria criteria) {
        super(criteria);
    }

    public ClientCategorySpecification(ClientCategoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
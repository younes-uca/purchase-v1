package ma.zynerator.ecom.dao.facade.core;


import ma.zynerator.ecom.zynerator.repository.AbstractRepository;
import ma.zynerator.ecom.bean.core.Purchase;
import org.springframework.stereotype.Repository;
import ma.zynerator.ecom.bean.core.Purchase;
import java.util.List;


@Repository
public interface PurchaseDao extends AbstractRepository<Purchase,Long>  {
    Purchase findByReference(String reference);
    int deleteByReference(String reference);

    List<Purchase> findByClientId(Long id);
    int deleteByClientId(Long id);

}

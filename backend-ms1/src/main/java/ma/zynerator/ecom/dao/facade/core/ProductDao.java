package ma.zynerator.ecom.dao.facade.core;


import ma.zynerator.ecom.zynerator.repository.AbstractRepository;
import ma.zynerator.ecom.bean.core.Product;
import org.springframework.stereotype.Repository;
import ma.zynerator.ecom.bean.core.Product;
import java.util.List;


@Repository
public interface ProductDao extends AbstractRepository<Product,Long>  {
    Product findByReference(String reference);
    int deleteByReference(String reference);


}

package ma.zynerator.ecom.dao.facade.core;


import ma.zynerator.ecom.zynerator.repository.AbstractRepository;
import ma.zynerator.ecom.bean.core.ClientCategory;
import org.springframework.stereotype.Repository;
import ma.zynerator.ecom.bean.core.ClientCategory;
import java.util.List;


@Repository
public interface ClientCategoryDao extends AbstractRepository<ClientCategory,Long>  {
    ClientCategory findByReference(String reference);
    int deleteByReference(String reference);


}

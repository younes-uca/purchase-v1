package ma.zynerator.ecom.dao.facade.core;


import ma.zynerator.ecom.zynerator.repository.AbstractRepository;
import ma.zynerator.ecom.bean.core.Client;
import org.springframework.stereotype.Repository;
import ma.zynerator.ecom.bean.core.Client;
import java.util.List;


@Repository
public interface ClientDao extends AbstractRepository<Client,Long>  {
    Client findByEmail(String email);
    int deleteByEmail(String email);

    List<Client> findByClientCategoryId(Long id);
    int deleteByClientCategoryId(Long id);

}

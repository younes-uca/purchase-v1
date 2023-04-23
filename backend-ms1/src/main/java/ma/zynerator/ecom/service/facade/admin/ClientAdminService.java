package ma.zynerator.ecom.service.facade.admin;

import java.util.List;
import ma.zynerator.ecom.bean.core.Client;
import ma.zynerator.ecom.dao.criteria.core.ClientCriteria;
import ma.zynerator.ecom.dao.criteria.history.ClientHistoryCriteria;
import ma.zynerator.ecom.zynerator.service.IService;

public interface ClientAdminService extends  IService<Client,ClientCriteria, ClientHistoryCriteria>  {

    List<Client> findByClientCategoryId(Long id);
    int deleteByClientCategoryId(Long id);



}

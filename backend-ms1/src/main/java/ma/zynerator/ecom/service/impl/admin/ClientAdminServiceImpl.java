package ma.zynerator.ecom.service.impl.admin;

import ma.zynerator.ecom.bean.core.Client;
import ma.zynerator.ecom.bean.history.ClientHistory;
import ma.zynerator.ecom.dao.criteria.core.ClientCriteria;
import ma.zynerator.ecom.dao.criteria.history.ClientHistoryCriteria;
import ma.zynerator.ecom.dao.facade.core.ClientDao;
import ma.zynerator.ecom.dao.facade.history.ClientHistoryDao;
import ma.zynerator.ecom.dao.specification.core.ClientSpecification;
import ma.zynerator.ecom.service.facade.admin.ClientAdminService;
import ma.zynerator.ecom.zynerator.service.AbstractServiceImpl;
import ma.zynerator.ecom.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.zynerator.ecom.service.facade.admin.ClientCategoryAdminService ;


import java.util.List;
@Service
public class ClientAdminServiceImpl extends AbstractServiceImpl<Client,ClientHistory, ClientCriteria, ClientHistoryCriteria, ClientDao,
ClientHistoryDao> implements ClientAdminService {


    public Client findByReferenceEntity(Client t){
        return  dao.findByEmail(t.getEmail());
    }

    public List<Client> findByClientCategoryId(Long id){
        return dao.findByClientCategoryId(id);
    }
    public int deleteByClientCategoryId(Long id){
        return dao.deleteByClientCategoryId(id);
    }

    public void configure() {
        super.configure(Client.class,ClientHistory.class, ClientHistoryCriteria.class, ClientSpecification.class);
    }

    @Autowired
    private ClientCategoryAdminService clientCategoryService ;
    public ClientAdminServiceImpl(ClientDao dao, ClientHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ma.zynerator.ecom.service.impl.admin;

import ma.zynerator.ecom.bean.core.ClientCategory;
import ma.zynerator.ecom.bean.history.ClientCategoryHistory;
import ma.zynerator.ecom.dao.criteria.core.ClientCategoryCriteria;
import ma.zynerator.ecom.dao.criteria.history.ClientCategoryHistoryCriteria;
import ma.zynerator.ecom.dao.facade.core.ClientCategoryDao;
import ma.zynerator.ecom.dao.facade.history.ClientCategoryHistoryDao;
import ma.zynerator.ecom.dao.specification.core.ClientCategorySpecification;
import ma.zynerator.ecom.service.facade.admin.ClientCategoryAdminService;
import ma.zynerator.ecom.zynerator.service.AbstractServiceImpl;
import ma.zynerator.ecom.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ClientCategoryAdminServiceImpl extends AbstractServiceImpl<ClientCategory,ClientCategoryHistory, ClientCategoryCriteria, ClientCategoryHistoryCriteria, ClientCategoryDao,
ClientCategoryHistoryDao> implements ClientCategoryAdminService {


    public ClientCategory findByReferenceEntity(ClientCategory t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(ClientCategory.class,ClientCategoryHistory.class, ClientCategoryHistoryCriteria.class, ClientCategorySpecification.class);
    }

    public ClientCategoryAdminServiceImpl(ClientCategoryDao dao, ClientCategoryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
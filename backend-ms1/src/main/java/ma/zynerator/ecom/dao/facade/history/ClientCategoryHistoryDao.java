package ma.zynerator.ecom.dao.facade.history;

import ma.zynerator.ecom.zynerator.repository.AbstractHistoryRepository;
import ma.zynerator.ecom.bean.history.ClientCategoryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCategoryHistoryDao extends AbstractHistoryRepository<ClientCategoryHistory,Long> {

}

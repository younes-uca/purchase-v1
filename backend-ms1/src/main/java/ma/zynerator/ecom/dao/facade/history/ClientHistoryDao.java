package ma.zynerator.ecom.dao.facade.history;

import ma.zynerator.ecom.zynerator.repository.AbstractHistoryRepository;
import ma.zynerator.ecom.bean.history.ClientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientHistoryDao extends AbstractHistoryRepository<ClientHistory,Long> {

}

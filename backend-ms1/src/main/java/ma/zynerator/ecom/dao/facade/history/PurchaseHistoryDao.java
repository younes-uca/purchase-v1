package ma.zynerator.ecom.dao.facade.history;

import ma.zynerator.ecom.zynerator.repository.AbstractHistoryRepository;
import ma.zynerator.ecom.bean.history.PurchaseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseHistoryDao extends AbstractHistoryRepository<PurchaseHistory,Long> {

}

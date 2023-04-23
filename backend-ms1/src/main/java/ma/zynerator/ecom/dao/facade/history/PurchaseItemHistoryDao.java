package ma.zynerator.ecom.dao.facade.history;

import ma.zynerator.ecom.zynerator.repository.AbstractHistoryRepository;
import ma.zynerator.ecom.bean.history.PurchaseItemHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseItemHistoryDao extends AbstractHistoryRepository<PurchaseItemHistory,Long> {

}

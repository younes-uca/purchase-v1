package ma.zynerator.ecom.dao.facade.history;

import ma.zynerator.ecom.zynerator.repository.AbstractHistoryRepository;
import ma.zynerator.ecom.bean.history.ProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductHistoryDao extends AbstractHistoryRepository<ProductHistory,Long> {

}

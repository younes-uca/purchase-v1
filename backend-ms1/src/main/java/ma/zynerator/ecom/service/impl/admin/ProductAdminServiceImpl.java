package ma.zynerator.ecom.service.impl.admin;

import ma.zynerator.ecom.bean.core.Product;
import ma.zynerator.ecom.bean.history.ProductHistory;
import ma.zynerator.ecom.dao.criteria.core.ProductCriteria;
import ma.zynerator.ecom.dao.criteria.history.ProductHistoryCriteria;
import ma.zynerator.ecom.dao.facade.core.ProductDao;
import ma.zynerator.ecom.dao.facade.history.ProductHistoryDao;
import ma.zynerator.ecom.dao.specification.core.ProductSpecification;
import ma.zynerator.ecom.service.facade.admin.ProductAdminService;
import ma.zynerator.ecom.zynerator.service.AbstractServiceImpl;
import ma.zynerator.ecom.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ProductAdminServiceImpl extends AbstractServiceImpl<Product,ProductHistory, ProductCriteria, ProductHistoryCriteria, ProductDao,
ProductHistoryDao> implements ProductAdminService {


    public Product findByReferenceEntity(Product t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Product.class,ProductHistory.class, ProductHistoryCriteria.class, ProductSpecification.class);
    }

    public ProductAdminServiceImpl(ProductDao dao, ProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
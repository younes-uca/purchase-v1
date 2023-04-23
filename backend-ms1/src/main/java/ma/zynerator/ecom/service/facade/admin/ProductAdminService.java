package ma.zynerator.ecom.service.facade.admin;

import java.util.List;
import ma.zynerator.ecom.bean.core.Product;
import ma.zynerator.ecom.dao.criteria.core.ProductCriteria;
import ma.zynerator.ecom.dao.criteria.history.ProductHistoryCriteria;
import ma.zynerator.ecom.zynerator.service.IService;

public interface ProductAdminService extends  IService<Product,ProductCriteria, ProductHistoryCriteria>  {




}

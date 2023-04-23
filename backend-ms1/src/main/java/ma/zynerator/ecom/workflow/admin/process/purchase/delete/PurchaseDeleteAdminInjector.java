package ma.zynerator.ecom.workflow.admin.process.purchase.delete;
import ma.zynerator.ecom.service.facade.admin.PurchaseAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PurchaseDeleteAdminInjector{

    @Bean
    public PurchaseDeleteAdminProcess purchaseDeleteAdmin(PurchaseAdminService service, PurchaseDeleteAdminConverter converter) {
        return new PurchaseDeleteAdminProcessImpl(service,converter);
    }

}

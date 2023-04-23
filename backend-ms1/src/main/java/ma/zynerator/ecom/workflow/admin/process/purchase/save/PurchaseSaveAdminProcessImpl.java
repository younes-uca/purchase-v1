package ma.zynerator.ecom.workflow.admin.process.purchase.save;
import ma.zynerator.ecom.service.facade.admin.PurchaseAdminService;

import ma.zynerator.ecom.zynerator.process.AbstractProcessImpl;
import ma.zynerator.ecom.zynerator.process.Result;
import ma.zynerator.ecom.bean.core.Purchase;

public class PurchaseSaveAdminProcessImpl extends AbstractProcessImpl<PurchaseSaveAdminInput, PurchaseSaveAdminOutput,  Purchase,  PurchaseSaveAdminConverter> implements PurchaseSaveAdminProcess {

    @Override
    public void init(PurchaseSaveAdminInput input, Purchase item) {

    }

    @Override
    public void validate(PurchaseSaveAdminInput input, Purchase item, Result<PurchaseSaveAdminInput, PurchaseSaveAdminOutput, Purchase> result) {
        
    }

    @Override
    public void run(PurchaseSaveAdminInput input, Purchase t, Result<PurchaseSaveAdminInput, PurchaseSaveAdminOutput, Purchase> result) {
        
    }
    


    private PurchaseAdminService service;
    public PurchaseSaveAdminProcessImpl(PurchaseAdminService service, PurchaseSaveAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}

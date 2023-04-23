package ma.zynerator.ecom.workflow.admin.process.purchase.save;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;

import ma.zynerator.ecom.ws.dto.PurchaseItemDto;
import ma.zynerator.ecom.ws.dto.ProductDto;
import ma.zynerator.ecom.ws.dto.ClientDto;
import ma.zynerator.ecom.zynerator.audit.Log;
import ma.zynerator.ecom.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zynerator.ecom.zynerator.process.AbstractProcessOutput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseSaveAdminOutput  extends AbstractProcessOutput {

     private String reference  ;
     private String purchaseDate ;
     private BigDecimal total  ;
     private String description  ;

    private ClientDto client ;

    private List<PurchaseItemDto> purchaseItems ;


    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getPurchaseDate(){
         return this.purchaseDate;
    }
    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    @Log
    public BigDecimal getTotal(){
        return this.total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public ClientDto getClient(){
        return this.client;
    }

    public void setClient(ClientDto client){
        this.client = client;
    }

    public List<PurchaseItemDto> getPurchaseItems(){
        return this.purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItemDto> purchaseItems){
        this.purchaseItems = purchaseItems;
    }
}

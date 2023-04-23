package  ma.zynerator.ecom.ws.dto;

import ma.zynerator.ecom.zynerator.audit.Log;
import ma.zynerator.ecom.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCategoryDto  extends AuditBaseDto {

    private String label  ;
    private String reference  ;




    public ClientCategoryDto(){
        super();
    }



    @Log
    public String getLabel(){
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }

    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }






}

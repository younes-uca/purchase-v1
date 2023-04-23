package  ma.zynerator.ecom.dao.criteria.core;


import ma.zynerator.ecom.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ClientCategoryCriteria extends  BaseCriteria  {

    private String label;
    private String labelLike;
    private String reference;
    private String referenceLike;



    public ClientCategoryCriteria(){}

    public String getLabel(){
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabelLike(){
        return this.labelLike;
    }
    public void setLabelLike(String labelLike){
        this.labelLike = labelLike;
    }

    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReferenceLike(){
        return this.referenceLike;
    }
    public void setReferenceLike(String referenceLike){
        this.referenceLike = referenceLike;
    }


}

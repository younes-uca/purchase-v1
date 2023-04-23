package ma.zynerator.ecom.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zynerator.ecom.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "client_category")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="client_category_seq",sequenceName="client_category_seq",allocationSize=1, initialValue = 1)
public class ClientCategory   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String label;
    @Column(length = 500)
    private String reference;



    public ClientCategory(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="client_category_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLabel(){
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Transient
    public String getLabel() {
        label = label;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientCategory clientCategory = (ClientCategory) o;
        return id != null && id.equals(clientCategory.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


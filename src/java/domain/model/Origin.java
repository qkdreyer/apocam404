package domain.model;
// Generated 9 nov. 2011 19:39:34 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Origin generated by hbm2java
 */
@Entity
@Table(name="ORIGIN"
    ,schema="JULIEN"
)
public class Origin  implements java.io.Serializable {


     private BigDecimal id;
     private String label;
     private Set students = new HashSet(0);

    public Origin() {
    }

	
    public Origin(BigDecimal id) {
        this.id = id;
    }
    public Origin(BigDecimal id, String label, Set students) {
       this.id = id;
       this.label = label;
       this.students = students;
    }
   
     @Id 
    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    
    @Column(name="LABEL", length=30)
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="origin")
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }




}



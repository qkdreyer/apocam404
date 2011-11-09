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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Status generated by hbm2java
 */
@Entity
@Table(name="STATUS"
    ,schema="JULIEN"
)
public class Status  implements java.io.Serializable {


     private BigDecimal id;
     private String label;
     private Set students = new HashSet(0);

    public Status() {
    }

	
    public Status(BigDecimal id) {
        this.id = id;
    }
    public Status(BigDecimal id, String label, Set students) {
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
    
    @Column(name="LABEL", length=20)
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="statuses")
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }




}


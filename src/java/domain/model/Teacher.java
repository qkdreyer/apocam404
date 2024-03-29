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
 * Teacher generated by hbm2java
 */
@Entity
@Table(name="TEACHER"
    ,schema="JULIEN"
)
public class Teacher  implements java.io.Serializable {


     private String id;
     private String lastname;
     private String firstname;
     private String sex;
     private String email;
     private String password;
     private BigDecimal rights;
     private Set ues = new HashSet(0);
     private Set stages = new HashSet(0);
     private Set ecues = new HashSet(0);
     private Set departments = new HashSet(0);

    public Teacher() {
    }

	
    public Teacher(String id) {
        this.id = id;
    }
    public Teacher(String id, String lastname, String firstname, String sex, String email, String password, BigDecimal rights, Set ues, Set stages, Set ecues, Set departments) {
       this.id = id;
       this.lastname = lastname;
       this.firstname = firstname;
       this.sex = sex;
       this.email = email;
       this.password = password;
       this.rights = rights;
       this.ues = ues;
       this.stages = stages;
       this.ecues = ecues;
       this.departments = departments;
    }
   
     @Id 
    
    @Column(name="ID", unique=true, nullable=false, length=20)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="LASTNAME", length=40)
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    @Column(name="FIRSTNAME", length=40)
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    @Column(name="SEX", length=2)
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Column(name="EMAIL", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="PASSWORD", length=20)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="RIGHTS", precision=22, scale=0)
    public BigDecimal getRights() {
        return this.rights;
    }
    
    public void setRights(BigDecimal rights) {
        this.rights = rights;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="teacher")
    public Set getUes() {
        return this.ues;
    }
    
    public void setUes(Set ues) {
        this.ues = ues;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="teacher")
    public Set getStages() {
        return this.stages;
    }
    
    public void setStages(Set stages) {
        this.stages = stages;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="teacher")
    public Set getEcues() {
        return this.ecues;
    }
    
    public void setEcues(Set ecues) {
        this.ecues = ecues;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="teacher")
    public Set getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set departments) {
        this.departments = departments;
    }




}



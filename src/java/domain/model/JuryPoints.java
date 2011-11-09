package domain.model;
// Generated 9 nov. 2011 19:39:34 by Hibernate Tools 3.2.1.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * JuryPoints generated by hbm2java
 */
@Entity
@Table(name="JURY_POINTS"
    ,schema="JULIEN"
)
public class JuryPoints  implements java.io.Serializable {


     private JuryPointsId id;
     private Student student;
     private Semester semester;
     private Byte juryPoints;

    public JuryPoints() {
    }

	
    public JuryPoints(JuryPointsId id, Student student, Semester semester) {
        this.id = id;
        this.student = student;
        this.semester = semester;
    }
    public JuryPoints(JuryPointsId id, Student student, Semester semester, Byte juryPoints) {
       this.id = id;
       this.student = student;
       this.semester = semester;
       this.juryPoints = juryPoints;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="studentNumber", column=@Column(name="STUDENT_NUMBER", nullable=false, precision=8, scale=0) ), 
        @AttributeOverride(name="semesterCode", column=@Column(name="SEMESTER_CODE", nullable=false, length=10) ) } )
    public JuryPointsId getId() {
        return this.id;
    }
    
    public void setId(JuryPointsId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STUDENT_NUMBER", nullable=false, insertable=false, updatable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SEMESTER_CODE", nullable=false, insertable=false, updatable=false)
    public Semester getSemester() {
        return this.semester;
    }
    
    public void setSemester(Semester semester) {
        this.semester = semester;
    }
    
    @Column(name="JURY_POINTS", precision=2, scale=0)
    public Byte getJuryPoints() {
        return this.juryPoints;
    }
    
    public void setJuryPoints(Byte juryPoints) {
        this.juryPoints = juryPoints;
    }




}



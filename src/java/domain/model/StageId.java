package domain.model;
// Generated 9 nov. 2011 19:39:34 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StageId generated by hbm2java
 */
@Embeddable
public class StageId  implements java.io.Serializable {


     private String departmentMnemo;
     private BigDecimal stageNumber;

    public StageId() {
    }

    public StageId(String departmentMnemo, BigDecimal stageNumber) {
       this.departmentMnemo = departmentMnemo;
       this.stageNumber = stageNumber;
    }
   

    @Column(name="DEPARTMENT_MNEMO", nullable=false, length=10)
    public String getDepartmentMnemo() {
        return this.departmentMnemo;
    }
    
    public void setDepartmentMnemo(String departmentMnemo) {
        this.departmentMnemo = departmentMnemo;
    }

    @Column(name="STAGE_NUMBER", nullable=false, precision=22, scale=0)
    public BigDecimal getStageNumber() {
        return this.stageNumber;
    }
    
    public void setStageNumber(BigDecimal stageNumber) {
        this.stageNumber = stageNumber;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StageId) ) return false;
		 StageId castOther = ( StageId ) other; 
         
		 return ( (this.getDepartmentMnemo()==castOther.getDepartmentMnemo()) || ( this.getDepartmentMnemo()!=null && castOther.getDepartmentMnemo()!=null && this.getDepartmentMnemo().equals(castOther.getDepartmentMnemo()) ) )
 && ( (this.getStageNumber()==castOther.getStageNumber()) || ( this.getStageNumber()!=null && castOther.getStageNumber()!=null && this.getStageNumber().equals(castOther.getStageNumber()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDepartmentMnemo() == null ? 0 : this.getDepartmentMnemo().hashCode() );
         result = 37 * result + ( getStageNumber() == null ? 0 : this.getStageNumber().hashCode() );
         return result;
   }   


}



package mapping;
// Generated May 13, 2015 4:10:55 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ProjEmpId generated by hbm2java
 */
public class ProjEmpId  implements java.io.Serializable {


     private BigDecimal idProjet;
     private BigDecimal matricule;

    public ProjEmpId() {
    }

    public ProjEmpId(BigDecimal idProjet, BigDecimal matricule) {
       this.idProjet = idProjet;
       this.matricule = matricule;
    }
   
    public BigDecimal getIdProjet() {
        return this.idProjet;
    }
    
    public void setIdProjet(BigDecimal idProjet) {
        this.idProjet = idProjet;
    }
    public BigDecimal getMatricule() {
        return this.matricule;
    }
    
    public void setMatricule(BigDecimal matricule) {
        this.matricule = matricule;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProjEmpId) ) return false;
		 ProjEmpId castOther = ( ProjEmpId ) other; 
         
		 return ( (this.getIdProjet()==castOther.getIdProjet()) || ( this.getIdProjet()!=null && castOther.getIdProjet()!=null && this.getIdProjet().equals(castOther.getIdProjet()) ) )
 && ( (this.getMatricule()==castOther.getMatricule()) || ( this.getMatricule()!=null && castOther.getMatricule()!=null && this.getMatricule().equals(castOther.getMatricule()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdProjet() == null ? 0 : this.getIdProjet().hashCode() );
         result = 37 * result + ( getMatricule() == null ? 0 : this.getMatricule().hashCode() );
         return result;
   }   


}


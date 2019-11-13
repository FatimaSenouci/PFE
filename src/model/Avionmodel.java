
package model;

/**
 *
 * @author hp
 */
public class Avionmodel {
    private int idavion;
          private String nom_avion;
          private int  capacité;
          
           public Avionmodel(int idavion , String nom_avion ,int capacité){
        
        super();
        this.idavion=idavion;
        this.nom_avion= nom_avion;
        this.capacité = capacité;
       
    }
    public Avionmodel(){
        
       
    }

    public int getIdavion() {
        return idavion;
    }

    public void setIdavion(int idavion) {
        this.idavion = idavion;
    }

    public String getNom_avion() {
        return nom_avion;
    }

    public void setNom_avion(String nom_avion) {
        this.nom_avion = nom_avion;
    }

    public int getCapacité() {
        return capacité;
    }

    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }
    
    
}

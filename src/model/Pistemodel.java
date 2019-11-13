
package model;

public class Pistemodel {
          private int idpiste;
          private String type;
          private int  nombre;
    
    
     public Pistemodel(int idpiste , String type ,int nombre){
        
        super();
        this.idpiste=idpiste;
        this.type= type;
        this.nombre = nombre;
       
    }
    public Pistemodel(){
        
       
    }

    public Pistemodel(int aInt, String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdpiste() {
        return idpiste;
    }

    public void setIdpiste(int idpiste) {
        this.idpiste = idpiste;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }    
}

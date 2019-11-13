
package model;


public class Volmodel {
     private int idvol;
          private String ddd;
          private String hdd;
          private String dda;
          private String hda;
          
           public Volmodel(int idvol , String ddd ,String hdd,String dda,String hda){
        
        super();
        this.idvol=idvol;
        this.ddd= ddd;
        this.hdd = hdd;
        this.dda = dda;
        this.hda = hda;
       
    }
    public Volmodel(){
        
       
    }

          

    public int getIdvol() {
        return idvol;
    }

    public void setIdvol(int idvol) {
        this.idvol = idvol;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getDda() {
        return dda;
    }

    public void setDda(String dda) {
        this.dda = dda;
    }

    public String getHda() {
        return hda;
    }

    public void setHda(String hda) {
        this.hda = hda;
    }
          
    
}

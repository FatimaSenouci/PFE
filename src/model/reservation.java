/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp
 */
public class reservation {
    private String Bnom ;
      private String Bprenom ;
        private String NbValise ;
          private String Vdarrive ;
            private String Vdepart ;
              private String Bpassport ;
              
              public reservation() {}

    public reservation(String Bnom, String Bprenom, String NbValise, String Vdarrive, String Vdepart, String Bpassport) {
        this.Bnom = Bnom;
        this.Bprenom = Bprenom;
        this.NbValise = NbValise;
        this.Vdarrive = Vdarrive;
        this.Vdepart = Vdepart;
        this.Bpassport = Bpassport;
    }
              

    public String getBnom() {
        return Bnom;
    }

    public void setBnom(String Bnom) {
        this.Bnom = Bnom;
    }

    public String getBprenom() {
        return Bprenom;
    }

    public void setBprenom(String Bprenom) {
        this.Bprenom = Bprenom;
    }

    public String getNbValise() {
        return NbValise;
    }

    public void setNbValise(String NbValise) {
        this.NbValise = NbValise;
    }

    public String getVdarrive() {
        return Vdarrive;
    }

    public void setVdarrive(String Vdarrive) {
        this.Vdarrive = Vdarrive;
    }

    public String getVdepart() {
        return Vdepart;
    }

    public void setVdepart(String Vdepart) {
        this.Vdepart = Vdepart;
    }

    public String getBpassport() {
        return Bpassport;
    }

    public void setBpassport(String Bpassport) {
        this.Bpassport = Bpassport;
    }
    
    
}

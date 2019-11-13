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
public class TableLoad {
    String DateT;
    String FlightT;
    String PlaneT;
    String PisteT;
    String HT;
   String CT;
   
   
    public TableLoad(String DateT, String FlightT, String PlaneT, String PisteT, String HT, String CT) {
        
         super();
        this.DateT = DateT;
        this.FlightT = FlightT;
        this.PlaneT = PlaneT;
        this.PisteT = PisteT;
        this.HT = HT;
        this.CT = CT;
    }
    public TableLoad(){
        
    }
  
   

    public String getDateT() {
        return DateT;
    }

    public void setDateT(String DateT) {
        this.DateT = DateT;
    }

    public String getFlightT() {
        return FlightT;
    }

    public void setFlightT(String FlightT) {
        this.FlightT = FlightT;
    }

    public String getPlaneT() {
        return PlaneT;
    }

    public void setPlaneT(String PlaneT) {
        this.PlaneT = PlaneT;
    }

    public String getPisteT() {
        return PisteT;
    }

    public void setPisteT(String PistT) {
        this.PisteT = PistT;
    }

    public String getHT() {
        return HT;
    }

    public void setHT(String HT) {
        this.HT = HT;
    }

    public String getCT() {
        return CT;
    }

    public void setCT(String CT) {
        this.CT = CT;
    }
  
    
    
}

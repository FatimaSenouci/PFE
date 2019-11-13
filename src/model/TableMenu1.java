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
public class TableMenu1 {
     private int trackidT;
     private String typeidT;

    public TableMenu1(int trackidT, String typeidT) {
        
        super();
        this.trackidT = trackidT;
        this.typeidT = typeidT;
    }
public TableMenu1(){
    
}
   
    public int getTrackidT() {
        return trackidT;
    }

    public void setTrackidT(int trackidT) {
        this.trackidT = trackidT;
    }

    public String getTypeidT() {
        return typeidT;
    }

    public void setTypeidT(String typeidT) {
        this.typeidT = typeidT;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.control.CheckBox;

/**
 *
 * @author hp
 */
public class TableSetter {
    int trackid2;
    String type2id;
    CheckBox free;
    CheckBox occupied;
        
    public TableSetter(int trackid2, String type2id, CheckBox free, CheckBox occupied) {
        this.trackid2 = trackid2;
        this.type2id = type2id;
        this.free = free;
        this.occupied = occupied;
         
    }
    public TableSetter(){
        
    }

    public int getTrackid2() {
        return trackid2;
    }

    public void setTrackid2(int trackid2) {
        this.trackid2 = trackid2;
    }

    public String getType2id() {
        return type2id;
    }

    public void setType2id(String type2id) {
        this.type2id = type2id;
    }

    public CheckBox getFree() {
        return free;
    }

    public void setFree(CheckBox free) {
        this.free = free;
    }

    public CheckBox getOccupied() {
        return occupied;
    }

    public void setOccupied(CheckBox occupied) {
        this.occupied = occupied;
    }
    
    
}

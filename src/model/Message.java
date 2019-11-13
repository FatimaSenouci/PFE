/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author hp
 */
public class Message {
    
    private int id_sender;
    private int id_receiver;
    private String message;
    private Date date; 

    public Message(int id_sender, int id_receiver, String message, Date date) {
        this.id_sender = id_sender;
        this.id_receiver = id_receiver;
        this.message = message;
        this.date = date;
    }

    public void setId_sender(int id_sender) {
        this.id_sender = id_sender;
    }

    public void setId_receiver(int id_receiver) {
        this.id_receiver = id_receiver;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId_sender() {
        return id_sender;
    }

    public int getId_receiver() {
        return id_receiver;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
    
}

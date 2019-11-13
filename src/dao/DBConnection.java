package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Pistemodel;
import model.Avionmodel;
import model.Message;
import model.Stripmodel;

public class DBConnection {

    // Information of Database
    private final static String USERNAME = "root";
    private final static String PASSWORD = "";
    private final static String URL = "127.0.0.1";
    private final static int PORT = 3306;
    private final static String DB_NAME = "aeroport";

    // Connection
    // ObservableList<pistes> produis = FXCollections.observableArrayList();
    public static Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + URL + ":" + PORT + "/" + DB_NAME, USERNAME, PASSWORD);
        } catch (SQLException se) {
            se.printStackTrace();
        }

    }

    public static int checkLogin(String username, String password, boolean isAdmin) throws SQLException {
        Connection con = DBConnection.con;
        if (con == null) {
            return -1;
        }
        String tableName;
        if (isAdmin) {
            tableName = "admin";
        } else {
            tableName = "controleur";
        }

        String sql = "SELECT * FROM " + tableName + " WHERE username=? AND password=? ";
        try {
            PreparedStatement prest = con.prepareCall(sql);
            prest.setString(1, username);
            prest.setString(2, password);
            ResultSet rs = prest.executeQuery();
            while (rs.next()) {
                return 0;
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return 1;
    }

    public void insertPiste(Pistemodel pistes) {

        String sql = "INSERT INTO piste VALUES(?, ?, ?);";
        Connection con = DBConnection.con;
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setInt(1, pistes.getIdpiste());
            prest.setString(2, pistes.getType());
            prest.setInt(3, pistes.getNombre());

            prest.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
         public void deletePiste(Pistemodel pistes)  {
         String sql = "DELETE FROM piste WHERE idpiste = ?";
         Connection con = DBConnection.con;
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setInt(1, pistes.getIdpiste());  
            prest.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      
        
         }
        
    public void insertAvion(Avionmodel avions) {

        String sql = "INSERT INTO avion VALUES(?, ?, ?);";
        Connection con = DBConnection.con;
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setInt(1, avions.getIdavion());
            prest.setString(2, avions.getNom_avion());
            prest.setInt(3, avions.getCapacité());

            prest.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
           
    public void deleteAvion(Avionmodel avions) {

       String sql = "DELETE FROM avion WHERE idavion = ?";
        Connection con = DBConnection.con;
        try {
            PreparedStatement prest = con.prepareStatement(sql);
            prest.setInt(1, avions.getIdavion());
        

            prest.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
     public void insertStrip(Stripmodel strips) {

        String sql = "INSERT INTO stripb VALUES(?, ?, ?, ?, ?, ?);";
        Connection con = DBConnection.con;
        try {
            PreparedStatement prest = con.prepareStatement(sql);
           
            prest.setString(1, strips.getId1());
            prest.setString(2, strips.getId2());
            prest.setString(3, strips.getId3());
            prest.setString(4, strips.getId4());
            prest.setString(5, strips.getId5());
            prest.setString(6, strips.getId7());

            prest.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
     
     public void insertMessage(Message message) {

        String sql = "INSERT INTO messages VALUES(?, ?, ?, ?, ?);";
        Connection con = DBConnection.con;
        try {
            PreparedStatement prest = con.prepareStatement(sql);
           
        
            prest.setString(1,null );
            prest.setInt(2, message.getId_sender());
            prest.setInt(3, message.getId_receiver());
            prest.setString(4, message.getMessage());
            prest.setDate(5, message.getDate());

            prest.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

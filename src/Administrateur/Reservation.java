/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrateur;



import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import dao.DBConnection;
import static dao.DBConnection.con;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import model.reservation;

/**
 * FXML Controller class
 *
 * @author fatima
 */
public class Reservation implements Initializable {

    @FXML
    private JFXTextField Bprenom;
    @FXML
    private JFXComboBox<?> ComboEtat;
    @FXML
    private JFXTextField NbValise;
    @FXML
    private JFXTextField Vdarrive;
    @FXML
    private JFXDatePicker DateR;
    @FXML
    private JFXTextField Bnom;
    @FXML
    private JFXTextField Bpassport;
    @FXML
    private JFXComboBox<?> ComboClass;
    @FXML
    private JFXTextField Vdepart;
    @FXML
    private JFXDatePicker DateD;
    @FXML
    private JFXCheckBox Espace;
    @FXML
    private JFXCheckBox CB;
    @FXML
    private JFXCheckBox Visa;
    @FXML
    private JFXCheckBox Check;
    @FXML
    private JFXTextField Code;
    @FXML
    private Label typepayer;

    ObservableList<reservation> reserve = FXCollections.observableArrayList();
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
         try{
            
            Connection con = null;
            
            String sql = "SELECT * FROM reservation "; 
            con = DBConnection.con;
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rss = ps.executeQuery();
            
            while(rss.next()){
                
                reserve.add(new reservation(rss.getString(1),rss.getString(2),rss.getString(3),rss.getString(4),rss.getString(5),rss.getString(6)));
            }
//           con.close();   
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
        
    }

    @FXML
    private void BtnReserver(ActionEvent event) {
            
        try{
         String query= "INSERT INTO reservation (nom,prenom,passeport,valise,depart,arrive) VALUES (?,?,?,?,?,?);";
           PreparedStatement prest = con.prepareStatement(query);
           
            prest.setString(1, Bnom.getText());
            prest.setString(2, Bprenom.getText());
            //prest.setString(3, ComboClass.getTypeSelector());
           // prest.setString(4, ComboEtat.getTypeSelector());
           // prest.setString(5, DateD.getUserAgentStylesheet());
           // prest.setString(6, DateR.getUserAgentStylesheet());
//             prest.setString(3, typepayer.getText());
             prest.setString(3, Bpassport.getText());
              prest.setString(4, NbValise.getText());
               prest.setString(5, Vdepart.getText());
                prest.setString(6, Vdarrive.getText());
            
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("information de reservation");
            alert.setHeaderText(null);
            alert.setContentText("Vous avez reservÃ© avec succÃ©e");
            alert.showAndWait();
            
           
           prest.execute();
           prest.close();
           
           
       }catch(Exception ex){
           ex.printStackTrace();
       }
        // new  DBConnection().SaveData(ReservationSetter);
        
        
        
        
        
    }

    @FXML
    private void BtnImprimer(ActionEvent event) {
    }


    @FXML
    private void CheckEvent3(ActionEvent event) {
        int count3=0;
        String message3="";
        
          if (Espace.isSelected()){
            count3++;
            message3+=Espace.getText()+"\n";
            
        }
            if (CB.isSelected()){
            count3++;
            message3+=CB.getText()+"\n";
            
        }
             if (Visa.isSelected()){
            count3++;
            message3+=Visa.getText()+"\n";
            
        }
              if (Check.isSelected()){
            count3++;
            message3+=Check.getText()+"\n";
            
        }
     
        typepayer.setText(message3);
        
    }
    
}

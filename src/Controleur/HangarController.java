/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import com.jfoenix.controls.JFXCheckBox;
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
import javafx.scene.layout.AnchorPane;
import model.TableSetter;
import model.VolSetter;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class HangarController implements Initializable {

  @FXML
    private AnchorPane root3;
    @FXML
    private Label lblFN;
    @FXML
    private Label lblPN;
    @FXML
    private Label lblTid;
    @FXML
    private Label lblType;
    @FXML
    private Label lblHangar;
    @FXML
    private Label lblControl;
    @FXML
    private JFXCheckBox Hyes;
    @FXML
    private JFXCheckBox Hno;
    @FXML
    private JFXCheckBox Cyes;
    @FXML
    private JFXCheckBox Cno;
    @FXML
    private Label lblDate3;
    
    public static String type ;
    public static Integer idpiste;
    
    private TableSetter Selectedvol;

    
    ObservableList<VolSetter> list = FXCollections.observableArrayList();
    
    
    
    @FXML
    public void checkEvent(ActionEvent event){
        int count=0;
        String message="";
        if (Hyes.isSelected()){
            count++;
            message+=Hyes.getText()+"\n";
            
        }
          if (Hno.isSelected()){
            count++;
            message+=Hno.getText()+"\n";
            
        }
         lblHangar.setText(message);  
          
    }
    @FXML
    public void checkEvent2(ActionEvent event){
        int count2=0;
        String message2="";
        
          if (Cyes.isSelected()){
            count2++;
            message2+=Cyes.getText()+"\n";
            
        }
            if (Cno.isSelected()){
            count2++;
            message2+=Cno.getText()+"\n";
            
        }
     
        lblControl.setText(message2);
        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
      lblType.setText(Suite1Controller.selectedType);
      
       lblTid.setText(Suite1Controller.selectedId);
       
       //CODE to inserte information 
        try{
            
            Connection con = null;
            
            String sql = "SELECT * FROM information "; 
            con = DBConnection.con;
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                list.add(new VolSetter(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
//           con.close();   
        }catch(Exception e){
            e.printStackTrace();
        }
       
       
        
    }    
    
    
    
    void setText(String lblFN, String lblPN,String lblDate3) {
       this.lblFN.setText(lblFN);
       this.lblPN.setText(lblPN);
       this.lblDate3.setText(lblDate3);
       
   }

    @FXML
    private void SaveData(ActionEvent event) {
       
       try{
         String query= "INSERT INTO information(Date,Idpiste,FlightN,PlaneN,Hangar,Control) VALUES (?,?,?,?,?,?);";
           PreparedStatement prest = con.prepareStatement(query);
           
            prest.setString(1, lblDate3.getText());
            prest.setString(2, lblFN.getText());
            prest.setString(3, lblPN.getText());
            prest.setString(4, lblTid.getText());
            prest.setString(5, lblHangar.getText());
            prest.setString(6, lblControl.getText());
            
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("information of vol");
            alert.setHeaderText(null);
            alert.setContentText("The Flight has been regested!");
            alert.showAndWait();
            
           
           prest.execute();
           prest.close();
           
           
       }catch(Exception ex){
           ex.printStackTrace();
       }
           //new  DBConnection().SaveData(VolSetter);
    } 
    
}

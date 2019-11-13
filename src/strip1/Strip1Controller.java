/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strip1;

import com.jfoenix.controls.JFXTextField;
import dao.DBConnection;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Pistemodel;
import model.Stripmodel;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class Strip1Controller implements Initializable {

    @FXML
    private AnchorPane idPanStrip1;
    @FXML
    private JFXTextField id1;
    @FXML
    private JFXTextField id3;
    @FXML
    private JFXTextField id5;
    @FXML
    private JFXTextField id2;
    @FXML
    private JFXTextField id4;
    @FXML
    private JFXTextField id6;
    @FXML
    private JFXTextField id7;
     ObservableList<Stripmodel> strips = FXCollections.observableArrayList();
    @FXML
    private HBox idStripb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          
        try{
            
            Connection con = null;
            
            String sql = "Select * from stripb ";
            con = DBConnection.con;
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                strips.add(new Stripmodel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7)));
            }
//            con.close();
            
            
        }catch(Exception e){
            
        }
        // TODO
    }    

////    @FXML
////    private void goStrip1(MouseEvent event) throws IOException {
////            AnchorPane pane =FXMLLoader.load(getClass().getResource("/PlantDeVol/Plant.fxml"));
////     ((Stage)idPanStrip1.getScene().getWindow()).setScene(new Scene(pane));
////    }

    @FXML
    private void Gostrip1(MouseEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/PlantDeVol/Plant.fxml"));
     ((Stage)idPanStrip1.getScene().getWindow()).setScene(new Scene(pane));
    }
    
    public void setText(String id1,String id2,String id3,String id4,String id5,String id7){
    this.id1.setText(id1);
    this.id2.setText(id2);
    this.id3.setText(id3);
    this.id4.setText(id4); 
    this.id5.setText(id5);
//    this.id6.setText(id6);
    this.id7.setText(id7);}

    @FXML
    private void SaveOn(ActionEvent event) {
          Stripmodel  stripmodel = new Stripmodel();
         
        stripmodel.setId1(id1.getText());
        stripmodel.setId2(id2.getText());
        stripmodel.setId3(id3.getText());
        stripmodel.setId4(id4.getText());
        stripmodel.setId5(id5.getText());
        stripmodel.setId7(id7.getText());
        strips.clear();
     //   System.out.println(Stripmodel.getId1() + " " + Stripmodel.getId2() + " " + Stripmodel.getId3()+ " " + Stripmodel.getId4() + " " + Stripmodel.getId5()+ " " + Stripmodel.getId7());
        
        new DBConnection().insertStrip(stripmodel);
    }

   @FXML
    private void OnPrint(ActionEvent event) {
         print(idStripb);
    }
       private void print(Node node) {

    javafx.print.PrinterJob job = javafx.print.PrinterJob.createPrinterJob();
    if (job != null) {

      boolean printed = job.printPage(node);
      if (printed) {
        job.endJob();
      } else {
      }
    } else {
    }
     }
    
    
    
    
    
   

    
}

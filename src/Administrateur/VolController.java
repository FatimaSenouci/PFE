/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrateur;

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
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Avionmodel;
import model.Pistemodel;
import model.Volmodel;


public class VolController implements Initializable {
    
    @FXML
    private AnchorPane rootPane5;
    @FXML
    private JFXTextField idvol;
    @FXML
    private JFXTextField idddd;
    @FXML
    private JFXTextField idhdd;
    @FXML
    private JFXTextField iddda;
    @FXML
    private JFXTextField idhda;
    @FXML
    private TableView<Volmodel> idTab;
    @FXML
    private TableColumn<Volmodel, Integer> idvolT;
    @FXML
    private TableColumn<Volmodel, String> dddT;
    @FXML
    private TableColumn<Volmodel, String> hddT;
    @FXML
    private TableColumn<Volmodel, String> ddaT;
    @FXML
    private TableColumn<Volmodel, String> hdaT;

        ObservableList<Volmodel> vols = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        try{
            
            Connection con = null;
            
            String sql = "Select * from vol ";
            con = DBConnection.con;
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                vols.add(new Volmodel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(2)));
            }
//            con.close();
            
            
        }catch(Exception e){
            
        }
      
        
        idvolT.setCellValueFactory(new PropertyValueFactory<Volmodel,Integer>("idpiste"));
        dddT.setCellValueFactory(new PropertyValueFactory<Volmodel,String>("ddd"));
        hddT.setCellValueFactory(new PropertyValueFactory<Volmodel,String>("hdd"));
        ddaT.setCellValueFactory(new PropertyValueFactory<Volmodel,String>("dda"));
        hdaT.setCellValueFactory(new PropertyValueFactory<Volmodel,String>("hda"));
        
        
        
     idTab.setItems(vols);
    }    

    @FXML
    private void retour5(MouseEvent event) throws IOException {
              AnchorPane pane =FXMLLoader.load(getClass().getResource("admin.fxml"));
     ((Stage)rootPane5.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void OnInsertVol(ActionEvent event) {
//         Volmodel volmodel = new Volmodel();
//        volmodel.setIdvol(Integer.parseInt(idvol.getText()));
//        volmodel.setDdd(ddd.getText());
//        volmodel.setHdd(hdd.getText());
//
//
//
//        new  DBConnection().insertAvion(avionmodel);
//        avions.clear();
    }
    
}

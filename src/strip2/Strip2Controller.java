/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strip2;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class Strip2Controller implements Initializable {

    @FXML
    private AnchorPane idPanStrip2;
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
    private JFXTextField id610;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

//    @FXML
//    private void goStrip2(MouseEvent event) throws IOException {
//         AnchorPane pane =FXMLLoader.load(getClass().getResource("/PlantDeVol/Plant.fxml"));
//     ((Stage)idPanStrip2.getScene().getWindow()).setScene(new Scene(pane));
//    }

    @FXML
    private void Gostrip2(MouseEvent event) throws IOException {
           AnchorPane pane =FXMLLoader.load(getClass().getResource("/PlantDeVol/Plant.fxml"));
     ((Stage)idPanStrip2.getScene().getWindow()).setScene(new Scene(pane));
    }
    
    
       public void setText(String id1,String id2,String id3,String id4,String id5){
    this.id1.setText(id1);
    this.id2.setText(id2);
    this.id3.setText(id3);
    this.id4.setText(id4); 
    this.id5.setText(id5);
//    this.id6.setText(id6);
    
    
}}

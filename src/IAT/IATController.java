/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAT;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import dao.DBConnection;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Message;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class IATController implements Initializable {

    @FXML
    private AnchorPane AnchorMessage;
    @FXML
    private JFXButton sendButton;
    @FXML
    private JFXTextField messageTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retourMessage(MouseEvent event) throws IOException {
          AnchorPane pane =FXMLLoader.load(getClass().getResource("/Administrateur/admin.fxml"));
     ((Stage)AnchorMessage.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void sendMessage(ActionEvent event) {
        String message = messageTextField.getText();
        Date date = new Date(System.currentTimeMillis());
        
        DBConnection conn = new DBConnection();
        conn.insertMessage(new Message(1, 2, message, date));
    }
   
}

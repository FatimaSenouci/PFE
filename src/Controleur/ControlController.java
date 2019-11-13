
package Controleur;

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


public class ControlController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void go(MouseEvent event) throws IOException {
         AnchorPane pane =FXMLLoader.load(getClass().getResource("cntrl1.fxml"));
            ((Stage)rootPane.getScene().getWindow()).setScene(new Scene(pane));
    }
    
}

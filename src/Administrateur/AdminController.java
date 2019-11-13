
package Administrateur;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class AdminController implements Initializable {

   
    @FXML
    private AnchorPane enterPane;

    @FXML
    private Label time;
    @FXML
    private Button idPiste;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {            
            Calendar cal = Calendar.getInstance();
            int second = cal.get(Calendar.SECOND);
            int minute = cal.get(Calendar.MINUTE);
            int hour = cal.get(Calendar.HOUR);
            time.setText(((hour<10)?"0" : "") + hour + ":" + ((minute<10)?"0" : "") + minute + ":" + ((second<10)?"0" : "") + second);
            }),
             new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
       
        clock.play();

    }    

    @FXML
    private void goPiste(MouseEvent event) throws IOException {
                          AnchorPane pane =FXMLLoader.load(getClass().getResource("pistes.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
  
    }

    private void goLigne(MouseEvent event) throws IOException {
                             AnchorPane pane =FXMLLoader.load(getClass().getResource("Ligne.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void goVol(MouseEvent event) throws IOException {
                             AnchorPane pane =FXMLLoader.load(getClass().getResource("Vol.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void goAvion(MouseEvent event) throws IOException {
                             AnchorPane pane =FXMLLoader.load(getClass().getResource("avion.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void goPilote(MouseEvent event) throws IOException {
                             AnchorPane pane =FXMLLoader.load(getClass().getResource("pilote.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void goTechnecien(MouseEvent event) throws IOException {
                             AnchorPane pane =FXMLLoader.load(getClass().getResource("technecien.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void goPlane(MouseEvent event) throws IOException {
         AnchorPane pane =FXMLLoader.load(getClass().getResource("/PlantDeVol/Plant.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
        
    }

    @FXML
    private void goMessage(MouseEvent event) throws IOException {
              AnchorPane pane =FXMLLoader.load(getClass().getResource("/IAT/IAT.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
        
    }

    @FXML
    private void Goreserve(MouseEvent event) throws IOException {
          AnchorPane pane =FXMLLoader.load(getClass().getResource("/Administrateur/reservation.fxml"));
     ((Stage)enterPane.getScene().getWindow()).setScene(new Scene(pane));
        
    }

  
}

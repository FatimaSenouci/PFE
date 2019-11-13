/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class Suite1Controller implements Initializable {

    @FXML
    private AnchorPane root1;
    @FXML
    private TextField flightid;
    @FXML
    private TextField planeid;
    @FXML
    private TableView<?> tableviewsuitid;
    @FXML
    private TableColumn<?, ?> trackid2;
    @FXML
    private TableColumn<?, ?> type2id;
    @FXML
    private TableColumn<?, ?> freeid;
    @FXML
    private TableColumn<?, ?> occupiedid;
    @FXML
    private Label lblDate2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnListe(ActionEvent event) {
    }

    @FXML
    private void retour1(MouseEvent event) {
    }

    @FXML
    private void displaySelected(MouseEvent event) {
    }

    @FXML
    private void Go22(MouseEvent event) {
    }

    @FXML
    private void toDisplay(ActionEvent event) {
    }
    
}

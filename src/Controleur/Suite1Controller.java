
package Controleur;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.TableSetter;

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
    private TableView<TableSetter> tableviewsuitid;
    @FXML
    private TableColumn<TableSetter,Integer> trackid2;
    @FXML
    private TableColumn<TableSetter,String> type2id;
    @FXML
    private TableColumn<TableSetter,CheckBox> freeid;
    @FXML
    private TableColumn<TableSetter, CheckBox> occupiedid;
    @FXML
    private Label lblDate2;
    
   
    public static String selectedType;
     public static String selectedId;


      
    ObservableList<TableSetter> list=FXCollections.observableArrayList();
    @FXML
    private JFXTextField Screen1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
       
       for (int i=0; i<10;i++){
            
      
        CheckBox ch = new CheckBox(""+i);
        list.add(new TableSetter(i,"Landing",ch,ch));
       
        
        } 
//        tableviewsuitid.setItems(list);
        trackid2.setCellValueFactory(new PropertyValueFactory<TableSetter,Integer>("trackid2"));
        type2id.setCellValueFactory(new PropertyValueFactory<TableSetter,String>("type2id"));
        freeid.setCellValueFactory(new PropertyValueFactory<TableSetter,CheckBox>("freeid"));
        occupiedid.setCellValueFactory(new PropertyValueFactory<TableSetter,CheckBox>("occupied"));
        
       tableviewsuitid.setItems(list);
    }    
public void setText(String flightid, String planeid,String lblDate2) {
       this.flightid.setText(flightid);
       this.planeid.setText(planeid);
       this.lblDate2.setText(lblDate2);
       
   }
    @FXML
    private void BtnListe(ActionEvent event) {
    }

    @FXML
    private void retour1(MouseEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("/Controleur/control.fxml"));
            ((Stage)root1.getScene().getWindow()).setScene(new Scene(pane));
    }



    @FXML
    private void Go22(MouseEvent event) throws IOException {
           AnchorPane pane =FXMLLoader.load(getClass().getResource("/Controleur/Hangar.fxml"));
            ((Stage)root1.getScene().getWindow()).setScene(new Scene(pane));
            
    }

  

    @FXML
    private void toDisplay(ActionEvent event) {
        String flightid_Text=flightid.getText();
        String planeid_Text=planeid.getText();
        String lblDate2_Text=lblDate2.getText();
        
        
         FXMLLoader Loader= new FXMLLoader();
        Loader.setLocation(getClass().getResource("/Controleur/Hangar.fxml"));
        try{
            Loader.load();
            
        }catch(IOException ex){
           ex.printStackTrace();
        
        }
        HangarController display=Loader.getController();
        display.setText(flightid_Text,planeid_Text,lblDate2_Text);
       
        Parent p = Loader.getRoot();
        Stage stage =new Stage();
        stage.setScene(new Scene(p));
        stage.showAndWait();
        
   
    }

    @FXML
    private void displaySelected(MouseEvent event) {
      
        int selectedIndex = tableviewsuitid.getSelectionModel().getSelectedIndex();
         selectedType = type2id.getCellData(selectedIndex);
         selectedId=trackid2.getCellData(selectedIndex).toString();
          
    }   
    
}

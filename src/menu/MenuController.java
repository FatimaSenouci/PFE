/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import Controleur.Suite1Controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import dao.DBConnection;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.TableLoad;
import model.TableMenu1;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class MenuController implements Initializable {
 
   private final static MenuController instance = new MenuController();
    public static MenuController getInstance() {
        return instance;
    
    }


    @FXML
    private AnchorPane landing;
    @FXML
    private AnchorPane liftoff;
    @FXML
    private AnchorPane theflights;
    @FXML
    private AnchorPane tracks;
    @FXML
    private AnchorPane control;
    @FXML
    private AnchorPane pere;
    @FXML
    private JFXButton btn_landing;
    @FXML
    private JFXButton btn_liftoff;
    @FXML
    private JFXButton btn_theflights;
    @FXML
    private JFXButton btn_tracks;
    @FXML
    private JFXButton btn_control;
    @FXML
    private JFXButton bnt_all;
    private Object btn_all;
    @FXML
    private JFXTextField flightn;
    @FXML
    private JFXTextField plann;
    
    private TableView<TableMenu1> idTable;
    private TableColumn<TableMenu1, Integer> trackidT;
    private TableColumn<TableMenu1, String> typeidT;
    
   
    
      ObservableList<TableMenu1> list = FXCollections.observableArrayList();
     ///pichr 
  
    @FXML private DatePicker dp;
    @FXML private Label lblDate;
    @FXML
    private TableView<TableLoad> tableViewF;
    @FXML
    private TableColumn<TableLoad, String> DateT;
    @FXML
    private TableColumn<TableLoad,String > FlightT;
    @FXML
    private TableColumn<TableLoad, String> PlaneT;
    @FXML
    private TableColumn<TableLoad, String> PisteT;
    @FXML
    private TableColumn<TableLoad,String> HT;
    @FXML
    private TableColumn<TableLoad,String> CT;
    
    ObservableList<TableLoad> load = FXCollections.observableArrayList();
    @FXML
    private JFXTextField SearchField;
    
    @FXML
    private void getDate(){
        
      //Suite1Controller.date =  dp.getValue().toString();
    }

     public DatePicker getDp() {
        return dp;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//         try{
//            
//            Connection con = null;
//            
//            String sql = "SELECT * FROM piste "; 
//            con = DBConnection.con;
//            
//            PreparedStatement ps = con.prepareStatement(sql);
//            
//            ResultSet rs = ps.executeQuery();
//            
//            while(rs.next()){
//                
//                list.add(new TableMenu1(rs.getInt(1),rs.getString(2)));
//            }
////           con.close();   
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//       trackidT.setCellValueFactory(new PropertyValueFactory<TableMenu1,Integer>("trackidT"));
//       typeidT.setCellValueFactory(new PropertyValueFactory<TableMenu1,String>("typeidT"));
//      
//     idTable.setItems(list);
//     
//     
//     //table LOad
     
     try{
            
            Connection con = null;
            
            String sql = "SELECT * FROM information "; 
            con = DBConnection.con;
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                load.add(new TableLoad(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
//           con.close();   
        }catch(Exception e){
            e.printStackTrace();
        }
     
    
     DateT.setCellValueFactory(new PropertyValueFactory<TableLoad,String>("DateT"));
     FlightT.setCellValueFactory(new PropertyValueFactory<TableLoad,String>("FlightT"));
     PlaneT.setCellValueFactory(new PropertyValueFactory<TableLoad,String>("PlaneT"));
     PisteT.setCellValueFactory(new PropertyValueFactory<TableLoad,String>("PistT"));
     HT.setCellValueFactory(new PropertyValueFactory<TableLoad,String>("HT"));
     CT.setCellValueFactory(new PropertyValueFactory<TableLoad,String>("CT"));
     
     tableViewF.setItems(load);
     
        // TODO
    }    

    @FXML
    private void onClose(ActionEvent event) {
         Platform.exit();
    }

 FilteredList<TableLoad> filtredData= new FilteredList(load,e ->true);
  
    @FXML
    private void SearchField(KeyEvent event) {
         SearchField.textProperty().addListener((observableValue,oldValue, newValue) ->{
       
            
            filtredData.setPredicate((Predicate<? super TableLoad> ) (TableLoad std)->{
                
                if(newValue== null || newValue.isEmpty()){
                     return true;
                     
                     
                 }else if(std.getDateT().contains(newValue)){
                     return true;
                 }
                
                
                
                return false;
                
                 });
    });
           
      SortedList sort=new SortedList(filtredData);
      sort.comparatorProperty().bind(tableViewF.comparatorProperty());
       
      tableViewF.setItems(sort);
      
    }
    


    @FXML
    private void go1(MouseEvent event) throws IOException {
         AnchorPane pane =FXMLLoader.load(getClass().getResource("suite1.fxml"));
            ((Stage)landing.getScene().getWindow()).setScene(new Scene(pane));
    }

    @FXML
    private void handleButtonAction2(ActionEvent event) {
         String flightn_Text=flightn.getText();
        String plann_Text=plann.getText();
        String lblDate_Text=lblDate.getText();
        
                
     
        FXMLLoader Loader= new FXMLLoader();
        Loader.setLocation(getClass().getResource("/Controleur/suite1.fxml"));
        try{
            Loader.load();
            
        }catch(IOException ex){
           ex.printStackTrace();

        }
        
       Suite1Controller display=Loader.getController();
       
     display.setText(flightn_Text,plann_Text,lblDate_Text);
       
        Parent p = Loader.getRoot();
        Stage stage =new Stage();
        stage.setScene(new Scene(p));
        stage.showAndWait();
    }

    @FXML
    private void Confirm(ActionEvent event) {
         lblDate.setText(dp.getValue().toString());
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        if(event.getSource()==btn_all){
            pere.toFront();
        }
        else  if(event.getSource()==btn_landing){
            landing.toFront();
        }
        
         else  if(event.getSource()==btn_control){
           control.toFront();
        }
         else  if(event.getSource()==btn_liftoff){
         liftoff.toFront();
        }
         else  if(event.getSource()==btn_tracks){
            tracks.toFront();
        }
         else  if(event.getSource()==btn_theflights){
            theflights.toFront();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantDeVol;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.NativeFunction.function;
import org.controlsfx.control.textfield.TextFields;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class PlantController implements Initializable {

    @FXML
    private JFXTimePicker idTime;
    @FXML
    private JFXTextField idExpediteur;
    @FXML
    private JFXTextField idAd1;
    @FXML
    private JFXTextField idAd2;
    @FXML
    private JFXTextField idAd3;
    @FXML
    private JFXTextField idAdress;
    @FXML
    private JFXTextField idRegle;
    @FXML
    private JFXTextField idType;
    @FXML
    private JFXTextField idNombre;
    @FXML
    private JFXTextField idCat;
    @FXML
    private JFXTextField idEquipement;
    @FXML
    private JFXTextField idRoute;
    @FXML
    private JFXTimePicker idDuréeTtl;
    @FXML
    private AnchorPane PanePlan;
    @FXML
    private JFXTimePicker idDuréeTtl1;
    @FXML
    private JFXTextField idDestination1;
    @FXML
    private JFXTextField idDestination11;
    @FXML
    private JFXTextField idDestination111;
    @FXML
    private JFXTextField idDestination1111;
    @FXML
    private JFXTextField idDestination11111;
    @FXML
    private JFXTextField idDestination111111;
    @FXML
    private JFXTextField idDestination1111111;
    @FXML
    private AnchorPane IdPlant;
    @FXML
    private JFXTextField id3;
    @FXML
    private JFXTextField id1;
    @FXML
    private JFXTextField id5;
    @FXML
    private JFXTimePicker id6;
    @FXML
    private JFXTextField id4;
    @FXML
    private JFXTextField id7;
    @FXML
    private JFXTextField id2;
//    Set<String> possiblewordsSet = new HashSet<>();
    @FXML
    private JFXTextField idALTN;
    @FXML
    private JFXTextField idALTN2;

//    @FXML
//    void sais(KeyEvent e){
//        if(id5.getText().length() == 5){
//            
//        }
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//       String[] possiblewordsSet ={};
        String[] possiblewordsSet = {" ","DAAA" ,"DAAB","DAAD" ,"DAAE","DAAF" ,
            "DAAG","DAAJ" ,"DAAK","DAAL" ,"DAAM","DAAN" ,"DAAP","DAAQ" ,"DAAS"
                ,"DAAT" ,"DAAV","DAAW" ,"DAAX","DAAY" ,"DAAZ","DABB" ,"DABC","DABP" 
                ,"DABS","DABT" ,"DAFH","DAFI" ,"DAMM","DAOB" ,"DAOE",
            "DAOF","DAOH" ,"DAOI","DAOL" ,"DAON","DAOO" ,"DAOR","DAOS" ,"DAOJ"
                ,"DAOV" ,"DATG","DATM" ,"DAUA","DAUB" ,"DAUE","DAUG" ,"DAUH","DAUI" 
                ,"DAUK","DAUL" ,"DAUO","DAUT" ,"DAUU","DAUZ" };
            TextFields.bindAutoCompletion(id1, possiblewordsSet);
            TextFields.bindAutoCompletion(id2, possiblewordsSet);
            TextFields.bindAutoCompletion(idALTN, possiblewordsSet);
            TextFields.bindAutoCompletion(idALTN2, possiblewordsSet);
            String[] possiblewordsSet2 = { " ", " 7T-VWE","7T-AAA"," 7T-BBB","7T-CCC"," 7T-DDD",
                "7T-EEE"," 7T-FFF","7T-GGG"," 7T-HHH","7T-III"," 7T-JJJ","7T-KKK"," 7T-LLL",
                "7T-MMM"," 7T-NNN","7T-OOO"," 7T-PPP","7T-QQQ"," 7T-RRR","7T-SSS"," 7T-TTT","7T-UUU"," 7T-VVV",
                "7T-WWW"," 7T-XXX","7T-YYY"," 7T-ZZZ","7T-ABB"," 7T-ACC","7T-ADD"," 7T-AEE","7T-AFF"," 7T-AGG",
                "7T-AHH"," 7T-AII","7T-AJJ"};
             TextFields.bindAutoCompletion(id5, possiblewordsSet2);
         	//.101 · A.106 · A.109 · AW119 · AW139 · AW169 · AB 412 · AW609 · EH101
                	//A.109 Hirundo · AW119 Koala · A.129 Mangusta · AB.102 · AB.212 · AW149 · AW159 Wildcat · AW Super Lynx · WAH-64 Apache · EH101 Merlin
                 String[] possiblewordsSet3 = { "A.101","A106","A.109","AW119","AW139","AW169","AB 412","AW609","EH101"
                         ,"A.109 Hirundo","AW119 Koala","A.129 Mangusta","AB.102","AB.212","AW149","AW159 Wildcat","AW Super Lynx",
                 "WAH-64 Apache","EH101 Merlin",};
                  TextFields.bindAutoCompletion(id3, possiblewordsSet3);
                
                
//      TextField textField = TextFields.createClearablePasswordField();
//       IdPlant.getChildren().add(textField);
//       AnchorPane.setBottomAnchor(id3, Double.NaN);

    }    
    
 
  
    
    @FXML
    private void retourPlan(MouseEvent event) throws IOException {
          AnchorPane pane =FXMLLoader.load(getClass().getResource("/Administrateur/admin.fxml"));
            ((Stage)PanePlan.getScene().getWindow()).setScene(new Scene(pane));
    }


//    @FXML
//    private void Gostrip2(MouseEvent event) throws IOException {
//         AnchorPane pane =FXMLLoader.load(getClass().getResource("/strip2/strip2.fxml"));
//            ((Stage)PanePlan.getScene().getWindow()).setScene(new Scene(pane));
//    }
//    private void Gostrips(ActionEvent event) {
//        
//        String Text_1 = id1.getText();
//        String Text_3 = id3.getText();
//         String Text_2 = id2.getText();
//        String Text_4 = id4.getText();
//         String Text_5 = id5.getText();
////        String Text_6 = id6.getText();
//        String Text_7 = id7.getText();
//        FXMLLoader Loader = new FXMLLoader();
//        Loader.setLocation(getClass().getResource("/strips/strips.fxml"));
//        try {
//            Loader.load();
//        } catch (IOException ex) {
//            Logger.getLogger(PlantController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        strips.StripsController strips = Loader.getController();
//        strips.setText(Text_1, Text_3, Text_2, Text_4, Text_5, Text_7);
//        Parent p =Loader.getRoot();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(p));
//        stage.showAndWait();
//        
//        
//    }

    @FXML
    private void OnPrint(ActionEvent event) {
         print(IdPlant);
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

//    @FXML
//    private void Gostrips(MouseEvent event) {
//            String Text_1 = id1.getText();
//        String Text_3 = id3.getText();
//         String Text_2 = id2.getText();
//        String Text_4 = id4.getText();
//         String Text_5 = id5.getText();
////        String Text_6 = id6.getText();
//        String Text_7 = id7.getText();
//        FXMLLoader Loader = new FXMLLoader();
//        Loader.setLocation(getClass().getResource("/strips/strips.fxml"));
//        try {
//            Loader.load();
//        } catch (IOException ex) {
////            Logger.getLogger(PlantController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        strips.StripsController strips = Loader.getController();
//        strips.setText(Text_1, Text_3, Text_2, Text_4, Text_5, Text_7);
//        Parent p =Loader.getRoot();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(p));
//        stage.showAndWait();
//    }

    @FXML
    private void goStrip1(ActionEvent event) throws IOException {
//            AnchorPane pane =FXMLLoader.load(getClass().getResource("/strip1/strip1.fxml"));
//            ((Stage)PanePlan.getScene().getWindow()).setScene(new Scene(pane));

   
       String Text_1 = id1.getText();
        String Text_3 = id3.getText();
         String Text_2 = id2.getText();
        String Text_4 = id4.getText();
         String Text_5 = id5.getText();
//        String Text_6 = id6.getText();
        String Text_7 = id7.getText();
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("/strip1/strip1.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(PlantController.class.getName()).log(Level.SEVERE, null, ex);
        }
        strip1.Strip1Controller strip1 = Loader.getController();
        strip1.setText(Text_1, Text_3, Text_2, Text_4, Text_5, Text_7);
        Parent p =Loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
        stage.showAndWait();
       
    }
    
    @FXML
    void Gostrip2(ActionEvent event) {
         String Text_1 = id1.getText();
        String Text_3 = id3.getText();
         String Text_2 = id2.getText();
        String Text_4 = id4.getText();
         String Text_5 = id5.getText();
//        String Text_6 = id6.getText();
        String Text_7 = id7.getText();
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("/strip2/strip2.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(PlantController.class.getName()).log(Level.SEVERE, null, ex);
        }
        strip2.Strip2Controller strip2 = Loader.getController();
        strip2.setText(Text_1, Text_3, Text_2, Text_4, Text_5);
        Parent p =Loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
        stage.showAndWait();

    }

      @FXML
    private void champ7(KeyEvent event) {

    }

    @FXML
    private void champ9(KeyEvent event) {

    }

    @FXML
    private void champ13(KeyEvent event) {
    }
    
}

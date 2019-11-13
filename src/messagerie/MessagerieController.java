/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagerie;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class MessagerieController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

 private HTMLEditor htmlEditor = null;
    private final String INITIAL_TEXT = "<html><body>Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            +"Nam tortor felis, pulvinar in scelerisque cursus, pulvinar at ante. Nulla consequat "
            + "congue lectus in sodales. Nullam eu est a felis ornare bibendum et nec tellus. "
            + "Vivamus non metus tempus augue auctor ornare. Duis pulvinar justo ac purus adipiscing "
            + "pulvinar. Integer congue faucibus dapibus. Integer id nisl ut elit aliquam sagittis "
            + "gravida eu dolor. Etiam sit amet ipsum sem.</body></html>";
            
    
    private void init(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setScene(new Scene(root));
        VBox vRoot = new VBox();

        vRoot.setPadding(new Insets(8, 8, 8, 8));
        vRoot.setSpacing(5);

        htmlEditor = new HTMLEditor();
        htmlEditor.setPrefSize(500, 245);
        htmlEditor.setHtmlText(INITIAL_TEXT);
        vRoot.getChildren().add(htmlEditor);

        final Label htmlLabel = new Label();
        htmlLabel.setMaxWidth(500);
        htmlLabel.setWrapText(true);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.getStyleClass().add("noborder-scroll-pane");
        scrollPane.setContent(htmlLabel);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefHeight(180);

        Button showHTMLButton = new Button("Show the HTML below");
        vRoot.setAlignment(Pos.CENTER);
        showHTMLButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                htmlLabel.setText(htmlEditor.getHtmlText());
            }
        });

        vRoot.getChildren().addAll(showHTMLButton, scrollPane);
        root.getChildren().addAll(vRoot);
    }

    public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX 
     * application. main() serves only as fallback in case the 
     * application can not be launched through deployment artifacts,
     * e.g., in IDEs with limited FX support. NetBeans ignores main().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }    
    
}

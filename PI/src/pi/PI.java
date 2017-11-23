/* pppppppppp
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Noemi
 */
public class PI extends Application {
    
    public static String screen1ID = "main";
    public static String screen1File = "TelaInicial.fxml";
    public static String screen2ID = "Tela11";
    public static String screen2File = "Tela11.fxml";
    public static String screen3ID = "Tela2";
    public static String screen3File = "Tela2.fxml";
    public static String screen4ID = "Tela9";
    public static String screen4File = "Tela9.fxml";
    public static String screen5ID = "Tela3";
    public static String screen5File = "Tela3.fxml";
    public static String screen6ID = "Tela4";
    public static String screen6File = "Tela4.fxml";
    public static String screen7ID = "Tela7";
    public static String screen7File = "Tela7.fxml";
    public static String screen8ID = "Tela5";
    public static String screen8File = "Tela5.fxml";
    public static String screen9ID = "Tela6";
    public static String screen9File = "Tela6.fxml";
    public static String screen10ID = "Tela8";
    public static String screen10File = "Tela8.fxml";
    public static String screen11ID = "Febre";
    public static String screen11File = "Febre.fxml";
    
    
    @Override
    public void start(Stage primaryStage) {
        
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(PI.screen1ID, PI.screen1File);
        mainContainer.loadScreen(PI.screen2ID, PI.screen2File);
        mainContainer.loadScreen(PI.screen3ID, PI.screen3File);
        mainContainer.loadScreen(PI.screen4ID, PI.screen4File);
        mainContainer.loadScreen(PI.screen5ID, PI.screen5File);
        mainContainer.loadScreen(PI.screen6ID, PI.screen6File);
        mainContainer.loadScreen(PI.screen7ID, PI.screen7File);
        mainContainer.loadScreen(PI.screen8ID, PI.screen8File);
        mainContainer.loadScreen(PI.screen9ID, PI.screen9File);
        mainContainer.loadScreen(PI.screen10ID, PI.screen10File);
        mainContainer.loadScreen(PI.screen11ID, PI.screen11File);
        
        mainContainer.setScreen(PI.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setWidth(600);
        primaryStage.setHeight(420);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

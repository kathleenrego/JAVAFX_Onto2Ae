/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author Joel
 */
public class Tela2Controller implements Initializable, ControlledScreen {

    @FXML private RadioButton opcaoManchaMuitoIntensa; 
    @FXML private RadioButton opcaoManchasLeves; 
    @FXML private RadioButton opcaoManchaPescoco; 
    @FXML private RadioButton opcaoinchaco; 
    @FXML private RadioButton opcaoSemManchas; 
    /**
     * Initializes the controller class.
     */ScreensController myController;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
    
    @FXML
    private void goToScreen2(ActionEvent event){
       myController.setScreen(PI.screen2ID);
    }
    @FXML
    private void goToScreen4(ActionEvent event){
        
        if(!opcaoManchaMuitoIntensa.isSelected()&& !opcaoinchaco.isSelected() && !opcaoManchasLeves.isSelected()
                && !opcaoSemManchas.isSelected()&& !opcaoManchaPescoco.isSelected()){
           
             
            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");
            
            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();
        
            
        }else{
          /*   Armazenamento arm = new Armazenamento();
            if(opcaoManchaMuitoIntensa.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temMancha","paciente1","Mancha", true);
                
            }else if(opcaoinchaco.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temInchaco","paciente1","Mancha", true);
                
            }else if(opcaoManchasLeves.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temMancha","paciente1","Mancha", false);
                
            }else if(opcaoSemManchas.isSelected()){
                
                
            }else if(opcaoManchaPescoco.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temManchaPescoco","paciente1","Mancha", true);
            }*/
       myController.setScreen(PI.screen4ID);
       }
        
    }
    @FXML
    private void ComMancha(ActionEvent event) {
         opcaoManchaPescoco.setDisable(false);
         opcaoinchaco.setDisable(false);
     }
    
    @FXML
     private void SemMancha(ActionEvent event) {

         opcaoManchaPescoco.setDisable(true);
         opcaoinchaco.setDisable(true);
         opcaoManchaPescoco.setSelected(false);
         opcaoinchaco.setSelected(false);
     }
}

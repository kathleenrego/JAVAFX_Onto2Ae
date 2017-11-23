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
 * @author Noemi
 */
public class Tela5Controller implements Initializable, ControlledScreen {
    @FXML private RadioButton opcaoMuitaIrritacaoOlho; 
    @FXML private RadioButton opcaoPoucaIrritacaoOlho; 
    @FXML private RadioButton opcaoconjutivite; 
    @FXML private RadioButton opcaoDorNosOlhos;
    @FXML private RadioButton opcaoSemIrrita;
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
     private void goToScreen9(ActionEvent event){
         if(!opcaoMuitaIrritacaoOlho.isSelected()&& !opcaoPoucaIrritacaoOlho.isSelected() && !opcaoconjutivite.isSelected()
            && !opcaoDorNosOlhos.isSelected()&& !opcaoSemIrrita.isSelected()){
           
             
            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");
            
            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();
        
            
        }else{
            /* Armazenamento arm = new Armazenamento();
            if(opcaoMuitaIrritacaoOlho.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temMuitaIrritacaoOlho", "paciente1","IrritacaoOlho", true);
                
            }else if(opcaoPoucaIrritacaoOlho.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temPoucaIrritacaoOlho", "paciente1","IrritacaoOlho", true);
            }else if(opcaoconjutivite.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temConjutivte", "paciente1", "IrritacaoOlho", true);
            }else if(opcaoDorNosOlhos.isSelected()){
                arm.armazenarSintomasPacienteBoolean("temDorNosOlhos", "paciente1", "IrritacaoOlhos", true);
                
            }else if(opcaoSemIrrita.isSelected()){
                
            }*/
       myController.setScreen(PI.screen9ID);
         }
    }
     @FXML
     private void goToScreen7(ActionEvent event){
       myController.setScreen(PI.screen7ID);
    }
     @FXML
     private void SemIrritacao(ActionEvent event) {
         
         
         opcaoconjutivite.setDisable(true);
         opcaoDorNosOlhos.setDisable(true);
         opcaoconjutivite.setSelected(false);
         opcaoDorNosOlhos.setSelected(false);
     }
      @FXML
     private void ComIrritacao(ActionEvent event) {
         opcaoconjutivite.setDisable(false);
         opcaoDorNosOlhos.setDisable(false);
     }
}

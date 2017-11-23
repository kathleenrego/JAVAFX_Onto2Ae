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
public class Tela4Controller implements Initializable, ControlledScreen {

    @FXML
    private RadioButton opcaoDorArticuIntensa;
    @FXML
    private RadioButton opcaoDorArticuFraca;
    @FXML
    private RadioButton opcaoDorArticuAssimetrica;
    @FXML
    private RadioButton opcaoSemDorArticu;
    @FXML
    private RadioButton opcaoDorArticuMuitoIntensa;
    
    /**
     * Initializes the controller class.
     */
    ScreensController myController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void goToScreen7(ActionEvent event) {
        if (!opcaoDorArticuIntensa.isSelected() && !opcaoDorArticuFraca.isSelected()
                && !opcaoDorArticuAssimetrica.isSelected() && !opcaoSemDorArticu.isSelected() && !opcaoDorArticuMuitoIntensa.isSelected()) {

            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");

            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();

        } else {
            /* Armazenamento arm = new Armazenamento();
            if (opcaoDorArticuIntensa.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temDorArticulacaoIntensa","paciente1","DorArticulacao", true);

            } else if (opcaoDorArticuFraca.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temDorArticulacaoFraca","paciente1","DorArticulacao", true);

            } else if (opcaoDorArticuAssimetrica.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temDorArticulacaoSimetrica","paciente1","DorArticulacao", true);

            } else if (opcaoSemDorArticu.isSelected()) {
                

            }*/
            myController.setScreen(PI.screen7ID);
        }
    }

    @FXML
    private void goToScreen5(ActionEvent event) {
        myController.setScreen(PI.screen5ID);
    }
    @FXML
    private void comDorArticu(ActionEvent event) {
         opcaoDorArticuAssimetrica.setDisable(false);
         
     }
    @FXML
     private void semDorArticu(ActionEvent event) {
         
         opcaoDorArticuAssimetrica.setSelected(false);
         
         opcaoDorArticuAssimetrica.setDisable(true);
         
     }
    

}

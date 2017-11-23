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
public class Tela8Controller implements Initializable, ControlledScreen {

    @FXML
    private RadioButton opcaoCansaço;
    @FXML
    private RadioButton opcaoTontura;
    @FXML
    private RadioButton opcaoSonolencia;
    @FXML
    private RadioButton opcaoDorDeCabeca;
    @FXML
    private RadioButton opcaoSemSintomasFraqueza;
    @FXML
    private RadioButton opcaoLimpar;
    
    /**
     * Initializes the controller class.
     */
    ScreensController myController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        opcaoCansaço.setDisable(false);
        opcaoTontura.setDisable(false);
        opcaoSonolencia.setDisable(false);
        opcaoDorDeCabeca.setDisable(false);
    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void goToScreen11(ActionEvent event) {
        if (!opcaoCansaço.isSelected() && !opcaoTontura.isSelected() && !opcaoSonolencia.isSelected()
                && !opcaoDorDeCabeca.isSelected() && !opcaoSemSintomasFraqueza.isSelected()) {

            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");

            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();

        } else {
          /*   Armazenamento arm = new Armazenamento();
            if (opcaoCansaço.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temCansaco","paciente1","Prostacao", true);

            } else if (opcaoTontura.isSelected()) {
                 arm.armazenarSintomasPacienteBoolean("temTontura","paciente1","Prostacao", true);

            } else if (opcaoSonolencia.isSelected()) {
                 arm.armazenarSintomasPacienteBoolean("temSonolenta","paciente1","Prostacao", true);

            } else if (opcaoDorDeCabeca.isSelected()) {
                 arm.armazenarSintomasPacienteBoolean("temDorDeCabeca","paciente1","Prostacao", true);

            } else if (opcaoSemSintomasFraqueza.isSelected()) {

            }*/
            myController.setScreen(PI.screen11ID);
        }
    }

    @FXML
    private void goToScreen9(ActionEvent event) {
        myController.setScreen(PI.screen9ID);
    }
    
     @FXML
    private void LimparMarcacoes(ActionEvent event) {
         
         opcaoCansaço.setDisable(false);
         opcaoTontura.setDisable(false);
         opcaoSonolencia.setDisable(false);
         opcaoDorDeCabeca.setDisable(false);
         opcaoSemSintomasFraqueza.setDisable(false);
         
         opcaoSemSintomasFraqueza.setSelected(false);
         opcaoCansaço.setSelected(false);
         opcaoTontura.setSelected(false);
         opcaoSonolencia.setSelected(false);
         opcaoDorDeCabeca.setSelected(false);
     }
     @FXML
    private void SemFraqueza(ActionEvent event) {
         opcaoCansaço.setDisable(true);
         opcaoTontura.setDisable(true);
         opcaoSonolencia.setDisable(true);
         opcaoDorDeCabeca.setDisable(true);
         
         opcaoCansaço.setSelected(false);
         opcaoTontura.setSelected(false);
         opcaoSonolencia.setSelected(false);
         opcaoDorDeCabeca.setSelected(false);
         
     }
    

}

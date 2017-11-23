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
public class Tela7Controller implements Initializable, ControlledScreen {

    @FXML
    private RadioButton opcaoNaoTemSangramento;
    @FXML
    private RadioButton opcaoTemSangramento;
    @FXML
    private RadioButton opcaoTemSangramentoOuvido;
    @FXML
    private RadioButton opcaoTemSangramentoGengiva;
    @FXML
    private RadioButton opcaoTemSangramentoNariz;
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
    private void goToScreen8(ActionEvent event) {
        if (!opcaoNaoTemSangramento.isSelected() && !opcaoTemSangramento.isSelected() && !opcaoTemSangramentoOuvido.isSelected()
                && !opcaoTemSangramentoGengiva.isSelected() && !opcaoTemSangramentoNariz.isSelected()) {

            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");

            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();

        } else {
           /*  Armazenamento arm = new Armazenamento();
            if (opcaoNaoTemSangramento.isSelected()) {

            } else if (opcaoTemSangramento.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temSangramento", "paciente1", "Sangramento", true);

            } else if (opcaoTemSangramentoOuvido.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temSangramentoOuvido", "paciente1", "Sangramento", true);

            } else if (opcaoTemSangramentoGengiva.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temSangramentoGengiva", "paciente1", "Sangramento", true);

            } else if (opcaoTemSangramentoNariz.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temSangramentoNariz", "paciente1", "Sangramento", true);

            }*/
            myController.setScreen(PI.screen8ID);
        }
    }

    @FXML
    private void goToScreen6(ActionEvent event) {
        myController.setScreen(PI.screen6ID);
    }
    
     @FXML
    private void ComSangramento(ActionEvent event) {
         opcaoTemSangramentoOuvido.setDisable(false);
         opcaoTemSangramentoNariz.setDisable(false);
         opcaoTemSangramentoGengiva.setDisable(false);
     }
     @FXML
    private void SemSangramento(ActionEvent event) {
         opcaoTemSangramentoOuvido.setDisable(true);
         opcaoTemSangramentoNariz.setDisable(true);
         opcaoTemSangramentoGengiva.setDisable(true);
         
         opcaoTemSangramentoOuvido.setSelected(false);
         opcaoTemSangramentoNariz.setSelected(false);
         opcaoTemSangramentoGengiva.setSelected(false);
     }
}

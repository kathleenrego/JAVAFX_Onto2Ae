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
public class Tela6Controller implements Initializable, ControlledScreen {

    @FXML
    private RadioButton opcaoDiarreia;
    @FXML
    private RadioButton opcaoVomitoPersistente;
    @FXML
    private RadioButton opcaoVomitoPouco;
    @FXML
    private RadioButton opcaoSemVomito;
    @FXML
    private RadioButton opcaoSemDiarreia;

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
    private void goToScreen10(ActionEvent event) {
        if (!opcaoDiarreia.isSelected() && !opcaoVomitoPersistente.isSelected() && !opcaoVomitoPouco.isSelected()
                && !opcaoSemVomito.isSelected() && !opcaoSemDiarreia.isSelected()) {

            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");

            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();

        } else {
           /*  Armazenamento arm = new Armazenamento();
            if (opcaoDiarreia.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temDiarreia", "paciente1", "Diarreia", true);

            } else if (opcaoVomitoPersistente.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temVomitoPersistente", "paciente1", "Vomito", true);

            } else if (opcaoVomitoPouco.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temVomitoPouco", "paciente1", "Vomito", true);

            } else if (opcaoSemVomito.isSelected()) {

            } else if (opcaoSemDiarreia.isSelected()) {

            }*/
            myController.setScreen(PI.screen10ID);
        }
    }

    @FXML
    private void goToScreen8(ActionEvent event) {
        myController.setScreen(PI.screen8ID);
    }

}

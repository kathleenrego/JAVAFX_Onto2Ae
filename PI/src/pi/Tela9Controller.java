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
public class Tela9Controller implements Initializable, ControlledScreen {

    @FXML
    private RadioButton opcaoCoceiraForte;
    @FXML
    private RadioButton opcaoCoceiraFraca;
    @FXML
    private RadioButton opcaoCoceiraNaoApresenta;

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
    private void goToScreen5(ActionEvent event) {
        if (!opcaoCoceiraForte.isSelected() && !opcaoCoceiraFraca.isSelected() && !opcaoCoceiraNaoApresenta.isSelected()) {

            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");

            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();

        } else {
            /* Armazenamento arm = new Armazenamento();
            if (opcaoCoceiraForte.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temCoceira","paciente","Coceira", true);
                

            } else if (opcaoCoceiraFraca.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temCoceira","paciente1","Coceira", true);

            } else if (opcaoCoceiraNaoApresenta.isSelected()) {

            }*/
            myController.setScreen(PI.screen5ID);
        }
    }

    @FXML
    private void goToScreen3(ActionEvent event) {
        myController.setScreen(PI.screen3ID);
    }
}

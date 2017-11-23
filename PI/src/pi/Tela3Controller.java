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
public class Tela3Controller implements Initializable, ControlledScreen {

    @FXML
    private RadioButton opcaoDorAbdominal;
    @FXML
    private RadioButton opcaoDormuscularOutrosLocais;
    @FXML
    private RadioButton SemDorMuscular;
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
    private void goToScreen6(ActionEvent event) {
        if (!opcaoDorAbdominal.isSelected()  && !opcaoDormuscularOutrosLocais.isSelected()
                && !SemDorMuscular.isSelected()) {

            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");

            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();

        } else {
            Armazenamento arm = new Armazenamento();
           /*  if (opcaoDorAbdominal.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temDorAbdominal","paciente1","DorMuscular", true);

            } else if (opcaoDormuscularOutrosLocais.isSelected()) {
                arm.armazenarSintomasPacienteBoolean("temDorMuscular", "paciente1","DorMuscular", true);

            } else if (SemDorMuscular.isSelected()) {

            }*/
            myController.setScreen(PI.screen6ID);
        }
    }

    @FXML
    private void goToScreen4(ActionEvent event) {
        myController.setScreen(PI.screen4ID);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.Dialog;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Noemi
 */
public class FebreController implements Initializable, ControlledScreen {

    @FXML
    private RadioButton OpcaofebreBaixa;
    @FXML
    private RadioButton OpcaofebreAlta;
    @FXML
    private RadioButton opcaoSemFebre;
    @FXML
    private RadioButton opcaoFebreRepentina;
    @FXML
    private RadioButton opcaoFebreGradativa;
    @FXML
    private TextField campoDuracaoFebre;
    

    ScreensController myController;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void goToScreen3(ActionEvent event) {

        if (!opcaoSemFebre.isSelected() && !OpcaofebreAlta.isSelected() && !OpcaofebreBaixa.isSelected()
                && !opcaoFebreRepentina.isSelected() && !opcaoFebreGradativa.isSelected() && campoDuracaoFebre.getText().equals("")) {

            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
            dialogoAviso.setTitle("Diálogo de Aviso");
            dialogoAviso.setHeaderText("ERRO!");

            dialogoAviso.setContentText("Escolha uma alternativa!");
            dialogoAviso.showAndWait();
            

        }
        
        else {
          /* Armazenamento arm = new Armazenamento();
            String duracao= campoDuracaoFebre.getText();
            int duracao_int = Integer.parseInt(duracao);
            if (opcaoSemFebre.isSelected()) {
                
                

            } else if (OpcaofebreAlta.isSelected()) {
                //arm.armazenarSintomasPacienteDouble("temFebre","paciente1", "Febre",39, duracao_int );

            } else if (OpcaofebreBaixa.isSelected()) {
               // arm.armazenarSintomasPacienteDouble("temFebre","paciente1", "Febre",38, duracao_int );
            } else if (opcaoFebreRepentina.isSelected()) {
               // arm.armazenarSintomasPacienteString("temFebreRepentina","paciente1", "Febre", "repentino");


            } else if (opcaoFebreGradativa.isSelected()) {
               // arm.armazenarSintomasPacienteString("temFebreGradativa","paciente1", "Febre", "gradativo");
            }*/
            myController.setScreen(PI.screen3ID);
        }
    }
    @FXML
    private void goToScreenInicial(ActionEvent event) {
        myController.setScreen(PI.screen1ID);
    }
     @FXML
     private void clicouSemFebre(ActionEvent event) {
         
         
         opcaoFebreGradativa.setDisable(true);
         opcaoFebreRepentina.setDisable(true);
         opcaoFebreGradativa.setSelected(false);
         opcaoFebreRepentina.setSelected(false);
     }
     @FXML
     private void clicouFebre(ActionEvent event) {
         opcaoFebreGradativa.setDisable(false);
         opcaoFebreRepentina.setDisable(false);
     }

    }

    


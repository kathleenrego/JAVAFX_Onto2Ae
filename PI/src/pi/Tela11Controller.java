/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Noemi
 */
public class Tela11Controller implements Initializable, ControlledScreen {
    @FXML
    private PieChart piechart;
    
    @FXML
    private Label labelResultado;
    
    ScreensController myController;
    /**
     * Initializes the controller class.
     */
  static final Duration ANIMATION_DURATION = new Duration(500);
  static final double ANIMATION_DISTANCE = 0.15;
  private double cos;
  private double sin;
  private PieChart chart;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
    
    @FXML
    private void AparecerGrafico(ActionEvent event) {
        ObservableList<PieChart.Data> pieChartData = 
                FXCollections.observableArrayList(
                    new PieChart.Data("Dengue", 10),
                    new PieChart.Data("Dengue hemorragica", 9),
                    new PieChart.Data("Chykungunha", 15),
                    new PieChart.Data("Zyka", 10));
        
        piechart.setTitle("DOENÇAS");
        
        piechart.setData(pieChartData);
    }

  
}

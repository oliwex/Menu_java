/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.chart.Chart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Minio
 */
public class AplicationScreenController 
{
    @FXML
    private Button back;
    @FXML
    private Label title;
    @FXML
    private Chart chart;
    
    
    private MainScreenController mainScreenController;
    
    private void setElements()    /*sets the text on buttons*/
    {
        this.back.setText("Powrót");
        this.title.setText("Wykres prezentujący działanie aplikacji");

    }
    @FXML
    public void backMenu()
    {
        this.mainScreenController.loadMenuScreen();
    }
    
    public void setMainScreenController(MainScreenController mainScreenController)
    {
        this.mainScreenController=mainScreenController;
    }
    
    public void initialize()
    {
        this.setElements();
    }
}

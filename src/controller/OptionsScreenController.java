/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author Minio
 */
public class OptionsScreenController {
    
    @FXML
    private Button back;
    
    private MainScreenController mainScreenController;
    
    private void setElements()
    {
        this.back.setText("Powrót");
    }
    
    public void setMainScreenController(MainScreenController mainScreenController)
    {
        this.mainScreenController=mainScreenController;
    }
    
    public void backMenu()
    {
        this.mainScreenController.loadMenuScreen();
    }
    
    public void initialize()
    {
        this.setElements();  
    }
}

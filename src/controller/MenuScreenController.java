/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.chart.Chart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;




/**
 *
 * @author Minio
 */
public class MenuScreenController {
        
    @FXML
    private Button app;
    @FXML
    private Button options;
    @FXML
    private Button exit;

    
    private MainScreenController mainScreenController;
    
    private void setButton()    /*sets the text on buttons*/
    {
        this.app.setText("Aplication");
        this.options.setText("Options");
        this.exit.setText("Exit");

    }
    public void openAplication()
    {   FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/fxml/AplicationScreen.fxml"));
        Pane pane=null;
        try {
            pane=loader.load();
        } catch (IOException ex) {
            Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        AplicationScreenController aplicationScreenController=loader.getController();//referencja do Aplikacji
        aplicationScreenController.setMainScreenController(mainScreenController); //referencja do Aplikacji
        
        mainScreenController.setScreen(pane);
    }
    public void openOptions()
    {
        FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/fxml/OptionsScreen.fxml"));
        Pane pane=null;
        try {
            pane=loader.load();
        } catch (IOException ex) {
            Logger.getLogger(MenuScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        OptionsScreenController optionsScreenController=loader.getController();//referencja do Aplikacji
        optionsScreenController.setMainScreenController(mainScreenController); //referencja do Aplikacji
        
        mainScreenController.setScreen(pane);
    }
    public void closeAplication()
    {
        Platform.exit();
    }
    
    public void setMainScreenController(MainScreenController mainScreenController) //przypisanie referencji z klasy MainScreenController
    {
        this.mainScreenController=mainScreenController;
    }
    
    
    @FXML
    public void initialize() 
    {
        this.setButton();
    }
}

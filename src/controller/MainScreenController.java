/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Minio
 */
public class MainScreenController /*klasa której celem jest przypisanie do głównego ekranu nakładki z menu*/
{
    
    @FXML
    private StackPane mainStackPane;
    
   
    public void setScreen(Pane pane) //dodaje elementy do Pane 
    {   mainStackPane.getChildren().clear(); //czyści stackpane
        mainStackPane.getChildren().add(pane);//dodaje do stackpane elementy takie jak wykres i button
    }

    @FXML
    public void initialize() 
    {
        this.loadMenuScreen();
    }
    public void loadMenuScreen()
    {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
	Pane pane = null;
	try 
        {
            pane = loader.load();
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
	}
        MenuScreenController menuScreenController=loader.getController();
        menuScreenController.setMainScreenController(this);
        this.setScreen(pane);
    }
}

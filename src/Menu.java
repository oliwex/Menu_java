/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Minio
 */
public class Menu extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        

            FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/fxml/MainScreen.fxml"));
            StackPane stackpane=loader.load();
            Scene scene=new Scene(stackpane,400,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Program with changing screen");
            primaryStage.setResizable(false);
            primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

package br.edu.ifba.saj.ads.poo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControleErro {
    @FXML
    private Button xButton;

    @FXML
    private void handleClickX(ActionEvent event){
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tela4Encomendar.fxml"));
        Parent root = loader.load();
        //controlador da tela 4
        ControleEncomendar controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        } catch (Exception e) {
                e.printStackTrace();
        }  
    }
}

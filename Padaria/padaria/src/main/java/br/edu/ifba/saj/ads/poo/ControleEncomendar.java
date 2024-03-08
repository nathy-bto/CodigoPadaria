package br.edu.ifba.saj.ads.poo;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControleEncomendar {
    @FXML
    private TextField nomeTextField;

    @FXML
    private Button encomendarButton;

    @FXML
    private Text saldoText;

    @FXML
    private Button xButton;

    private Padaria padaria;
    private List<Produtos> listaProdutos;
    private Fregues fregues;

    @FXML
    private void handleClickEncomendar(ActionEvent event){
        String nome = nomeTextField.getText();
        padaria.encomedarProduto(null, null);
        double novoSaldo = fregues.getSaldo();
        saldoText.setText(String.valueOf(novoSaldo));
    }

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

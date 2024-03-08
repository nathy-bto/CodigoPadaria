package br.edu.ifba.saj.ads.poo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import br.edu.ifba.saj.ads.poo.Padaria;

public class ControleCadastrarProduto {
    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField codigoTextField;

    @FXML
    private TextField valorTextField;

    @FXML
    private TextField quantidadeTextField;

    @FXML
    private Button cadastrarProdutoButton;

    @FXML
    private Button xButton;

    private Padaria padaria;

    @FXML
    private void handleClickCadastrarProduto(ActionEvent event){
        String nome = nomeTextField.getText();
        String codigo = codigoTextField.getText();
        String valor = valorTextField.getText();
        String quantidade = quantidadeTextField.getText();

        try {
            padaria.adicionarProduto(null);
        } catch (Exception e) {
            // TODO: handle exception
            //abrir tela de erro
        }
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

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

public class ControleVirarFregues {
    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField idadeTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField senhaTextField;

    @FXML
    private TextField saldoTextField;

    @FXML
    private Button virarFreguesButton;

    @FXML
    private Button cadastrarProdutoButton;

    @FXML
    private Button xButton;

    private Padaria padaria;

    @FXML
    private void handleClickVirarFregues(ActionEvent event){
        String nome = nomeTextField.getText();
        String idade = nomeTextField.getText();
        String email = nomeTextField.getText();
        String senha = nomeTextField.getText();
        String saldo = nomeTextField.getText();

        try {
           padaria.adicionarFregues(email, senha, null);
        } catch (Exception e) {
            //autenticacao invalida
            //abrir tela de erro
        }
    }

    @FXML
    private void handleClickCadastrarProduto(ActionEvent event){
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tela3CadastrarProduto.fxml"));
        Parent root = loader.load();
        //controlador da tela 3
        ControleCadastrarProduto controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        } catch (Exception e) {
            e.printStackTrace();
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

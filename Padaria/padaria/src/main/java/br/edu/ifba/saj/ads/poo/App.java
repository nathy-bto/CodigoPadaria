package br.edu.ifba.saj.ads.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// import java.io.IOException;

// /**
//  * JavaFX App
//  */
// public class App extends Application {

//     private static Scene scene;
//     private static Stage stage;

//     @Override
//     public void start(Stage primaryStage) throws IOException {
//         stage = primaryStage;
//         scene = new Scene(loadFXML("tela1Entrar"), 504, 359);
//         stage.setScene(scene);
//         stage.show();
//     }

//     static void setRoot(String fxml) throws IOException {
//         scene.setRoot(loadFXML(fxml));
//     }

//     private static Parent loadFXML(String fxml) throws IOException {
//         FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
//         return fxmlLoader.load();
//     }

//     public static void main(String[] args) {
//         launch();
//     }

//     public static void abrir() throws IOException{
//         setRoot("tela1Entrar");
//     }
// }

public class App extends Application{
    public static void main(String[] args) throws Exception{
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tela1Entrar.fxml"));
       Parent root = fxmlLoader.load();
       Scene tela = new Scene(root);

       primaryStage.setTitle("paodaria");
       primaryStage.setScene(tela);
       primaryStage.show();


    }
}
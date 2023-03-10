package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	// Método start() é onde a aplicação JavaFX é iniciada
	@Override
	public void start(Stage primaryStage) {
		try {
			// Criando um objeto FXMLLoader para carregar a view FXML
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			// Carregando a view FXML
			ScrollPane scrollPane = loader.load();
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			// Criando uma cena para a view carregada
			Scene mainScene = new Scene(scrollPane);
			// Setando a cena no palco principal
			primaryStage.setScene(mainScene);
			// Definindo o título do palco principal
			primaryStage.setTitle("Sample JavaFX application");
			// Exibindo o palco principal
			primaryStage.show();
		} catch (IOException e) {
			// Se houver uma exceção, imprime a stack trace
			e.printStackTrace();
		}
	}

	// Método main() que é chamado quando a aplicação é iniciada
	public static void main(String[] args) {
		// Chama o método launch() da classe Application, iniciando a aplicação JavaFX
		launch(args);
	}
}

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.WarControl;

/**
 * Main class to the AED final project
 * @author Victor Mora
 */
public class Main extends Application {
	
	public static BorderPane root = new BorderPane();
	public static WarControl war = new WarControl();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static BorderPane getRoot() {
		return root;
	}
	
	public static WarControl getWar() {
		return war;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}



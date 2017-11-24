import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application{
    public void start(Stage primaryStage) throws Exception (
            FXML.Loader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.Load(new FileInputStream(
                    name "C:\\Users\\user\\IdeaProjects\\dbTest"
            ));
            )
}

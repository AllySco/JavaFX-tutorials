import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("gridpane");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name Label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0,0);

        //Name Input
        TextField nameInput = new TextField("Ally");
        GridPane.setConstraints(nameInput, 1,0);

        //Password Label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(nameLabel, 0,1);

        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText("Type your Password");
        GridPane.setConstraints(passInput, 1,1);


        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1,2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        Scene scene = new Scene(grid, 300, 300);

        window.setScene(scene);
        window.show();

    }


}
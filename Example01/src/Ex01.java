import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

    public static void main(String[] args) {
        launch(args); //initialise javafx application also calls start method
    }

    public void onButtonFarewellWorldClicked(ActionEvent event){
        System.out.println("JavaFX says 'Farewell cruel world...'");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //set window title
        primaryStage.setTitle("Example 01");

        // create user interface
        Button buttonHelloWorld = new Button("Hello world");
        Button buttonFarewellWorld = new Button("Farewell World");

        // create scene root
        VBox vBox = new VBox();
        vBox.getChildren().addAll(buttonHelloWorld, buttonFarewellWorld);

        // attach event handler
        buttonHelloWorld.setOnAction(event -> System.out.println("JavaFX says 'Hello world'"));
        buttonFarewellWorld.setOnAction(this::onButtonFarewellWorldClicked);

        // set scene.
        primaryStage.setScene(new Scene(vBox, 250, 150));

        // Show stage.
        primaryStage.show();


    }
}

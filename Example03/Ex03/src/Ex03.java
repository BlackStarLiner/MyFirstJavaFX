import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lblX = new Label("X");
        TextField txtX = new TextField();
        Label lblY = new Label("Y");
        TextField txtY = new TextField();

        Label lblOutput = new Label("The output goes here.");

        Button btnMin = new Button("Min");
        Button btnSum = new Button("Sum");

        HBox hbxX = new HBox();
        hbxX.getChildren().addAll(lblX, txtX);

        HBox hbxY = new HBox();
        hbxY.getChildren().addAll(lblY, txtY);

        VBox root = new VBox();
        root.getChildren().addAll(hbxX, hbxY, btnMin, btnSum, lblOutput);

        btnMin.setMaxWidth(Double.MAX_VALUE);
        btnSum.setMaxWidth(Double.MAX_VALUE);
        root.setSpacing(5);
        root.setPadding(new Insets(10, 10, 10, 10));
        lblX.setMaxHeight(Double.MAX_VALUE);
        lblY.setMaxHeight(Double.MAX_VALUE);
        btnMin.setOnAction(event -> {
            int x = Integer.parseInt(txtX.getText());
            int y = Integer.parseInt(txtY.getText());

            int res = y;
            if(x < y) res = x;

            lblOutput.setText("Min = " + res);
        });

        btnSum.setOnAction(event -> {

            int x = Integer.parseInt(txtX.getText());
            int y = Integer.parseInt(txtY.getText());

            lblOutput.setText("Sum = " + (x+y));
        });

        txtX.setOnAction(event -> {
            try{
                int x = Integer.parseInt(txtX.getText());
                int y = Integer.parseInt(txtY.getText());
                lblOutput.setText("x = " + x + ", y = " + y);
            }catch (NumberFormatException e){
                lblOutput.setText("Invalid input...enter integer.");
            }
        });

        txtY.setOnAction(event -> {
            try{
                int x = Integer.parseInt(txtX.getText());
                int y = Integer.parseInt(txtY.getText());
                lblOutput.setText("x = " + x + ", y = " + y);
            }catch (NumberFormatException e){
                lblOutput.setText("Invalid input...enter integer.");
            }
        });

        primaryStage.setTitle("Example 3");
        primaryStage.setScene(new Scene(root, 320, 180));
        primaryStage.show();

    }
}

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Example02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Example 02");

        //primaryStage.setScene(getHorizontalLayout());
        //primaryStage.setScene(getVerticalBox());
        //primaryStage.setScene(getFlowLayout());
        //primaryStage.setScene(getStackedLayout());
        //primaryStage.setScene(getBorderLayout());
        primaryStage.setScene(getGridLayout());
        primaryStage.show();
    }

    public Scene getHorizontalLayout(){
        HBox root = new HBox();

        // add buttons to the pane
        root.getChildren().add(new Button("Start"));
        root.getChildren().add(new Button("Rewind"));
        root.getChildren().add(new Button("Pause"));
        root.getChildren().add(new Button("Play"));
        root.getChildren().add(new Button("Fast Forward"));
        root.getChildren().add(new Button("End"));
        root.getChildren().add(new Button("Stop"));

        return new Scene(root);
    }

    public Scene getVerticalBox(){

        VBox root = new VBox();

        Button btnStart = new Button("Start");
        Button btnRewind = new Button("Rewind");
        Button btnPause = new Button("Pause");
        Button btnPlay = new Button("Play");
        Button btnFastForward = new Button("FastForward");
        Button btnEnd = new Button("End");
        Button btnStop = new Button("Stop");

        // change the width of the buttons to their maximum size
        btnStart.setMaxWidth(Double.MAX_VALUE);
        btnRewind.setMaxWidth(Double.MAX_VALUE);
        btnPause.setMaxWidth(Double.MAX_VALUE);
        btnPlay.setMaxWidth(Double.MAX_VALUE);
        btnFastForward.setMaxWidth(Double.MAX_VALUE);
        btnEnd.setMaxWidth(Double.MAX_VALUE);
        btnStop.setMaxWidth(Double.MAX_VALUE);

        root.getChildren().addAll(btnStart, btnRewind, btnPause, btnPlay,
                btnFastForward, btnEnd, btnStop);

        return new Scene(root);
    }

    public Scene getFlowLayout(){

        FlowPane root = new FlowPane(Orientation.VERTICAL);

        // add buttons to the pane
        root.getChildren().add(new Button("Start"));
        root.getChildren().add(new Button("Rewind"));
        root.getChildren().add(new Button("Pause"));
        root.getChildren().add(new Button("Play"));
        root.getChildren().add(new Button("Fast Forward"));
        root.getChildren().add(new Button("End"));
        root.getChildren().add(new Button("Stop"));

        return new Scene(root);
    }

    public Scene getStackedLayout(){

        StackPane root = new StackPane();

        // add buttons to the pane
        root.getChildren().add(new Button("Start"));
        root.getChildren().add(new Button("Rewind"));
        root.getChildren().add(new Button("Pause"));
        root.getChildren().add(new Button("Play"));
        root.getChildren().add(new Button("Fast Forward"));
        root.getChildren().add(new Button("End"));
        root.getChildren().add(new Button("Stop"));

        return new Scene(root);
    }

    // can only have a maximum of 5 children
    public Scene getBorderLayout(){
        BorderPane root = new BorderPane();

        // add buttons to the pane
        Button btnStart = new Button("Start");
        Button btnRewind = new Button("Rewind");
        Button btnPause = new Button("Pause");
        Button btnPlay = new Button("Play");
        Button btnFastForward = new Button("FastForward");

        // change the width of the buttons to their maximum size
        btnStart.setMaxWidth(Double.MAX_VALUE);
        btnRewind.setMaxWidth(Double.MAX_VALUE);
        btnPause.setMaxWidth(Double.MAX_VALUE);
        btnPlay.setMaxWidth(Double.MAX_VALUE);
        btnFastForward.setMaxWidth(Double.MAX_VALUE);

        // changes the height of the button to their max size
        btnStart.setMaxHeight(Double.MAX_VALUE);
        btnRewind.setMaxHeight(Double.MAX_VALUE);
        btnPause.setMaxHeight(Double.MAX_VALUE);
        btnPlay.setMaxHeight(Double.MAX_VALUE);
        btnFastForward.setMaxHeight(Double.MAX_VALUE);

        root.setLeft(btnStart);
        root.setTop(btnRewind);
        //root.setRight(btnPause);
        //root.setBottom(btnPlay);
        root.setCenter(btnFastForward);

        return new Scene(root);
    }
    
    public Scene getGridLayout(){
        GridPane root = new GridPane();
        
        root.setHgap(5);
        root.setVgap(10);
        
        root.setPadding(new Insets(0,10,0,10));

        Button btnStart = new Button("Start");
        Button btnRewind = new Button("Rewind");
        Button btnPause = new Button("Pause");
        Button btnPlay = new Button("Play");
        Button btnFastForward = new Button("FastForward");
        Button btnEnd = new Button("End");
        Button btnStop = new Button("Stop");
        Button btnHelp = new Button("Help");
        Button btnAbout = new Button("About");

        // change the width of the buttons to their maximum size
        btnStart.setMaxWidth(Double.MAX_VALUE);
        btnRewind.setMaxWidth(Double.MAX_VALUE);
        btnPause.setMaxWidth(Double.MAX_VALUE);
        btnPlay.setMaxWidth(Double.MAX_VALUE);
        btnFastForward.setMaxWidth(Double.MAX_VALUE);
        btnEnd.setMaxWidth(Double.MAX_VALUE);
        btnStop.setMaxWidth(Double.MAX_VALUE);
        btnHelp.setMaxWidth(Double.MAX_VALUE);
        btnAbout.setMaxWidth(Double.MAX_VALUE);

        btnStart.setMaxHeight(Double.MAX_VALUE);
        btnRewind.setMaxHeight(Double.MAX_VALUE);
        btnPause.setMaxHeight(Double.MAX_VALUE);
        btnPlay.setMaxHeight(Double.MAX_VALUE);
        btnFastForward.setMaxHeight(Double.MAX_VALUE);
        btnEnd.setMaxHeight(Double.MAX_VALUE);
        btnStop.setMaxHeight(Double.MAX_VALUE);
        btnHelp.setMaxHeight(Double.MAX_VALUE);
        btnAbout.setMaxHeight(Double.MAX_VALUE);

        root.add(btnStart, 0, 0);
        root.add(btnRewind, 1, 0);
        root.add(btnPause, 2, 0);

        root.add(btnPlay, 0, 1, 2, 1);
        root.add(btnFastForward, 2, 1);

        root.add(btnStop, 0, 2, 2, 2);
        root.add(btnEnd, 2, 2, 1, 2);

        root.add(btnAbout, 3, 3);
        root.add(btnHelp, 3, 2);


        return new Scene(root);
    }


}

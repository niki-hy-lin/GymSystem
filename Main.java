import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.applet.Applet;

public class Main extends Application {

    Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("N Gym");

        Text welcomeMessage = new Text("Welcome to N Gym! How can I help you?");
        welcomeMessage.setFont(Font.font(null, FontWeight.BOLD, 15));

        //Setting the color of the text
        welcomeMessage.setFill(Color.CRIMSON);




        //close by clicking the red arrow button
        window.setOnCloseRequest( e -> closeProgram());

        //codes to open a new AlertBox
//        Button button = new Button("Close program");
//        button.setOnAction(e -> AlertBox.display("Title of the window", "this is an alert box"));


        //codes to open a new ConfirmBox, and check if it needs to be closed
//        Button button = new Button("Close program");
//        button.setOnAction(e ->
//        {boolean response = ConfirmBox.display("Title of the window", "Are you sure");
//                if (response)
//                    window.close();
//        }
//        );

        //codes to close window using method named closeProgram
        Button quitButton = new Button("Quit");
        quitButton.setOnAction(e -> {
            e.consume();
            closeProgram();
                }
        );

        Button infoButton = new Button("Info");
        infoButton.setOnAction( e -> {
                    e.consume();
                    InfoBox.display("", "We are pleased to advertise the following amenities.\n" +
                            "FitLife has 3 cardio machines and 9 weights.\n" +
                            "We do not have a pool. We do have child care.\n" +
                            "\n" +
                            "To learn more about cardio machines, click 'Cardio'.\n" +
                            "To learn more about weight machines, click 'weights'.");
                }
        );


        Button signUpButton = new Button("Sign Up");

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(welcomeMessage,infoButton,signUpButton,quitButton);
        Scene scene = new Scene(layout, 600, 600);
        window.setScene(scene);
        window.show();
    }



    private void closeProgram(){
       Boolean answer = ConfirmBox.display("", "Want to exit?");
       if (answer)
           window.close();
    }




}


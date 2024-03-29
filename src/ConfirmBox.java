import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ConfirmBox {

    static boolean answer;

    //create two buttons
    static Button yesButton = new Button("Yes");
    static Button noButton = new Button("No");

    public static boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(200);

        Label label = new Label();
        label.setText(message);


        yesButton.setOnAction(e -> {
                    answer = true;
                    window.close();
                }
        );

        noButton.setOnAction( e -> {
                    answer = false;
                    window.close();
                }

        );

        VBox layout = new VBox(10);

        //Adding buttons
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;


    }
}

import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;


public class InfoBox {

    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(450);

        Label label = new Label();
        label.setText(message);

        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> window.close());

        Button cardioButton = new Button("Cardio");
        Button weightsButton = new Button("Weights");

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,cardioButton,weightsButton,closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
}

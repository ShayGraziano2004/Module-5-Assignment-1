import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPaneApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane to display the images
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Load the image files
        Image caImage = new Image("ca.gif");
        Image chinaImage = new Image("china.gif");
        Image ukImage = new Image("uk.gif");
        Image usImage = new Image("us.gif");

        // Create ImageView objects for each image
        ImageView caImageView = new ImageView(caImage);
        ImageView chinaImageView = new ImageView(chinaImage);
        ImageView ukImageView = new ImageView(ukImage);
        ImageView usImageView = new ImageView(usImage);

        // Add ImageView objects to the GridPane
        gridPane.add(caImageView, 0, 0);
        gridPane.add(chinaImageView, 1, 0);
        gridPane.add(ukImageView, 0, 1);
        gridPane.add(usImageView, 1, 1);

        // Create a Scene and set it on the stage
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setScene(scene);

        // Set the stage title
        primaryStage.setTitle("Image Grid Pane Example");

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

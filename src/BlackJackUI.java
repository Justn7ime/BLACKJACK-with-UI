import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Priority;
import javafx.geometry.Insets;
import javafx.scene.control.ProgressBar;
import javafx.beans.binding.Bindings;
import java.nio.charset.StandardCharsets;

public class BlackJackUI extends Application {

    private Stage stage;
    private Scene scene;
    private VBox root;

    // name stuff
    private HBox topRow;
    private Label playerName;

    // where cards go
    private HBox cardRow;
    private ImageView[] cardHolder;

    // total and buttons
    private HBox bottomRow;
    private Label total;
    private Button stand;
    private Button hit;

    public BlackJackUI() {
        this.stage = null;
        this.scene = null;
        this.root = new VBox(3);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BlackJackUI app = new BlackJackUI();
        app.stage = stage;
        stage.setTitle("Black Jack");
        // topRow
        topRow = new HBox(4);
        playerName = new Label(Player.getName());
        topRow.setPadding(new Insets(5, 2, 2, 5));
        topRow.getChildren().addAll(playerName);

        // adding all to root
        root.getChildren().addAll(topRow);
        root.setSpacing(0);

        // setting scene
        app.scene = new Scene(app.root);
        app.stage.setOnCloseRequest(event -> Platform.exit());
        app.stage.setTitle("Casino");
        app.stage.setScene(app.scene);
        app.stage.sizeToScene();
        app.stage.show();
        Platform.runLater(() -> app.stage.setResizable(false));
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }
}

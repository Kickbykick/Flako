package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.ListView;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Main extends Application {

    ListView<String> flavourList;
    ListView<String> toppingList;
    ListView<String> priceList;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setTitle("Summary View");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        Scene scene = new Scene(new Group());

        SummaryView summaryView = new SummaryView();
        MilkshakeModel milkshakeModel = new MilkshakeModel(); // Scope - main
        IncrementView incrementView = new IncrementView();

        scene.setRoot(incrementView.hBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

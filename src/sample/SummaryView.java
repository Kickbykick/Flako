package sample;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class SummaryView extends StackPane {
    VBox vbox = new VBox(5); // spacing = 8
    ListView<String> flavourList;
    ListView<String> toppingList;
    ListView<String> priceList;

    public SummaryView(){
        vbox.setPadding(new Insets(10,10,10,10));

        flavourList = new ListView<>();
        toppingList = new ListView<>();
        priceList = new ListView<>();

        flavourList.getItems().addAll("Chocolate x 3 : $7", "Vanilla x 3 : $7", "Butterscotch x 3 : $7", "Chocolate x 3 : $7", "Chocolate x 3 : $7", "Chocolate x 3 : $7");
        priceList.getItems().addAll("Toppings x 4 : $2", "Flavors x 4 : $4", "Total = $6");

        TreeItem flavoursTree = new TreeItem("Flavours");
        TreeItem toppingTree = new TreeItem("Toppings");
        TreeItem priceTree = new TreeItem("Price");

        Text flavoursText = new Text("Toppings");
        flavoursText.setStyle("-fx-font: 18 arial;");
        Text toppingText = new Text("Flavours");
        toppingText.setStyle("-fx-font: 18 arial;");
        Text priceText = new Text("Price");
        priceText.setStyle("-fx-font: 18 arial;");

        vbox.getChildren().addAll(flavoursText, flavourList,  toppingText, toppingList, priceText, priceList);
    }


}

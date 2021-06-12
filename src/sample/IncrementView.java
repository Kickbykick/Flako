package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

import java.awt.*;

public class IncrementView {
    HBox hBox = new HBox(5);
    Text currentPickText;

    public IncrementView(){
        hBox.setPadding(new Insets(5,5,5,5));
        Button addButton = new Button();
        addButton.setText("+");
        Button subtractButton = new Button();
        subtractButton.setText("-");

        addButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Add button");
            }});

        subtractButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Subtract pressed");
            }});

        currentPickText = new Text();
        currentPickText.setStyle("-fx-font: 18 arial;");
        Text pointerText = new Text("Current Pick:  ");
        pointerText.setStyle("-fx-font: 18 arial;");
        
        hBox.getChildren().addAll(addButton, subtractButton, pointerText, currentPickText);
    }

    public void changeCurrentPick(){

    }
}

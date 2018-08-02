package Assgniment2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.*;
import javafx.scene.*;
import java.util.*;
import javafx.geometry.*;
public class scene1 extends Application {
    private int numtopping;
    private int maxtopping;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ArrayList<String> chosenTopping = new ArrayList<String>();
        VBox vBox= new VBox(10);
        Scene scene1 = new Scene(vBox,500,500);

        Label entername =new Label("Please enter your name:");
        TextField name =new TextField();
        name.setPrefColumnCount(15);
        Label chosetype =new Label("Please chose your type:");
        RadioButton radioButton1 =new RadioButton("Regular");
        radioButton1.setUserData("Regular");
        RadioButton radioButton2 =new RadioButton("Feast");
        radioButton2.setUserData("Feast");
        radioButton1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> ov,
                                Boolean old_val, Boolean new_val) {
                if (new_val==true)
                    numtopping=2;
                else
                    numtopping=3;
                maxtopping=numtopping;
            }
        });
        ToggleGroup group1 = new ToggleGroup();
        ToggleGroup group2 = new ToggleGroup();
        radioButton1.setToggleGroup(group1);
        radioButton2.setToggleGroup(group1);

        Label chosesize =new Label("Please chose your size:");
        RadioButton radioButton3 =new RadioButton("Small");
        radioButton3.setUserData("Small");
        RadioButton radioButton4 =new RadioButton("Medium");
        radioButton4.setUserData("Medium");
        RadioButton radioButton5 =new RadioButton("Large");
        radioButton5.setUserData("Large");
        radioButton3.setToggleGroup(group2);
        radioButton4.setToggleGroup(group2);
        radioButton5.setToggleGroup(group2);
        String[] toppings={"Beef","Sausage","Chicken","Mushroom","Oliver","Green Pepper","Lame"};
        Label selecttopping =new Label("Please select your topping:");
        Button next = new Button("Next");




        vBox.getChildren().add(entername);
        vBox.getChildren().add(name);
        vBox.getChildren().add(chosetype);
        vBox.getChildren().add(radioButton1);
        vBox.getChildren().add(radioButton2);
        vBox.getChildren().add(chosesize);
        vBox.getChildren().add(radioButton3);
        vBox.getChildren().add(radioButton4);
        vBox.getChildren().add(radioButton5);
        vBox.getChildren().add(selecttopping);
        for(int i=0;i<toppings.length;i++){
            CheckBox checkBox=new CheckBox(toppings[i]);
            checkBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
                public void changed(ObservableValue<? extends Boolean> ov,
                                    Boolean old_val, Boolean new_val) {
                    if (new_val==true&&numtopping>0) {

                        numtopping--;
                        chosenTopping.add(checkBox.getText());

                    }
                    else if (new_val==false&&numtopping<=0&&numtopping<maxtopping){
                        numtopping++;

                        chosenTopping.remove(checkBox.getText());
                    }
                }
            });
            vBox.getChildren().add(checkBox);
        }



        vBox.getChildren().add(next);

        primaryStage.setScene(scene1);
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String username = name.getText();
                String type=group1.getSelectedToggle().getUserData().toString();
                String size=group2.getSelectedToggle().getUserData().toString();

                scene2 s2 =new scene2(primaryStage,username,size,type,chosenTopping);

                s2.show();

            }
        });
        primaryStage.show();

    }
}

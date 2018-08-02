package Assgniment2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class scene2 {
    private VBox vBox2;
    private HBox hBox3;
    private Scene scene3;
    private Scene scene2;
    private Label printname;
    private Label printtype;
    private Label printsize;
    private Stage primaryStage;
    private ArrayList chosenTopping;
    private Label printoppings;
    private Label payment;
    private Button gopayment;

    public scene2(Stage primaryStage, String username, String size, String type, ArrayList<String>chosenTopping) {
        vBox2= new VBox(10);
        scene2 = new Scene(vBox2,500,500);
        hBox3= new HBox(10);
        scene3 = new Scene(hBox3,500,500);
        printname =new Label("Costumer name:"+username);
        printtype =new Label("Your Pizza type is :"+type);
        printsize =new Label("Your Pizza size is :"+size);
        payment=new Label("Please chose your payment");
        gopayment=new Button("Pay");
        vBox2.getChildren().add(printname);
        vBox2.getChildren().add(printtype);
        vBox2.getChildren().add(printsize);
        Hyperlink debit =new Hyperlink("debit");
        Hyperlink cash =new  Hyperlink ("Cash");
        Hyperlink credit =new Hyperlink ("Credit");
        hBox3.getChildren().add(debit);
        hBox3.getChildren().add(cash);
        hBox3.getChildren().add(credit);

        for(int i=0;i<chosenTopping.size();i++)
        {
            printoppings=new Label("Your number "+(i+1)+"is"+chosenTopping.get(i));
            vBox2.getChildren().add(printoppings);
        }
        vBox2.getChildren().add(payment);
        vBox2.getChildren().add(gopayment);
        this.primaryStage=primaryStage;
        gopayment.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                primaryStage.setScene(scene3);

            }
        });
       debit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                getHostServices().showDocument("https://www.paypal.com/us/home");
            }
        });
        cash.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

              Image image = new Image("1.jpg");
                ImageView img = new ImageView(image);
            }
        });
        credit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                getHostServices().showDocument("https://www.interac.ca/en/");
            }
        });

    }

    public void show (){
        primaryStage.setScene(scene2);
    }
}

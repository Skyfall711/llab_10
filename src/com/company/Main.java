package com.company;
import java.lang.String;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label nameLbl = new Label("Enter number:");
        TextField number = new TextField();
        Label msg = new Label();
        msg.setStyle("fx-text-fill: red;");
        Button drawBtn = new Button("Draw");
        Button exitBtn = new Button("Exit");
        drawBtn.setOnAction(e -> {
            int n = Integer.parseInt(number.getText());
            String str = "";
            for(int i = 0; i < n; i++){
                for(int j=0;j < i+1;j++){
                    str+=j+1;
                }
                str+="\n";
            }
            if (n>= 1 && n<=9) {
                msg.setText(str);
            } else {
                Platform.exit();
            }
        });
        exitBtn.setOnAction(e -> Platform.exit());
        VBox root = new VBox();
        root.setSpacing(15);
        root.getChildren().addAll(nameLbl, number,
                msg, drawBtn, exitBtn);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Practice 10");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

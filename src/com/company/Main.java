package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        root.setHgap(5);
        root.setVgap(5);

        TextField name = new TextField("your name");
        GridPane.setConstraints(name, 0, 0);

        TextField lastName = new TextField();
        GridPane.setConstraints(lastName, 0, 1);

        TextField comment = new TextField();
        comment.setPromptText("enter your comment");
        GridPane.setConstraints(comment, 0, 2);

        Button submit = new Button("submit");
        GridPane.setConstraints(submit, 1, 0);
        Button clear = new Button("clear");
        GridPane.setConstraints(clear, 1, 1);
        Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        submit.setOnAction(event -> {
            if (!comment.getText().isEmpty()) {
                label.setText(name.getText() + " " + lastName.getText() + "," + " shnorhakalutyun duq comment eq grel");
            } else {
                label.setText("duq comment cheq grel");
            }
        });
        clear.setOnAction(event -> {
            name.clear();
            lastName.clear();
            comment.clear();
            label.setText(null);
        });
        root.getChildren().addAll(name, comment, lastName, submit, clear, label);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


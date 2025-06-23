package com.daknight.generator.ui;

import com.daknight.generator.util.generators.PasswordGenerator;
import com.daknight.generator.util.generators.UsernameGenerator;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GeneratorUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        Label username = new Label("Username");
        username.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
        Label password = new Label("Password");
        password.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        TextField generatedUsername = new TextField(UsernameGenerator.generateUsername());
        generatedUsername.setEditable(false);
        generatedUsername.setStyle("-fx-font-size: 14px;");
        generatedUsername.setPrefWidth(200);
        TextField generatedPassword = new TextField(PasswordGenerator.generatePassword());
        generatedPassword.setEditable(false);
        generatedPassword.setStyle("-fx-font-size: 14px;");
        generatedPassword.setPrefWidth(200);

        Button generateButton = new Button("Generate");
        generateButton.setOnAction(e -> {
            String newUsername = UsernameGenerator.generateUsername();
            generatedUsername.setText(newUsername);
            String newPassword = PasswordGenerator.generatePassword();
            generatedPassword.setText(newPassword);
        });
        generateButton.setCursor(Cursor.HAND);
        generateButton.setStyle("""
            -fx-background-color: #4CAF50;
            -fx-text-fill: white;
            -fx-font-size: 14px;
            -fx-font-weight: bold;
            -fx-background-radius: 6;
            -fx-padding: 8 16;
        """);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(username, 0, 0);
        grid.add(generatedUsername, 1, 0);
        grid.add(password, 0, 1);
        grid.add(generatedPassword, 1, 1);
        grid.add(generateButton, 1, 2);

        grid.setAlignment(Pos.CENTER);
        root.setCenter(grid);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Login-Data-Generator");
        primaryStage.show();
    }
}

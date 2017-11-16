package gui;


import patientprocessing.Patient;
import users.Administrator;
import users.Doctor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

// work with JavaFx and SceneBuilder

public class Gui extends Application {
    public static void graphics() {
		
                Administrator admin = new Administrator("John");
		Doctor doc2 = new Doctor("Eddy");
                Patient steve = new Patient();
                doc2.prescribeMedication("drugxyz",steve );
                System.out.println("This is good");
                launch();
}

    @Override
    public void start(Stage primaryStage) { //Throws exception
        primaryStage.setTitle("java-buddy.blogspot.com");
        Group root = new Group();
        
        TextArea textArea = new TextArea();

        Button admin = new Button("Administrator");
        Button doctor = new Button("Doctor");
        Button nurse = new Button("Nurse");
        Button pharm = new Button("Pharmacist");
        
        admin.setOnAction((ActionEvent event) -> {
            System.out.println("Administrator");
        });
                doctor.setOnAction((ActionEvent event) -> {
            System.out.println("Doctor");
        });
                nurse.setOnAction((ActionEvent event) -> {
            System.out.println("Nurse");
        });
                pharm.setOnAction((ActionEvent event) -> {
            System.out.println("Pharmacist");
        });                
        
        VBox vBox = new VBox();
        vBox.getChildren().addAll(textArea, admin, doctor,nurse,pharm);
        
        root.getChildren().add(vBox);
        
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }
        
    }

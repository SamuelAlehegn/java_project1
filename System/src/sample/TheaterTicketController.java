package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TheaterTicketController {


    @FXML
    private Button searchButton;
    @FXML
    private Button showButtonOne;
    @FXML
    private Button showButtonTwo;
    @FXML
    private Button showButtonThree;
    @FXML
    private Button showButtonFour;
    @FXML
    private Label labelMessage;
    @FXML
    private Label successLabelMessage;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField searchTextField;



    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
        Platform.exit(); // to close the login page when register page is close
    }


    public void searchButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) searchButton.getScene().getWindow();
        if (searchTextField.getText().isBlank() == true) {
            labelMessage.setText("Please type before Search!");
       }


        else
            labelMessage.setText("No result for " + searchTextField.getText());
    }
    public void showButtonOneOnAction(ActionEvent event){
        Stage stage = (Stage) showButtonOne.getScene().getWindow();
        successLabelMessage.setText("Success! yow will get your tickets via email " );
    }
    public void showButtonTwoOnAction(ActionEvent event){
        Stage stage = (Stage) showButtonTwo.getScene().getWindow();
        successLabelMessage.setText("Success! yow will get your tickets via email " );
    }

    public void showButtonThreeOnAction(ActionEvent event){
        Stage stage = (Stage) showButtonThree.getScene().getWindow();
        successLabelMessage.setText("Success! yow will get your tickets via email " );
    }
    public void showButtonFourOneOnAction(ActionEvent event){
        Stage stage = (Stage) showButtonFour.getScene().getWindow();
        successLabelMessage.setText("Success! yow will get your tickets via email " );
    }

}



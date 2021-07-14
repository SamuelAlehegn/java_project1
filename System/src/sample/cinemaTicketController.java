/*
*
*               THIS CLASS IS USED TO CONTROL cinemaTicket.fxml,Frozen.fxml
*                bossBaby.fxml, Scoobi.fxml, Dolittel.fxml, badBoyz.fxml,
*                movieInfo.fxml AND
*                Frenemies.fxml PROCEED TO
*                NEXT STAGE BASED ON USER'S PREFERENCE
*
*
 */
package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class cinemaTicketController {

        @FXML
        private TextField searchTextField;
        @FXML
        private Label labelMessage;
        @FXML
        private Button searchButton;
        @FXML
        private Button cancelButton;
        @FXML
        private Button showButtonOne;
        @FXML
        private Button showButtonTwo;
        @FXML
        private Button showButtonThree;
        @FXML
        private Button showButtonFour;
        @FXML
        private Button showButtonFive;
        @FXML
        private Button showButtonSix;
        String boxOffice = "Office";


    public void showButtonOneOnAction(ActionEvent event) {
        Stage stage = (Stage) showButtonOne.getScene().getWindow();
        Frenemies();

    }
    public void showButtonTwoOnAction(ActionEvent event) {
        Stage stage = (Stage) showButtonTwo.getScene().getWindow();

        badBoys();

    }
    public void showButtonThreeOnAction(ActionEvent event) {
        Stage stage = (Stage) showButtonThree.getScene().getWindow();
        dolittle();
    }
    public void showButtonFourOnAction(ActionEvent event) {
        Stage stage = (Stage) showButtonFour.getScene().getWindow();
        scoobi();
    }
    public void showButtonFiveOnAction(ActionEvent event) {
        Stage stage = (Stage) showButtonFive.getScene().getWindow();
        bossBaby();
    }
    public void showButtonSixOnAction(ActionEvent event) {
        Stage stage = (Stage) showButtonSix.getScene().getWindow();
        frozen();
    }







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
         if (boxOffice.equals(searchTextField.getText().toLowerCase()) ) {
            boxOffice();
      }

        else
            labelMessage.setText("No result for " + searchTextField.getText());
    }







    public void boxOffice() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("movieInfo.fxml"));
            Stage movieInfo = new Stage();
            movieInfo.initStyle(StageStyle.UNDECORATED);
            movieInfo.setScene(new Scene(root, 777, 499));
            movieInfo.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void Frenemies() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Frenemies.fxml"));
            Stage movieInfo = new Stage();
            movieInfo.initStyle(StageStyle.UNDECORATED);
            movieInfo.setScene(new Scene(root, 670, 527));
            movieInfo.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void badBoys() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("badBoyz.fxml"));
            Stage movieInfo = new Stage();
            movieInfo.initStyle(StageStyle.UNDECORATED);
            movieInfo.setScene(new Scene(root, 669, 500));
            movieInfo.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void dolittle() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Dolittel.fxml"));
            Stage movieInfo = new Stage();
            movieInfo.initStyle(StageStyle.UNDECORATED);
            movieInfo.setScene(new Scene(root, 686, 504));
            movieInfo.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void scoobi() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Scoobi.fxml"));
            Stage movieInfo = new Stage();
            movieInfo.initStyle(StageStyle.UNDECORATED);
            movieInfo.setScene(new Scene(root, 774, 552));
            movieInfo.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void bossBaby() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("bossBaby.fxml"));
            Stage movieInfo = new Stage();
            movieInfo.initStyle(StageStyle.UNDECORATED);
            movieInfo.setScene(new Scene(root, 670, 522));
            movieInfo.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void frozen() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Frozen.fxml"));
            Stage movieInfo = new Stage();
            movieInfo.initStyle(StageStyle.UNDECORATED);
            movieInfo.setScene(new Scene(root, 677, 529));
            movieInfo.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
}




/*
*
*    THE ROLE OF THIS CLASS IS TO CONTROL homePage.fxml AND DIRECT
*    THE USER INTO NEXT STEP BASED ON THE USER PREFERENCE
*
*
 */


package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

public class homePageController {
    @FXML
    private Button bookDeliveryButton;
    @FXML
    private Button cinemaTicketButton;
    @FXML
    private Button stadiumTicketButton;
    @FXML
    private Button theaterTicketsButton;
    @FXML
    private Button cancelButton;

    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
        Platform.exit(); // to close the login page when register page is close
    }

    public void bookDeliveryButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) bookDeliveryButton.getScene().getWindow();
        bookDelivery();
    }

    public void cinemaTicketButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cinemaTicketButton.getScene().getWindow();
        cinemaTickets();
    }

    public void stadiumTicketButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) stadiumTicketButton.getScene().getWindow();
        stadiumTickets();
    }

    public void theaterTicketsButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) theaterTicketsButton.getScene().getWindow();
        theaterTickets();
    }

    //********************************************************************************************************************************************
    public void bookDelivery() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("bookDelivery.fxml"));
            Stage homePageStage = new Stage();
            homePageStage.initStyle(StageStyle.UNDECORATED);
            homePageStage.setScene(new Scene(root, 798, 598));
            homePageStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

//********************************************************************************************************************************************************
    public void cinemaTickets() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("cinemaTicket.fxml"));
            Stage homePageStage = new Stage();
            homePageStage.initStyle(StageStyle.UNDECORATED);
            homePageStage.setScene(new Scene(root, 800, 670));
            homePageStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

//*******************************************************************************************************************************************************************

    public void stadiumTickets() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("stadiumTicket.fxml"));
            Stage homePageStage = new Stage();
            homePageStage.initStyle(StageStyle.UNDECORATED);
            homePageStage.setScene(new Scene(root, 798, 598));
            homePageStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

//************************************************************************************************************************************************************************

    public void theaterTickets() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("theaterTicket.fxml"));
            Stage homePageStage = new Stage();
            homePageStage.initStyle(StageStyle.UNDECORATED);
            homePageStage.setScene(new Scene(root, 798, 598));
            homePageStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
}
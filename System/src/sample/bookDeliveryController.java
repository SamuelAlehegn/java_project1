/*
*
*  THE ROLE OF THIS CLASS IS TO CONTROL bookDelivery.fxml, Haddis.fxml,
*  LockedKeyBook.fxml, yeHabeshaJebdu.fxml, Emegua.fxml, FikrEskeMekabir.fxml
*  AND Werisa.fxml and direct the user to next stage based on user's preference
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

public class bookDeliveryController {

    @FXML
    private Button searchButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Button buyOneButton;
    @FXML
    private Button buyThreeButton;
    @FXML
    private Button buyFiveButton;
    @FXML
    private Button buySevenButton;
    @FXML
    private Button buyElevenButton;
    @FXML
    private Button buyTwelveButton;

    @FXML
    private TextField searchTextField;
    @FXML
    private Label noResultLableMessage;





    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
        Platform.exit(); // to close the login page when register page is close
    }
    public void searchButtonOnAction(ActionEvent event){
        Stage stage = (Stage) searchButton.getScene().getWindow();
         if (searchTextField.getText().isBlank() == true)
         {
             noResultLableMessage.setText("please type before search");
         } else
        noResultLableMessage.setText("No result for " + searchTextField.getText());
    }






    public void buyOneButtonOnAction(){
        Stage stage = (Stage) buyOneButton.getScene().getWindow();
        haddis();
    }

    public void buyThreeButtonOnAction(){
        Stage stage = (Stage) buyThreeButton.getScene().getWindow();
        lockedKey();
    }
    public void buyFiveButtonOnAction(){
        Stage stage = (Stage) buyFiveButton.getScene().getWindow();
        yeHabeshaJebdu();
    }
    public void buySevenButtonOnAction(){
        Stage stage = (Stage) buySevenButton.getScene().getWindow();
        emegua();
    }
    public void buyElevenButtonOnAction(){
        Stage stage = (Stage) buyElevenButton.getScene().getWindow();
        fikirEskeMekabir();
    }
    public void buyTwelveButtonOnAction(){
        Stage stage = (Stage) buyTwelveButton.getScene().getWindow();
        werisa();
    }



    public void haddis() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Haddis.fxml"));
            Stage haddis = new Stage();
            haddis.initStyle(StageStyle.UNDECORATED);
            haddis.setScene(new Scene(root, 701, 542));
            haddis.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void lockedKey() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("LockedKeyBook.fxml"));
            Stage lockedKey = new Stage();
            lockedKey.initStyle(StageStyle.UNDECORATED);
            lockedKey.setScene(new Scene(root, 710, 500));
            lockedKey.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void yeHabeshaJebdu() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("yeHabeshaJebdu.fxml"));
            Stage yeHabeshaJebdu = new Stage();
            yeHabeshaJebdu.initStyle(StageStyle.UNDECORATED);
            yeHabeshaJebdu.setScene(new Scene(root, 749, 665));
            yeHabeshaJebdu.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void emegua() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Emegua.fxml"));
            Stage emegua = new Stage();
            emegua.initStyle(StageStyle.UNDECORATED);
            emegua.setScene(new Scene(root, 704, 482));
            emegua.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }


    public void fikirEskeMekabir() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("FikrEskeMekabir.fxml"));
            Stage fikirEskeMekabir = new Stage();
            fikirEskeMekabir.initStyle(StageStyle.UNDECORATED);
            fikirEskeMekabir.setScene(new Scene(root, 669, 471));
            fikirEskeMekabir.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void werisa() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Werisa.fxml"));
            Stage werisa = new Stage();
            werisa.initStyle(StageStyle.UNDECORATED);
            werisa.setScene(new Scene(root, 655, 446));
            werisa.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }


    }



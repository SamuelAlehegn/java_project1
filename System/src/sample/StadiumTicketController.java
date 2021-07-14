/*
*
*               THIS CLASS CONTROLS ACTION RELATED TO STADIUM TICKETS
*               AND IT CONTROLS bestScorers.fxml, championsHistory.fxml and
*               FootballRank.fxml,
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

public class StadiumTicketController {


    @FXML
    private Button searchButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Button orderOneButton;
    @FXML
    private Button orderTwoButton;
    @FXML
    private Button orderThreeButton;
    @FXML
    private Button orderFourButton;
    @FXML
    private Label successAndFailLableMessage;
    @FXML
    private Label noResultLableMessage;
    @FXML
    private TextField searchTextField;
    String Rank = "rank";
    String History = "history";
    String Scorers = "scorers";

    int numberOfSeats = 300000;


    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
        Platform.exit(); // to close the login page when register page is close
    }

    public void searchButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) searchButton.getScene().getWindow();
        if (searchTextField.getText().isBlank() == true) {
            noResultLableMessage.setText("Please type before Search!");
        }else if (Rank.equals(searchTextField.getText().toLowerCase()) ) {
            footballRank();
        }
        else if (History.equals(searchTextField.getText().toLowerCase()) ) {
            championsHistory();
        }
        else if (Scorers.equals(searchTextField.getText().toLowerCase()) ) {
            bestScorers();
        }

        else
            noResultLableMessage.setText("No result for " + searchTextField.getText());
    }


    public void orderOneButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) orderOneButton.getScene().getWindow();
        if (numberOfSeats > 0) {
            successAndFailLableMessage.setText("success you will get yor tickets Via email");
            numberOfSeats =- 1;
        }
        else  successAndFailLableMessage.setText("there is no tickets");
    }

    public void orderTwoButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) orderTwoButton.getScene().getWindow();
        if (numberOfSeats > 0) {
            successAndFailLableMessage.setText("success you will get yor tickets Via email");
            numberOfSeats =- 1;
        }
        else  successAndFailLableMessage.setText("there is no tickets");
    }

    public void orderThreeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) orderThreeButton.getScene().getWindow();
        if (numberOfSeats > 0) {
            successAndFailLableMessage.setText("success you will get yor tickets Via email");
            numberOfSeats =- 1;
        }
        else  successAndFailLableMessage.setText("there is no tickets");
    }

    public void orderFourButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) orderFourButton.getScene().getWindow();
        if (numberOfSeats > 0) {
            successAndFailLableMessage.setText("success you will get yor tickets Via email");
            numberOfSeats =- 1;
        }
        else  successAndFailLableMessage.setText("there is no tickets");
    }


    public void footballRank() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("FootballRank.fxml"));
            Stage footballRank = new Stage();
            footballRank.initStyle(StageStyle.UNDECORATED);
            footballRank.setScene(new Scene(root, 739, 579));
            footballRank.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void championsHistory() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("championsHistory.fxml"));
            Stage championsHistory = new Stage();
            championsHistory.initStyle(StageStyle.UNDECORATED);
            championsHistory.setScene(new Scene(root, 934, 387));
            championsHistory.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void bestScorers() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("bestScorers.fxml"));
            Stage bestScorers = new Stage();
            bestScorers.initStyle(StageStyle.UNDECORATED);
            bestScorers.setScene(new Scene(root, 772, 463));
            bestScorers.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
}


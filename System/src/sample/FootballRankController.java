/*
*
*      THE ROLE OF THIS CLASS IS TO CONTROL EVENTS ON championsHistory.fxml,
*      bestScorers.fxml, and history.fxml
*
 */


package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FootballRankController {
    @FXML
    private Button backButton;
    @FXML
    private Button championsHistoryBackButton;
    @FXML
    private Button bestScorersPerSeasonButton;

    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    public void championsHistoryBackButton(ActionEvent event) {
        Stage stage = (Stage) championsHistoryBackButton.getScene().getWindow();
        stage.close();
    }

    public void bestScorersPerSeasonButton(ActionEvent event) {
        Stage stage = (Stage) bestScorersPerSeasonButton.getScene().getWindow();
        stage.close();
    }


}

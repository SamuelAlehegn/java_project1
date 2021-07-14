/*
*
*    THE ROLE OF THIS CLASS IS TO PERFORM TASKS RELATED TO MOVIE WHICH MEANS
*     ANY INFORMATION RELATED TO MOVIE
*
*
 */


package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MovieInfoController {
    @FXML
    private Button boxOfficeBackButton;
/*
          angry Birds Movie
 */

    @FXML
    private Label angryBirdsMovieLabel;
    @FXML
    private Label angryBirdsMovieOrderLabel;
    @FXML
    private Button angryBirdsMovieBackButton;
    @FXML
    private Button angryBirdsMovieOrderButton;
    @FXML
    private TextField angryBirdsMovieTextField;
/*
          Bad Boyz for Life
 */
    @FXML
    private Label badBoysforLifeLabel;
    @FXML
    private Button badBoysforLifeBackButton;
    @FXML
    private Button badBoysforLifeOrderButton;
    @FXML
    private TextField badBoysforLifeOrderTextField;
    @FXML
    private Label badBoysforLifeOrderLabel;

/*
        Dolittle
*/
     @FXML
     private Label dolittleMovieLable;
     @FXML
     private Button dolittleMovieBackButton;
     @FXML
     private Button dolittleMovieOrderButton;
     @FXML
     private TextField dolittleMovieOrderTextField;
     @FXML
     private Label dolittleMovieOrderLable;

/*
         Scoobi
 */
    @FXML
    private Button scoobMovieBackButton;
    @FXML
    private Label scoobMovieLabel;
    @FXML
    private Label scoobMovieOrderLabel;
    @FXML
    private TextField scoobMovieOrderTextField;
    @FXML
    private Button scoobMovieOrderButton;

/*
         Boss Baby
 */
    @FXML
    private Button bosBabyMovieBackButton;
    @FXML
    private Label bosBabyMovieLabel;
    @FXML
    private Label bosBabyMovieOrderLabel;
    @FXML
    private TextField bosBabyMovieOrderTextField;
    @FXML
    private Button bosBabyMovieOrderButton;

    /*
         Frozen ll
 */
    @FXML
    private Button frozenMovieBackButton;
    @FXML
    private Label frozenMovieLabel;
    @FXML
    private Label frozenMovieOrderLabel;
    @FXML
    private TextField frozenMovieOrderTextField;
    @FXML
    private Button frozenMovieOrderButton;




 /*
           back button
 */

    public void boxOfficeBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) boxOfficeBackButton.getScene().getWindow();
        stage.close();
    }
    public void angryBirdsMovieBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) angryBirdsMovieBackButton.getScene().getWindow();
        stage.close();
    }
    public void badBoysforLifeBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) badBoysforLifeBackButton.getScene().getWindow();
        stage.close();
    }
    public void dolittleMovieBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) dolittleMovieBackButton.getScene().getWindow();
        stage.close();
    }
    public void scoobMovieBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) scoobMovieBackButton.getScene().getWindow();
        stage.close();
    }

    public void bosBabyMovieBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) bosBabyMovieBackButton.getScene().getWindow();
        stage.close();
    }

    public void frozenMovieBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) frozenMovieBackButton.getScene().getWindow();
        stage.close();
    }


/*
              Movie details
*/
    public void angryBirdsMovieOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) angryBirdsMovieOrderButton.getScene().getWindow();

        try {
            int tickets = Integer.parseInt(angryBirdsMovieTextField.getText());
            if (tickets > 5 || tickets < 1) {
                angryBirdsMovieOrderLabel.setText("you can not order more than 5 tickets");
                angryBirdsMovieLabel.setText(" ");
            } else {
                angryBirdsMovieLabel.setText("Success! you will get tickets via email. Thanks");
                angryBirdsMovieOrderLabel.setText(" ");
            }
        } catch (Exception e){
            angryBirdsMovieOrderLabel.setText("please enter valid format");
            angryBirdsMovieOrderLabel.setText(" ");
        }
    }
    public void badBoysforLifeOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) badBoysforLifeOrderButton.getScene().getWindow();
        try{
        int tickets = Integer.parseInt(badBoysforLifeOrderTextField.getText());
        if (tickets > 5 || tickets < 1){
            badBoysforLifeOrderLabel.setText("you can not order more than 5 tickets");
            badBoysforLifeLabel.setText(" ");
        }else {
            badBoysforLifeLabel.setText("Success! you will get tickets via email. Thanks");
            badBoysforLifeOrderLabel.setText(" ");

        }
    }catch (Exception e){
            badBoysforLifeOrderLabel.setText("please enter valid number");
            badBoysforLifeLabel.setText(" ");
        }
}

    public void dolittleMovieOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) dolittleMovieOrderButton.getScene().getWindow();
        try{
            int tickets = Integer.parseInt(dolittleMovieOrderTextField.getText());
            if (tickets > 5 || tickets < 1){
                dolittleMovieOrderLable.setText("you can not order more than 5 tickets");
                dolittleMovieLable.setText(" ");
            }else {
                dolittleMovieLable.setText("Success! you will get tickets via email. Thanks");
                dolittleMovieOrderLable.setText(" ");

            }
        }catch (Exception e){
            dolittleMovieOrderLable.setText("please enter valid number");
            dolittleMovieLable.setText(" ");
        }
    }

    public void scoobMovieOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) scoobMovieOrderButton.getScene().getWindow();
        try{
            int tickets = Integer.parseInt(scoobMovieOrderTextField.getText());
            if (tickets > 5 || tickets < 1){
                scoobMovieOrderLabel.setText("you can not order more than 5 tickets");
                scoobMovieLabel.setText(" ");
            }else {
                scoobMovieLabel.setText("Success! you will get tickets via email. Thanks");
                scoobMovieOrderLabel.setText(" ");

            }
        }catch (Exception e){
            scoobMovieOrderLabel.setText("please enter valid number");
            scoobMovieLabel.setText(" ");
        }
    }

    public void bosBabyMovieOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) bosBabyMovieOrderButton.getScene().getWindow();
        try{
            int tickets = Integer.parseInt(bosBabyMovieOrderTextField.getText());
            if (tickets > 5 || tickets < 1){
                bosBabyMovieOrderLabel.setText("you can not order more than 5 tickets");
                bosBabyMovieLabel.setText(" ");
            }else {
                bosBabyMovieLabel.setText("Success! you will get tickets via email. Thanks");
                bosBabyMovieOrderLabel.setText(" ");

            }
        }catch (Exception e){
            bosBabyMovieOrderLabel.setText("please enter valid number");
            bosBabyMovieLabel.setText(" ");
        }
    }

    public void frozenMovieOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) frozenMovieOrderButton.getScene().getWindow();
        try{
            int tickets = Integer.parseInt(frozenMovieOrderTextField.getText());
            if (tickets > 5 || tickets < 1){
                frozenMovieOrderLabel.setText("you can not order more than 5 tickets");
                frozenMovieLabel.setText(" ");
            }else {
                frozenMovieLabel.setText("Success! you will get tickets via email. Thanks");
                frozenMovieOrderLabel.setText(" ");

            }
        }catch (Exception e){
            frozenMovieOrderLabel.setText("please enter valid number");
            frozenMovieLabel.setText(" ");
        }
    }
}

/*
*
*    THIS CLASS IS USED TO CONTROL BOOK DELIVERY PROCESS
*     IT CONTROLS THE USER'S PREFERABLE BOOK. AND CHECK IF THE USER
*     HAVE ENOUGH BALANCE IN HIS ACCOUNT OR NOT.
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

public class bookInfoController {
 /*
         Haddis
  */
    @FXML
    private Button haddisBackButton;
    @FXML
    private Label haddisMessageLabel;
    @FXML
    private Button haddisOrderButton;
    @FXML
    private TextField haddisOrderTextField;
    @FXML
    private Label haddisOrderLabel;

/*
         Locked key book
*/
    @FXML
    private Button lockedKeyBackButton;
    @FXML
    private Label lockedKeyMessageLabel;
    @FXML
    private Button lockedKeyOrderButton;
    @FXML
    private TextField lockedKeyOrderTextField;
    @FXML
    private Label lockedKeyOrderLabel;

/*
         yeHabesha Jebdu Book
*/
    @FXML
    private Button yeHabeshaBackButton;
    @FXML
    private Label yeHabeshaMessageLabel;
    @FXML
    private Button yeHabeshaOrderButton;
    @FXML
    private TextField yeHabeshaOrderTextField;
    @FXML
    private Label yeHabeshaOrderLabel;


/*
        Emegua Book
*/
    @FXML
    private Button emeguaBackButton;
    @FXML
    private Label emeguaMessageLabel;
    @FXML
    private Button emeguaOrderButton;
    @FXML
    private TextField emeguaOrderTextField;
    @FXML
    private Label emeguaOrderLabel;


/*
        Fikir eske Mekabir Book
*/
    @FXML
    private Button fikerEskeMekabirBackButton;
    @FXML
    private Label fikerEskeMekabirMessageLabel;
    @FXML
    private Button fikerEskeMekabirOrderButton;
    @FXML
    private TextField fikerEskeMekabirOrderTextField;
    @FXML
    private Label fikerEskeMekabirOrderLabel;

/*
            Werisa Book
*/
    @FXML
    private Button werisaBackButton;
    @FXML
    private Label werisaMessageLabel;
    @FXML
    private Button werisaOrderButton;
    @FXML
    private TextField werisaOrderTextField;
    @FXML
    private Label werisaOrderLabel;




/*
       Haddis Book
 */

    public void haddisBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) haddisBackButton.getScene().getWindow();
        stage.close();
    }

    public void haddisOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) haddisOrderButton.getScene().getWindow();

        try {
            int books = Integer.parseInt(haddisOrderTextField.getText());
            int totalBook = 100;
            if (books >totalBook ) {
                haddisOrderLabel.setText("We have not " + haddisOrderTextField.getText() +" copy of this books");
                haddisMessageLabel.setText(" ");
            } else {
                haddisMessageLabel.setText("Success!  We will deliver this book with in 24 hours. Thanks");
                haddisOrderLabel.setText(" ");
            }
        } catch (Exception e){
            haddisOrderLabel.setText("please enter valid format");
            haddisMessageLabel.setText(" ");
        }
    }

/*
       Locked Key Book
*/

    public void lockedKeyBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) lockedKeyBackButton.getScene().getWindow();
        stage.close();
    }

    public void lockedKeyOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) lockedKeyOrderButton.getScene().getWindow();

        try {
            int books = Integer.parseInt(lockedKeyOrderTextField.getText());
            int totalBook = 100;
            if (books >totalBook ) {
                lockedKeyOrderLabel.setText("We have not " + lockedKeyOrderTextField.getText() +" copy of this books");
                lockedKeyMessageLabel.setText(" ");
            } else {
                lockedKeyMessageLabel.setText("Success!  We will deliver this book with in 24 hours. Thanks");
                lockedKeyOrderLabel.setText(" ");
            }
        } catch (Exception e){
            lockedKeyOrderLabel.setText("please enter valid format");
            lockedKeyMessageLabel.setText(" ");
        }
    }


/*
       YeHabesha Jebdu Book
*/

    public void yeHabeshaBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) yeHabeshaBackButton.getScene().getWindow();
        stage.close();
    }

    public void yeHabeshaOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) yeHabeshaOrderButton.getScene().getWindow();

        try {
            int books = Integer.parseInt(yeHabeshaOrderTextField.getText());
            int totalBook = 100;
            if (books >totalBook ) {
                yeHabeshaOrderLabel.setText("We have not " + yeHabeshaOrderTextField.getText() +" copy of this books");
                yeHabeshaMessageLabel.setText(" ");
            } else {
                yeHabeshaMessageLabel.setText("Success!  We will deliver this book with in 24 hours. Thanks");
                yeHabeshaOrderLabel.setText(" ");
            }
        } catch (Exception e){
            yeHabeshaOrderLabel.setText("please enter valid format");
            yeHabeshaMessageLabel.setText(" ");
        }
    }
/*
          Emegua Book
 */
    public void emeguaBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) emeguaBackButton.getScene().getWindow();
        stage.close();
    }

    public void emeguaOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) emeguaOrderButton.getScene().getWindow();

        try {
            int books = Integer.parseInt(emeguaOrderTextField.getText());
            int totalBook = 100;
            if (books >totalBook ) {
                emeguaOrderLabel.setText("We have not " + emeguaOrderTextField.getText() +" copy of this books");
                emeguaMessageLabel.setText(" ");
            } else {
                emeguaMessageLabel.setText("Success!  We will deliver this book with in 24 hours. Thanks");
                emeguaOrderLabel.setText(" ");
            }
        } catch (Exception e){
            emeguaOrderLabel.setText("please enter valid format");
            emeguaMessageLabel.setText(" ");
        }
    }
/*
                Fiker Eske Mekabir
 */
    public void fikerEskeMekabirBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) fikerEskeMekabirBackButton.getScene().getWindow();
        stage.close();
    }

    public void fikerEskeMekabirOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) fikerEskeMekabirOrderButton.getScene().getWindow();

        try {
            int books = Integer.parseInt(fikerEskeMekabirOrderTextField.getText());
            int totalBook = 100;
            if (books > totalBook ) {
                fikerEskeMekabirOrderLabel.setText("We have not " + fikerEskeMekabirOrderTextField.getText() +" copy of this books");
                fikerEskeMekabirMessageLabel.setText(" ");
            } else {
                fikerEskeMekabirMessageLabel.setText("Success!  We will deliver this book with in 24 hours. Thanks");
                fikerEskeMekabirOrderLabel.setText(" ");
            }
        } catch (Exception e){
            fikerEskeMekabirOrderLabel.setText("please enter valid format");
            fikerEskeMekabirMessageLabel.setText(" ");
        }
    }


/*
          Werisa Book
*/

    public void werisaBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) werisaBackButton.getScene().getWindow();
        stage.close();
    }

    public void werisaOrderButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) werisaOrderButton.getScene().getWindow();

        try {
            int books = Integer.parseInt(werisaOrderTextField.getText());
            int totalBook = 100;
            if (books > totalBook ) {
                werisaOrderLabel.setText("We have not " + werisaOrderTextField.getText() +" copy of this books");
                werisaMessageLabel.setText(" ");
            } else {
                werisaMessageLabel.setText("Success!  We will deliver this book with in 24 hours. Thanks");
                werisaOrderLabel.setText(" ");
            }
        } catch (Exception e){
            werisaOrderLabel.setText("please enter valid format");
            werisaMessageLabel.setText(" ");
        }
    }
}

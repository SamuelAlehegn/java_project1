/*
*
*            THE ROLE OF THIS CLASS IS TO VALIDATE LOGIN AND CONTROL
*            Login.fxml JAVAFX FILE. IF THE USERNAME AND PASSWORD
*            ENTERED BY USER IS THE SAME AS DATA IN DATABASE, THEN THE
*            USER CAN CONTINUE IF NOT THE  THE USER IS NOT ALLOWED TO
*            CONTINUE
 */



package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController  {

    @FXML
    private Button cancelButton;
    @FXML
    private Button registerButton;
    @FXML
    private Label loginMessageLable;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;



    DBConnnection connection = new DBConnnection();
    RegisterController register = new RegisterController();

    public void loginButtonOnAction(ActionEvent event) {
        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() == false) {
            validateLogin();
        } else if (usernameTextField.getText().isBlank() == false) {
            loginMessageLable.setText("please enter password");
        } else if (enterPasswordField.getText().isBlank() == false) {
            loginMessageLable.setText("please enter username");
        } else {
            loginMessageLable.setText("please enter username and password");
        }
    }

    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void registerButtonOnAction(ActionEvent event){
     Stage stage = (Stage) registerButton.getScene().getWindow();
      createAccountForm();

    }

    // it called in loginButtonOnAction method
    //and it is used to validate login
    public void validateLogin() {
        Connection connectionDB = connection.getConnection();
        String varifyLogin = "SELECT * FROM customer_info WHERE username = '" + usernameTextField.getText() + "' AND password = '" + enterPasswordField.getText() + "'";
//        System.out.println(varifyLogin);

        try {
            Statement statement = connectionDB.createStatement();
            ResultSet queryResult = statement.executeQuery(varifyLogin);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {

                    homePage();
                    //createAccountForm();
                } else {
                    loginMessageLable.setText("invalid login. Please try again!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }


//**************************************************************************************************************
    //it called in registerButtonOnAction method
    // and used for show register page
    public void createAccountForm() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
            Stage registerStage = new Stage();
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.setScene(new Scene(root, 720, 650));
            registerStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
//************************************************************************************************************


//*****************************************************************************************************************
//it called in registerButtonOnAction method
//and it is used to show homepage
public void homePage() {

    try {
        Parent root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        Stage homePageStage = new Stage();
        homePageStage.initStyle(StageStyle.UNDECORATED);
        homePageStage.setScene(new Scene(root, 798, 594));
        homePageStage.show();
    } catch (Exception e) {
        e.printStackTrace();
        e.getCause();
    }

}
}
//****************************************************************************************************************
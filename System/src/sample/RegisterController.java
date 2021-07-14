/*
*
*        THE ROLE OF THIS CLASS ID TO CONTROL register.fxml WHICH PERFORMS
*        THE REGISTRATION OF NEW USER AND TO ADD THE USERS INFORMATION INTO
*        DATABASE BY MEANS OF DBConnection CLASS
*
 */



package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Random;

public class RegisterController {

    @FXML
    private Button closeButton;
    @FXML
    private Label registrationMessageLable;
    @FXML
    private Label confirmPasswordLable1;
    @FXML
    private TextField confirmPasswordField;
    @FXML
    private TextField setPasswordField;
    @FXML
    private TextField firstnameTextField;
    @FXML
    private TextField middlenameTextField;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField countryTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField genderTextfield;
    @FXML
    private TextField phonenumberTextField;
    @FXML
    private TextField dobTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField depositeTextField;





    public void registerButtonOnAction(ActionEvent event){
/*
        to check whether the password and confirm password is same or not
 */
        if (setPasswordField.getText().equals(confirmPasswordField.getText())){
            registerUser();
            confirmPasswordLable1.setText("");

        }else {
            confirmPasswordLable1.setText("Password does not match");
        }

    }

    public void closeButtonOnAction(ActionEvent event){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        Platform.exit(); // to close the login page when register page is close
    }
/*
         it called in registerButtonOnAction method and it is used to
         register new user and store its data in to database
 */
    public void registerUser(){
/*
         creating onject that used to database connection( DBConnection class)
 */
        DBConnnection connection =  new DBConnnection();
        Connection connectionDB = connection.getConnection();

        try {
        String firstname = firstnameTextField.getText();
        String middlename = middlenameTextField.getText();
        String lastname = lastnameTextField.getText();
        String username = usernameTextField.getText();
        String Password = setPasswordField.getText();
        String country = countryTextField.getText();
        String city = cityTextField.getText();
        String gender = genderTextfield.getText();
        String phonenumber = phonenumberTextField.getText();
        String balance = depositeTextField.getText();
        String dob = dobTextField.getText();
        String email = emailTextField.getText();


        Random rand = new Random();
        int accountnumber = rand.nextInt(1000000000);

        String insertFields = "INSERT INTO customer_info(firstname, middlename, lastname, username, password, gender, accountnumber, country, city, phonenumber, email, dob, balance) VALUES ('";
        String insertValues = firstname + "','" + middlename  + "','" + lastname  + "','" + username  + "','" + Password  + "','" + gender  + "','" + accountnumber  + "','"  +  country  + "','" + city  + "','" + phonenumber + "','" + email + "','" + dob + "','" + balance  + "')" ;
        String insertToRegister = insertFields + insertValues;
        Statement statement = connectionDB.createStatement();
        statement.executeUpdate(insertToRegister);
        registrationMessageLable.setText("User registered successfully!");
        } catch (Exception e) {
            registrationMessageLable.setText("Error in the input");
            e.printStackTrace();
            e.getCause();
        }

    }
}


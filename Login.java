/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

/**
 *
 * @author luke
 */public class Login {

    private String username;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;

    public Login(String username, String password, String cellNumber, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        String pattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=[\\]{};':\"\\\\|,.<>/?]).{8,}$";
        return password.matches(pattern);
    }

    public boolean checkCellPhoneNumber() {
        return cellNumber.matches("^\\+27\\d{9,10}$");
    }

    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please enter a password that contains at least 8 characters, a capital letter, a number and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international country code.";
        }
        return "User successfully registered!";
    }

    public boolean loginUser(String usernameInput, String passwordInput) {
        return this.username.equals(usernameInput) && this.password.equals(passwordInput);
    }

    public String returnLoginStatus(String usernameInput, String passwordInput) {
        if (loginUser(usernameInput, passwordInput)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

}

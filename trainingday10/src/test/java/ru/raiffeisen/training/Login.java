package ru.raiffeisen.training;

public class Login {

    private String userLogin;
    private String userPassword;

    private final static int passLimit = 7;
    public Login(String userLogin, String userPassword) {
        this.userLogin = userLogin.trim().toUpperCase();


            this.userPassword = userPassword;
    }


    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin.trim().toUpperCase();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean verify() throws PasswordException {
        System.out.println("Test passed: "+ userLogin+ "/"+userPassword);

    if ((userPassword.length() < passLimit) && (userPassword != null)) throw new PasswordException("Password length violation " +userPassword.length());

        return false;
    }



}

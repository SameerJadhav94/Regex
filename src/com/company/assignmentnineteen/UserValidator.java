package com.company.assignmentnineteen;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex
    private static final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex
    private static final String emailIDPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"; //regex
    private static final String mobileNumberPattern = "(0|91)*[ ][7-9][0-9]{9}"; //regex
    private static final String passwordPattern1 = "^[a-zA-Z]{8,}$"; //regex

    /***
     *
     * @param fName
     * @return
     */
    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(fName).matches();
    }

    /***
     *
     * @param lName
     * @return
     */
    public boolean validateLastName(String lName) {
        Pattern pattern2 = Pattern.compile(lastNamePattern);
        return pattern2.matcher(lName).matches();
    }

    /***
     *
     * @param email
     * @return
     */
    public boolean validateEmailAddress(String email) {
        Pattern pattern3 = Pattern.compile(emailIDPattern);
        return pattern3.matcher(email).matches();
    }

    /***
     *
     * @param mobileNumber
     * @return
     */
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern3 = Pattern.compile(mobileNumberPattern);
        return pattern3.matcher(mobileNumber).matches();
    }

    /***
     *
     * @param passwordPattern
     * @return
     */
    public boolean validatePasswordPattern1(String passwordPattern) {
        Pattern pattern4 = Pattern.compile(passwordPattern1);
        return pattern4.matcher(passwordPattern).matches();
    }

    public static void main(String[] args) {

        UserValidator validator = new UserValidator();

        boolean result = validator.validateFirstName("Sameer");
        boolean resultLastName = validator.validateLastName("Jadhav");
        boolean resultEmail = validator.validateEmailAddress("abc+100@yahoo.com");
        boolean resultMobileNumber = validator.validateMobileNumber("0 7568438745");
        boolean resultPassword1 = validator.validatePasswordPattern1("PassWordSam");
        
        System.out.println(result);
        System.out.println(resultLastName);
        System.out.println(resultEmail);
        System.out.println(resultMobileNumber);
        System.out.println(resultPassword1);
    }
}

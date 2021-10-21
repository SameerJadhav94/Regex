package com.company.assignmentnineteen;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex
    private static final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex
    private static final String emailIDPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"; //regex
    private static final String mobileNumberPattern = "(0|91)*[ ][7-9][0-9]{9}"; //regex
    private static final String passwordPattern1 = "^[a-zA-Z]{8,}$"; //regex
    private static final String passwordPattern2 = "^(?=.*[A-Z])[A-Za-z]{8,}$"; //regex
    private static final String passwordPattern3 = "^(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{8,}$"; //regex
    private static final String passwordPattern4 = "^(?=.*[0-9])(?=.*[A-Z])(?=.*([$&+,:;=?@#|/'<>.^*()%!-]))(?=.{8,}$).*$"; //regex

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
     * @param passwordPattern for minimum 8 characters
     * @return
     */
    public boolean validatePasswordPattern1(String passwordPattern) {
        Pattern pattern4 = Pattern.compile(passwordPattern1);
        return pattern4.matcher(passwordPattern).matches();
    }

    /***
     *
     * @param passwordPattern for at least 1 Upper Case Character
     * @return
     */
    public boolean validatePasswordPattern2(String passwordPattern) {
        Pattern pattern5 = Pattern.compile(passwordPattern2);
        return pattern5.matcher(passwordPattern).matches();
    }

    /***
     *
     * @param passwordPattern for at least 1 Numeric Character
     * @return
     */
    public boolean validatePasswordPattern3(String passwordPattern) {
        Pattern pattern6 = Pattern.compile(passwordPattern3);
        return pattern6.matcher(passwordPattern).matches();
    }

    /***
     *
     * @param passwordPattern for at least 1 Special Character
     * @return
     */
    public boolean validatePasswordPattern4(String passwordPattern) {
        Pattern pattern7 = Pattern.compile(passwordPattern4);
        return pattern7.matcher(passwordPattern).matches();
    }

    public static void main(String[] args) {

        UserValidator validator = new UserValidator();

        boolean result = validator.validateFirstName("Sameer");
        boolean resultLastName = validator.validateLastName("Jadhav");
        boolean resultEmail = validator.validateEmailAddress("abc+100@yahoo.com");
        boolean resultMobileNumber = validator.validateMobileNumber("0 7568438745");
        boolean resultPassword1 = validator.validatePasswordPattern1("PassWordSam");
        boolean resultPassword2 = validator.validatePasswordPattern2("passwordSam");
        boolean resultPassword3 = validator.validatePasswordPattern3("passwordSam19");
        boolean resultPassword4 = validator.validatePasswordPattern4("Sameer@1994");
        System.out.println(result);
        System.out.println(resultLastName);
        System.out.println(resultEmail);
        System.out.println(resultMobileNumber);
        System.out.println(resultPassword1);
        System.out.println(resultPassword2);
        System.out.println(resultPassword3);
        System.out.println(resultPassword4);

        //Storing all the E-mail pattern in an Array.
        String [] email = {"abc+100@yahoo.com", "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",  "abc@1.com", "abc@gmail.com.com" };

        // Printing if the E-mail Pattern entered is Valid.
        for (String pattern: email) {
            boolean Emailresult = validator.validateEmailAddress(pattern);
            if (Emailresult){
                System.out.println("The Entered Email Pattern is Valid.");
            }else{
                System.out.println("The Entered Email Pattern is Invalid.");
            }
        }

    }
}

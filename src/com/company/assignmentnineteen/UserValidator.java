package com.company.assignmentnineteen;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex
    private static final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex

    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(fName).matches();
    }

    public boolean validateLastName(String lName) {
        Pattern pattern2 = Pattern.compile(lastNamePattern);
        return pattern2.matcher(lName).matches();
    }

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Sameer");
        boolean resultLastName = validator.validateLastName("Jadhav");
        System.out.println(result);
        System.out.println(resultLastName);
    }
}

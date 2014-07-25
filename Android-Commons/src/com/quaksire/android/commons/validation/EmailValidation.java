package com.quaksire.android.commons.validation;

/**
 *
 * @author julio
 */
public class EmailValidation {

    public static boolean isEmailValid(String email) {
        if (email == null) {
            return false;
        }

        if (email.isEmpty()) {
            return false;
        }
        
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}

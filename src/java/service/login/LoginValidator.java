/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.login;

import domain.login.Login;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

import controller.login.*;
import service.login.*;
import domain.login.*;

public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class clazz) {
        return Login.class.isAssignableFrom(clazz);
    }

    public void validate(Object obj, Errors errors) {
        Login login = (Login) obj;
        if (login.getUsername() == null || login.getUsername().length() == 0) {
            errors.rejectValue("username", "error.empty.field", "Please Enter User Name");
        } else if (!login.getUsername().equals("admin")) {
            errors.rejectValue("username", "unknown.user", "Unknown User");
        }
        if (login.getPassword() == null || login.getPassword().length() == 0) {
            errors.rejectValue("password", "error.empty.field", "Please Enter Password");
        } else if (!login.getPassword().equals("admin")) {
            errors.rejectValue("password", "wrong.password", "Wrong Password");
        }
    }
}
package controllers.forms;

import dao.service.IUserDao;
import dao.service.UserDaoBD;
import domain.service.IUserManager;
import domain.model.Users;
import hibernate.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

import domain.model.formobjects.Login;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginValidator implements Validator {

    private IUserManager userManager;

    public void setUserManager(IUserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public boolean supports(Class clazz) {
        return Login.class.isAssignableFrom(clazz);
    }

    public void validate(Object obj, Errors errors) {

        Login submitLogin = (Login) obj;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "field.required", "Please Enter User Name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required", "Please Enter Password");

        if ((this.userManager.checkLogin(submitLogin.getUsername(), submitLogin.getPassword()) == null)) {
            System.out.println("Erreur ! Mauvais nom d'utilisateur ou mot de passe !");
            errors.reject("invalidUser", "Erreur ! Mauvais nom d'utilisateur ou mot de passe !");
        }

    }
}

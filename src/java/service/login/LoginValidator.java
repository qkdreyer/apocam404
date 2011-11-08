/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.login;

import domain.login.Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

import controller.login.*;
import service.login.*;
import domain.login.*;
import java.util.Iterator;
import java.util.List;
import javax.management.Query;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import hibernate.test.util.HibernateUtil;

public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class clazz) {
        return Login.class.isAssignableFrom(clazz);
    }
    private SessionFactory sessionFactory;
    public void validate(Object obj, Errors errors) {
        Login login = (Login) obj;
        
        //Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        /**       
        session.beginTransaction();
        
        List test = session.createQuery("select * from Users").list();

        
        for (Iterator it = test.iterator(); it.hasNext();)
        {
            System.out.println("lol");
        }
        
        session.getTransaction().commit();*/
        
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
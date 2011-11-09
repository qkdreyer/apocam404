/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.service;

import domain.model.Users;
import hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author ApeX
 */
public class UserDaoBD implements IUserDao {


    @Override
    public void saveUser(Users user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateUser(Users user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void createUser(Users user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteUser(Users user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Users checkLogin(String login, String password) {
        
        Session session = HibernateUtil.currentSession();

        Transaction tx = session.beginTransaction();

        List list = session.createQuery("from Users").list();
        Iterator it = list.iterator();
        
        boolean userIsFind = false;
        Users readUser = null;
        
        while (it.hasNext() && userIsFind == false) {
            
            readUser = (Users) it.next();
            
            if (login.equals(readUser.getLoginUser()) && password.equals(readUser.getMdpUser()))
            {
                userIsFind = true;
            }
        }
        
        tx.commit();

        HibernateUtil.closeSession();
        
        if (userIsFind)
        {
            return readUser;
        }
        else
        {
            return null;
        }


    }

    @Override
    public Users getUser(int idUser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Users> getUsersList() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

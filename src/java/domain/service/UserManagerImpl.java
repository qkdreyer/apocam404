/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.service;


import dao.service.IUserDao;
import domain.model.Users;

/**
 *
 * @author ApeX
 */
public class UserManagerImpl implements IUserManager {
    
    
    private IUserDao userDao;
     
    /**
     * setter to allows spring to inject userDao implementation
     * @param userDao : object (implementation of IUserDao interface) to inject.
     */
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
    
    public Users checkLogin(String login, String password) {
        return this.userDao.checkLogin(login, password);
    }
    
}

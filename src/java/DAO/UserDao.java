/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.User;

/**
 *
 * @author Quentin
 */
public interface UserDao {

    /**
     * Check if the login exists and if the password is correct in datasource. 
     * @param login : user login
     * @param password : user password
     * @return true if the login exists and if the password is correct. 
     * Otherwise, return false. 
     * @throws DataAccessException in case of Data access errors 
     * (database unreachable, etc.)
     */
    public boolean checkLogin (String login, String password);

    /**
     * Return a User object from a given login.
     * @param login : user login
     * @return the corresponding user object.
     * @throws DataAccessException in case of Data access errors 
     * (database unreachable, etc.)
     */
    public User getUser(String login);
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.service;

import domain.model.Users;

/**
 *
 * @author ApeX
 */
public interface IUserManager {
    
    public Users checkLogin(String login, String password);

}

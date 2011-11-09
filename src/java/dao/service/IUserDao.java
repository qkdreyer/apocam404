/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.service;

import domain.model.Users;
import java.util.ArrayList;

/**
 *
 * @author ApeX
 */
public interface IUserDao {
    
    public Users checkLogin(String login, String password);
    public Users getUser(int idUser);
    
    public ArrayList<Users> getUsersList();
    
}

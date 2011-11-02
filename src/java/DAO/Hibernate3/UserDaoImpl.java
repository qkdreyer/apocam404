/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Hibernate3;

import DAO.UserDao;
import POJO.Users;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Quentin
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public boolean checkLogin(String login, String password) {
        if (null == login || null == password) {
            throw new IllegalArgumentException("Login and password are mandatory. Null values are forbidden.");
        }
        try {
            logger.info("Check user with login: " + login + " and password : [PROTECTED]");
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            // create a new criteria
            Criteria crit = session.createCriteria(Users.class);
            crit.add(Expression.ilike("loginUser", login));
            crit.add(Expression.eq("passwordUser", password));

            Users user = (Users) crit.uniqueResult();
            return (user != null);
        } catch (DataAccessException e) {
            // Critical errors : database unreachable, etc.
            logger.error("Exception - DataAccessException occurs : " + e.getMessage()
                    + " on complete checkLogin().");
            return false;
        }
    }

    @Override
    public Users getUser(String login) {
        if (null == login) {
            throw new IllegalArgumentException("Login is mandatory. Null value is forbidden.");
        }
        try {
            logger.info("get User with login: " + login);
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            // create a new criteria
            Criteria crit = session.createCriteria(Users.class);
            crit.add(Expression.eq("loginUser", login));

            Users user = (Users) crit.uniqueResult();
            return user;
        } catch (DataAccessException e) {
            // Critical errors : database unreachable, etc.
            logger.error("Exception - DataAccessException occurs : " + e.getMessage()
                    + " on complete getUser().");
            return null;
        }
    }
}

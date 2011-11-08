/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package something.user;

import domain.user.Users;
import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.io.*;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author damien
 */
@Transactional
@Repository
public class UsersSomething {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private SessionFactory sessionFactory;

    public void lol() {
        Session session = sessionFactory.openSession();

        List list = sessionFactory.getCurrentSession().createCriteria(Users.class).list();

        logger.info("lol" + list);

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ApeX
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Crée la SessionFactory
            sessionFactory =
                    new Configuration() {}.configure().buildSessionFactory();
        } catch (HibernateException ex) {
            throw new RuntimeException("Problème de configuration : "
                    + ex.getMessage(), ex);
        }
    }
    public static final ThreadLocal session = new ThreadLocal();

    public static Session currentSession()
            throws HibernateException {
        Session s = (Session) session.get();
        // Ouvre une nouvelle Session, si ce Thread n'en a aucune
        if (s == null) {
            s = sessionFactory.openSession();
            session.set(s);
        }
        return s;
    }

    public static void closeSession()
            throws HibernateException {
        Session s = (Session) session.get();
        session.set(null);
        if (s != null) {
            s.close();
        }
    }
}
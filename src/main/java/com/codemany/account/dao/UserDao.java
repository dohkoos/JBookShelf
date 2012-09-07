package com.codemany.account.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.codemany.account.model.User;

public class UserDao {
    public static User getUser(String username) {
        Session session = HibernateUtil.getSession();
        try {
            Query query = session.createQuery("from User u where u.username = ?");
            query.setString(0, username);
            query.setMaxResults(1);
            return (User)query.uniqueResult();
        } finally {
            session.close();
        }
    }
}

package com.codemany.account.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.codemany.account.model.User;

public class UserDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public User getUser(String username) {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from User u where u.username = ?");
            query.setString(0, username);
            query.setMaxResults(1);
            return (User)query.uniqueResult();
        } finally {
            session.close();
        }
    }

    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            session.save(user);
            ts.commit();
        } finally {
            session.close();
        }
    }
}

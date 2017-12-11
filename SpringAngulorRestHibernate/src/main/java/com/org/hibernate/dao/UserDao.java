package com.org.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.org.hibernate.conf.HibernateConnector;
import com.org.hibernate.pojo.Student;
import com.org.hibernate.pojo.User;

public class UserDao {

	public List<User> listUser() {
        Session session = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from User u");
 
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                System.out.println("list " + queryList);
                return (List<User>) queryList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
	
	public Student findUserById(String userId) {
        Session session = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            Query query = session.createQuery("from User u where u.userId = :userId");
            query.setParameter("userId", userId);
 
            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (Student) queryList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
	
	public User addUser(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("session : "+session);
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	public void deleteUser(String userId) {
        Session session = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            Transaction beginTransaction = session.beginTransaction();
            Query createQuery = session.createQuery("delete from User u where u.userId =:userId");
            createQuery.setParameter("userId", userId);
            createQuery.executeUpdate();
            beginTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
 
}

package com.scurto.service;

import com.scurto.model.Gclid;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by yustymenko on 13.12.2017.
 */

@Repository
@Transactional
public class GclidService {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    public void addKey(String gclid) {
        LocalDateTime currentTime = LocalDateTime.now();

        String format = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("gclid get at -> " + format);

        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Gclid row = new Gclid();
            row.setGclid(gclid);
            row.setTime(format);
            session.save(row);
            tx.commit();

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void clearTable() {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.createSQLQuery("truncate table gclid").executeUpdate();
            tx.commit();

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
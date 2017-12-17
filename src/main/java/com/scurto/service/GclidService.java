package com.scurto.service;

import com.scurto.model.Gclid;
import org.hibernate.*;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
            if (tx != null) tx.rollback();
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
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public List<Gclid> getAllGClids() {
        Query query = getSession().createSQLQuery("select * from gclid");

        Gclid dest;
        ArrayList<Gclid> gclids = new ArrayList<>();
        Iterator iterator= query.list().iterator();
        while(iterator.hasNext()){
            Object[] tuple= (Object[]) iterator.next();
            dest= new Gclid();
            dest.setId((Integer) tuple[0]);
            dest.setGclid((String) tuple[1]);
            dest.setTime((String) tuple[2]);
            gclids.add(dest);
        }

        return gclids;
    }
}
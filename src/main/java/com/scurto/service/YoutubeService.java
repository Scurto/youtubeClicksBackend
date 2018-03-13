package com.scurto.service;

import com.scurto.model.*;
import com.scurto.model.advertise.SecondaryReklamaModel;
import com.scurto.model.advertise.TransferReklamaModel;
import com.scurto.model.advertise.TransferReklamaModelWrapper;
import com.scurto.shared.ChanelIdStorage;
import com.scurto.shared.ReklamaStorage;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by yustymenko on 13.10.2017.
 */
@Repository
@Transactional
public class YoutubeService {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    @SuppressWarnings("unchecked")
    public List<Person> getAllPersons() {
        return getSession().createQuery("from Person").list();
    }

    public List<Youtube> getAllYoutubeTasks() {
        return getSession().createQuery("from Youtube").list();
    }

    public Person getPersonById(Long id) {
        Person person = (Person) getSession().get(Person.class, id);
        return person;
    }

    public Youtube getTaskById(String taskId) {
        Youtube task = (Youtube) getSession().get(Youtube.class, taskId);
        return task;
    }

    public String updateTask(String taskId, String lastReklama) {
        Youtube task = (Youtube)getTaskById(taskId);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        String stringDate = today.format(formatter);
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();

            if (task == null) {
                task = new Youtube();
                task.setTaskId(taskId);
                task.setLastReklama(lastReklama);
                task.setLastDate(stringDate);
                session.save(task);
            } else {
                task.setLastDate(stringDate);
                task.setLastReklama(lastReklama);
                session.update(task);
            }

            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return "";
    }

    public List<Youtube> getReklamaListForRemove(String taskId, boolean isOneTimeTask) {
        List<Youtube> relatedTasks = new ArrayList<>();
        if (!isOneTimeTask) {
            for (String relatedTaskId : getRelatedTasks(taskId)) {
                Youtube relatedTaskFromDb = getTaskById(relatedTaskId);
                if (relatedTaskFromDb != null) {
                    relatedTasks.add(relatedTaskFromDb);
                }
            }
        }
        return relatedTasks;
    }

    public ArrayList<String> getRelatedTasks(String taskId) {
        ArrayList<String> relatedTasks = new ArrayList<>();
        ArrayList<String> relatedTasks2 = new ArrayList<>();

        HashMap<String, TaskModel> allTaskModel = ChanelIdStorage.getAllTaskModel();
        TaskModel model = allTaskModel.get(taskId);
        if (model != null) {
            String taskOwner = model.getTaskOwner();
            for (TaskModel taskModel : allTaskModel.values()) {
                if (taskOwner.equalsIgnoreCase(taskModel.getTaskOwner())) {
                    relatedTasks2.add(taskModel.getTaskId());
                }
            }
        }

        if (taskId.equalsIgnoreCase("1") || taskId.equalsIgnoreCase("2")) {
            relatedTasks.add("1");
            relatedTasks.add("2");
        } else if (taskId.equalsIgnoreCase("3") || taskId.equalsIgnoreCase("4")) {
            relatedTasks.add("3");
            relatedTasks.add("4");
        } else if (taskId.equalsIgnoreCase("5")) {
            relatedTasks.add("5");
//        } else if (taskId.equalsIgnoreCase("327158") || taskId.equalsIgnoreCase("437355") || taskId.equalsIgnoreCase("327160") || taskId.equalsIgnoreCase("327835")) {
//            relatedTasks.add("327158");
//            relatedTasks.add("437355");
//            relatedTasks.add("327160");
//            relatedTasks.add("327835");
//        }
//        } else if (taskId.equalsIgnoreCase("1628076")) {
//            relatedTasks.add("1628076");
//        } else if (taskId.equalsIgnoreCase("1641523")) {
//            relatedTasks.add("1641523");
//        } else if (taskId.equalsIgnoreCase("1685040") || taskId.equalsIgnoreCase("1685742")) {
//            relatedTasks.add("1685040");
//            relatedTasks.add("1685742");
//        } else if (taskId.equalsIgnoreCase("1597613")) {
//            relatedTasks.add("1597613");
        } else if (taskId.equalsIgnoreCase("362698") || taskId.equalsIgnoreCase("677818") || taskId.equalsIgnoreCase("695075")) {
            relatedTasks.add("362698");
            relatedTasks.add("677818");
            relatedTasks.add("695075");
        } else if (taskId.equalsIgnoreCase("1671590")) {
            relatedTasks.add("1671590");
//        } else if (taskId.equalsIgnoreCase("1411090") || taskId.equalsIgnoreCase("1306013")) {
//            relatedTasks.add("1411090");
//            relatedTasks.add("1306013");
//        } else if (taskId.equalsIgnoreCase("1365817")) {
//            relatedTasks.add("1365817");
//        } else if (taskId.equalsIgnoreCase("1438352")) {
//            relatedTasks.add("1438352");
        }


        return relatedTasks2;
//        return relatedTasks;
    }

    public TransferReklamaModelWrapper prepareReklamaListToShow(String taskId, String countOfReklama, String countOfMove, boolean isOneTime) {
        TransferReklamaModelWrapper reklamaModelWrapper = new TransferReklamaModelWrapper();

        int intCountOfReklama = Integer.parseInt(countOfReklama);
        int intCountOfMove = Integer.parseInt(countOfMove);
        ArrayList<String> allReklama = new ArrayList<>();
        ArrayList<TransferReklamaModel> etalonReklamaForShow = new ArrayList<>();

        HashMap<String, ReklamaModel> storageReklama = ReklamaStorage.getAllReklama();
        List<Youtube> taskForRemove = getReklamaListForRemove(taskId, isOneTime);
        List<String> readReklamaFromTask = readReklamaFromTask(taskForRemove);

        for (String s : readReklamaFromTask) {
            storageReklama.remove(s);
        }


        ArrayList<String> uniqKeys = new ArrayList<>();
        uniqKeys.addAll(storageReklama.keySet());

        if (uniqKeys.size() > intCountOfReklama) {
            Random rnd = new Random();
            for (int i = 0; i < intCountOfReklama; i++) {
                String unigKey = uniqKeys.get(rnd.nextInt(uniqKeys.size()));
                uniqKeys.remove(unigKey);
                allReklama.add(unigKey);
            }

            for (String rek : allReklama) {
                ReklamaModel model = storageReklama.get(rek);
                TransferReklamaModel newModel = new TransferReklamaModel();
                ArrayList<String> newModelTextLine = new ArrayList<>();


                for (int i = 0; i < intCountOfMove; i++) {
                    SecondaryReklamaModel secondaryReklamaModel = model.getSecondaryReklamaModels().get(rnd.nextInt(model.getSecondaryReklamaModels().size()));
                    model.getSecondaryReklamaModels().remove(secondaryReklamaModel);
                    newModelTextLine.add(secondaryReklamaModel.getUrl());
                }

                newModel.setGclidLine(model.getMainUrl());
                newModel.setTextLine(newModelTextLine);

                etalonReklamaForShow.add(newModel);
            }

        }

        reklamaModelWrapper.setTransferReklamaModels(etalonReklamaForShow);
        reklamaModelWrapper.setTransferReklamaKeys(prepareKeysValue(allReklama));

        return reklamaModelWrapper;
    }

    public List<String> readReklamaFromTask(List<Youtube> list) {

        List<String> stringSet = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");

        for (Youtube youtube : list) {
            LocalDate lastTaskDate = LocalDate.parse(youtube.getLastDate(), formatter);
            LocalDate minusDays = LocalDate.now().minusDays(2);

//            System.out.println("1 " + lastTaskDate.isAfter(minusDays));
//            System.out.println("2 " + lastTaskDate.isBefore(minusDays));
//            System.out.println("3 " + lastTaskDate.isEqual(minusDays));
//            boolean after = lastTaskDate.isAfter(minusDays);
            if (lastTaskDate.isAfter(minusDays)) {
                stringSet.addAll(Arrays.asList(youtube.getLastReklama().split("/")));
            }
        }

        return stringSet;
    }

    public String getGclid() {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.googleadservices.com/pagead/aclk?sa=L&ai=CL5pYZBf5Vt7JDdHCzAaQ9rioBNPTpaAJi6fr1cwCwI23ARABII-3lydgpa6jhvwioAGl1PrMA8gBAqkCi1C4O9yRZD6oAwHIA8EEqgSGAU_QZb7yQmc68XRES43BmnFv7WwFuh2EO6yXlVPcp-CjYYmaJiLpDGT1Ez62ipR-tLpJMwkRX4ksXWfXHyrpWF6PJSGaDjOAWcp0fa9ms2HrI69PE4w9-ci_dYs4bfS15CAD88OaojTjVtSEa-acK4Bcht2KJ_6GSBaqn5jAiEkCRr-tujxYiAYBoAYCgAfDq4UzqAemvhvYBwE&num=1&cid=5GgQQtsb4HnWY7c17g9SpS51&sig=AOD64_2UG1wFu-Coo7ptfLnfD_RuF3I-pg&client=ca-pub-6591344393480072&adurl=http://www.amotutto.com.ua/maslo-olivkovoe-olio-di-oliva.html").get();
//       http://www.googleadservices.com/pagead/aclk?sa=L&ai=CE3Ea0xH5VrvBMsLQWIbMi5gEh9C46wjP2J3IqgHZ2R4QASCPt5cnYKWuo4b8IqAB8ZDo0QPIAQSpAtuvLQjFc2Q-qAMBqgSJAU_QdforgDP693gblzap__W37VMG-P-6lyJJpludDxa-Sly2VejUppKx_sVlVzn2eneASTPem0i-3PiTBXuDCXfvCPs7WMQ7tXkwGbWA5PUG5g8dTCkDhjHNwK8mXmQInbxBaIcWy4wsNcrNNEHxgb7jV385InOFFx4xphpJ409zmpt7tcAtjONhiAYBoAYEgAf37pcuqAemvhvYBwA&num=1&cid=5GjuNJU5TeVzfh3jPSr5DtZ2&sig=AOD64_13YGsXGMFoT8tFggLncW46HsknqA&client=ca-pub-6591344393480072&adurl=http://oiler.com.ua/sto/
        } catch (IOException e) {
            e.printStackTrace();
        }

        String baseUri = doc.baseUri();
        int index = baseUri.lastIndexOf("gclid=");
        String gclid = baseUri.substring(index+6, baseUri.length());
        System.out.println(baseUri);
        System.out.println(gclid);
        return gclid;
    }



    private String prepareKeysValue(ArrayList<String> reklamaList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : reklamaList) {
            stringBuilder.append(s).append("/");
        }

        if (stringBuilder.length() > 1) {
            stringBuilder.delete(stringBuilder.length() -1, stringBuilder.length());
            System.out.println("stringBuilder = " + stringBuilder);
        }

        return stringBuilder.toString();
    }

}

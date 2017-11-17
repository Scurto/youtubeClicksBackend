package com.scurto.model;

/**
 * Created by yustymenko on 17.11.2017.
 */
public class ChanelIdStorage {

    public static String getChanelId(String taskId) {
        if (taskId.equalsIgnoreCase("1")) {
            return "channel/UCJIbnmV8DdqOGEcl6hm-x8w";
        } else if (taskId.equalsIgnoreCase("2")) {
            return "channel/UCJIbnmV8DdqOGEcl6hm-x8w";
        } else if (taskId.equalsIgnoreCase("3")) {
            return "user/dkdsl";
        }  else if (taskId.equalsIgnoreCase("4")) {
            return "channel/UCJIbnmV8DdqOGEcl6hm-x8w";
        }  else if (taskId.equalsIgnoreCase("5")) {
            return "channel/UCJIbnmV8DdqOGEcl6hm-x8w";
        }
        return "";
    }
}

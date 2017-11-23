package com.scurto.model;

import java.util.HashMap;

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
        } else if (taskId.equalsIgnoreCase("4")) {
            return "channel/UCJIbnmV8DdqOGEcl6hm-x8w";
        } else if (taskId.equalsIgnoreCase("5")) {
            return "channel/UCJIbnmV8DdqOGEcl6hm-x8w";
        } else if (taskId.equalsIgnoreCase("327158")) {
            return "user/dkdsl";
        } else if (taskId.equalsIgnoreCase("437355")) {
            return "user/PalkinChef";
        }
        return "";
    }

    public static String getTaskModel(Mode mode) {
        if (mode == Mode.TASK_ID) {

        } else if (mode == Mode.CHANNEL_ID) {

        } else if (mode == Mode.TASK_DESCRIPTION) {

        }
        return "";
    }


    enum Mode {
        TASK_ID,
        CHANNEL_ID,
        TASK_DESCRIPTION
    }

    public static HashMap<String, TaskModel> getAllTaskModel() {
        HashMap<String, TaskModel> allTaskModel = new HashMap<>();

        allTaskModel.put("1", model(
                "1",
                "3",
                "3",
                "3",
                30,
                30,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w"
        ));


        return allTaskModel;
    }

    private static TaskModel model(String taskId, String countVideo, String countReklama, String countMove, Integer reklamafreeze, Integer videoFreeze, String channelId) {
        TaskModel taskModel = new TaskModel();
        taskModel.setTaskId(taskId);
        taskModel.setCountVideo(countVideo);
        taskModel.setCountReklama(countReklama);
        taskModel.setCountMove(countMove);
        taskModel.setReklamafreeze(reklamafreeze);
        taskModel.setVideoFreeze(videoFreeze);
        return taskModel;
    }
}

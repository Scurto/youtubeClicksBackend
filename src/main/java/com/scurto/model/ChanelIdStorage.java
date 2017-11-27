package com.scurto.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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
        } else if (taskId.equalsIgnoreCase("1457501")) {
            return "channel/UCWviTklK43BjG7KP6sBQpbw";
        } else if (taskId.equalsIgnoreCase("1628076")) {
            return "channel/UCufzTDx9I-75JgY5voVI7FA";
        } else if (taskId.equalsIgnoreCase("1254825")) {
            return "channel/UCE0fj9vk80sNG5ADEqrFF9g";
        } else if (taskId.equalsIgnoreCase("1685040")) {
            return "channel/UC8v0Rdi-gCEdFoprevXnrmg";
        } else if (taskId.equalsIgnoreCase("1667761")) {
            return "channel/UCYVjyU0A7kA2wZOaMTlsIYQ";
        } else if (taskId.equalsIgnoreCase("1687980")) {
            return "channel/UCYZKH0xzLa_LYIYA76GgocA";
        } else if (taskId.equalsIgnoreCase("1631021")) {
            return "channel/UC8MYAUpyXcjIeAHfzy7ltIQ";
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

    public static ArrayList<TaskModel> getAllTaskModelArray(Mode mode) {
        return new ArrayList<TaskModel>(getAllTaskModel().values());
    }


    public enum Mode {
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
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                null
        ));

        allTaskModel.put("2", model(
                "2",
                "3",
                "3",
                "3",
                30,
                30,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                null
        ));
        allTaskModel.put("327158", model(
                "327158",
                "7",
                "2",
                "2",
                40,
                40,
                "user/dkdsl",
                "rpte"
        ));
        allTaskModel.put("437355", model(
                "437355",
                "8",
                "2",
                "3",
                45,
                45,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                "rpte"
        ));
        allTaskModel.put("1457501", model(
                "1457501",
                "5",
                "3",
                "3",
                40,
                40,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                null
        ));
        allTaskModel.put("1628076", model(
                "1628076",
                "1",
                "1",
                "1",
                34,
                55,
                "channel/UCufzTDx9I-75JgY5voVI7FA",
                null
        ));
        allTaskModel.put("1254825", model(
                "1254825",
                "3",
                "1",
                "2",
                30,
                30,
                "channel/UCE0fj9vk80sNG5ADEqrFF9g",
                null
        ));
        allTaskModel.put("1685040", model(
                "1685040",
                "1",
                "1",
                "2",
                40,
                50,
                "channel/UC8v0Rdi-gCEdFoprevXnrmg",
                null
        ));
        allTaskModel.put("1667761", model(
                "1667761",
                "3",
                "1",
                "2",
                40,
                30,
                "channel/UCYVjyU0A7kA2wZOaMTlsIYQ",
                null
        ));
        allTaskModel.put("1687980", model(
                "1687980",
                "2",
                "1",
                "2",
                40,
                55,
                "channel/UCYZKH0xzLa_LYIYA76GgocA",
                null
        ));
        allTaskModel.put("1631021", model(
                "1631021",
                "4",
                "1",
                "3",
                50,
                40,
                "channel/UC8MYAUpyXcjIeAHfzy7ltIQ",
                null
        ));


        return allTaskModel;
    }

    private static TaskModel model(String taskId, String countVideo, String countReklama, String countMove, Integer reklamaFreeze, Integer videoFreeze, String channelId, String strategy) {
        TaskModel taskModel = new TaskModel();
        taskModel.setTaskId(taskId);
        taskModel.setCountVideo(countVideo);
        taskModel.setCountReklama(countReklama);
        taskModel.setCountMove(countMove);
        taskModel.setReklamafreeze(reklamaFreeze);
        taskModel.setVideoFreeze(videoFreeze);
        if (strategy != null) {
            taskModel.setStrategy(strategy);
        }
        return taskModel;
    }
}

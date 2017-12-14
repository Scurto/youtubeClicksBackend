package com.scurto.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yustymenko on 17.11.2017.
 */
public class ChanelIdStorage {

    public static String getChanelId(String taskId) {
        HashMap<String, TaskModel> allTaskModel = getAllTaskModel();
        TaskModel taskModel = allTaskModel.get(taskId);
        return taskModel.getChannelId();
    }

    public static ArrayList<TaskModel> getAllTaskModelArray() {
        return new ArrayList<TaskModel>(getAllTaskModel().values());
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
                null,
                "test"
        ));

        allTaskModel.put("2", model(
                "2",
                "3",
                "3",
                "3",
                30,
                30,
                "channel/UCJIbnmV8DdqOGEcl6hm-x8w",
                null,
                "test"
        ));
        allTaskModel.put("327158", model(
                "327158",
                "7",
                "2",
                "2",
                40,
                40,
                "user/dkdsl",
                "rpte",
                "2271404 - Евгений"
        ));
        allTaskModel.put("327835", model(
                "327835",
                "12",
                "1",
                "3",
                40,
                55,
                "user/PalkinBody",
                null,
                "2271404 - Евгений"
        ));
        allTaskModel.put("437355", model(
                "437355",
                "8",
                "2",
                "3",
                45,
                45,
                "user/PalkinChef",
                "rpte",
                "2271404 - Евгений"
        ));
        allTaskModel.put("327160", model(
                "327160",
                "8",
                "2",
                "2",
                45,
                45,
                "user/PalkinBody",
                "rpte",
                "2271404 - Евгений"
        ));
        allTaskModel.put("1457501", model(
                "1457501",
                "5",
                "3",
                "3",
                40,
                40,
                "channel/UCWviTklK43BjG7KP6sBQpbw",
                null,
                "8245711 - Дмитрий Мизерный"
        ));
//        allTaskModel.put("1628076", model(
//                "1628076",
//                "1",
//                "1",
//                "1",
//                34,
//                55,
//                "channel/UCufzTDx9I-75JgY5voVI7FA",
//                null,
//                    "6795138 - leyba5"
//        ));
        allTaskModel.put("1628076", model(
                "1628076",
                "5",
                "0",
                "0",
                34,
                40,
                "channel/UCufzTDx9I-75JgY5voVI7FA",
                null,
                "6795138 - leyba5"
        ));

        allTaskModel.put("1690816", model(
                "1690816",
                "1",
                "1",
                "2",
                35,
                50,
                "channel/UCufzTDx9I-75JgY5voVI7FA",
                null,
                "6795138 - leyba5"
        ));

        allTaskModel.put("1254825", model(
                "1254825",
                "3",
                "1",
                "2",
                30,
                30,
                "channel/UCE0fj9vk80sNG5ADEqrFF9g",
                null,
                "1403953 - Hugme"
        ));
        allTaskModel.put("1685040", model(
                "1685040",
                "1",
                "1",
                "2",
                40,
                50,
                "channel/UC8v0Rdi-gCEdFoprevXnrmg",
                null,
                "10919343 - Вадим"
        ));
        allTaskModel.put("1685742", model(
                "1685742",
                "1",
                "1",
                "2",
                40,
                50,
                "channel/UCiAFkRUtkYVs1vgXjHH7-ZQ",
                null,
                "10919343 - Вадим"
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
                "2",
                "2",
                40,
                55,
                "channel/UCYZKH0xzLa_LYIYA76GgocA",
                null,
                "10806861 - Vu Nguyen"
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
        allTaskModel.put("1641523", model(
                "1641523",
                "1",
                "1",
                "3",
                40,
                40,
                "user/NewMixPro",
                null,
                "10778148 - NewMix"
        ));

        allTaskModel.put("1597613", model(
                "1597613",
                "7",
                "2",
                "2",
                55,
                55,
                "channel/UC9h__DFkhKQ0D4JrYD_FmGA",
                null,
                "8622996 - Боря"
        ));

        allTaskModel.put("1686627", model(
                "1686627",
                "5",
                "5",
                "2",
                35,
                35,
                "channel/UCp4Ij2tD45ETgDqrQ723Lig",
                null
        ));

        allTaskModel.put("362698", model(
                "362698",
                "10",
                "0",
                "0",
                35,
                40,
                "user/Puteshestvie1",
                null,
                "2079971 - Mnatsakan"
        ));
        allTaskModel.put("677818", model(
                "677818",
                "8",
                "0",
                "0",
                35,
                40,
                "user/123pepush",
                null,
                "2079971 - Mnatsakan"
        ));

        allTaskModel.put("695075", model(
                "695075",
                "2",
                "2",
                "0",
                35,
                40,
                "user/123pepush",
                null,
                "2079971 - Mnatsakan"
        ));

        allTaskModel.put("1671590", model(
                "1671590",
                "10",
                "2",
                "2",
                35,
                45,
                "channel/UC3uEhRvVUFt3ypY1Us1aILg",
                null
        ));
        allTaskModel.put("1411090", model(
                "1411090",
                "2",
                "2",
                "0",
                35,
                35,
                "channel/UCTuHjQxohECtXF34vQY8GYA",
                null,
                "8386110 - Артём"
        ));
        allTaskModel.put("1306013", model(
                "1306013",
                "2",
                "2",
                "0",
                35,
                35,
                "channel/UCJZhOY2D3NodBzFVjiyMsiw",
                null,
                "8386110 - Артём"
        ));
        allTaskModel.put("1365817", model(
                "1365817",
                "3",
                "1",
                "1",
                35,
                35,
                "channel/UC9-uS0PokRtQJ9RL_jyuoRg",
                null,
                "8408010 - Александр"
        ));

        allTaskModel.put("1438352", model(
                "1438352",
                "2",
                "2",
                "2",
                40,
                40,
                "channel/UCJnyRfVt-mYajy9R8TMgMcQ",
                null,
                "9845746 - vladgrygorets"
        ));

        allTaskModel.put("1519863", model(
                "1519863",
                "5",
                "0",
                "0",
                59,
                59,
                "channel/UCMaG-XGGhdiqZX2j6jUAJbQ",
                null,
                "9368532 - Александр"
        ));

        allTaskModel.put("1679135", model(
                "1679135",
                "3",
                "2",
                "2",
                40,
                40,
                "channel/UC0vq6WjQ3dxWGxnFkF5SPwQ",
                null,
                "10724700 - Виктор"
        ));
        allTaskModel.put("357330", model(
                "357330",
                "2",
                "2",
                "0",
                40,
                40,
                "user/Puteshestvie1",
                null,
                "2079971 - Mnatsakan"
        ));
        allTaskModel.put("1689346", model(
                "1689346",
                "7",
                "2",
                "2",
                40,
                40,
                "channel/UCO0eop7jbAxaowFT-VoX4rA",
                null,
                "8338662 - Artem"
        ));
        allTaskModel.put("1003172", model(
                "1003172",
                "1",
                "1",
                "2",
                40,
                40,
                "channel/UCVVmtpAp4IY5125T0rPnPzQ",
                null,
                "4319928 - константин"
        ));


        return allTaskModel;
    }

    private static TaskModel model(String taskId, String countVideo, String countReklama, String countMove, Integer reklamaFreeze, Integer videoFreeze, String channelId, String strategy) {
        return model(taskId, countVideo, countReklama, countMove, reklamaFreeze, videoFreeze,channelId, strategy, null);
    }

    private static TaskModel model(String taskId, String countVideo, String countReklama, String countMove, Integer reklamaFreeze, Integer videoFreeze, String channelId, String strategy, String taskOwner) {
        TaskModel taskModel = new TaskModel();
        taskModel.setTaskId(taskId);
        taskModel.setCountVideo(countVideo);
        taskModel.setCountReklama(countReklama);
        taskModel.setCountMove(countMove);
        taskModel.setReklamaFreeze(reklamaFreeze);
        taskModel.setVideoFreeze(videoFreeze);
        taskModel.setChannelId(channelId);
        if (strategy != null) {
            taskModel.setStrategy(strategy);
        } else {
            taskModel.setStrategy("classic");
        }

        taskModel.setTaskOwner(taskOwner);
        return taskModel;
    }
}

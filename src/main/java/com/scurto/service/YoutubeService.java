package com.scurto.service;

import com.scurto.model.YoutubeTaskModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by scurto on 05.09.2017.
 */
@Service
public class YoutubeService {

    public YoutubeTaskModel getModel(String taskId) {
        for (YoutubeTaskModel model : taskList()) {
            if (model.getTaskId().equalsIgnoreCase(taskId)) {
                return model;
            }
        }
        return null;
    }

    public ArrayList<YoutubeTaskModel> taskList() {
        ArrayList<YoutubeTaskModel> models = new ArrayList<>();
        models.add(new YoutubeTaskModel("1", "1", "1", "1", "1" ,"1"));
        models.add(new YoutubeTaskModel("2", "2", "2", "2", "2" ,"2"));
        models.add(new YoutubeTaskModel("3", "3", "3", "3", "3" ,"3"));
        return models;
    }

}

package com.scurto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yustymenko on 12.10.2017.
 */
@Entity
@Table(name = "youtube")
public class Youtube {

    @Id
    @Column(name = "task_id")
    private String taskId;
    @Column(name = "last_date")
    private String lastDate;
    @Column(name = "last_reklama")
    private String lastReklama;

    public Youtube() {
        super();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getLastReklama() {
        return lastReklama;
    }

    public void setLastReklama(String lastReklama) {
        this.lastReklama = lastReklama;
    }
}

package com.scurto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "website")
public class Website {

    @Id
    @Column(name = "task_id")
    private String taskId;
    @Column(name = "last_date")
    private String lastDate;
    @Column(name = "last_advertise")
    private String lastAdvertise;
    @Column(name = "executionCount")
    private Integer executionCount;

    public Website() {
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

    public String getLastAdvertise() {
        return lastAdvertise;
    }

    public void setLastAdvertise(String lastAdvertise) {
        this.lastAdvertise = lastAdvertise;
    }

    public Integer getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(Integer executionCount) {
        this.executionCount = executionCount;
    }
}

//    ALTER TABLE seosprint.website
//        ADD executionCount int;

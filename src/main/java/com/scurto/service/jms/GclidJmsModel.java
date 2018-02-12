package com.scurto.service.jms;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.jms.Message;
import javax.jms.ObjectMessage;
import java.io.Serializable;

/**
 * Created by scurto on 11.02.2018.
 */
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id", scope = GclidJmsModel.class)
public class GclidJmsModel implements Serializable {

    private static final long serialVersionUID = 7526472295622776147L;

    private String time;
    private String gclid;

    public GclidJmsModel() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGclid() {
        return gclid;
    }

    public void setGclid(String gclid) {
        this.gclid = gclid;
    }



    @Override
    public String toString() {
        return "GclidJmsModel{" +
                "time='" + time + '\'' +
                ", gclid='" + gclid + '\'' +
                '}';
    }
}

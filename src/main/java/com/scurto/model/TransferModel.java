package com.scurto.model;

import java.util.ArrayList;

/**
 * Created by scurto on 17.10.2017.
 */
public class TransferModel {
    private ArrayList<TransferReklamaModel> transferReklamaModel;
    private ArrayList<String> transferVideoModel;
    private String transferReklamaKeys;
    private String transferChanelId;

    public ArrayList<TransferReklamaModel> getTransferReklamaModel() {
        return transferReklamaModel;
    }

    public void setTransferReklamaModel(ArrayList<TransferReklamaModel> transferReklamaModel) {
        this.transferReklamaModel = transferReklamaModel;
    }

    public ArrayList<String> getTransferVideoModel() {
        return transferVideoModel;
    }

    public void setTransferVideoModel(ArrayList<String> transferVideoModel) {
        this.transferVideoModel = transferVideoModel;
    }

    public String getTransferReklamaKeys() {
        return transferReklamaKeys;
    }

    public void setTransferReklamaKeys(String transferReklamaKeys) {
        this.transferReklamaKeys = transferReklamaKeys;
    }

    public String getTransferChanelId() {
        return transferChanelId;
    }

    public void setTransferChanelId(String transferChanelId) {
        this.transferChanelId = transferChanelId;
    }
}

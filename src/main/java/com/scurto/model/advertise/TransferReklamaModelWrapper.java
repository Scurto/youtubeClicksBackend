package com.scurto.model.advertise;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by yustymenko on 23.10.2017.
 */
public class TransferReklamaModelWrapper implements Serializable {
    private ArrayList<TransferReklamaModel> transferReklamaModels;
    private String transferReklamaKeys;

    public ArrayList<TransferReklamaModel> getTransferReklamaModels() {
        return transferReklamaModels;
    }

    public void setTransferReklamaModels(ArrayList<TransferReklamaModel> transferReklamaModels) {
        this.transferReklamaModels = transferReklamaModels;
    }

    public String getTransferReklamaKeys() {
        return transferReklamaKeys;
    }

    public void setTransferReklamaKeys(String transferReklamaKeys) {
        this.transferReklamaKeys = transferReklamaKeys;
    }
}

package com.scurto.model.YoutubeApiModel;

import java.io.Serializable;

/**
 * Created by scurto on 16.10.2017.
 */
public class PageInfo implements Serializable {
    private Integer resultsPerPage;
    private Integer totalResults;

    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
}

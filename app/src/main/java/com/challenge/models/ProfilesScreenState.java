package com.challenge.models;

import java.util.ArrayList;
import java.util.List;

public class ProfilesScreenState {

    private List<Result> resultList = new ArrayList<>();

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }

    public void addAll(List<Result> results) {
        resultList.addAll(results);
    }
}

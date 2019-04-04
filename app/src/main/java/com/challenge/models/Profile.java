
package com.challenge.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Profile {

    @SerializedName("_meta")
    @Expose
    private Meta meta;
    @SerializedName("result")
    @Expose
    private List<Result> result = new ArrayList<>();

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Profile withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Profile withResult(List<Result> result) {
        this.result = result;
        return this;
    }

}

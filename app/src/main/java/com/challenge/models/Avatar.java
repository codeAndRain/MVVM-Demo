
package com.challenge.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar {

    @SerializedName("href")
    @Expose
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Avatar withHref(String href) {
        this.href = href;
        return this;
    }

}


package com.challenge.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RateLimit {

    @SerializedName("limit")
    @Expose
    private int limit;
    @SerializedName("remaining")
    @Expose
    private int remaining;
    @SerializedName("reset")
    @Expose
    private int reset;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public RateLimit withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public RateLimit withRemaining(int remaining) {
        this.remaining = remaining;
        return this;
    }

    public int getReset() {
        return reset;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public RateLimit withReset(int reset) {
        this.reset = reset;
        return this;
    }

}

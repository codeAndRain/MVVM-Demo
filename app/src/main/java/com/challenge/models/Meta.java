
package com.challenge.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("success")
    @Expose
    private boolean success;
    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("totalCount")
    @Expose
    private int totalCount;
    @SerializedName("pageCount")
    @Expose
    private int pageCount;
    @SerializedName("currentPage")
    @Expose
    private int currentPage;
    @SerializedName("perPage")
    @Expose
    private int perPage;
    @SerializedName("rateLimit")
    @Expose
    private RateLimit rateLimit;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Meta withSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Meta withCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Meta withMessage(String message) {
        this.message = message;
        return this;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Meta withTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Meta withPageCount(int pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Meta withCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public Meta withPerPage(int perPage) {
        this.perPage = perPage;
        return this;
    }

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public Meta withRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

}

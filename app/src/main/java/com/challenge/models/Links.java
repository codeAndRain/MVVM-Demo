
package com.challenge.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("self")
    @Expose
    private Self self;
    @SerializedName("avatar")
    @Expose
    private Avatar avatar;

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public Links withSelf(Self self) {
        this.self = self;
        return this;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Links withAvatar(Avatar avatar) {
        this.avatar = avatar;
        return this;
    }

}

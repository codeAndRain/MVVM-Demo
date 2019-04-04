package com.challenge.mvvmdemo.service;

import com.challenge.models.Result;
import com.challenge.mvvmdemo.service.remote_service.RemoteDataSource;

import java.util.List;

import io.reactivex.Single;

public class Repository {

    RemoteDataSource remoteDataSource;

    public Repository() {
        this.remoteDataSource = new RemoteDataSource();
    }

    public Single<List<Result>> getProfiles() {
        return remoteDataSource.getProfiles();
    }
}

package com.challenge.mvvmdemo.service.remote_service;

import com.challenge.common.Constants;
import com.challenge.models.Result;

import java.util.List;

import io.reactivex.Single;

public class RemoteDataSource {

    ProfileService profileService;

    public RemoteDataSource() {
        profileService = ServiceProvider.getInstance().getProfileService();
    }

    public Single<List<Result>> getProfiles() {
        return profileService.getProfiles(Constants.FORMAT, Constants.ACCESS_TOKEN)
                .flatMap(profiles -> Single.just(profiles.getResult()));
    }
}

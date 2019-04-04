package com.challenge.mvvmdemo.service.remote_service;

import com.challenge.common.Constants;
import com.challenge.models.Profile;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProfileService {

    @GET(Constants.RELATIVE_URL)
    Single<Profile> getProfiles(@Query("format") String format,
                                @Query("access-token") String accessToken);
}

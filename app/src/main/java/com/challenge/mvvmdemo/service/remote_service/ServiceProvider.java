package com.challenge.mvvmdemo.service.remote_service;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceProvider {

    public static final String BASE_URL = "https://gorest.co.in/";

    private ProfileService profileService;

    private static ServiceProvider serviceProvider;

    private ServiceProvider() {
        buildRetrofit();
    }

    public static ServiceProvider getInstance() {
        if (serviceProvider == null) {
            serviceProvider = new ServiceProvider();
        }
        return serviceProvider;
    }

    private void buildRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        profileService = retrofit.create(ProfileService.class);
    }

    public ProfileService getProfileService() {
        return profileService;
    }
}

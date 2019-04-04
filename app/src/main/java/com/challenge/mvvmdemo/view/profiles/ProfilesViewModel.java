package com.challenge.mvvmdemo.view.profiles;

import android.util.Log;

import com.challenge.models.ProfilesScreenState;
import com.challenge.models.Result;
import com.challenge.mvvmdemo.service.Repository;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ProfilesViewModel extends ViewModel {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<ProfilesScreenState> profilesScreenLiveData = new MutableLiveData<>();

    private Repository repository;

    public void init() {
        repository = new Repository();
        getProfiles();
    }

    public MutableLiveData<ProfilesScreenState> getProfilesMutableLiveData() {
        return profilesScreenLiveData;
    }

    private void getProfiles() {
        compositeDisposable.add(repository.getProfiles()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(this::getProfileScreenState)
                .subscribe(profilesScreenState -> {
                    profilesScreenLiveData.setValue(profilesScreenState);
                }, throwable -> Log.d("TAG_1", throwable.getMessage())));
    }

    private ProfilesScreenState getProfileScreenState(List<Result> results) {
        ProfilesScreenState profilesScreenState = new ProfilesScreenState();
        profilesScreenState.addAll(results);
        return profilesScreenState;
    }
}

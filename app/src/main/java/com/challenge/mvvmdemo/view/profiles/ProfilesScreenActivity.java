package com.challenge.mvvmdemo.view.profiles;

import android.os.Bundle;

import com.challenge.mvvmdemo.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfilesScreenActivity extends AppCompatActivity {

    @BindView(R.id.profiles_recyclerview)
    RecyclerView recyclerView;

    private ProfilesAdapter profilesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViews();

        // initialize ViewModel
        ProfilesViewModel profilesViewModel = ViewModelProviders.of(this).get(ProfilesViewModel.class);
        profilesViewModel.init();


        // subscribe for updates
        profilesViewModel.getProfilesMutableLiveData().observe(this, profilesScreenState -> {
            if (profilesScreenState != null) {
                profilesAdapter.setResults(profilesScreenState.getResultList());
            }
        });
    }

    private void initViews() {
        profilesAdapter = new ProfilesAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(profilesAdapter);
    }

}

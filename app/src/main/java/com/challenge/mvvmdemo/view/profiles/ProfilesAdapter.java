package com.challenge.mvvmdemo.view.profiles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.challenge.models.Result;
import com.challenge.mvvmdemo.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfilesAdapter extends RecyclerView.Adapter<ProfilesViewHolder> {

    private List<Result> resultList = new ArrayList<>();

    @NonNull
    @Override
    public ProfilesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.profiles_recycler_view_item, parent, false);
        return new ProfilesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfilesViewHolder holder, int position) {
        Result result = resultList.get(position);
        holder.bind(result);
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    public void setResults(List<Result> results) {
        if (!resultList.isEmpty()) {
            resultList.clear();
        }
        resultList.addAll(results);
        notifyDataSetChanged();
    }
}

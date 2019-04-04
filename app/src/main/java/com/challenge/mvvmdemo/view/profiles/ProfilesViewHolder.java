package com.challenge.mvvmdemo.view.profiles;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.challenge.models.Result;
import com.challenge.mvvmdemo.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

class ProfilesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.user_avatar)
    ImageView userAvatar;
    @BindView(R.id.user_name)
    TextView userName;
    @BindView(R.id.user_email)
    TextView userEmail;

    private Context context;

    public ProfilesViewHolder(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
        ButterKnife.bind(this, itemView);
    }

    public void bind(Result result) {
        String imageUrl = result.getLinks().getAvatar().getHref();
        setImage(userAvatar, imageUrl, context);
        userName.setText(result.getName());
        userEmail.setText(result.getEmail());
    }

    private void setImage(ImageView avatarImageView, String imageUrl, Context context) {
        Glide.with(context)
                .load(imageUrl)
                .into(avatarImageView);
    }
}

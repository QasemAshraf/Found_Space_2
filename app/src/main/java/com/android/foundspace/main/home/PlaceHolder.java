package com.android.foundspace.main.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.foundspace.R;
import com.android.foundspace.models.Place;

public class PlaceHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView tvTitle;
    private TextView tvAddress;
    private RatingBar ratingBar;

    public PlaceHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    void initView(View view) {
        imageView = view.findViewById(R.id.item_place_imageView);
        tvTitle = view.findViewById(R.id.item_place_title_textView);
        tvAddress = view.findViewById(R.id.item_place_address_textView);
        ratingBar = view.findViewById(R.id.item_place_ratingBar);
    }

    void bindView(Place place) {
//        Picasso.get()
//                .load(place.getImage())
//                .placeholder(R.drawable.appicon)
//                .error(R.drawable.appicon)
//                .into(imageView);

        place.loadImage(imageView);
        tvTitle.setText(place.getName());
        tvAddress.setText(place.getAddress());
        ratingBar.setRating(place.getRating());
    }
}

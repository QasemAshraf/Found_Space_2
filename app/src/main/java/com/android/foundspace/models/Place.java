package com.android.foundspace.models;


import android.widget.ImageView;

import com.android.foundspace.R;
import com.squareup.picasso.Picasso;

public class Place {

    private String image;
    private String name;
    private String address;
    private float rating;

    public Place(String image, String name, String address, float rating) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void loadImage(ImageView imageView) {
        Picasso.get()
                .load(getImage())
                .placeholder(R.drawable.img_found_png)
                .error(R.drawable.img_found_png)
                .into(imageView);
    }
}

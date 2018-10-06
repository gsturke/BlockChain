package com.example.acer.blockchain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class ImageAdapter extends ArrayAdapter<Image> {
    public ImageAdapter(Context context, ArrayList<Image> imageList) {
        super(context, 0, imageList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initview(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initview(position, convertView, parent);
    }


    private View initview(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinner_img, parent, false);

        }
        ImageView imageView = convertView.findViewById(R.id.img1);
        Image image = getItem(position);

        if (image != null) {
            imageView.setImageResource(image.getMimage());
        }
        return convertView;
    }



    }

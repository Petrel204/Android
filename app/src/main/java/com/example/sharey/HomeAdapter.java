package com.example.sharey;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 张文博 on 2017/4/12.
 */

public class HomeAdapter extends ArrayAdapter<Auth> {

    private int resourceId;
    public HomeAdapter(Context context, int textViewResourceId, List<Auth> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Auth auth = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView authName= (TextView) view.findViewById(R.id.home_name);
        ImageView authImage= (ImageView) view.findViewById(R.id.home_image);
        authName.setText(auth.getName());
        authImage.setImageResource(auth.getImageId());
        return view;
    }
}

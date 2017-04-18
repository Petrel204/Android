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
 * Created by 张文博 on 2017/4/11.
 */

public class AuthAdapter extends ArrayAdapter<Auth> {

    private int resourceId;
    public AuthAdapter(Context context,int textViewResourceId,List<Auth> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Auth auth = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView authImage= (ImageView) view.findViewById(R.id.auth_image);
        TextView authName= (TextView) view.findViewById(R.id.auth_name);
        authImage.setImageResource(auth.getImageId());
        authName.setText(auth.getName());
        return view;
    }
}

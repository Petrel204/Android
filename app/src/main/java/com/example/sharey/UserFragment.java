package com.example.sharey;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by 张文博 on 2017/4/11.
 */

public class UserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_fragment,container,false);
        ImageButton more = (ImageButton)view.findViewById(R.id.more);
        more.setOnClickListener(new LocationCheckedListener());
        return view;
    }

    private class LocationCheckedListener implements View.OnClickListener {
        public void onClick(View v){
            Intent intent=new Intent();
            intent.setClass(getActivity(), AccountManagerActivity.class);
            getActivity().startActivity(intent);
        }
    }
}

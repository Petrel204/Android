package com.example.sharey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张文博 on 2017/4/11.
 */

public class HomeFragment extends Fragment {

    private List<Auth> homeList=new ArrayList<>();

    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);
        listView = (ListView)view.findViewById(R.id.list_view);
        inithomes();
        HomeAdapter adapter=new HomeAdapter(getActivity(),R.layout.home_item,homeList);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Auth auth = authList.get(position);
//                Toast.makeText(getActivity(),auth.getName()+"授权成功",Toast.LENGTH_SHORT).show();
//            }
//        });
//        ImageButton fab = (ImageButton)view.findViewById(R.id.fab);
//        fab.setOnClickListener(new LocationCheckedListener());
        return view;
    }

    private void inithomes() {
        Auth share1 = new Auth("历史分享的动态",R.mipmap.pic1);
        homeList.add(share1);
        Auth share2 = new Auth("历史分享的动态",R.mipmap.pic2);
        homeList.add(share2);
        Auth share3 = new Auth("历史分享的动态",R.mipmap.pic3);
        homeList.add(share3);
    }

//    private class LocationCheckedListener implements View.OnClickListener {
//        public void onClick(View v){
//            Intent intent=new Intent();
//            intent.setClass(getActivity(), ShareActivity.class);
//            getActivity().startActivity(intent);
//        }
//    }

}

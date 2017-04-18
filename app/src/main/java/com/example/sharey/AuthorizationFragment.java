package com.example.sharey;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 张文博 on 2017/4/11.
 */

public class AuthorizationFragment extends Fragment {

//    private String[] data1={"微博","QQ","微信"};
    private  List<Auth> authList=new ArrayList<>();

    private ListView listView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.auth_fragment , container, false);
        listView = (ListView)view.findViewById(R.id.list_view);
        initAuths();
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.auth_item ,getData());
        AuthAdapter adapter=new AuthAdapter(getActivity(),R.layout.auth_item,authList);
        //listView.setAdapter(arrayAdapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Auth auth = authList.get(position);
                Toast.makeText(getActivity(),auth.getName()+"授权成功",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
        }

    private void initAuths() {
        Auth weibo = new Auth("微博",R.drawable.weibo);
        authList.add(weibo);
        Auth qq = new Auth("QQ",R.drawable.qq);
        authList.add(qq);
        Auth weixin = new Auth("微信",R.drawable.weixin);
        authList.add(weixin);

    }


//    private List<String> getData(){
//        List<String> data = new ArrayList<String>();
//        for(int i = 0;i <3 ;i++) {
//            data.add(data1[i]);
//            }
//        return data;
//        }


}

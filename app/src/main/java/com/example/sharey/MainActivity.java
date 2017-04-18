package com.example.sharey;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import cn.sharesdk.onekeyshare.OnekeyShare;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }
        HomeFragment homefragment = new HomeFragment();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(R.id.frame,homefragment);
        beginTransaction.commit();
        group = (RadioGroup) findViewById(R.id.radiogroup);
        group.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.first:{
                HomeFragment homefragment = new HomeFragment();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.replace(R.id.frame,homefragment);
                beginTransaction.commit();

                break;
            }
            case R.id.second:{
                OnekeyShare onekeyShare=new OnekeyShare();
                onekeyShare.setTitle("zwbshare");
                onekeyShare.setText("1");
                onekeyShare.show(MainActivity.this);
//                AuthorizationFragment authfragment = new AuthorizationFragment();
//                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//                android.support.v4.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
//                beginTransaction.replace(R.id.frame,authfragment);
//                beginTransaction.commit();
                break;
            }
            case R.id.third:{
                UserFragment userfragment = new UserFragment();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.replace(R.id.frame,userfragment);
                beginTransaction.commit();
                break;
            }

        }
    }
}

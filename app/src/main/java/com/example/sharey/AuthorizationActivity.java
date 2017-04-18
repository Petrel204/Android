package com.example.sharey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AuthorizationActivity extends AppCompatActivity {

//    private String[] data={"微博","QQ","微信"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization);

//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
//                AuthorizationActivity.this,android.R.layout.simple_list_item_1,data
//        );
//        ListView listView= (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
    }
}

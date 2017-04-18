package com.example.sharey;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }
        //设置标题
        setTitle("注册成功！");
//接收数据
        Intent intent=this.getIntent();
        Bundle bundle=intent.getBundleExtra("info");
        String strUsername=bundle.getString("username");
        String strPwd=bundle.getString("password");
        String strCheck=bundle.getBoolean("check")?"是":"否";
        final TextView username=(TextView) findViewById(R.id.userName);
        username.setText(strUsername);
        final TextView password=(TextView) findViewById(R.id.password);
        password.setText(strPwd);
        final TextView strcheck=(TextView) findViewById(R.id.check);
        strcheck.setText(strCheck);
        Button OkBt=(Button) findViewById(R.id.OK);
        OkBt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                ResultActivity.this.finish();
            }
        });
    }
}

package com.example.sharey;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
public class RegisterActivity extends LogActivity {

    private boolean isChecked=false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }
        Button back = (Button)findViewById(R.id.title_back);
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//      设置标题
        setTitle("注册");
//      获取控件
        final EditText username=(EditText) findViewById(R.id.userName);
        final EditText password=(EditText) findViewById(R.id.password);
        final EditText repassword=(EditText) findViewById(R.id.repassword);
        CheckBox check=(CheckBox)findViewById(R.id.check);
        Button register=(Button)findViewById(R.id.register);
        Button cancel=(Button)findViewById(R.id.cancel);
//      事件监听
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean flag) {
//      TODO Auto-generated method stub
                isChecked=flag;
            }
        });
        register.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                String strUser=username.getText().toString();
                String strPwd=password.getText().toString();
                String strRepwd=repassword.getText().toString();
                if(strUser.equals("")){
//弹出对话框  验证是否填写用户名
                    new AlertDialog.Builder(RegisterActivity.this)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setTitle("警告")
                            .setMessage("请输入用户名")
                            .setPositiveButton("确定",null)
                            .show();
                    return;
                }
                if(!strPwd.equals(strRepwd)){
//弹出对话框  验证密码输入是否一致
                    new AlertDialog.Builder(RegisterActivity.this)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setTitle("警告")
                            .setMessage("两次密码输入不相同")
                            .setPositiveButton("确定",null)
                            .show();
                    return;
                }
                if(!isChecked){
//弹出对话框   验证是否同意条款
                    new AlertDialog.Builder(RegisterActivity.this)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setTitle("警告")
                            .setMessage("请勾选同意条款")
                            .setPositiveButton("确定",null)
                            .show();
                    return;
                }
//发送数据到另一个Activity
                Bundle bundle=new Bundle();
                bundle.putString("username", strUser);
                bundle.putString("password", strPwd);
                bundle.putBoolean("check", isChecked);
                Intent intent=new Intent(RegisterActivity.this,ResultActivity.class);
                intent.putExtra("info",bundle);
//启动这个Activity
                RegisterActivity.this.startActivity(intent);
//结束本Activity
                RegisterActivity.this.finish();
            }
        });
        cancel.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                RegisterActivity.this.finish();
            }
        });
    }
}
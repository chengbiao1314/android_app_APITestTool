package com.chengbiao.apitesttool;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {
    private LinearLayout ll_setIP;
    private TextView tv_tips;
    private EditText et_ip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getElement();
    }

    private void getElement(){
        ll_setIP = (LinearLayout) findViewById(R.id.ll_setIP);
        tv_tips = (TextView) findViewById(R.id.tv_tips);
        et_ip = (EditText) findViewById(R.id.et_ip);
    }

    public void action(View v){
        switch (v.getId()){
            case R.id.btn_beginTest:
                Intent intent_login = new Intent(this,LoginActivity.class);
                startActivity(intent_login);
                break;
            case R.id.btn_createApi:
                Intent intent_create = new Intent(this,CreateAPIActivity.class);
                startActivity(intent_create);
                break;
            case R.id.btn_setting:
                tv_tips.setVisibility(View.GONE);
                ll_setIP.setVisibility(View.VISIBLE);
                break;
            case R.id.btn_cancel:
                tv_tips.setVisibility(View.VISIBLE);
                ll_setIP.setVisibility(View.GONE);
                break;
            case R.id.btn_save:
                String temp = et_ip.getText().toString().trim();
                tv_tips.setText("设置的URL前缀为：\n"+temp);
                tv_tips.setVisibility(View.VISIBLE);
                ll_setIP.setVisibility(View.GONE);
                break;
            default:
                break;
        }
    }

}

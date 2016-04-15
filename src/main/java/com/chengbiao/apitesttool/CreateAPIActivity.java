package com.chengbiao.apitesttool;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Ricky on 16/4/14.
 */
public class CreateAPIActivity extends Activity {
    private ListView lv_listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createapi);

        getElement();
    }

    private void getElement(){
        lv_listview = (ListView) findViewById(R.id.lv_setkey);
    }
}

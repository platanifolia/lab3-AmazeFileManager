package com.amaze.filemanager.ui.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amaze.filemanager.R;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void gotoAbout(View view){
        Intent intent = new Intent(MyActivity.this,AboutActivity.class);
        startActivity(intent);
    }

    public void buttonTest(View view) {
        Intent intent = new Intent(MyActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
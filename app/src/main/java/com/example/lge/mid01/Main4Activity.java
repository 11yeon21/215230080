package com.example.lge.mid01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void toast(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "inform", Toast.LENGTH_LONG);
        toast.show();
    }


    public void Exit(View v) {
        moveTaskToBack(true);
        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
    }


}

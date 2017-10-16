package com.example.lge.mid01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void PreviousScreen(View v) {
        Intent i = new Intent(this, Main5Activity.class);
        startActivity(i);
    }

    public void FinishScreen(View v) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);

        Toast toast = Toast.makeText(getApplicationContext(), "BYE", Toast.LENGTH_LONG);
        toast.show();
    }
}

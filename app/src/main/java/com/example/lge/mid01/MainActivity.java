package com.example.lge.mid01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    public void replaceFragment(View view)
    {
        BlankFragment fr = null;

        if(view == findViewById(R.id.Fg1)){
            fr = new BlankFragment(); }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.Fg1, fr);
        fragmentTransaction.commit();

    }
    */


   public void nextScene(View vvv) {
        //ViewGroup vg = (ViewGroup) vvv.findViewById(R.id.Scr4);
        //Scene s2 = Scene.getSceneForLayout(vg, R.layout.activity_main5, this);
        //s2.enter();

        Intent i = new Intent(this, Main5Activity.class);
        startActivity(i);


        Toast toast = Toast.makeText(getApplicationContext(), "start", Toast.LENGTH_LONG);
        toast.show();
    }

}

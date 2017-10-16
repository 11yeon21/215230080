package com.example.lge.mid01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TabHost th1 = (TabHost) findViewById(R.id.tabHost);
        th1.setup();

        // "Tab Spec" 태그(Tag)를 가진 TabSpec 객체 생성.
        TabHost.TabSpec t1 = th1.newTabSpec("T1");
        // 탭이 눌려졌을 때 FrameLayout에 표시될 Content 뷰에 대한 리소스 id 지정.
        t1.setContent(R.id.ramen);
        // 탭에 표시될 문자열 지정
        t1.setIndicator("Ramen");
        // TabHost에 탭 추가.
        th1.addTab(t1);

        TabHost.TabSpec t2 = th1.newTabSpec("T2");
        t2.setContent(R.id.EggCustard);
        t2.setIndicator("EggCustard");
        th1.addTab(t2);

    }

    public void NextScreen1 (View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);

        Toast toast = Toast.makeText(getApplicationContext(), "Ramen", Toast.LENGTH_LONG);
        toast.show();

    }

    public void NextScreen2 (View v){
        Intent i = new Intent(this,Main3Activity.class);
        startActivity(i);

        Toast toast = Toast.makeText(getApplicationContext(), "Egg Custard", Toast.LENGTH_LONG);
        toast.show();
    }
}

package com.demoutils.jinyuaniwm.javabasics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.demoutils.jinyuaniwm.javabasics.init.AABaseAllActivity;
import com.demoutils.jinyuaniwm.javabasics.init.Baseb_cActivity;
import com.demoutils.jinyuaniwm.javabasics.init.ConstructWithPublicActivity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ConstructWithPublicActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ConstructWithPublicActivity.class));
            }
        });


        findViewById(R.id.Baseb_cActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Baseb_cActivity.class));

            }
        });

        findViewById(R.id.BaseAllActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AABaseAllActivity.class));

            }
        });
    }


}

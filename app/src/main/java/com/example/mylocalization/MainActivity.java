package com.example.mylocalization;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLanguage = findViewById(R.id.btn_language);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                localeSetting();
            }
        });
    }
    private void localeSetting(){
        Intent i = new Intent(Settings.ACTION_LOCALE_SETTINGS);
        startActivity(i);
    }
}

package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.githang.statusbar.StatusBarCompat;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Integer result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.btn_1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result+0;
            };
        });

        StatusBarCompat.setStatusBarColor(this, 0xFAFAFA,true);
    }
}
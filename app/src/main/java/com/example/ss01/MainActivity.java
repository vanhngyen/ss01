package com.example.ss01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        tvTitle = findViewById(R.id.tvtitle);
        ImageView ivCover = findViewById(R.id.ivCover);
        ivCover.setImageResource(R.drawable.baby);

    }
}

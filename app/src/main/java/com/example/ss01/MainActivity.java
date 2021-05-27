package com.example.ss01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvTitle;
    EditText edUser;
    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
    protected void onCreate(Bundle savedInstanceState) {

//        ImageView ivCover;
//        Button btLogin;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        tvTitle =findViewById(R.id.tvtitle);//tifm cac compolen
        ImageView ivCover = findViewById(R.id.ivCover);
        ivCover.setImageResource(R.drawable.baby);
        edUser = findViewById(R.id.edUser);
        Button btLogin = findViewById(R.id.btnLogin);
        btLogin.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnLogin:
                Log.d("MainActivity",edUser.getText().toString());
                tvTitle.setText("Hello baby");
                Toast.makeText(MainActivity.this,
                    edUser.getText().toString(),
                    Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvtitle:
                break;
            default:
                break;
        }

    }

}

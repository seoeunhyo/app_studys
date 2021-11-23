package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec);

        Button btn = (Button)findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecActivity.class);
                startActivity(intent);
            }
        });
    }

    public void back(View view) {
//선택완료창으로
    }


}
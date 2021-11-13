package com.example.appstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

        String name = getIntent().getStringExtra("name");

        Button btn2 = (Button)findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),third.class);
                intent.putExtra("name2", "eunhyo");
                startActivity(intent);

            }
        });
    setResult(RESULT_OK);


    }



}

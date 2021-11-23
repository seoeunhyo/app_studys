package com.example.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trd);
    }
    public void yes(View view){
// 초기화면 또는 예약내역?
    }
    public void no(View view){
// 결제창 또는 초기화면으로
    }
}

package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class sanpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanp);



        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(sanpActivity.this,MainActivity.class);
                startActivity( intent );


            }
        },3000 );
    }
}

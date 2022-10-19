package com.example.mealerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp = (TextView) findViewById(R.id.signUpBttn);
        signUp.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View view){
        if(view.getId()==R.id.signUpBttn){
            startActivity(new Intent(ths, CookersignupPageActivity.class));
        }
    }
}
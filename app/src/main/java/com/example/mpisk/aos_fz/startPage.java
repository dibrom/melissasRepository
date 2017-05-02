package com.example.mpisk.aos_fz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class startPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    public void goToLogin(View view){
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }

    public void goToSignUp(View view){
        Intent intent = new Intent(this, SignUpPage1.class);
        startActivity(intent);
    }
}

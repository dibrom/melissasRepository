package com.example.mpisk.aos_fz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpPage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page1);
    }

    public void goToSignUpPage2(View view){
        Intent intent = new Intent(this, SignUpPage2_Sportart.class);
        startActivity(intent);
    }
}

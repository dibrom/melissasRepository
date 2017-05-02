package com.example.mpisk.aos_fz;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;


public class SignUpPage2_Sportart extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page2__sportart);
    }

    public void goToSignUpPage3(View view){
        Intent intent = new Intent(this, SignUpPage3_Ziele.class);
        startActivity(intent);
    }
}

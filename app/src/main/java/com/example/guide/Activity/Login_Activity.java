package com.example.guide.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guide.R;


public class Login_Activity extends AppCompatActivity {
   private Button user_button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        user_button_login=findViewById(R.id.user_button_login);
        user_button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Otp_Activity.class);
                startActivity(intent);
            }
        });
    }
}

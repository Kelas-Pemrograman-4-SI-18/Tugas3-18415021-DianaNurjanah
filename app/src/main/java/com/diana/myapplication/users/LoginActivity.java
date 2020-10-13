package com.diana.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.diana.myapplication.R;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {

    Button btnRegistrasi;
    NoboButton btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegistrasi = (Button) findViewById(R.id.btnRegistrasi);
        btnLogin = (NoboButton) findViewById(R.id.loginBtn);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, registrasi.class);
                startActivity(i);
                finish();
            }
        });

       // btnLogin.setOnClickListener(new View.OnClickListener() {
       //     @Override
         //   public void onClick(View v) {
           //     Intent i = new Intent(LoginActivity.this, Homeadmin.class);
             //   startActivity(i);
               // finish();
      //      }
       // });

    }
}
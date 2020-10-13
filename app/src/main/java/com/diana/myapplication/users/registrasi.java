package com.diana.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.diana.myapplication.R;
//import com.diana.pembeli.HomePembeliActivity;
import com.ornach.nobobutton.NoboButton;

public class registrasi extends AppCompatActivity {

    Button btnLogin;
    NoboButton btnRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        getSupportActionBar().hide();

        btnRegistrasi = (NoboButton) findViewById(R.id.btnRegistrasi);
        btnLogin = (Button) findViewById(R.id.loginBtn);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(registrasi.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(registrasi.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
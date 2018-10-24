package com.example.kevin.projectprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {


    //needed for the login later

    private Button btnLogin;
    private EditText etName;
    private EditText etPass;
    private TextView tvError;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPassword);
        tvError = findViewById(R.id.tvError);



            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Login.this, Mainpage.class));
                }
            });
    }
}

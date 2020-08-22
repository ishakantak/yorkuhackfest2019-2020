package com.example.greenify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button signUpBtn;

    EditText emailBox, passwordBox;
    Button loginBtn;
    DataBaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DataBaseHelper(this);
        emailBox = (EditText) findViewById(R.id.emailBox);
        passwordBox = (EditText) findViewById(R.id.passwordBox);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailBox.getText().toString();
                String password = passwordBox.getText().toString();
                Boolean ChkEmailPass = db.emailPassword(email, password);

                if(ChkEmailPass == true) {
                    loginBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(LoginActivity.this,CategoryActivity.class);
                            startActivity(intent);
                        }
                    });
                }
                else
                    Toast.makeText(getApplicationContext(),"Wrong email or password", Toast.LENGTH_SHORT).show();
            }

        });




        signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

}

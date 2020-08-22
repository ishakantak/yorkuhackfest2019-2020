package com.example.greenify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private TextView goBack;
    DataBaseHelper db;
    EditText userEmailBox, userPasswordBox, confirmBox;
    Button createBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DataBaseHelper(this);
        confirmBox = (EditText) findViewById(R.id.confirmBox);
        userEmailBox = (EditText) findViewById(R.id.userEmailBox);
        userPasswordBox = (EditText) findViewById(R.id.userPasswordBox);
        createBtn = (Button) findViewById(R.id.createBtn);
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String confirm = confirmBox.getText().toString();
                String userEmail = userEmailBox.getText().toString();
                String userPassword = userPasswordBox.getText().toString();
                if(userEmail.equals("") || userPassword.equals("") || confirm.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(userPassword.equals(confirm)){
                        Boolean chkemail = db.chkemail(userEmail);
                        if(chkemail == true){
                            Boolean insert = db.insert(userEmail, userPassword);
                            if(insert == true){
                                Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Email Already exists", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(!userPassword.equals(confirm)){
                        Toast.makeText(getApplicationContext(), "Your password is unmatched", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}

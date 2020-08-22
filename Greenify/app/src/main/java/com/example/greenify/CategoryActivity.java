package com.example.greenify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class CategoryActivity extends AppCompatActivity {
    private LinearLayout flowersBox;
    private LinearLayout herbBox;
    private LinearLayout treeBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        flowersBox = findViewById(R.id.flowersBox);
        herbBox = findViewById(R.id.herbBox);
        treeBox = findViewById(R.id.treeBox);


        flowersBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,FlowersActivity.class);
                startActivity(intent);}
    });

        herbBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,HerbActivity.class);
                startActivity(intent);}
        });

        treeBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,TreeActivity.class);
                startActivity(intent);}
        });
    }
}


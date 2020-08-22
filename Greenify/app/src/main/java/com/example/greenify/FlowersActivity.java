package com.example.greenify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FlowersActivity extends AppCompatActivity {

    DataBaseHelper db;


    
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        listView = (ListView) findViewById(R.id.listView);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);

        data.add("Rose");
        data.add("Tulip");
        data.add("Sunflower");
        data.add("Daisy");
        data.add("Lilies");
        adapter.notifyDataSetChanged();



    }
}

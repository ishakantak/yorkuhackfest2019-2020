package com.example.greenify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HerbActivity extends AppCompatActivity {
    private ListView herbList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herb);
        herbList = (ListView) findViewById(R.id.herbList);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        herbList.setAdapter(adapter);

        data.add("Rosemary");
        data.add("Parsley");
        data.add("Mint");
        data.add("Thyme");
        data.add("Cilantro");
        adapter.notifyDataSetChanged();




    }
}

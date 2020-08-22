package com.example.greenify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TreeActivity extends AppCompatActivity {

    private ListView treeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        treeList = (ListView) findViewById(R.id.treeList);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        treeList.setAdapter(adapter);

        data.add("Maple tree");
        data.add("Cedar tree");
        data.add("Pine tree");
        data.add("Cherry tree");
        data.add("Poplar tree");
        adapter.notifyDataSetChanged();
    }
}

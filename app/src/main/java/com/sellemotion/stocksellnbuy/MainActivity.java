package com.sellemotion.stocksellnbuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //StockOwnList
    ArrayList<String> listItems=new ArrayList<String>();

    //set a string adapter
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.stockownitemlistview);

        listItems.add("item 1");
        listItems.add("item 2");
        listItems.add("item 3");
        listItems.add("item 4");
        listItems.add("item 5");
        listItems.add("item 6");

        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);

        listView.setAdapter(adapter);
        System.out.println("sssss");
    }

    public void addItems(View v) {
        listItems.add("test item");
        adapter.notifyDataSetChanged();
    }
}

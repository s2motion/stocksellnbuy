package com.sellemotion.stocksellnbuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sellemotion.stocksellnbuy.stock.StockOwnItemListViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    //StockOwnList
    ArrayList<HashMap<String, String>> listItems;

    //set a string adapter
    StockOwnItemListViewAdapter adapter;

    public static final String FIRST_COLUMN="First";
    public static final String SECOND_COLUMN="Second";
    public static final String THIRD_COLUMN="Third";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.stockownitemlistview);

        populateList();
        adapter=new StockOwnItemListViewAdapter(this, listItems);

        listView.setAdapter(adapter);

    }

    private void populateList(){
        listItems = new ArrayList<HashMap<String, String>>();

        HashMap<String,String> hashmap=new HashMap<String, String>();
        hashmap.put(FIRST_COLUMN, "0001");
        hashmap.put(SECOND_COLUMN, "삼성전자");
        hashmap.put(THIRD_COLUMN, "10,000");
        listItems.add(hashmap);

        HashMap<String,String> hashmap2=new HashMap<String, String>();
        hashmap2.put(FIRST_COLUMN, "0002");
        hashmap2.put(SECOND_COLUMN, "애경산업");
        hashmap2.put(THIRD_COLUMN, "15,000");
        listItems.add(hashmap2);

        HashMap<String,String> hashmap3=new HashMap<String, String>();
        hashmap3.put(FIRST_COLUMN, "0003");
        hashmap3.put(SECOND_COLUMN, "랩노믹스");
        hashmap3.put(THIRD_COLUMN, "20,000");
        listItems.add(hashmap3);
    }

}

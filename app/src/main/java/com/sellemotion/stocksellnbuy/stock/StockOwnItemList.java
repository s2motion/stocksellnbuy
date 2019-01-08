package com.sellemotion.stocksellnbuy.stock;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sellemotion.stocksellnbuy.R;

import java.util.ArrayList;

public class StockOwnItemList extends ListActivity {
    //StockOwnList
    ArrayList<String> listItems=new ArrayList<String>();

    //set a string adapter
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        listItems.add("삼성전자");
        listItems.add("애경산업");
        listItems.add("랩노믹스");
        listItems.add("삼성전기");
        listItems.add("셀트리온");
        listItems.add("삼성바이오로직스");

        final ListView listView = (ListView) findViewById(R.id.stockownitemlistview);

        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_2,
                listItems);

        listView.setAdapter(adapter);
    }

    public void addItems(View v) {
        listItems.add("test item");
        adapter.notifyDataSetChanged();
    }
}

package com.sellemotion.stocksellnbuy.stock;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.sellemotion.stocksellnbuy.R;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class StockOwnItemListViewAdapter extends BaseAdapter{

    public ArrayList<HashMap<String, String>> stockOwnItemList;
    Activity activity;

    public static final String FIRST_COLUMN = "종목코드";
    public static final String SECOND_COLUMN = "종목명";
    public static final String THIRD_COLUMN = "현재가";


    public StockOwnItemListViewAdapter(Activity activity, ArrayList<HashMap<String, String>> list){
        super();
        this.activity = activity;
        this.stockOwnItemList = list;
    }

    @Override
    public int getCount() {
        return stockOwnItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return stockOwnItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ListViewItemHolder {
        TextView firstColumn;
        TextView secondColumn;
        TextView thirdColumn;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ListViewItemHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();

        if(view == null){
            view = inflater.inflate(R.layout.stockitem_column, null);
            holder = new ListViewItemHolder();
            holder.firstColumn = (TextView)view.findViewById(R.id.TextFirst);
            holder.secondColumn = (TextView)view.findViewById(R.id.TextSecond);
            holder.thirdColumn = (TextView)view.findViewById(R.id.TextThird);

            view.setTag(holder);
        }else{
            holder = (ListViewItemHolder)view.getTag();
        }

        HashMap<String, String> map = stockOwnItemList.get(i);
        holder.firstColumn.setText(map.get(FIRST_COLUMN));
        holder.secondColumn.setText(map.get(SECOND_COLUMN));
        holder.thirdColumn.setText(map.get(THIRD_COLUMN));
        return view;
    }
}

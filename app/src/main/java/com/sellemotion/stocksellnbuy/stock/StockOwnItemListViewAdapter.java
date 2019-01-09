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

    public static final String FIRST_COLUMN = "First";
    public static final String SECOND_COLUMN = "Second";
    public static final String THIRD_COLUMN = "Third";


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
        return i;
    }

    private class ListViewItemHolder {
        TextView txtFirst;
        TextView txtSecond;
        TextView txtThird;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ListViewItemHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();

        if(convertView == null){
            convertView = inflater.inflate(R.layout.stockitem_column, null);
            holder = new ListViewItemHolder();
            holder.txtFirst = (TextView)convertView.findViewById(R.id.TextFirst);
            holder.txtSecond = (TextView)convertView.findViewById(R.id.TextSecond);
            holder.txtThird = (TextView)convertView.findViewById(R.id.TextThird);
            convertView.setTag(holder);
        }else{
            holder = (ListViewItemHolder)convertView.getTag();
        }

        HashMap<String, String> map = stockOwnItemList.get(position);
        holder.txtFirst.setText(FIRST_COLUMN);
        holder.txtSecond.setText(map.get(SECOND_COLUMN));
        holder.txtThird.setText(map.get(THIRD_COLUMN));

        return convertView;
    }
}

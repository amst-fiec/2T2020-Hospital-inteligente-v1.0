package com.example.getabed;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CamasAdapter extends BaseAdapter {
    Context context;
    ArrayList<Cama> arrayList;

    public CamasAdapter(Context context, ArrayList<Cama> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Cama cama= arrayList.get(position);
        Log.d("cama", cama.getEstado());
        if ( cama.getEstado()=="Ocupado") {
            convertView = LayoutInflater.from(context).inflate(R.layout.cama_ocupada, parent, false);
        }else{
            convertView = LayoutInflater.from(context).inflate(R.layout.cama_desocupada, parent, false);
        }
        return convertView;
    }
}

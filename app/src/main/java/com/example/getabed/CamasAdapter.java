package com.example.getabed;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
        convertView = LayoutInflater.from(context).inflate(R.layout.cama_ocupada, parent, false);
        ImageView img= (ImageView) convertView.findViewById(R.id.cama);
        if ( cama.getEstado().equals("Ocupado")) {
            img.setBackgroundColor(Color.RED);
        }else{
            img.setBackgroundColor(Color.WHITE);
        }
        TextView idView= (TextView) convertView.findViewById(R.id.idCama);
        idView.setText(idView.getText()+cama.getId());
        TextView estadoView= (TextView) convertView.findViewById(R.id.estadoCama);
        estadoView.setText(cama.getEstado());
        TextView bateriaView= (TextView) convertView.findViewById(R.id.bateriaView);
        bateriaView.setText(bateriaView.getText()+cama.getBateria());
        return convertView;
    }
}

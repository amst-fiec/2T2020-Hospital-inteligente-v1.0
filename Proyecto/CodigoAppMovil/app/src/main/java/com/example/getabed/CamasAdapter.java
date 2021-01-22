package com.example.getabed;

import android.content.Context;
import android.graphics.Color;
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
       TextView idView= (TextView) convertView.findViewById(R.id.idCama);
        idView.setText(idView.getText()+cama.getId());
        TextView estadoView= (TextView) convertView.findViewById(R.id.estadoCama);

        if ( cama.getEstado().equals("Ocupado")) {
            estadoView.setText(cama.getEstado());
            img.setImageResource(R.drawable.cama_ocupado);
            estadoView.setTextColor(Color.parseColor("#E6352B"));
        }else{
            estadoView.setText("Desocupado");
            img.setImageResource(R.drawable.cama_desocupada);
            estadoView.setTextColor(Color.parseColor("#04A04B"));
        }
        String bateria= cama.getBateria();
        if(bateria.length()>2){
            bateria= cama.getBateria().substring(0,2);
        }

        TextView bateriaView= (TextView) convertView.findViewById(R.id.bateriaView);
        bateriaView.setText(bateriaView.getText()+bateria+" %");
        return convertView;
    }
}

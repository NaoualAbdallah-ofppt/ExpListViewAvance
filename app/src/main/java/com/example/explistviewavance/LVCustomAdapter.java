package com.example.explistviewavance;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LVCustomAdapter
extends BaseAdapter {
    Context C;

    public LVCustomAdapter(Context c) {
        C = c;
    }

    @Override
    public int getCount() {
       // return  0;
        return Logiciel.getLstLog().size();
    }

    @Override
    public Object getItem(int i) {
       // return  null;

        return Logiciel.getLstLog().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       view= LayoutInflater.from(C).inflate(R.layout.lv_item,viewGroup,false);
         TextView txtN=(TextView) view.findViewById(R.id.txtNom);
         TextView txtE=(TextView) view.findViewById(R.id.txtEdit);
        ImageView img=(ImageView) view.findViewById(R.id.img);
        Logiciel L = Logiciel.getLstLog().get(i);
        txtN.setText(L.getNom());
        txtE.setText(L.getEditeur());
        img.setImageResource(L.getPhoto());
        return view;
    }
}

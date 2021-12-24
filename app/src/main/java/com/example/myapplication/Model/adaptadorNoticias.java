package com.example.myapplication.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.R;

public class adaptadorNoticias extends ArrayAdapter<noticias> {
   public adaptadorNoticias ( Context context, noticias[] datos) {
       super(context, R.layout.ly_itemnoticias, datos);
}
   public View getView(int position, View convertView, ViewGroup parent) {
       LayoutInflater inflater = LayoutInflater.from(getContext());
       View item = inflater.inflate(R.layout.ly_itemnoticias, null);
       TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
       lblTitulo.setText(getItem(position).getTitulo());
       TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
       lblSubtitulo.setText(getItem(position).getSubtitulo());
       return(item);
}
}


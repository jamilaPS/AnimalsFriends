package com.tads.animalsfriends.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tads.animalsfriends.R;
import com.tads.animalsfriends.modelo.MausTratos;

import java.util.List;

/**
 * Created by jamila on 21/06/16.
 */
public class AdapterMausTratos extends BaseAdapter {
    private Activity activity;
    private List<MausTratos> listaMausTratos;

    public AdapterMausTratos(Activity activity, List<MausTratos> listaMausTratos) {
        this.activity = activity;
        this.listaMausTratos = listaMausTratos;
    }

    @Override
    public int getCount() {
        return listaMausTratos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaMausTratos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaMausTratos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(activity).inflate(R.layout.list_view_maus_tratos, parent, false);
        MausTratos mausTratos = (MausTratos) getItem(position);

        TextView textDescricao = ((TextView) view.findViewById(R.id.textViewDescricao));
        TextView textCidade = ((TextView) view.findViewById(R.id.textViewCidade));

        textDescricao.setText(mausTratos.getDescricao());
        textCidade.setText(mausTratos.getCidade());

        return view;
    }
}

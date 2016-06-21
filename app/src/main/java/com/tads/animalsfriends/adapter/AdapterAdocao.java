package com.tads.animalsfriends.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.tads.animalsfriends.modelo.Adocao;

import java.util.List;

/**
 * Created by jamila on 21/06/16.
 */
public class AdapterAdocao extends BaseAdapter {
    private Activity activity;
    private List<Adocao> listaAdocao;

    public AdapterAdocao(Activity activity, List<Adocao> listaAdocao) {
        this.activity = activity;
        this.listaAdocao = listaAdocao;
    }

    @Override
    public int getCount() {
        return listaAdocao.size();
    }

    @Override
    public Object getItem(int position) {
        return listaAdocao.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaAdocao.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}

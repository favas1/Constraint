package com.project.constraint.adapters;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;


import com.project.constraint.R;
import com.project.model.model_grid;

import java.util.List;


public class AdapterGridview extends BaseAdapter {


    Context context;
    List<model_grid> list;


    public AdapterGridview(Context context, List<model_grid> list) {
        this.context = context;
        this.list = list;

    }

    private class ViewHolder {

        TextView txt1, txt2;


    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        final ViewHolder holder;
        if (view == null) {


            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(R.layout.model_grid, null);


            holder = new ViewHolder();


            holder.txt1 = view.findViewById(R.id.txt1);
            holder.txt2 = view.findViewById(R.id.txt2);

            view.setTag(holder);
        } else {


            holder = (ViewHolder) view.getTag();
        }
        //    imageView.setImageResource(mThumbIds[position]);


        final model_grid cpr = list.get(position);
        holder.txt1.setText(cpr.getLoaction());
        holder.txt2.setText(cpr.getAmount());

        return view;
    }


}

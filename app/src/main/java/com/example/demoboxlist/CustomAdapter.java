package com.example.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<boxes> boxesList;

    public CustomAdapter(Context context, int resource, ArrayList<boxes> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        boxesList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivitem = rowView.findViewById(R.id.imageView1st);

        boxes currentItem = boxesList.get(position);

        if (currentItem.getColor().equals("o")) {
            ivitem.setImageResource(R.drawable.orange_box);
        } else if (currentItem.getColor().equals("bl")) {
            ivitem.setImageResource(R.drawable.blue_box);
        } else {
            ivitem.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}

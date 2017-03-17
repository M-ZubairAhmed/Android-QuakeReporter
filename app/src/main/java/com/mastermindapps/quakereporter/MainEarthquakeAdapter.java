package com.mastermindapps.quakereporter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainEarthquakeAdapter extends ArrayAdapter<MainEarthquareData> {

    public MainEarthquakeAdapter(@NonNull Context context, @NonNull ArrayList<MainEarthquareData> arrayListMain) {
        super(context, 0, arrayListMain);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;
        if (rowView == null){
            rowView = LayoutInflater.from(getContext()).inflate(R.layout.row_main,parent,false);
        }
        MainEarthquareData item = getItem(position);

        TextView ritcher_text = (TextView) rowView.findViewById(R.id.row_main_ritcher_xml);
        ritcher_text.setText(item.getRitcher());
        TextView place_text = (TextView) rowView.findViewById(R.id.row_main_city_xml);
        place_text.setText(item.getPlace());
        TextView date_text = (TextView) rowView.findViewById(R.id.row_main_date_xml);
        date_text.setText(item.getDate());

        return rowView;
    }
}

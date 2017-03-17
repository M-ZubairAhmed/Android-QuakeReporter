package com.mastermindapps.quakereporter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MainEarthquareData> arrayListMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListMain = new ArrayList<>();
        arrayListMain.add(new MainEarthquareData("5.2","Mosco, Russia", "24 Apr 16"));
        arrayListMain.add(new MainEarthquareData("2.1","Java, Indonesia", "21 Apr 16"));
        ListView listView = (ListView) findViewById(R.id.list_view_xml);

    }
}

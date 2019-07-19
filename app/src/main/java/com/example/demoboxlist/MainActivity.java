package com.example.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBoxes;
    ArrayList<boxes> alBoxesList;
    CustomAdapter caBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBoxes = findViewById(R.id.listViewBox);
        alBoxesList = new ArrayList<>();

        boxes item1 = new boxes("bl");
        boxes item2 = new boxes("o");
        boxes item3 = new boxes("br");

        alBoxesList.add(item1);
        alBoxesList.add(item2);
        alBoxesList.add(item3);

        caBoxes = new CustomAdapter(this,R.layout.row,alBoxesList);
        lvBoxes.setAdapter(caBoxes);
    }
}

package com.example.mounikapathuri.listascnddec81;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ListView MyListView;
    private ArrayList<String> mMonths;
    private ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListView = (ListView) findViewById(R.id.Months);
        Button Des = (Button) findViewById(R.id.btnDescending);
        Button Asc = (Button) findViewById(R.id.btnAscending);

        mMonths = new ArrayList<>();
        mMonths.add("January");
        mMonths.add("February");
        mMonths.add("March");
        mMonths.add("April");
        mMonths.add("May");
        mMonths.add("June");
        mMonths.add("July");
        mMonths.add("August");
        mMonths.add("September");
        mMonths.add("October");
        mMonths.add("November");
        mMonths.add("December");

        mAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, mMonths);
        MyListView.setAdapter(mAdapter);
    }

    public void Ascending(View v) {
        Collections.sort(mMonths);
        mAdapter.notifyDataSetChanged();
        Toast.makeText(MainActivity.this, "Sorting in Ascending Order", Toast.LENGTH_SHORT).show();
    }

    public void Descending(View v) {
        Collections.sort(mMonths,Collections.<String>reverseOrder());
        mAdapter.notifyDataSetChanged();
        Toast.makeText(MainActivity.this, "Sorting in Descending Order", Toast.LENGTH_SHORT).show();
    }
}


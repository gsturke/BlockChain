package com.example.acer.blockchain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

public class Send_Bitcoin extends AppCompatActivity  {
    private ArrayList<Image> mCountryList;
    private ImageAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_bitcoin);

        initList();

        Spinner spinnerCountries = findViewById(R.id.spinner);

        mAdapter = new ImageAdapter(this, mCountryList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Image clickedItem = (Image) parent.getItemAtPosition(position);

                Toast.makeText(Send_Bitcoin.this, clickedItem + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initList() {
        mCountryList = new ArrayList<>();
        mCountryList.add(new Image( R.drawable.bitcoin_cash));
        mCountryList.add(new Image(R.drawable.bitcoin_cash1));
        mCountryList.add(new Image(R.drawable.ether));



        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.my_bitccin,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.my_bitccin,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
      //  spinner.setOnItemSelectedListener(this);

    }

   /* @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }*/
}

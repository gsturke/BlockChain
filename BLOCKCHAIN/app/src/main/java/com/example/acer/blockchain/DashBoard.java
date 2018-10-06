package com.example.acer.blockchain;

import android.app.DownloadManager;
import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity  {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private ActionBar toolbar;
    private Button send, request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        send = (Button) findViewById(R.id.send);
        request = (Button) findViewById(R.id.register);

        send.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                if (view == send) {
                    startActivity(new Intent(DashBoard.this, Send.class));
                }
            }

        });

        request.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                if (view == request) {
                    startActivity(new Intent(DashBoard.this, RequestActivity.class));
                }
            }

        });


        /*toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("Shop");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    {
        mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.home:
                        toolbar.setTitle("Home");
                        return true;
                    case R.id.bitcoin:
                        toolbar.setTitle("Bitcoin");
                        return true;
                    case R.id.ether:
                        toolbar.setTitle("Ether");
                        return true;
                    case R.id.bitcoin_cash:
                        toolbar.setTitle("Bitcoin Cash");
                        return true;
                    case R.id.exchange:
                        toolbar.setTitle("Exchange");
                        return true;
                }
                return false;
            }
        };*/
    }


}


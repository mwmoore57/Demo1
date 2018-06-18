package com.hfad.demo1.activites;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hfad.demo1.R;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;
    private Button bClickMe;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    tvMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    tvMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    tvMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        fetchData();
        
        displayTheData();
    }

    private void displayTheData() {
        // TODO: 6/17/2018 show the data 
    }

    private void fetchData() {
        // TODO: 6/17/2018  get data from server 
        
        
    }

    private void findViews() {
        tvMessage = (TextView) findViewById(R.id.tvMessage);
        bClickMe = (Button) findViewById(R.id.bClickMe);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        // TODO: 6/17/2018 add items to layout... and test them here

        bClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "you just clicked me", Toast.LENGTH_LONG).show();
                Log.d("MainAct", " hi mike, button works");
                Log.e("MainAct", " hi mike, button works");
            }
        });
    }

}

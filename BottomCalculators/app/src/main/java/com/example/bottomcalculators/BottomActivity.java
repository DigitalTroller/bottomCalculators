package com.example.bottomcalculators;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);


        SimpleCalcFragment simpleCalcFragment = new SimpleCalcFragment();
        TriangleAreaFragment triangleAreaFragment = new TriangleAreaFragment();
        DepositFragment depositFragment = new DepositFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, simpleCalcFragment).commit();

        BottomNavigationView bottomNavView = findViewById(R.id.bottom_nav_view);
        bottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.menuItemSimpleCalc){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, simpleCalcFragment).commit();
                } else if (item.getItemId() == R.id.menuItemTriangleArea) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, triangleAreaFragment).commit();
                } else if (item.getItemId() == R.id.menuItemDeposit) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, depositFragment).commit();
                }

                return true;
            }
        });
    }
}
package com.android.foundspace.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.android.foundspace.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity
        // implements BottomNavigationView.OnNavigationItemSelectedListener
{

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        // openFragment(new HomeFragment());
    }

    void initUI() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        // bottomNavigationView.setOnNavigationItemSelectedListener(this);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

//    void openFragment(Fragment fragment) {
//        FragmentTransaction transaction = getFragmentManager().beginTransaction();
//        transaction.replace(R.id.main_frameLayout, fragment);
//        transaction.commit();
//    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.nav_home:
//                openFragment(new HomeFragment());
//                break;
//            case R.id.nav_booking:
//                openFragment(new BookingsFragment());
//                break;
//            case R.id.nav_nearby:
//                openFragment(new NearbyFragment());
//                break;
//            case R.id.nav_more:
//                openFragment(new MoreFragment());
//                break;
//        }
//
//        return true;
//    }
}

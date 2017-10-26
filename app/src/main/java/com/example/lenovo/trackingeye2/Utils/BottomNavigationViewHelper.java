package com.example.lenovo.trackingeye2.Utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.MenuItem;

import com.example.lenovo.trackingeye2.HomeActivity;
import com.example.lenovo.trackingeye2.ProfileActivity;
import com.example.lenovo.trackingeye2.R;
import com.example.lenovo.trackingeye2.SettingActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Lenovo on 15/10/2017.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);


    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

//                    case R.id.ic_house:
//                        Intent intent1 = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
//                        context.startActivity(intent1);
//                        break;
                    case R.id.ic_profile:
                        Intent intent2 = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_setting:
                        Intent intent3 = new Intent(context, SettingActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;

                }
                return false;
            }
        });
    }




}

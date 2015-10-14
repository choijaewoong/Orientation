package com.torerov.orientation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] ROTATION = {"PORT", "LAND", "REV_PORT", "REV_LAND"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(this, "onCreate...", Toast.LENGTH_SHORT).show();

//        reverse까지는 알수 없다는 단점이 있음.
//        int orientation = getResources().getConfiguration().orientation;
//        if(orientation == Configuration.ORIENTATION_PORTRAIT){
//            Toast.makeText(this, "Portrait", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "Landscape", Toast.LENGTH_SHORT).show();
//        }

//
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        Toast.makeText(this, "ROTATION : " + ROTATION[rotation], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int orientation = newConfig.orientation;
        if(orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "Changed Portrait", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Changed Landscape", Toast.LENGTH_SHORT).show();
        }

    }
}

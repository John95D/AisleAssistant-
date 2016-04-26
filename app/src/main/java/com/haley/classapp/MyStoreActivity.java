package com.haley.classapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Haley on 3/30/16.
 */
public class MyStoreActivity extends Activity {
    //deactivate back button
    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_store);

    //This should work
        Button btnMap = (Button) findViewById(R.id.mapButton);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });

        Button btnRequestItem = (Button) findViewById(R.id.requestButton);
        btnRequestItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ItemRequestActivity.class);
                startActivity(intent);
            }
        });

        Button btnCallStore = (Button) findViewById(R.id.callStoreButton);
        btnCallStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:555551234"));
                startActivity(intent);
            }
        });

        Button activityButton = (Button) findViewById(R.id.requestButton);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent startIntent = new Intent(getApplicationContext(),ItemRequestActivity.class);
                startActivity(startIntent);
            }
        });
    }

}

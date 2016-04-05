package com.haley.classapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Haley on 3/30/16.
 */
public class MyStoreActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_store);

        Button activityButton = (Button) findViewById(R.id.button3);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //add code here for button click

                Intent startIntent = new Intent(getApplicationContext(),ItemRequestActivity.class);
                startActivity(startIntent);
            }
        });
    }

}

package com.haley.classapp;

import android.app.Activity;
import android.os.Bundle;

public class StoreContactActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_contact);

        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("(555)555-1234");
                //this is a comment
            }
        } else {
            newString = (String) savedInstanceState.getSerializable("(555)555-1234");
        }
    }
}

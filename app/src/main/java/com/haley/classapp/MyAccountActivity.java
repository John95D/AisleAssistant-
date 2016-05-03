package com.haley.classapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Haley on 5/2/16.
 */
public class MyAccountActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        Button btnStore = (Button) findViewById(R.id.button1);
        assert btnStore != null;
        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MyStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}

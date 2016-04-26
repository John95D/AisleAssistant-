package com.haley.classapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.haley.classapp.R;

public class ItemRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_request);

        Button buttonreq = (Button) findViewById(R.id.button);
        buttonreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MyStoreActivity.class);
                startActivity(intent);
                sendEmail();

            }
        });
    }

    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {"hnbvt24@vt.edu"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        EditText textname = (EditText)findViewById(R.id.editText);
        EditText textemail = (EditText)findViewById(R.id.editEmail);
        EditText textmsg = (EditText)findViewById(R.id.editText2);

        textmsg.setImeOptions(EditorInfo.IME_ACTION_DONE);

        String name = textname.getText().toString();
        String email = textemail.getText().toString();
        String subject = textmsg.getText().toString();

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Customer Request");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Customer request from " + name + " at " + email + " with the following concern: " + subject);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", "");
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ItemRequestActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

}

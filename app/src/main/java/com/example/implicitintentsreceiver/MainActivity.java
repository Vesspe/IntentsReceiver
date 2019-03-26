package com.example.implicitintentsreceiver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri uri = ((Intent) intent).getData();

        if(uri != null) {
            String string_uri = "Uri: " + uri.toString();
            TextView textView = (TextView) findViewById(R.id.text_uri_message);
            textView.setText(string_uri);
        }
    }
}

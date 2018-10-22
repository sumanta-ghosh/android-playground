package com.implicitintentreceiver.codeguy.implicitintentreceiver;

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
        Uri uri = intent.getData();
        TextView view_text = findViewById(R.id.view_text);

        if (uri != null) {
            view_text.setText(uri.toString());
        }
    }
}

package com.droidcafe.codeguy.droidcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String mOrderMsg = intent.getStringExtra(MainActivity.EXTRA_MSG);
        TextView orderText = findViewById(R.id.order_message);
        orderText.setText(mOrderMsg);
    }
}

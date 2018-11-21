package com.example.android.materialme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        TextView newsTitleDetail = findViewById(R.id.newsTitleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

        sportsTitle.setText(getIntent().getStringExtra("title"));
        newsTitleDetail.setText(getIntent().getStringExtra("details"));

        Glide.with(this).load(getIntent().getIntExtra("image_resource",0)).into(sportsImage);
    }
}

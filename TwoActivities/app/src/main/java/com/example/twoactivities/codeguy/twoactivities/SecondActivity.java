package com.example.twoactivities.codeguy.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String sReply;
    public static final String EXTRA_REPLY = "reply_2nd_screen";
    private EditText vReply;
    private Intent inReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MSG);
        TextView txt = findViewById(R.id.text_message);
        txt.setText(message);
        vReply = findViewById(R.id.replyText);

    }

    public void replyTheMessage(View view) {
        sReply = vReply.getText().toString();
        inReply = new Intent();
        inReply.putExtra(EXTRA_REPLY, sReply);
        setResult(RESULT_OK,inReply);
        finish();
    }
}

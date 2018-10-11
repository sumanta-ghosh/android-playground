package us.infoway.hellotoast.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int iCount = 0;
    TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = findViewById(R.id.show_count);
    }

    public void incrementCount(View view) {
        ++iCount;
        if(showCount!=null)
            showCount.setText(Integer.toString(iCount));
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello user....", Toast.LENGTH_SHORT).show();
    }
}

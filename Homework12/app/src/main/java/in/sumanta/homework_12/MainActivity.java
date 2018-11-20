package in.sumanta.homework_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView battery;
    private int batteryLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = findViewById(R.id.imageViewBattery);
    }

    public void inCrease(View v) {
        if (batteryLevel < 6) {
            batteryLevel++;
            updateBatteryImg(batteryLevel);
        }
    }

    public void deCrease(View v) {
        if (batteryLevel > 0) {
            batteryLevel--;
            updateBatteryImg(batteryLevel);
        }
    }

    private void updateBatteryImg(Integer level) {
        battery.setImageLevel(level);
    }
}

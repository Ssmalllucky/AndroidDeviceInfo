package com.ssmalllucky.android.deviceinfo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView deviceTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deviceTV = findViewById(R.id.deviceTV);
        deviceTV.setText(DeviceInfoUtils.getDeviceInfo(this));
    }
}
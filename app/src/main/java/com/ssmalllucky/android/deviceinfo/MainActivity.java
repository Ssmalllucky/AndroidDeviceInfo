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
        deviceTV.setText(getDeviceInfo());
    }

    public String getDeviceInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("deviceWidth: ").append(DeviceInfoUtils.getDeviceWidth(this)).append("\n")
                .append("deviceHeight: ").append(DeviceInfoUtils.getDeviceHeight(this)).append("\n")
                .append("deviceManufacturer: ").append(DeviceInfoUtils.getDeviceManufacturer()).append("\n")
                .append("deviceProduct: ").append(DeviceInfoUtils.getDeviceProduct()).append("\n")
                .append("deviceBrand: ").append(DeviceInfoUtils.getDeviceBrand()).append("\n")
                .append("deviceModel: ").append(DeviceInfoUtils.getDeviceModel()).append("\n")
                .append("deviceBoard").append(DeviceInfoUtils.getDeviceBoard()).append("\n")
                .append("deviceName").append(DeviceInfoUtils.getDeviceName()).append("\n")
                .append("deviceFingerprint: ").append(DeviceInfoUtils.getDeviceFingerprint()).append("\n")
                .append("deviceHardware: ").append(DeviceInfoUtils.getDeviceHardware()).append("\n")
                .append("deviceHost: ").append(DeviceInfoUtils.getDeviceHost()).append("\n")
                .append("deviceDisplay: ").append(DeviceInfoUtils.getDeviceDisplay()).append("\n")
                .append("deviceId: ").append(DeviceInfoUtils.getDeviceId()).append("\n")
                .append("deviceUser: ").append(DeviceInfoUtils.getDeviceUser()).append("\n")
                .append("deviceSerial: ").append(DeviceInfoUtils.getDeviceSerial()).append("\n")
                .append("deviceSDK: ").append(DeviceInfoUtils.getDeviceSDK()).append("\n")
                .append("deviceAndroidVersion: ").append(DeviceInfoUtils.getDeviceAndroidVersion()).append("\n")
                .append("deviceDefaultLanguage: ").append(DeviceInfoUtils.getDeviceDefaultLanguage()).append("\n")
                .append("isSDCardMount: ").append(DeviceInfoUtils.isSDCardMount());
        return stringBuilder.toString();
    }
}
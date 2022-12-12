package com.ssmalllucky.android.deviceinfo;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.util.Locale;

/**
 * 安卓设备信息获取帮助类
 *
 * @author ssmalllucky
 */
public final class DeviceInfoUtils {

    public static final String TAG = "DeviceInfoUtils";

    private static boolean hasContext(Context context) {
        if (context == null) {
            Log.e(TAG, "hasContext: context is null.");
            return false;
        } else {
            Log.e(TAG, "hasContext: context is: " + context);
            return true;
        }
    }

    /**
     * 获取屏幕宽度
     *
     * @param context 系统上下文
     * @return 屏幕宽度
     */
    public static int getDeviceWidth(Context context) {
        if (!hasContext(context)) {
            return 0;
        } else {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
    }

    /**
     * 获取屏幕高度
     *
     * @param context 系统上下文
     * @return 屏幕高度
     */
    public static int getDeviceHeight(Context context) {
        if (!hasContext(context)) {
            return 0;
        } else {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
    }

    /**
     * 获取厂商名称
     *
     * @return 厂商名称
     */
    public static String getDeviceManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    /**
     * 获取产品名称
     *
     * @return 产品名称
     */
    public static String getDeviceProduct() {
        return android.os.Build.PRODUCT;
    }

    /**
     * 获取设备品牌
     *
     * @return 设备品牌
     */
    public static String getDeviceBrand() {
        return android.os.Build.BRAND;
    }

    /**
     * 获取设备型号
     *
     * @return 设备型号
     */
    public static String getDeviceModel() {
        return android.os.Build.MODEL;
    }

    /**
     * 获取设备主板名称
     *
     * @return 主板名称
     */
    public static String getDeviceBoard() {
        return android.os.Build.BOARD;
    }

    /**
     * 获取设备名称
     *
     * @return 设备名称
     */
    public static String getDeviceName() {
        return android.os.Build.DEVICE;
    }

    /**
     * 获取FingerPrint信息
     *
     * @return FingerPrint信息
     */
    public static String getDeviceFingerprint() {
        return android.os.Build.FINGERPRINT;
    }

    /**
     * 获取设备硬件名
     *
     * @return 设备硬件名
     */
    public static String getDeviceHardware() {
        return android.os.Build.HARDWARE;
    }

    /**
     * 获取设备主机
     *
     * @return 设备主机名称
     */
    public static String getDeviceHost() {
        return android.os.Build.HOST;
    }

    /**
     * 获取设备显示ID
     *
     * @return 设备显示ID
     */
    public static String getDeviceDisplay() {
        return android.os.Build.DISPLAY;
    }

    /**
     * 获取设备ID
     *
     * @return
     */
    public static String getDeviceId() {
        return android.os.Build.ID;
    }

    /**
     * 获取设备用户名
     *
     * @return 设备用户名
     */
    public static String getDeviceUser() {
        return android.os.Build.USER;
    }

    /**
     * 获取设备硬件序列号
     *
     * @return 设备硬件序列号
     */
    public static String getDeviceSerial() {
        return android.os.Build.SERIAL;
    }


    /**
     * 获取设备的Android SDK数字版本号
     *
     * @return Android SDK数字版本号
     */
    public static int getDeviceSDK() {
        return android.os.Build.VERSION.SDK_INT;
    }

    /**
     * 获取设备Android 版本
     *
     * @return Android 版本名称
     */
    public static String getDeviceAndroidVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    /**
     * 获取当前设备系统语言
     *
     * @return 设备系统语言
     */
    public static String getDeviceDefaultLanguage() {
        return Locale.getDefault().getLanguage();
    }

    /**
     * 判断设备SD卡是否挂载
     *
     * @return true则挂载，false则未挂载。
     */
    public static boolean isSDCardMount() {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);
    }


}

package com.sportybet.plugin.webcontainer.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.twilio.voice.EventKeys;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceInfo {
    public static final String CMWAP = "cmwap";
    public static final String CTWAP = "ctwap";
    public static final int NETWORK_TYPE_MOBILE = 1;
    public static final int NETWORK_TYPE_NONE = -1;
    public static final int NETWORK_TYPE_WIFI = 0;
    public static final String UNIWAP = "uniwap";
    public static final String WAP_3G = "3gwap";
    private static DeviceInfo instance;
    private int networkState = -1;

    public static DeviceInfo getInstance() {
        DeviceInfo deviceInfo = instance;
        if (deviceInfo != null) {
            return deviceInfo;
        }
        DeviceInfo deviceInfo2 = new DeviceInfo();
        instance = deviceInfo2;
        return deviceInfo2;
    }

    public APN getApn(Context context) {
        APN apn = new APN();
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(0);
        if (networkInfo != null) {
            String extraInfo = networkInfo.getExtraInfo();
            String lowerCase = extraInfo != null ? extraInfo.toLowerCase(Locale.US) : "";
            if (lowerCase.contains(CMWAP) || lowerCase.contains(WAP_3G) || lowerCase.contains(UNIWAP)) {
                apn.setName(lowerCase);
                apn.setApnType(lowerCase);
                apn.setProxyServer(new Server("10.0.0.172", 80));
                return apn;
            }
            if (lowerCase.contains(CTWAP)) {
                apn.setName(lowerCase);
                apn.setApnType(lowerCase);
                apn.setProxyServer(new Server("10.0.0.200", 80));
            }
            return apn;
        }
        Cursor cursorQuery = null;
        try {
            try {
                APN apn2 = new APN();
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse("content://telephony/carriers/preferapn"), new String[]{"name", "apn", "proxy ", EventKeys.PORT}, "current=1", null, null);
                    if (cursorQuery != null) {
                        int count = cursorQuery.getCount();
                        cursorQuery.moveToFirst();
                        for (int i = 0; i < count; i++) {
                            apn2.setName(cursorQuery.getString(0));
                            apn2.setApnType(cursorQuery.getString(1));
                            apn2.setProxyServer(new Server(cursorQuery.getString(2), cursorQuery.getString(3)));
                            cursorQuery.moveToNext();
                        }
                    }
                    cursorQuery.close();
                    return apn2;
                } catch (Exception unused) {
                    apn = apn2;
                    cursorQuery.close();
                    return apn;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public int getNetworkState(Context context) {
        NetworkInfo networkInfo;
        if (context != null && (networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1)) != null) {
            if (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                this.networkState = 0;
            } else {
                this.networkState = 1;
            }
        }
        return this.networkState;
    }

    public boolean isWapApn(Context context) {
        if (isWifiConnected(context)) {
            return false;
        }
        try {
            APN apn = getApn(context);
            if (TextUtils.isEmpty(apn.getApnType())) {
                Server proxyServer = apn.getProxyServer();
                if (proxyServer != null && !TextUtils.isEmpty(proxyServer.getAddress())) {
                    return true;
                }
            } else if (apn.getApnType().contains("wap")) {
                return true;
            }
            return false;
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public boolean isWifiConnected(Context context) {
        return getNetworkState(context) == 0;
    }
}

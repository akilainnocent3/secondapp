package com.twilio.voice;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class Utils {
    public static void DumpBacktrace() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> bundleToMap(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            map.put(str, String.valueOf(bundle.get(str)));
        }
        return map;
    }

    public static Handler createHandler() {
        Handler handler;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            handler = new Handler(looperMyLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            handler = mainLooper != null ? new Handler(mainLooper) : null;
        }
        if (handler != null) {
            return handler;
        }
        throw new IllegalThreadStateException("This thread must be able to obtain a Looper");
    }

    public static String getIPAddress(boolean z) {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                i++;
                ArrayList list2 = Collections.list(((NetworkInterface) obj).getInetAddresses());
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = list2.get(i2);
                    i2++;
                    InetAddress inetAddress = (InetAddress) obj2;
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z2 = hostAddress.indexOf(58) < 0;
                        if (z) {
                            if (z2) {
                                return hostAddress;
                            }
                        } else if (!z2) {
                            int iIndexOf = hostAddress.indexOf(37);
                            return iIndexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, iIndexOf).toUpperCase();
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isAudioPermissionGranted(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    public static Pair<String[], String[]> mapToArrays(Map<String, String> map) {
        Pair<String[], String[]> pair = new Pair<>(new String[map.size()], new String[map.size()]);
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ((String[]) pair.first)[i] = entry.getKey();
            ((String[]) pair.second)[i] = entry.getValue();
            i++;
        }
        return pair;
    }

    public static String parseClientIdentity(String str) {
        if (str != null) {
            return str.replaceFirst("^client:", "");
        }
        return null;
    }

    public static void parseCustomParams(String str, Map<String, String> map) {
        String strSubstring;
        int i;
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=");
            if (iIndexOf > 0) {
                try {
                    strSubstring = str2.substring(0, iIndexOf);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            } else {
                strSubstring = str2;
            }
            map.put(strSubstring, (iIndexOf <= 0 || str2.length() <= (i = iIndexOf + 1)) ? null : URLDecoder.decode(str2.substring(i).replaceAll("\\+", "%20"), "UTF-8"));
        }
    }

    public static boolean permissionGranted(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}

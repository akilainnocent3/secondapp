package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private static HashMap<String, ArrayList<String>> hww = new HashMap<>();

    public static ArrayList<String> hww(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (hww.get(str) != null) {
                return hww.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : tq(context, packageName)) {
                    String strHww = "error!";
                    if ("MD5".equals(str)) {
                        strHww = hww(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        strHww = hww(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strHww = hww(signature, "SHA256");
                    }
                    arrayList.add(strHww);
                }
            } catch (Exception unused) {
            }
            hww.put(str, arrayList);
        }
        return arrayList;
    }

    private static Signature[] tq(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String hww(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListHww = hww(context, "SHA1");
        if (arrayListHww != null && arrayListHww.size() != 0) {
            for (int i10 = 0; i10 < arrayListHww.size(); i10++) {
                sb2.append(arrayListHww.get(i10));
                if (i10 < arrayListHww.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String hww(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                    sb2.append(":");
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}

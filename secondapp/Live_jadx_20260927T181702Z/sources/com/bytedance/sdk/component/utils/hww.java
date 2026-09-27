package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0332hww {
        static final Random hww = hww.sd();
    }

    public static JSONObject hww(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : hww(jSONObject.toString());
    }

    public static String sd(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strHww = hww(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strHww == null) ? str : com.bytedance.sdk.component.vy.hww.tq(str.substring(49), strSubstring, strHww);
    }

    public static String tq(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strHww = hww();
        String strHww2 = hww(strHww, 32);
        String strTq = tq();
        return 3 + strHww + strTq + ((strHww2 == null || strTq == null) ? null : com.bytedance.sdk.component.vy.hww.hww(str, strTq, strHww2));
    }

    public static JSONObject hww(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strTq = tq(str);
                    if (!TextUtils.isEmpty(strTq)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strTq);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static Random sd() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String tq() {
        String strHww = hww(8);
        if (strHww == null || strHww.length() != 16) {
            return null;
        }
        return strHww;
    }

    public static String hww() {
        String strHww = hww(16);
        if (strHww == null || strHww.length() != 32) {
            return null;
        }
        return strHww;
    }

    public static String hww(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String hww(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0332hww.hww.nextBytes(bArr);
            return hv.hww(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}

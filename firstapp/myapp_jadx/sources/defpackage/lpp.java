package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class lpp {
    public final HashMap a = new HashMap();
    public final int b;

    public lpp(int i) {
        this.b = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        boolean zEquals;
        String strA = a(this.b, str);
        if (this.a.size() >= 64 && !this.a.containsKey(strA)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: 64", null);
            return false;
        }
        String strA2 = a(this.b, str2);
        String str3 = (String) this.a.get(strA);
        if (str3 == null) {
            zEquals = strA2 == null;
        } else {
            zEquals = str3.equals(strA2);
        }
        if (zEquals) {
            return false;
        }
        HashMap map = this.a;
        if (str2 == null) {
            strA2 = "";
        }
        map.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map<String, String> map) {
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.b, key);
                if (this.a.size() < 64 || this.a.containsKey(strA)) {
                    String value = entry.getValue();
                    this.a.put(strA, value == null ? "" : a(this.b, value));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: 64", null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

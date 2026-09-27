package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import gi.j;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52311b = -16777216;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52312c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f52313d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f52314e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52315f = "NotificationParams";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Bundle f52316a;

    public g(@NonNull Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f52316a = new Bundle(bundle);
    }

    public static String B(String str) {
        return str.startsWith(b.c.f52235b) ? str.substring(6) : str;
    }

    public static int d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean t(String str) {
        return str.startsWith(b.a.f52223a) || str.equals("from");
    }

    public static boolean v(Bundle bundle) {
        return "1".equals(bundle.getString(b.c.f52237d)) || "1".equals(bundle.getString(x(b.c.f52237d)));
    }

    public static boolean w(String str) {
        return str.startsWith(b.d.f52275p) || str.startsWith(b.c.f52235b) || str.startsWith(b.c.f52236c);
    }

    public static String x(String str) {
        return !str.startsWith(b.c.f52235b) ? str : str.replace(b.c.f52235b, b.c.f52236c);
    }

    public Bundle A() {
        Bundle bundle = new Bundle(this.f52316a);
        for (String str : this.f52316a.keySet()) {
            if (w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public boolean a(String str) {
        String strP = p(str);
        return "1".equals(strP) || Boolean.parseBoolean(strP);
    }

    public Integer b(String str) {
        String strP = p(str);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strP));
        } catch (NumberFormatException unused) {
            Log.w(f52315f, "Couldn't parse value of " + B(str) + j.f86770c + strP + ") into an int");
            return null;
        }
    }

    @Nullable
    public JSONArray c(String str) {
        String strP = p(str);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        try {
            return new JSONArray(strP);
        } catch (JSONException unused) {
            Log.w(f52315f, "Malformed JSON for key " + B(str) + ": " + strP + ", falling back to default");
            return null;
        }
    }

    @Nullable
    public int[] e() {
        JSONArray jSONArrayC = c(b.c.f52256w);
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(jSONArrayC.optString(0));
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w(f52315f, "LightSettings is invalid: " + jSONArrayC + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w(f52315f, "LightSettings is invalid: " + jSONArrayC + ". Skipping setting LightSettings");
            return null;
        }
    }

    @Nullable
    public Uri f() {
        String strP = p(b.c.C);
        if (TextUtils.isEmpty(strP)) {
            strP = p(b.c.B);
        }
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        return Uri.parse(strP);
    }

    @Nullable
    public Object[] g(String str) {
        JSONArray jSONArrayC = c(str + b.c.G);
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayC.optString(i10);
        }
        return strArr;
    }

    @Nullable
    public String h(String str) {
        return p(str + b.c.F);
    }

    @Nullable
    public String i(Resources resources, String str, String str2) {
        String strH = h(str2);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        int identifier = resources.getIdentifier(strH, "string", str);
        if (identifier == 0) {
            Log.w(f52315f, B(str2 + b.c.F) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrG = g(str2);
        if (objArrG == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrG);
        } catch (MissingFormatArgumentException e10) {
            Log.w(f52315f, "Missing format argument for " + B(str2) + ": " + Arrays.toString(objArrG) + " Default value will be used.", e10);
            return null;
        }
    }

    public Long j(String str) {
        String strP = p(str);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strP));
        } catch (NumberFormatException unused) {
            Log.w(f52315f, "Couldn't parse value of " + B(str) + j.f86770c + strP + ") into a long");
            return null;
        }
    }

    public String k() {
        return p(b.c.D);
    }

    @Nullable
    public Integer l() {
        Integer numB = b(b.c.f52253t);
        if (numB == null) {
            return null;
        }
        if (numB.intValue() >= 0) {
            return numB;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + numB + ". Skipping setting notificationCount.");
        return null;
    }

    @Nullable
    public Integer m() {
        Integer numB = b(b.c.f52249p);
        if (numB == null) {
            return null;
        }
        if (numB.intValue() >= -2 && numB.intValue() <= 2) {
            return numB;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String strP = p(str2);
        return !TextUtils.isEmpty(strP) ? strP : i(resources, str, str2);
    }

    @Nullable
    public String o() {
        String strP = p(b.c.f52258y);
        return TextUtils.isEmpty(strP) ? p(b.c.f52259z) : strP;
    }

    public String p(String str) {
        return this.f52316a.getString(y(str));
    }

    @Nullable
    public long[] q() {
        JSONArray jSONArrayC = c(b.c.f52255v);
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayC.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w(f52315f, "User defined vibrateTimings is invalid: " + jSONArrayC + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Integer r() {
        Integer numB = b(b.c.f52254u);
        if (numB == null) {
            return null;
        }
        if (numB.intValue() >= -1 && numB.intValue() <= 1) {
            return numB;
        }
        Log.w(f52315f, "visibility is invalid: " + numB + ". Skipping setting visibility.");
        return null;
    }

    public boolean s() {
        return !TextUtils.isEmpty(p(b.c.f52243j));
    }

    public boolean u() {
        return a(b.c.f52237d);
    }

    public final String y(String str) {
        if (!this.f52316a.containsKey(str) && str.startsWith(b.c.f52235b)) {
            String strX = x(str);
            if (this.f52316a.containsKey(strX)) {
                return strX;
            }
        }
        return str;
    }

    public Bundle z() {
        Bundle bundle = new Bundle(this.f52316a);
        for (String str : this.f52316a.keySet()) {
            if (!t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}

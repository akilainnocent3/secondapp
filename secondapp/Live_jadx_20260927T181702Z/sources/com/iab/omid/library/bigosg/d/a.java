package com.iab.omid.library.bigosg.d;

import android.os.Build;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import org.json.JSONObject;
import r7.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return C4235d4.f61260d;
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, y0.f124211n, a());
        b.a(jSONObject, "osVersion", b());
        b.a(jSONObject, Q6.F, c());
        return jSONObject;
    }
}

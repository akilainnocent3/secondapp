package com.iab.omid.library.applovin.utils;

import android.os.Build;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import org.json.JSONObject;
import r7.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return C4235d4.f61260d;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, y0.f124211n, a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, Q6.F, b());
        return jSONObject;
    }
}

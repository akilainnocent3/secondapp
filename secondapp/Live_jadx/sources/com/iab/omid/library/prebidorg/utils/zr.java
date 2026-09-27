package com.iab.omid.library.prebidorg.utils;

import android.os.Build;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import org.json.JSONObject;
import r7.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zr {
    public static String zr() {
        return C4235d4.f61260d;
    }

    public static String zs() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject zt() {
        JSONObject jSONObject = new JSONObject();
        zs.zz(jSONObject, y0.f124211n, zz());
        zs.zz(jSONObject, "osVersion", zs());
        zs.zz(jSONObject, Q6.F, zr());
        return jSONObject;
    }

    public static String zz() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }
}

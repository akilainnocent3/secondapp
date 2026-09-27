package com.startapp.sdk.internal;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d2 {
    public static String a(boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            jSONObject.put("isTestAd", z10);
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        String strEncodeToString = Base64.encodeToString(cv.k0.X1(string), 0);
        kotlin.jvm.internal.m0.m(strEncodeToString);
        return strEncodeToString;
    }
}

package com.chartboost.sdk.impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z2 {
    public static final Boolean a(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.m0.p(jSONObject, "<this>");
        kotlin.jvm.internal.m0.p(name, "name");
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final JSONObject a(JSONObject jSONObject, String name, Object obj) {
        kotlin.jvm.internal.m0.p(jSONObject, "<this>");
        kotlin.jvm.internal.m0.p(name, "name");
        try {
            jSONObject.put(name, obj);
            return jSONObject;
        } catch (JSONException e10) {
            sb.b("put (" + name + gi.j.f86771d + e10, (Throwable) null, 2, (Object) null);
            return jSONObject;
        }
    }

    public static final byte[] a(JSONArray jSONArray) {
        kotlin.jvm.internal.m0.p(jSONArray, "<this>");
        String string = jSONArray.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        byte[] bytes = string.getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return bytes;
    }
}

package com.chartboost.sdk.impl;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i5 implements sh {
    @Override // com.chartboost.sdk.impl.sh
    public JSONObject a() throws JSONException {
        String strE = c4.f38374b.e();
        String strB = g7.f38990a.b();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", strE);
        jSONObject.put("app_version", strB);
        jSONObject.put("load-id", string);
        jSONObject.put("load_id", string);
        jSONObject.put("sdk", "Chartboost-Android-SDK");
        jSONObject.put("sdk_version", "9.11.0");
        return jSONObject;
    }
}

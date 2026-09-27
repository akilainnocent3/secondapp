package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p7 f40422a = new p7();

    public static final List a(JSONArray jSONArray) {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i10)) != null) {
                try {
                    arrayList.add(k7.f39713f.a(jSONObject));
                } catch (JSONException e10) {
                    sb.e("Failed to parse event tracker at index " + i10, e10);
                    dr.w2 w2Var = dr.w2.f79517a;
                }
            }
        }
        return arrayList;
    }
}

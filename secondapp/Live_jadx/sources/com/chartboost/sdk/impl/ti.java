package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ti {
    public final String a(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("url", "") : null;
        return strOptString == null ? "" : strOptString;
    }

    public final l3 b(JSONObject jSONObject) {
        return new l3(a(jSONObject), c(jSONObject));
    }

    public final Boolean c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return z2.a(jSONObject, "shouldDismiss");
        }
        return null;
    }
}

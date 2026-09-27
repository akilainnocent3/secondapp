package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.qk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC3948qk {
    public static JSONObject a(int i10, int i11, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, i10);
        jSONObject.put(str2, i11);
        return jSONObject;
    }
}

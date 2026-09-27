package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class li implements g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f75150a;

    public li(JSONObject jSONObject) {
        this.f75150a = jSONObject;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        try {
            return this.f75150a.getJSONObject(((Integer) obj).toString());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}

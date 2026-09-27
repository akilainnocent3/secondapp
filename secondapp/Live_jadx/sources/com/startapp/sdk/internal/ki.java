package com.startapp.sdk.internal;

import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ki implements g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f75094a;

    public ki(JSONArray jSONArray) {
        this.f75094a = jSONArray;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        try {
            return this.f75094a.getJSONObject(((Integer) obj).intValue());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}

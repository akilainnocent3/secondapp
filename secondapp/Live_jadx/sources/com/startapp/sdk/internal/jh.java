package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class jh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jh f75060b = new jh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f75061a;

    public jh() {
        this.f75061a = new JSONObject();
    }

    public final void a(int i10, Object obj) {
        try {
            this.f75061a.put(String.valueOf(i10), obj);
        } catch (JSONException unused) {
        }
    }

    public final String a(int i10) {
        Object objOpt = this.f75061a.opt(String.valueOf(i10));
        if (objOpt != null) {
            return objOpt.toString();
        }
        return null;
    }

    public jh(JSONObject jSONObject) {
        this.f75061a = jSONObject;
    }
}

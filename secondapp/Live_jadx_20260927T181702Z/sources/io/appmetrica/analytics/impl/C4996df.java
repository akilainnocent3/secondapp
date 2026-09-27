package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4996df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f97199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f97200c;

    public C4996df(String str, JSONObject jSONObject, T7 t10) {
        this.f97198a = str;
        this.f97199b = jSONObject;
        this.f97200c = t10;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f97198a + "', additionalParams=" + this.f97199b + ", source=" + this.f97200c + fw.b.f85383j;
    }
}

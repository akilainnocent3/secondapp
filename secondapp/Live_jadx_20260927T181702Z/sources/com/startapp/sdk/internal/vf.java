package com.startapp.sdk.internal;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class vf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f75706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f75707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xf f75708c;

    public vf(xf xfVar, String str, JSONObject jSONObject) {
        this.f75708c = xfVar;
        this.f75706a = str;
        this.f75707b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75708c.c(this.f75706a, this.f75707b);
    }
}

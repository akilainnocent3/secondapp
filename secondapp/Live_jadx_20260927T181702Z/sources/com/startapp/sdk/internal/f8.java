package com.startapp.sdk.internal;

import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class f8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg f74790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g8 f74791b;

    public f8(g8 g8Var, eg egVar) {
        this.f74791b = g8Var;
        this.f74790a = egVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArrayA;
        this.f74790a.b();
        w1 w1Var = this.f74791b.f75809b;
        try {
            jSONArrayA = this.f74790a.f74753b.a();
        } catch (Exception unused) {
            jSONArrayA = null;
        }
        w1Var.a(jSONArrayA);
    }
}

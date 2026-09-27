package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cb f38546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cb f38547d;

    public dd(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f38544a = context;
        this.f38546c = new cb(0, 0, 0, 0, 15, null);
        this.f38547d = new cb(0, 0, 0, 0, 15, null);
    }

    public final void a(cb cbVar, cb cbVar2) {
        o6 o6Var = o6.f40269a;
        cbVar2.c(o6Var.a(cbVar.c(), this.f38544a));
        cbVar2.d(o6Var.a(cbVar.d(), this.f38544a));
        cbVar2.b(o6Var.a(cbVar.b(), this.f38544a));
        cbVar2.a(o6Var.a(cbVar.a(), this.f38544a));
    }

    public final cb b() {
        return this.f38547d;
    }

    public String toString() {
        return "width: " + this.f38547d.b() + " height: " + this.f38547d.a() + " + x: " + this.f38547d.c() + " y: " + this.f38547d.d();
    }

    public final boolean a() {
        if (!this.f38545b) {
            return false;
        }
        this.f38545b = false;
        return true;
    }

    public final void a(int i10, int i11) {
        if (this.f38546c.b() == i10 && this.f38546c.a() == i11) {
            return;
        }
        cb cbVar = this.f38546c;
        cbVar.c(0);
        cbVar.d(0);
        cbVar.b(i10);
        cbVar.a(i11);
        a(this.f38546c, this.f38547d);
        this.f38545b = true;
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (kotlin.jvm.internal.m0.g(new cb(i10, i11, i12, i13), this.f38546c)) {
            return;
        }
        cb cbVar = this.f38546c;
        cbVar.c(i10);
        cbVar.d(i11);
        cbVar.b(i12);
        cbVar.a(i13);
        a(this.f38546c, this.f38547d);
        this.f38545b = true;
    }
}

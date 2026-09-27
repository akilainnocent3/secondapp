package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.chartboost.sdk.impl.rg;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f40807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f40809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f40811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f40812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f40813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ng f40814h;

    public rg(SharedPreferences mPrefs) {
        kotlin.jvm.internal.m0.p(mPrefs, "mPrefs");
        this.f40807a = mPrefs;
        this.f40811e = new AtomicInteger(0);
        this.f40812f = new AtomicInteger(0);
        this.f40813g = new AtomicInteger(0);
        this.f40814h = new ng() { // from class: uc.m0
            @Override // com.chartboost.sdk.impl.ng
            public final boolean a() {
                return rg.h();
            }
        };
        this.f40808b = a();
        this.f40809c = SystemClock.uptimeMillis();
        int iE = e() + 1;
        Integer numValueOf = iE < 0 ? null : Integer.valueOf(iE);
        this.f40810d = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
        g();
    }

    public static final boolean h() {
        return false;
    }

    public final void a(a0 type) {
        kotlin.jvm.internal.m0.p(type, "type");
        if (kotlin.jvm.internal.m0.g(type, a0.b.f38151g)) {
            this.f40811e.incrementAndGet();
        } else if (kotlin.jvm.internal.m0.g(type, a0.c.f38152g)) {
            this.f40812f.incrementAndGet();
        } else if (kotlin.jvm.internal.m0.g(type, a0.a.f38150g)) {
            this.f40813g.incrementAndGet();
        }
    }

    public final int b() {
        return this.f40810d;
    }

    public final long c() {
        if (this.f40814h.a()) {
            return SystemClock.uptimeMillis() - this.f40809c;
        }
        return 0L;
    }

    public final String d() {
        return this.f40808b;
    }

    public final int e() {
        return this.f40807a.getInt("session_key", 0);
    }

    public final void f() {
        this.f40809c = SystemClock.uptimeMillis();
    }

    public final void g() {
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorEdit = this.f40807a.edit();
        if (editorEdit == null || (editorPutInt = editorEdit.putInt("session_key", this.f40810d)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    public final sg i() {
        return new sg(this.f40808b, c(), this.f40810d, b(a0.a.f38150g), b(a0.c.f38152g), b(a0.b.f38151g));
    }

    public final int b(a0 a0Var) {
        if (kotlin.jvm.internal.m0.g(a0Var, a0.b.f38151g)) {
            return this.f40811e.get();
        }
        if (kotlin.jvm.internal.m0.g(a0Var, a0.c.f38152g)) {
            return this.f40812f.get();
        }
        if (kotlin.jvm.internal.m0.g(a0Var, a0.a.f38150g)) {
            return this.f40813g.get();
        }
        return 0;
    }

    public final void a(ng ngVar) {
        kotlin.jvm.internal.m0.p(ngVar, "<set-?>");
        this.f40814h = ngVar;
    }

    public final String a() {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return r2.a(string);
    }
}

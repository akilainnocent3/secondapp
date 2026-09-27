package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tf f40451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40453c;

    public abstract Object a(Context context, or.f fVar);

    public void a(float f10) {
    }

    public abstract void a(d7 d7Var, r5 r5Var);

    public abstract void a(eh ehVar);

    public long g() {
        return this.f40453c;
    }

    public boolean h() {
        return this.f40452b;
    }

    public final tf i() {
        return this.f40451a;
    }

    public float j() {
        return 1.0f;
    }

    public abstract View k();

    public void a(boolean z10) {
    }

    public final void a(tf tfVar) {
        this.f40451a = tfVar;
    }

    public void a(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
    }

    public static /* synthetic */ void a(pf pfVar, d7 d7Var, r5 r5Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEngagement");
        }
        if ((i10 & 2) != 0) {
            r5Var = null;
        }
        pfVar.a(d7Var, r5Var);
    }

    public static /* synthetic */ void a(pf pfVar, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unmute");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        pfVar.a(f10);
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }
}

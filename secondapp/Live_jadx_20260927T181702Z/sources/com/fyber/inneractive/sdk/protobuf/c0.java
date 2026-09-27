package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f47443a;

    public c0(b0 b0Var) {
        Charset charset = l1.f47517a;
        if (b0Var == null) {
            throw new NullPointerException("output");
        }
        this.f47443a = b0Var;
        b0Var.f47438a = this;
    }

    public final void a(int i10, float f10) {
        b0 b0Var = this.f47443a;
        b0Var.getClass();
        b0Var.a(i10, Float.floatToRawIntBits(f10));
    }

    public final void a(int i10, double d10) {
        b0 b0Var = this.f47443a;
        b0Var.getClass();
        b0Var.a(i10, Double.doubleToRawLongBits(d10));
    }

    public final void a(int i10, int i11) {
        this.f47443a.d(i10, b0.d(i11));
    }

    public final void a(int i10, long j10) {
        this.f47443a.b(i10, b0.b(j10));
    }

    public final void a(int i10, Object obj, t2 t2Var) {
        b0 b0Var = this.f47443a;
        b0Var.c(i10, 3);
        t2Var.a(obj, b0Var.f47438a);
        b0Var.c(i10, 4);
    }
}

package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import k.w;
import k.y0;
import ni.h;
import ni.r;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class d extends h implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50279h = 90;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f50280i = 180;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f50281j = 270;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50282k = 180;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f50283l = 1.75f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f50284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f50285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f50286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f50287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f50288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f50289g = -1.0f;

    public d(float f10, float f11, float f12) {
        this.f50285c = f10;
        this.f50284b = f11;
        l(f12);
        this.f50288f = 0.0f;
    }

    @Override // ni.h
    public void b(float f10, float f11, float f12, @NonNull r rVar) {
        float f13;
        float f14;
        float f15 = this.f50286d;
        if (f15 == 0.0f) {
            rVar.n(f10, 0.0f);
            return;
        }
        float f16 = ((this.f50285c * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f50284b;
        float f18 = f11 + this.f50288f;
        float f19 = (this.f50287e * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            rVar.n(f10, 0.0f);
            return;
        }
        float f20 = this.f50289g;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        rVar.n(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        rVar.a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            rVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f50285c;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            rVar.a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f50285c;
            rVar.n(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f50285c;
            rVar.a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        rVar.a(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        rVar.n(f10, 0.0f);
    }

    public float e() {
        return this.f50287e;
    }

    public float f() {
        return this.f50289g;
    }

    public float g() {
        return this.f50285c;
    }

    public float i() {
        return this.f50284b;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public float j() {
        return this.f50286d;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public float k() {
        return this.f50288f;
    }

    public void l(@w(from = 0.0d) float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f50287e = f10;
    }

    public void m(float f10) {
        this.f50289g = f10;
    }

    public void n(float f10) {
        this.f50285c = f10;
    }

    public void o(float f10) {
        this.f50284b = f10;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void p(float f10) {
        this.f50286d = f10;
    }

    public void q(float f10) {
        this.f50288f = f10;
    }
}

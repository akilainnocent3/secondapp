package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tpy {
    public final String a;
    public final String b;
    public final hlc c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;

    public tpy(String str, String str2, hlc hlcVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = hlcVar;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = f9;
        this.m = f10;
        this.n = f11;
        this.o = f12;
        this.p = f13;
        this.q = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpy)) {
            return false;
        }
        tpy tpyVar = (tpy) obj;
        return Intrinsics.g(this.a, tpyVar.a) && Intrinsics.g(this.b, tpyVar.b) && Intrinsics.g(this.c, tpyVar.c) && Float.compare(this.d, tpyVar.d) == 0 && Float.compare(this.e, tpyVar.e) == 0 && Float.compare(this.f, tpyVar.f) == 0 && Float.compare(this.g, tpyVar.g) == 0 && Float.compare(this.h, tpyVar.h) == 0 && Float.compare(this.i, tpyVar.i) == 0 && Float.compare(this.j, tpyVar.j) == 0 && Float.compare(this.k, tpyVar.k) == 0 && Float.compare(this.l, tpyVar.l) == 0 && Float.compare(this.m, tpyVar.m) == 0 && Float.compare(this.n, tpyVar.n) == 0 && Float.compare(this.o, tpyVar.o) == 0 && Float.compare(this.p, tpyVar.p) == 0 && Float.compare(this.q, tpyVar.q) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.q) + tvh.a(this.p, tvh.a(this.o, tvh.a(this.n, tvh.a(this.m, tvh.a(this.l, tvh.a(this.k, tvh.a(this.j, tvh.a(this.i, tvh.a(this.h, tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, tvh.a(this.d, (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("OnboardingPage(title=", this.a, ", imageUrl=", this.b, ", cutout=");
        sbA.append(this.c);
        sbA.append(", imagePercentX=");
        sbA.append(this.d);
        sbA.append(", imagePercentY=");
        ew7.b(sbA, this.e, ", imagePercentXArrow=", this.f, ", imagePercentYArrow=");
        ew7.b(sbA, this.g, ", imagePercentHeight=", this.h, ", titlePercentX=");
        ew7.b(sbA, this.i, ", titlePercentY=", this.j, ", titlePercentEndX=");
        ew7.b(sbA, this.k, ", titlePercentXArrow=", this.l, ", titlePercentYArrow=");
        ew7.b(sbA, this.m, ", arrowFLip=", this.n, ", titlePercentEndXArrow=");
        ew7.b(sbA, this.o, ", ctaRowPosition=", this.p, ", nextButtonHeightRatio=");
        return wi1.a(this.q, ")", sbA);
    }
}

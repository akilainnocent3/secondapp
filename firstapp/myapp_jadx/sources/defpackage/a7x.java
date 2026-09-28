package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a7x {
    public final fbx a;
    public final fbx b;
    public final String c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final float h;
    public final double i;
    public final boolean j;

    public a7x(fbx fbxVar, fbx fbxVar2, String str, double d, double d2, double d3, double d4, float f, double d5) {
        fbxVar.getClass();
        fbxVar2.getClass();
        str.getClass();
        this.a = fbxVar;
        this.b = fbxVar2;
        this.c = str;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = f;
        this.i = d5;
        this.j = fbxVar == fbxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7x)) {
            return false;
        }
        a7x a7xVar = (a7x) obj;
        return this.a == a7xVar.a && this.b == a7xVar.b && Intrinsics.g(this.c, a7xVar.c) && Double.compare(this.d, a7xVar.d) == 0 && Double.compare(this.e, a7xVar.e) == 0 && Double.compare(this.f, a7xVar.f) == 0 && Double.compare(this.g, a7xVar.g) == 0 && Float.compare(this.h, a7xVar.h) == 0 && Double.compare(this.i, a7xVar.i) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.i) + tvh.a(this.h, nrg0.a(nrg0.a(nrg0.a(nrg0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NNDBetData(userPick=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", payoutAmount=");
        sb.append(this.d);
        sb.append(", stakeAmount=");
        sb.append(this.e);
        sb.append(", actualDebitedAmt=");
        sb.append(this.f);
        sb.append(", actualCreditedAmt=");
        sb.append(this.g);
        sb.append(", randomNumber=");
        sb.append(this.h);
        sb.append(", giftAmount=");
        return org0.a(sb, this.i, ')');
    }

    public a7x() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a7x(int i) {
        fbx fbxVar = fbx.d;
        this(fbxVar, fbxVar, "", 0.0d, 0.0d, 0.0d, 0.0d, 0.0f, 0.0d);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f7x {
    public final int a;
    public final int b;
    public final double c;
    public final Double d;
    public final double e;
    public final double f;
    public final double g;
    public final fbx h;
    public final fbx i;
    public final String j;
    public final String k;
    public final long l;
    public final boolean m;

    public f7x(int i, int i2, double d, Double d2, double d3, double d4, double d5, fbx fbxVar, fbx fbxVar2, String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = fbxVar;
        this.i = fbxVar2;
        this.j = str;
        this.k = str2;
        this.l = j;
        this.m = d3 > 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7x)) {
            return false;
        }
        f7x f7xVar = (f7x) obj;
        return this.a == f7xVar.a && this.b == f7xVar.b && Double.compare(this.c, f7xVar.c) == 0 && Intrinsics.g(this.d, f7xVar.d) && Double.compare(this.e, f7xVar.e) == 0 && Double.compare(this.f, f7xVar.f) == 0 && Double.compare(this.g, f7xVar.g) == 0 && this.h == f7xVar.h && this.i == f7xVar.i && Intrinsics.g(this.j, f7xVar.j) && Intrinsics.g(this.k, f7xVar.k) && this.l == f7xVar.l;
    }

    public final int hashCode() {
        int iA = nrg0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        Double d = this.d;
        return Long.hashCode(this.l) + gmf0.a(gmf0.a((this.i.hashCode() + ((this.h.hashCode() + nrg0.a(nrg0.a(nrg0.a((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NNDBetHistoryItem(id=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", stakeAmount=");
        sb.append(this.c);
        sb.append(", giftAmount=");
        sb.append(this.d);
        sb.append(", payoutAmount=");
        sb.append(this.e);
        sb.append(", actualDebitedAmount=");
        sb.append(this.f);
        sb.append(", actualCreditedAmount=");
        sb.append(this.g);
        sb.append(", userPick=");
        sb.append(this.h);
        sb.append(", houseDraw=");
        sb.append(this.i);
        sb.append(", ticketId=");
        sb.append(this.j);
        sb.append(", currency=");
        sb.append(this.k);
        sb.append(", createdAt=");
        return uvh.a(sb, this.l, ')');
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class drj {
    public final double a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final uf00<tp10> g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public drj(double d, String str, int i, int i2, int i3, int i4, uf00 uf00Var, int i5) {
        this((i5 & 1) != 0 ? 0.0d : d, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? n1a0.c : uf00Var, false, false, false, false, false);
    }

    public static drj a(drj drjVar, int i, int i2, uf00 uf00Var, boolean z, boolean z2, int i3) {
        double d = drjVar.a;
        String str = drjVar.b;
        int i4 = drjVar.c;
        int i5 = (i3 & 8) != 0 ? drjVar.d : i;
        int i6 = (i3 & 16) != 0 ? drjVar.e : i2;
        int i7 = drjVar.f;
        uf00 uf00Var2 = (i3 & 64) != 0 ? drjVar.g : uf00Var;
        boolean z3 = (i3 & 128) != 0 ? drjVar.h : z;
        boolean z4 = (i3 & 256) != 0 ? drjVar.i : z2;
        boolean z5 = (i3 & 512) != 0 ? drjVar.j : true;
        boolean z6 = (i3 & 1024) != 0 ? drjVar.k : true;
        boolean z7 = (i3 & 2048) != 0 ? drjVar.l : true;
        str.getClass();
        uf00Var2.getClass();
        return new drj(d, str, i4, i5, i6, i7, uf00Var2, z3, z4, z5, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drj)) {
            return false;
        }
        drj drjVar = (drj) obj;
        return Double.compare(this.a, drjVar.a) == 0 && Intrinsics.g(this.b, drjVar.b) && this.c == drjVar.c && this.d == drjVar.d && this.e == drjVar.e && this.f == drjVar.f && Intrinsics.g(this.g, drjVar.g) && this.h == drjVar.h && this.i == drjVar.i && this.j == drjVar.j && this.k == drjVar.k && this.l == drjVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(yvz.a(this.g, gpp.a(this.f, gpp.a(this.e, gpp.a(this.d, gpp.a(this.c, gmf0.a(Double.hashCode(this.a) * 31, 31, this.b), 31), 31), 31), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameplayState(prizePool=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", totalHammers=");
        sb.append(this.c);
        sb.append(", hammersLeft=");
        sb.append(this.d);
        sb.append(", secondsLeft=");
        sb.append(this.e);
        sb.append(", totalSeconds=");
        sb.append(this.f);
        sb.append(", playersInfo=");
        sb.append(this.g);
        sb.append(", hitButtonEnabled=");
        sb.append(this.h);
        sb.append(", acceptsHits=");
        sb.append(this.i);
        sb.append(", hasGameEnded=");
        sb.append(this.j);
        sb.append(", hasGameAlreadyEnded=");
        sb.append(this.k);
        sb.append(", roundStarted=");
        return ruw.a(sb, this.l, ')');
    }

    public drj(double d, String str, int i, int i2, int i3, int i4, uf00<tp10> uf00Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        uf00Var.getClass();
        this.a = d;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = uf00Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
    }

    public drj() {
        this(0.0d, null, 0, 0, 0, 0, null, 4095);
    }
}

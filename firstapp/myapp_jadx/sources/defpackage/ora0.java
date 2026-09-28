package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ora0 implements nk0.a {
    public final kjf0 a;
    public final long b;
    public final t9i c;
    public final n9i d;
    public final o9i e;
    public final f8i f;
    public final String g;
    public final long h;
    public final t82 i;
    public final ljf0 j;
    public final cet k;
    public final long l;
    public final yef0 m;
    public final ix80 n;
    public final kk10 o;
    public final wcf p;

    public ora0(long j, long j2, t9i t9iVar, n9i n9iVar, o9i o9iVar, f8i f8iVar, String str, long j3, t82 t82Var, ljf0 ljf0Var, cet cetVar, long j4, yef0 yef0Var, ix80 ix80Var, int i) {
        this((i & 1) != 0 ? j58.m : j, (i & 2) != 0 ? omf0.c : j2, (i & 4) != 0 ? null : t9iVar, (i & 8) != 0 ? null : n9iVar, (i & 16) != 0 ? null : o9iVar, (i & 32) != 0 ? null : f8iVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? omf0.c : j3, (i & 256) != 0 ? null : t82Var, (i & 512) != 0 ? null : ljf0Var, (i & 1024) != 0 ? null : cetVar, (i & 2048) != 0 ? j58.m : j4, (i & 4096) != 0 ? null : yef0Var, (i & 8192) != 0 ? null : ix80Var, (kk10) null);
    }

    public static ora0 a(ora0 ora0Var, long j, t9i t9iVar, n9i n9iVar, yef0 yef0Var, int i) {
        long jD = (i & 1) != 0 ? ora0Var.a.d() : j;
        long j2 = ora0Var.b;
        t9i t9iVar2 = (i & 4) != 0 ? ora0Var.c : t9iVar;
        n9i n9iVar2 = (i & 8) != 0 ? ora0Var.d : n9iVar;
        o9i o9iVar = ora0Var.e;
        f8i f8iVar = (i & 32) != 0 ? ora0Var.f : null;
        String str = ora0Var.g;
        long j3 = ora0Var.h;
        t82 t82Var = ora0Var.i;
        ljf0 ljf0Var = ora0Var.j;
        cet cetVar = ora0Var.k;
        long j4 = ora0Var.l;
        yef0 yef0Var2 = (i & 4096) != 0 ? ora0Var.m : yef0Var;
        ix80 ix80Var = ora0Var.n;
        kk10 kk10Var = ora0Var.o;
        wcf wcfVar = ora0Var.p;
        kjf0 z68Var = ora0Var.a;
        long jD2 = z68Var.d();
        int i2 = j58.n;
        if (!nbh0.a(jD, jD2)) {
            z68Var = jD != 16 ? new z68(jD) : kjf0.a.a;
        }
        return new ora0(z68Var, j2, t9iVar2, n9iVar2, o9iVar, f8iVar, str, j3, t82Var, ljf0Var, cetVar, j4, yef0Var2, ix80Var, kk10Var, wcfVar);
    }

    public final boolean b(ora0 ora0Var) {
        if (this == ora0Var) {
            return true;
        }
        if (!omf0.a(this.b, ora0Var.b) || !Intrinsics.g(this.c, ora0Var.c) || !Intrinsics.g(this.d, ora0Var.d) || !Intrinsics.g(this.e, ora0Var.e) || !Intrinsics.g(this.f, ora0Var.f) || !Intrinsics.g(this.g, ora0Var.g) || !omf0.a(this.h, ora0Var.h) || !Intrinsics.g(this.i, ora0Var.i) || !Intrinsics.g(this.j, ora0Var.j) || !Intrinsics.g(this.k, ora0Var.k)) {
            return false;
        }
        long j = ora0Var.l;
        int i = j58.n;
        return nbh0.a(this.l, j) && Intrinsics.g(this.o, ora0Var.o);
    }

    public final boolean c(ora0 ora0Var) {
        return Intrinsics.g(this.a, ora0Var.a) && Intrinsics.g(this.m, ora0Var.m) && Intrinsics.g(this.n, ora0Var.n) && Intrinsics.g(this.p, ora0Var.p);
    }

    public final ora0 d(ora0 ora0Var) {
        if (ora0Var == null) {
            return this;
        }
        kjf0 kjf0Var = ora0Var.a;
        return qra0.a(this, kjf0Var.d(), kjf0Var.e(), kjf0Var.a(), ora0Var.b, ora0Var.c, ora0Var.d, ora0Var.e, ora0Var.f, ora0Var.g, ora0Var.h, ora0Var.i, ora0Var.j, ora0Var.k, ora0Var.l, ora0Var.m, ora0Var.n, ora0Var.o, ora0Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ora0)) {
            return false;
        }
        ora0 ora0Var = (ora0) obj;
        return b(ora0Var) && c(ora0Var);
    }

    public final int hashCode() {
        kjf0 kjf0Var = this.a;
        long jD = kjf0Var.d();
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        int iHashCode = Long.hashCode(jD) * 31;
        ya5 ya5VarE = kjf0Var.e();
        int iHashCode2 = (Float.hashCode(kjf0Var.a()) + ((iHashCode + (ya5VarE != null ? ya5VarE.hashCode() : 0)) * 31)) * 31;
        pmf0[] pmf0VarArr = omf0.b;
        int iA = f87.a(iHashCode2, this.b, 31);
        t9i t9iVar = this.c;
        int i2 = (iA + (t9iVar != null ? t9iVar.a : 0)) * 31;
        n9i n9iVar = this.d;
        int iHashCode3 = (i2 + (n9iVar != null ? Integer.hashCode(n9iVar.a) : 0)) * 31;
        o9i o9iVar = this.e;
        int iHashCode4 = (iHashCode3 + (o9iVar != null ? Integer.hashCode(o9iVar.a) : 0)) * 31;
        f8i f8iVar = this.f;
        int iHashCode5 = (iHashCode4 + (f8iVar != null ? f8iVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iA2 = f87.a((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, this.h, 31);
        t82 t82Var = this.i;
        int iHashCode6 = (iA2 + (t82Var != null ? Float.hashCode(t82Var.a) : 0)) * 31;
        ljf0 ljf0Var = this.j;
        int iHashCode7 = (iHashCode6 + (ljf0Var != null ? ljf0Var.hashCode() : 0)) * 31;
        cet cetVar = this.k;
        int iA3 = f87.a((iHashCode7 + (cetVar != null ? cetVar.a.hashCode() : 0)) * 31, this.l, 31);
        yef0 yef0Var = this.m;
        int i3 = (iA3 + (yef0Var != null ? yef0Var.a : 0)) * 31;
        ix80 ix80Var = this.n;
        int iHashCode8 = (i3 + (ix80Var != null ? ix80Var.hashCode() : 0)) * 31;
        kk10 kk10Var = this.o;
        int iHashCode9 = (iHashCode8 + (kk10Var != null ? kk10Var.hashCode() : 0)) * 31;
        wcf wcfVar = this.p;
        return iHashCode9 + (wcfVar != null ? wcfVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        kjf0 kjf0Var = this.a;
        sb.append((Object) j58.i(kjf0Var.d()));
        sb.append(", brush=");
        sb.append(kjf0Var.e());
        sb.append(", alpha=");
        sb.append(kjf0Var.a());
        sb.append(", fontSize=");
        sb.append((Object) omf0.f(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) omf0.f(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        ofz.a(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ora0(ya5 ya5Var, float f, long j, t9i t9iVar, n9i n9iVar, o9i o9iVar, f8i f8iVar, String str, long j2, t82 t82Var, ljf0 ljf0Var, cet cetVar, long j3, yef0 yef0Var, ix80 ix80Var, kk10 kk10Var, wcf wcfVar) {
        kjf0 ab5Var = kjf0.a.a;
        if (ya5Var != null) {
            if (ya5Var instanceof soa0) {
                long jA = gff0.a(f, ((soa0) ya5Var).b);
                if (jA != 16) {
                    ab5Var = new z68(jA);
                }
            } else {
                if (!(ya5Var instanceof dx80)) {
                    uhc.a();
                    throw null;
                }
                ab5Var = new ab5((dx80) ya5Var, f);
            }
        }
        this(ab5Var, j, t9iVar, n9iVar, o9iVar, f8iVar, str, j2, t82Var, ljf0Var, cetVar, j3, yef0Var, ix80Var, kk10Var, wcfVar);
    }

    public ora0(kjf0 kjf0Var, long j, t9i t9iVar, n9i n9iVar, o9i o9iVar, f8i f8iVar, String str, long j2, t82 t82Var, ljf0 ljf0Var, cet cetVar, long j3, yef0 yef0Var, ix80 ix80Var, kk10 kk10Var, wcf wcfVar) {
        this.a = kjf0Var;
        this.b = j;
        this.c = t9iVar;
        this.d = n9iVar;
        this.e = o9iVar;
        this.f = f8iVar;
        this.g = str;
        this.h = j2;
        this.i = t82Var;
        this.j = ljf0Var;
        this.k = cetVar;
        this.l = j3;
        this.m = yef0Var;
        this.n = ix80Var;
        this.o = kk10Var;
        this.p = wcfVar;
    }

    public ora0(long j, long j2, t9i t9iVar, n9i n9iVar, o9i o9iVar, f8i f8iVar, String str, long j3, t82 t82Var, ljf0 ljf0Var, cet cetVar, long j4, yef0 yef0Var, ix80 ix80Var, kk10 kk10Var) {
        kjf0 z68Var;
        if (j != 16) {
            z68Var = new z68(j);
        } else {
            z68Var = kjf0.a.a;
        }
        this(z68Var, j2, t9iVar, n9iVar, o9iVar, f8iVar, str, j3, t82Var, ljf0Var, cetVar, j4, yef0Var, ix80Var, kk10Var, null);
    }
}

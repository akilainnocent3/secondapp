package defpackage;

import androidx.work.OverwritingInputMerger;
import androidx.work.c;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class owj0 {
    public static final String y = jgt.g("WorkSpec");
    public final String a;
    public jvj0 b;
    public final String c;
    public final String d;
    public c e;
    public final c f;
    public final long g;
    public long h;
    public long i;
    public final lxa j;
    public final int k;
    public final nt1 l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final x7z r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;

    public static final class a {
        public String a;
        public jvj0 b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    public /* synthetic */ owj0(String str, jvj0 jvj0Var, String str2, String str3, c cVar, c cVar2, long j, long j2, long j3, lxa lxaVar, int i, nt1 nt1Var, long j4, long j5, long j6, long j7, boolean z, x7z x7zVar, int i2, long j8, int i3, int i4, String str4, int i5) {
        this(str, (i5 & 2) != 0 ? jvj0.a : jvj0Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? c.b : cVar, (i5 & 32) != 0 ? c.b : cVar2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? lxa.j : lxaVar, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? nt1.a : nt1Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? x7z.a : x7zVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (i5 & 8388608) != 0 ? null : str4);
    }

    public static owj0 b(owj0 owj0Var, String str, jvj0 jvj0Var, String str2, c cVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? owj0Var.a : str;
        jvj0 jvj0Var2 = (i5 & 2) != 0 ? owj0Var.b : jvj0Var;
        String str4 = (i5 & 4) != 0 ? owj0Var.c : str2;
        String str5 = owj0Var.d;
        c cVar2 = (i5 & 16) != 0 ? owj0Var.e : cVar;
        c cVar3 = owj0Var.f;
        long j3 = owj0Var.g;
        long j4 = owj0Var.h;
        long j5 = owj0Var.i;
        lxa lxaVar = owj0Var.j;
        int i6 = (i5 & 1024) != 0 ? owj0Var.k : i;
        nt1 nt1Var = owj0Var.l;
        long j6 = owj0Var.m;
        long j7 = (i5 & 8192) != 0 ? owj0Var.n : j;
        long j8 = owj0Var.o;
        long j9 = owj0Var.p;
        boolean z = owj0Var.q;
        x7z x7zVar = owj0Var.r;
        int i7 = (i5 & 262144) != 0 ? owj0Var.s : i2;
        int i8 = (i5 & 524288) != 0 ? owj0Var.t : i3;
        long j10 = (i5 & 1048576) != 0 ? owj0Var.u : j2;
        int i9 = (i5 & 2097152) != 0 ? owj0Var.v : i4;
        int i10 = owj0Var.w;
        String str6 = owj0Var.x;
        str3.getClass();
        jvj0Var2.getClass();
        str4.getClass();
        str5.getClass();
        cVar2.getClass();
        cVar3.getClass();
        lxaVar.getClass();
        nt1Var.getClass();
        x7zVar.getClass();
        return new owj0(str3, jvj0Var2, str4, str5, cVar2, cVar3, j3, j4, j5, lxaVar, i6, nt1Var, j6, j7, j8, j9, z, x7zVar, i7, i8, j10, i9, i10, str6);
    }

    public final long a() {
        jvj0 jvj0Var = this.b;
        jvj0 jvj0Var2 = jvj0.a;
        int i = this.k;
        boolean z = jvj0Var == jvj0Var2 && i > 0;
        long j = this.n;
        boolean zD = d();
        long j2 = this.i;
        long j3 = this.h;
        nt1 nt1Var = this.l;
        nt1Var.getClass();
        long j4 = this.u;
        int i2 = this.s;
        if (j4 != Long.MAX_VALUE && zD) {
            if (i2 != 0) {
                long j5 = j + 900000;
                if (j4 < j5) {
                    return j5;
                }
            }
            return j4;
        }
        if (z) {
            nt1 nt1Var2 = nt1.b;
            long j6 = this.m;
            long jScalb = nt1Var == nt1Var2 ? j6 * ((long) i) : (long) Math.scalb(j6, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j + jScalb;
        }
        long j7 = this.g;
        if (zD) {
            long j8 = i2 == 0 ? j + j7 : j + j3;
            return (j2 == j3 || i2 != 0) ? j8 : (j3 - j2) + j8;
        }
        if (j == -1) {
            return Long.MAX_VALUE;
        }
        return j + j7;
    }

    public final boolean c() {
        return !Intrinsics.g(lxa.j, this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owj0)) {
            return false;
        }
        owj0 owj0Var = (owj0) obj;
        return Intrinsics.g(this.a, owj0Var.a) && this.b == owj0Var.b && Intrinsics.g(this.c, owj0Var.c) && Intrinsics.g(this.d, owj0Var.d) && Intrinsics.g(this.e, owj0Var.e) && Intrinsics.g(this.f, owj0Var.f) && this.g == owj0Var.g && this.h == owj0Var.h && this.i == owj0Var.i && Intrinsics.g(this.j, owj0Var.j) && this.k == owj0Var.k && this.l == owj0Var.l && this.m == owj0Var.m && this.n == owj0Var.n && this.o == owj0Var.o && this.p == owj0Var.p && this.q == owj0Var.q && this.r == owj0Var.r && this.s == owj0Var.s && this.t == owj0Var.t && this.u == owj0Var.u && this.v == owj0Var.v && this.w == owj0Var.w && Intrinsics.g(this.x, owj0Var.x);
    }

    public final int hashCode() {
        int iA = gpp.a(this.w, gpp.a(this.v, f87.a(gpp.a(this.t, gpp.a(this.s, (this.r.hashCode() + mtg0.a(f87.a(f87.a(f87.a(f87.a((this.l.hashCode() + gpp.a(this.k, (this.j.hashCode() + f87.a(f87.a(f87.a((this.f.hashCode() + ((this.e.hashCode() + gmf0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, this.g, 31), this.h, 31), this.i, 31)) * 31, 31)) * 31, this.m, 31), this.n, 31), this.o, 31), this.p, 31), 31, this.q)) * 31, 31), 31), this.u, 31), 31), 31);
        String str = this.x;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return j26.a(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public owj0(String str, jvj0 jvj0Var, String str2, String str3, c cVar, c cVar2, long j, long j2, long j3, lxa lxaVar, int i, nt1 nt1Var, long j4, long j5, long j6, long j7, boolean z, x7z x7zVar, int i2, int i3, long j8, int i4, int i5, String str4) {
        str.getClass();
        jvj0Var.getClass();
        str2.getClass();
        str3.getClass();
        cVar.getClass();
        cVar2.getClass();
        lxaVar.getClass();
        nt1Var.getClass();
        x7zVar.getClass();
        this.a = str;
        this.b = jvj0Var;
        this.c = str2;
        this.d = str3;
        this.e = cVar;
        this.f = cVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = lxaVar;
        this.k = i;
        this.l = nt1Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = x7zVar;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
    }
}

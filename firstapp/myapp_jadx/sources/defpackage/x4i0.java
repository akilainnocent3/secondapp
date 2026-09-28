package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class x4i0 {
    public final djd.a a;
    public final u4i0 b;
    public final u4i0.a c = new u4i0.a();
    public final pxf0<v5i0> d = new pxf0<>();
    public final pxf0<Long> e = new pxf0<>();
    public final ojt f;
    public long g;
    public long h;
    public long i;
    public v5i0 j;
    public long k;

    public x4i0(djd.a aVar, u4i0 u4i0Var) {
        this.a = aVar;
        this.b = u4i0Var;
        ojt ojtVar = new ojt();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        ojtVar.a = 0;
        ojtVar.b = -1;
        ojtVar.c = 0;
        ojtVar.d = new long[iHighestOneBit];
        ojtVar.e = iHighestOneBit - 1;
        this.f = ojtVar;
        this.g = -9223372036854775807L;
        this.j = v5i0.d;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final djd.a aVar = this.a;
        djd djdVar = djd.this;
        while (true) {
            ojt ojtVar = this.f;
            int i = ojtVar.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                lrh0.a();
                return;
            }
            long j3 = ojtVar.d[ojtVar.a];
            Long lF = this.e.f(j3);
            u4i0 u4i0Var = this.b;
            if (lF != null && lF.longValue() != this.k) {
                this.k = lF.longValue();
                u4i0Var.f(2);
            }
            long j4 = this.k;
            u4i0 u4i0Var2 = this.b;
            u4i0.a aVar2 = this.c;
            int iA = u4i0Var2.a(j3, j, j2, j4, false, false, aVar2);
            if (iA == 0 || iA == 1) {
                this.h = j3;
                boolean z = iA == 0;
                long jA = ojtVar.a();
                final v5i0 v5i0VarF = this.d.f(jA);
                if (v5i0VarF != null && !v5i0VarF.equals(v5i0.d) && !v5i0VarF.equals(this.j)) {
                    this.j = v5i0VarF;
                    a.C0062a c0062a = new a.C0062a();
                    c0062a.t = v5i0VarF.a;
                    c0062a.u = v5i0VarF.b;
                    c0062a.m = gqv.m("video/raw");
                    aVar.a = new a(c0062a);
                    djdVar.h.execute(new Runnable() { // from class: cjd
                        @Override // java.lang.Runnable
                        public final void run() {
                            djd.this.g.a(v5i0VarF);
                        }
                    });
                }
                long jNanoTime = z ? System.nanoTime() : aVar2.b;
                boolean z2 = u4i0Var.e != 3;
                u4i0Var.e = 3;
                u4i0Var.g = jrh0.O(u4i0Var.l.d());
                if (z2 && djdVar.d != null) {
                    djdVar.h.execute(new Runnable() { // from class: ajd
                        @Override // java.lang.Runnable
                        public final void run() {
                            djd.this.g.c();
                        }
                    });
                }
                a aVar3 = aVar.a;
                djdVar.i.k(jA, jNanoTime, aVar3 == null ? new a(new a.C0062a()) : aVar3, null);
                ((u5i0.b) djdVar.c.remove()).a(jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.h = j3;
                ojtVar.a();
                djdVar.h.execute(new Runnable() { // from class: bjd
                    @Override // java.lang.Runnable
                    public final void run() {
                        djd.this.g.g();
                    }
                });
                ((u5i0.b) djdVar.c.remove()).b();
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    ib5.a(String.valueOf(iA));
                    return;
                }
                this.h = j3;
            }
        }
    }
}

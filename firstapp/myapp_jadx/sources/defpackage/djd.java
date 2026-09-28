package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class djd implements u5i0 {
    public final u4i0 a;
    public final x4i0 b;
    public final ArrayDeque c;
    public Surface d;
    public androidx.media3.common.a e;
    public long f;
    public u5i0.a g;
    public Executor h;
    public s4i0 i;

    public final class a {
        public androidx.media3.common.a a;

        public a() {
        }
    }

    public djd(u4i0 u4i0Var, vs7 vs7Var) {
        this.a = u4i0Var;
        u4i0Var.l = vs7Var;
        this.b = new x4i0(new a(), u4i0Var);
        this.c = new ArrayDeque();
        this.e = new androidx.media3.common.a(new androidx.media3.common.a.C0062a());
        this.f = -9223372036854775807L;
        this.g = u5i0.a.a;
        this.h = new xid();
        this.i = new yid();
    }

    @Override // defpackage.u5i0
    public final boolean b() {
        x4i0 x4i0Var = this.b;
        long j = x4i0Var.i;
        return j != -9223372036854775807L && x4i0Var.h == j;
    }

    @Override // defpackage.u5i0
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u5i0
    public final Surface e() {
        Surface surface = this.d;
        ly0.g(surface);
        return surface;
    }

    @Override // defpackage.u5i0
    public final void f(float f) {
        this.a.i(f);
    }

    @Override // defpackage.u5i0
    public final void h(long j, long j2) throws u5i0.c {
        try {
            this.b.a(j, j2);
        } catch (rwg e) {
            throw new u5i0.c(e, this.e);
        }
    }

    @Override // defpackage.u5i0
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u5i0
    public final boolean isInitialized() {
        return true;
    }

    @Override // defpackage.u5i0
    public final void j() {
        x4i0 x4i0Var = this.b;
        long j = x4i0Var.g;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            x4i0Var.g = Long.MIN_VALUE;
            x4i0Var.h = Long.MIN_VALUE;
        }
        x4i0Var.i = j;
    }

    @Override // defpackage.u5i0
    public final void k(kjv kjvVar) {
        this.g = kjvVar;
        this.h = lqe.a;
    }

    @Override // defpackage.u5i0
    public final void l(androidx.media3.common.a aVar, long j, int i, List list) {
        ly0.f(list.isEmpty());
        int i2 = aVar.u;
        int i3 = aVar.v;
        androidx.media3.common.a aVar2 = this.e;
        int i4 = aVar2.u;
        x4i0 x4i0Var = this.b;
        if (i2 != i4 || i3 != aVar2.v) {
            pxf0<v5i0> pxf0Var = x4i0Var.d;
            long j2 = x4i0Var.g;
            pxf0Var.a(new v5i0(i2, i3), j2 == -9223372036854775807L ? 0L : j2 + 1);
        }
        float f = aVar.y;
        if (f != this.e.y) {
            this.a.g(f);
        }
        this.e = aVar;
        if (j != this.f) {
            if (x4i0Var.f.c == 0) {
                x4i0Var.b.f(i);
                x4i0Var.k = j;
            } else {
                pxf0<Long> pxf0Var2 = x4i0Var.e;
                long j3 = x4i0Var.g;
                pxf0Var2.a(Long.valueOf(j), j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1);
            }
            this.f = j;
        }
    }

    @Override // defpackage.u5i0
    public final void m(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u5i0
    public final boolean n(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.u5i0
    public final void o(Surface surface, vw90 vw90Var) {
        this.d = surface;
        this.a.h(surface);
    }

    @Override // defpackage.u5i0
    public final boolean p(androidx.media3.common.a aVar) {
        return true;
    }

    @Override // defpackage.u5i0
    public final void q() {
        u4i0 u4i0Var = this.a;
        if (u4i0Var.e == 0) {
            u4i0Var.e = 1;
        }
    }

    @Override // defpackage.u5i0
    public final void r() {
        this.a.e();
    }

    @Override // defpackage.u5i0
    public final void s() {
        this.a.d();
    }

    @Override // defpackage.u5i0
    public final void t(int i) {
        w4i0 w4i0Var = this.a.b;
        if (w4i0Var.j == i) {
            return;
        }
        w4i0Var.j = i;
        w4i0Var.d(true);
    }

    @Override // defpackage.u5i0
    public final void u() {
        this.d = null;
        this.a.h(null);
    }

    @Override // defpackage.u5i0
    public final boolean v(long j, ljv.a aVar) {
        this.c.add(aVar);
        x4i0 x4i0Var = this.b;
        ojt ojtVar = x4i0Var.f;
        int i = ojtVar.c;
        long[] jArr = ojtVar.d;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                fm20.a();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = ojtVar.a;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(ojtVar.d, 0, jArr2, i3, i2);
            ojtVar.a = 0;
            int i4 = ojtVar.c;
            ojtVar.b = i4 - 1;
            ojtVar.d = jArr2;
            ojtVar.e = length - 1;
            i = i4;
            jArr = jArr2;
        }
        int i5 = (ojtVar.b + 1) & ojtVar.e;
        ojtVar.b = i5;
        jArr[i5] = j;
        ojtVar.c = i + 1;
        x4i0Var.g = j;
        x4i0Var.i = -9223372036854775807L;
        this.h.execute(new Runnable() { // from class: zid
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g.b();
            }
        });
        return true;
    }

    @Override // defpackage.u5i0
    public final void w(boolean z) {
        if (z) {
            u4i0 u4i0Var = this.a;
            w4i0 w4i0Var = u4i0Var.b;
            w4i0Var.m = 0L;
            w4i0Var.p = -1L;
            w4i0Var.n = -1L;
            u4i0Var.h = -9223372036854775807L;
            u4i0Var.f = -9223372036854775807L;
            u4i0Var.e = Math.min(u4i0Var.e, 1);
            u4i0Var.i = -9223372036854775807L;
        }
        x4i0 x4i0Var = this.b;
        pxf0<v5i0> pxf0Var = x4i0Var.d;
        ojt ojtVar = x4i0Var.f;
        ojtVar.a = 0;
        ojtVar.b = -1;
        ojtVar.c = 0;
        x4i0Var.g = -9223372036854775807L;
        x4i0Var.h = -9223372036854775807L;
        x4i0Var.i = -9223372036854775807L;
        pxf0<Long> pxf0Var2 = x4i0Var.e;
        if (pxf0Var2.h() > 0) {
            ly0.b(pxf0Var2.h() > 0);
            while (pxf0Var2.h() > 1) {
                pxf0Var2.e();
            }
            Long lE = pxf0Var2.e();
            lE.getClass();
            x4i0Var.k = lE.longValue();
        }
        if (pxf0Var.h() > 0) {
            ly0.b(pxf0Var.h() > 0);
            while (pxf0Var.h() > 1) {
                pxf0Var.e();
            }
            v5i0 v5i0VarE = pxf0Var.e();
            v5i0VarE.getClass();
            pxf0Var.a(v5i0VarE, 0L);
        }
        this.c.clear();
    }

    @Override // defpackage.u5i0
    public final void x(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.u5i0
    public final void y(s4i0 s4i0Var) {
        this.i = s4i0Var;
    }

    @Override // defpackage.u5i0
    public final void release() {
    }
}

package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hvr implements nur, pxr {
    public final int a;
    public final Object b;
    public final int c;
    public final asr d;
    public final int e;
    public final int f;
    public final List<y> g;
    public final long h;
    public final Object i;
    public final LazyLayoutItemAnimator<hvr> j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public int q;
    public int r;
    public final long s;
    public long t;
    public int u;
    public int v;
    public boolean w;

    public hvr(int i, Object obj, int i2, int i3, asr asrVar, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = asrVar;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = lazyLayoutItemAnimator;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((y) list.get(i8)).b);
        }
        this.n = iMax;
        int i9 = i3 + iMax;
        this.o = i9 >= 0 ? i9 : 0;
        this.s = (((long) this.c) << 32) | (((long) iMax) & 4294967295L);
        this.t = 0L;
        this.u = -1;
        this.v = -1;
    }

    @Override // defpackage.nur
    public final long a() {
        return this.s;
    }

    @Override // defpackage.pxr
    public final int b() {
        return this.g.size();
    }

    @Override // defpackage.pxr
    public final long c() {
        return this.k;
    }

    @Override // defpackage.pxr
    public final void d(int i, int i2, int i3, int i4) {
        q(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.pxr
    public final boolean e() {
        return this.w;
    }

    @Override // defpackage.pxr
    public final int f() {
        return this.m;
    }

    @Override // defpackage.nur
    public final int g() {
        return this.u;
    }

    @Override // defpackage.nur, defpackage.pxr
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.pxr
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.pxr
    public final boolean h() {
        return true;
    }

    @Override // defpackage.nur
    public final int i() {
        return this.v;
    }

    @Override // defpackage.pxr
    public final int j() {
        return this.o;
    }

    @Override // defpackage.pxr
    public final Object k(int i) {
        return this.g.get(i).g();
    }

    @Override // defpackage.pxr
    public final void l() {
        this.w = true;
    }

    @Override // defpackage.pxr
    public final long m(int i) {
        return this.t;
    }

    @Override // defpackage.pxr
    public final int n() {
        return this.l;
    }

    @Override // defpackage.nur
    public final long o() {
        return this.t;
    }

    public final void p(y.a aVar, boolean z) {
        if (this.p == Integer.MIN_VALUE) {
            zkn.a("position() should be called first");
        }
        List<y> list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y yVar = list.get(i);
            int i2 = this.q - yVar.b;
            int i3 = this.r;
            long j = this.t;
            owr owrVarA = this.j.a(i, this.b);
            v6l v6lVar = null;
            if (owrVarA != null) {
                if (z) {
                    owrVarA.r = j;
                } else {
                    long jD = iwo.d(!iwo.b(owrVarA.r, 9223372034707292159L) ? owrVarA.r : j, ((iwo) ((x5a0) owrVarA.q).getValue()).a);
                    int i4 = (int) (j & 4294967295L);
                    if (((i4 <= i2 && ((int) (jD & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jD & 4294967295L)) >= i3)) && ((Boolean) ((x5a0) owrVarA.h).getValue()).booleanValue()) {
                        ej5.c(owrVarA.a, null, null, new uwr(owrVarA, null), 3);
                    }
                    j = jD;
                }
                v6lVar = owrVarA.n;
            }
            long jD2 = iwo.d(j, this.h);
            if (!z && owrVarA != null) {
                owrVarA.m = jD2;
            }
            if (v6lVar != null) {
                aVar.o(yVar);
                yVar.r0(iwo.d(jD2, yVar.e), 0.0f, v6lVar);
            } else {
                y.a.M(aVar, yVar, jD2);
            }
        }
    }

    public final void q(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == asr.b) {
            i2 = (i3 - i2) - this.c;
        }
        this.t = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.u = i5;
        this.v = i6;
        this.q = -this.e;
        this.r = i4 + this.f;
    }
}

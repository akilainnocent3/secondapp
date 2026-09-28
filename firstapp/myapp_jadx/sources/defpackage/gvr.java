package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gvr implements cvr, biv {
    public final ivr a;
    public final int b;
    public final boolean c;
    public final float d;
    public final biv e;
    public final float f;
    public final boolean g;
    public final v5b h;
    public final mmd i;
    public final int j;
    public final Function1<Integer, List<Pair<Integer, kxa>>> k;
    public final Function1<Integer, Integer> l;
    public final List<hvr> m;
    public final int n;
    public final int o;
    public final int p;
    public final i3z q;
    public final int r;
    public final int s;

    public gvr(ivr ivrVar, int i, boolean z, float f, biv bivVar, float f2, boolean z2, v5b v5bVar, mmd mmdVar, int i2, Function1 function1, Function1 function2, List list, int i3, int i4, int i5, i3z i3zVar, int i6, int i7) {
        this.a = ivrVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = bivVar;
        this.f = f2;
        this.g = z2;
        this.h = v5bVar;
        this.i = mmdVar;
        this.j = i2;
        this.k = function1;
        this.l = function2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = i3zVar;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.cvr
    public final i3z a() {
        return this.q;
    }

    @Override // defpackage.biv
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.biv
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.cvr
    public final long d() {
        biv bivVar = this.e;
        return (((long) bivVar.c()) << 32) | (((long) bivVar.b()) & 4294967295L);
    }

    @Override // defpackage.cvr
    public final int e() {
        return this.r;
    }

    @Override // defpackage.cvr
    public final int f() {
        return this.o;
    }

    @Override // defpackage.cvr
    public final int g() {
        return -this.n;
    }

    @Override // defpackage.cvr
    public final int h() {
        return this.n;
    }

    @Override // defpackage.cvr
    public final int i() {
        return this.p;
    }

    @Override // defpackage.cvr
    public final int j() {
        return this.s;
    }

    @Override // defpackage.cvr
    public final List<hvr> k() {
        return this.m;
    }

    @Override // defpackage.biv
    public final void l() {
        this.e.l();
    }

    @Override // defpackage.biv
    public final Function1<r160, Unit> m() {
        return this.e.m();
    }

    public final gvr n(int i, boolean z) {
        ivr ivrVar;
        int i2;
        long j;
        if (this.g) {
            return null;
        }
        List<hvr> list = this.m;
        if (list.isEmpty() || (ivrVar = this.a) == null) {
            return null;
        }
        int i3 = ivrVar.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        hvr hvrVar = (hvr) CollectionsKt.T(list);
        hvr hvrVar2 = (hvr) CollectionsKt.b0(list);
        if (hvrVar.w || hvrVar2.w) {
            return null;
        }
        int i5 = this.o;
        int i6 = this.n;
        i3z i3zVar = this.q;
        if (i < 0) {
            if (Math.min((pvr.a(hvrVar, i3zVar) + hvrVar.o) - i6, (pvr.a(hvrVar2, i3zVar) + hvrVar2.o) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - pvr.a(hvrVar, i3zVar), i5 - pvr.a(hvrVar2, i3zVar)) <= i) {
            return null;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            hvr hvrVar3 = list.get(i7);
            hvrVar3.getClass();
            if (hvrVar3.w) {
                i2 = i7;
            } else {
                long j2 = hvrVar3.t;
                long j3 = 4294967295L;
                int i8 = i7;
                char c = ' ';
                hvrVar3.t = (((long) ((int) (j2 >> 32))) << 32) | (((long) (((int) (j2 & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = hvrVar3.g.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        owr owrVarA = hvrVar3.j.a(i9, hvrVar3.b);
                        if (owrVarA != null) {
                            long j4 = owrVarA.l;
                            j = j3;
                            char c2 = c;
                            owrVarA.l = (((long) ((int) (j4 >> c2))) << c2) | (((long) (((int) (j4 & j)) + i)) & j);
                        } else {
                            j = j3;
                        }
                        i9++;
                        i8 = i8;
                        j3 = j;
                        c = ' ';
                    }
                }
                i2 = i8;
            }
            i7 = i2 + 1;
        }
        return new gvr(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, i3zVar, this.r, this.s);
    }

    @Override // defpackage.biv
    public final Map<kt, Integer> s() {
        return this.e.s();
    }
}

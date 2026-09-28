package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class npz implements epz, biv {
    public final List<fiv> a;
    public final int b;
    public final int c;
    public final int d;
    public final i3z e;
    public final int f;
    public final int g;
    public final int h;
    public final fiv i;
    public final fiv j;
    public final float k;
    public final int l;
    public final boolean m;
    public final z4a0 n;
    public final biv o;
    public final boolean p;
    public final List<fiv> q;
    public final List<fiv> r;
    public final v5b s;

    public npz(List list, int i, int i2, int i3, i3z i3zVar, int i4, int i5, int i6, fiv fivVar, fiv fivVar2, float f, int i7, boolean z, z4a0 z4a0Var, biv bivVar, boolean z2, List list2, List list3, v5b v5bVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i3zVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = fivVar;
        this.j = fivVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = z4a0Var;
        this.o = bivVar;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = v5bVar;
    }

    @Override // defpackage.epz
    public final i3z a() {
        return this.e;
    }

    @Override // defpackage.biv
    public final int b() {
        return this.o.b();
    }

    @Override // defpackage.biv
    public final int c() {
        return this.o.c();
    }

    @Override // defpackage.epz
    public final long d() {
        biv bivVar = this.o;
        return (((long) bivVar.c()) << 32) | (((long) bivVar.b()) & 4294967295L);
    }

    @Override // defpackage.epz
    public final int e() {
        return this.d;
    }

    @Override // defpackage.epz
    public final int f() {
        return this.g;
    }

    @Override // defpackage.epz
    public final int g() {
        return -this.f;
    }

    @Override // defpackage.epz
    public final int h() {
        return this.f;
    }

    @Override // defpackage.epz
    public final boolean i() {
        return false;
    }

    @Override // defpackage.epz
    public final int j() {
        return this.b;
    }

    @Override // defpackage.epz
    public final List<fiv> k() {
        return this.a;
    }

    @Override // defpackage.biv
    public final void l() {
        this.o.l();
    }

    @Override // defpackage.biv
    public final Function1<r160, Unit> m() {
        return this.o.m();
    }

    @Override // defpackage.epz
    public final int n() {
        return this.c;
    }

    @Override // defpackage.epz
    public final int o() {
        return this.h;
    }

    @Override // defpackage.epz
    public final z4a0 p() {
        return this.n;
    }

    public final npz q(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List<fiv> list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        fiv fivVar = (fiv) CollectionsKt.T(list);
        fiv fivVar2 = (fiv) CollectionsKt.b0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((fivVar.j + i3) - i5, (fivVar2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - fivVar.j, i4 - fivVar2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            list.get(i6).a(i);
        }
        List<fiv> list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            list2.get(i7).a(i);
        }
        List<fiv> list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            list3.get(i8).a(i);
        }
        return new npz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    @Override // defpackage.biv
    public final Map<kt, Integer> s() {
        return this.o.s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public npz(m2g m2gVar, int i, int i2, int i3, int i4, int i5, int i6, z4a0 z4a0Var, biv bivVar, v5b v5bVar) {
        i3z i3zVar = i3z.b;
        m2g m2gVar2 = m2g.a;
        this(m2gVar, i, i2, i3, i3zVar, i4, i5, i6, null, null, 0.0f, 0, false, z4a0Var, bivVar, false, m2gVar2, m2gVar2, v5bVar);
    }
}

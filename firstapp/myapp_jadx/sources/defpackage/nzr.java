package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nzr implements kzr, biv {
    public final ozr a;
    public final int b;
    public final boolean c;
    public final float d;
    public final biv e;
    public final float f;
    public final boolean g;
    public final v5b h;
    public final mmd i;
    public final long j;
    public final List<ozr> k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final i3z p;
    public final int q;
    public final int r;

    public nzr(ozr ozrVar, int i, boolean z, float f, biv bivVar, float f2, boolean z2, v5b v5bVar, mmd mmdVar, long j, List<ozr> list, int i2, int i3, int i4, boolean z3, i3z i3zVar, int i5, int i6) {
        this.a = ozrVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = bivVar;
        this.f = f2;
        this.g = z2;
        this.h = v5bVar;
        this.i = mmdVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = i3zVar;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.kzr
    public final i3z a() {
        return this.p;
    }

    @Override // defpackage.biv
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.biv
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.kzr
    public final long d() {
        biv bivVar = this.e;
        return (((long) bivVar.c()) << 32) | (((long) bivVar.b()) & 4294967295L);
    }

    @Override // defpackage.kzr
    public final int e() {
        return this.q;
    }

    @Override // defpackage.kzr
    public final int f() {
        return this.m;
    }

    @Override // defpackage.kzr
    public final int g() {
        return -this.l;
    }

    @Override // defpackage.kzr
    public final int h() {
        return this.l;
    }

    @Override // defpackage.kzr
    public final int i() {
        return this.n;
    }

    @Override // defpackage.kzr
    public final int j() {
        return this.r;
    }

    @Override // defpackage.kzr
    public final List<ozr> k() {
        return this.k;
    }

    @Override // defpackage.biv
    public final void l() {
        this.e.l();
    }

    @Override // defpackage.biv
    public final Function1<r160, Unit> m() {
        return this.e.m();
    }

    public final nzr n(int i, boolean z) {
        ozr ozrVar;
        int i2;
        int i3;
        if (this.g) {
            return null;
        }
        List<ozr> list = this.k;
        if (list.isEmpty() || (ozrVar = this.a) == null) {
            return null;
        }
        int i4 = ozrVar.r;
        int i5 = this.b - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        ozr ozrVar2 = (ozr) CollectionsKt.T(list);
        ozr ozrVar3 = (ozr) CollectionsKt.b0(list);
        if (ozrVar2.t || ozrVar3.t) {
            return null;
        }
        int i6 = ozrVar2.p;
        int i7 = this.m;
        int i8 = this.l;
        if (i < 0) {
            if (Math.min((i6 + ozrVar2.r) - i8, (ozrVar3.p + ozrVar3.r) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - i6, i7 - ozrVar3.p) <= i) {
            return null;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            ozr ozrVar4 = list.get(i9);
            boolean z2 = ozrVar4.c;
            int[] iArr = ozrVar4.x;
            if (!ozrVar4.t) {
                ozrVar4.p += i;
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 & 1;
                    if ((z2 && i11 != 0) || (!z2 && i11 == 0)) {
                        iArr[i10] = iArr[i10] + i;
                    }
                }
                if (z) {
                    int size2 = ozrVar4.b.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        owr owrVarA = ozrVar4.n.a(i12, ozrVar4.l);
                        if (owrVarA != null) {
                            long j = owrVarA.l;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            owrVarA.l = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i9 = i9;
                        }
                        i12++;
                        i9 = i9;
                    }
                }
            }
            i9++;
        }
        return new nzr(this.a, i5, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    @Override // defpackage.biv
    public final Map<kt, Integer> s() {
        return this.e.s();
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zf extends f62 {
    public final fw1 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final pcn<a> o;
    public final vs7 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public siv u;

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public zf(jjg0 jjg0Var, int[] iArr, fw1 fw1Var, long j, long j2, long j3, int i, int i2, float f, float f2, pcn pcnVar, fqe0 fqe0Var) {
        super(jjg0Var, iArr);
        if (j3 < j) {
            cft.g("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = fw1Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = i;
        this.l = i2;
        this.m = f;
        this.n = f2;
        this.o = pcn.j(pcnVar);
        this.p = fqe0Var;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void u(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            pcn.a aVar = (pcn.a) arrayList.get(i);
            if (aVar != null) {
                aVar.c(new a(j, jArr[i]));
            }
        }
    }

    public static long w(List list) {
        if (!list.isEmpty()) {
            siv sivVar = (siv) t3p.a(list);
            long j = sivVar.g;
            if (j != -9223372036854775807L) {
                long j2 = sivVar.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.f62, defpackage.oyg
    public final void a() {
        this.u = null;
    }

    @Override // defpackage.oyg
    public final int c() {
        return this.r;
    }

    @Override // defpackage.f62, defpackage.oyg
    public final void h(float f) {
        this.q = f;
    }

    @Override // defpackage.oyg
    public final Object i() {
        return null;
    }

    @Override // defpackage.oyg
    public final void l(long j, long j2, long j3, List<? extends siv> list, tiv[] tivVarArr) {
        long jW;
        long jD = this.p.d();
        int i = this.r;
        int i2 = 0;
        if (i >= tivVarArr.length || !tivVarArr[i].next()) {
            int length = tivVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jW = w(list);
                    break;
                }
                tiv tivVar = tivVarArr[i3];
                if (tivVar.next()) {
                    jW = tivVar.b() - tivVar.a();
                    break;
                }
                i3++;
            }
        } else {
            tiv tivVar2 = tivVarArr[this.r];
            jW = tivVar2.b() - tivVar2.a();
        }
        int i4 = this.s;
        if (i4 == 0) {
            this.s = 1;
            this.r = v(jD, jW);
            return;
        }
        int i5 = this.r;
        boolean zIsEmpty = list.isEmpty();
        androidx.media3.common.a[] aVarArr = this.d;
        if (!zIsEmpty) {
            androidx.media3.common.a aVar = ((siv) t3p.a(list)).d;
            while (true) {
                if (i2 >= this.b) {
                    i2 = -1;
                    break;
                } else if (aVarArr[i2] == aVar) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 != -1) {
            i4 = ((siv) t3p.a(list)).e;
            i5 = i2;
        }
        int iV = v(jD, jW);
        if (iV != i5 && !b(i5, jD)) {
            androidx.media3.common.a aVar2 = aVarArr[i5];
            androidx.media3.common.a aVar3 = aVarArr[iV];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jW != -9223372036854775807L ? j3 - jW : j3) * this.n), jMin);
            }
            int i6 = aVar3.j;
            int i7 = aVar2.j;
            if ((i6 > i7 && j2 < jMin) || (i6 < i7 && j2 >= this.i)) {
                iV = i5;
            }
        }
        if (iV != i5) {
            i4 = 3;
        }
        this.s = i4;
        this.r = iV;
    }

    @Override // defpackage.f62, defpackage.oyg
    public final void o() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.f62, defpackage.oyg
    public final int p(long j, List<? extends siv> list) {
        int i;
        int i2;
        long jD = this.p.d();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jD - j2 < 1000 && (list.isEmpty() || ((siv) t3p.a(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jD;
        this.u = list.isEmpty() ? null : (siv) t3p.a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jB = jrh0.B(this.q, list.get(size - 1).g - j);
        long j3 = this.j;
        if (jB >= j3) {
            androidx.media3.common.a aVar = this.d[v(jD, w(list))];
            for (int i3 = 0; i3 < size; i3++) {
                siv sivVar = list.get(i3);
                androidx.media3.common.a aVar2 = sivVar.d;
                if (jrh0.B(this.q, sivVar.g - j) >= j3 && aVar2.j < aVar.j && (i = aVar2.v) != -1 && i <= this.l && (i2 = aVar2.u) != -1 && i2 <= this.k && i < aVar.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.oyg
    public final int s() {
        return this.s;
    }

    public final int v(long j, long j2) {
        long jC = (long) (((long) (this.g.c() * this.m)) / this.q);
        pcn<a> pcnVar = this.o;
        if (!pcnVar.isEmpty()) {
            int i = 1;
            while (i < pcnVar.size() - 1 && pcnVar.get(i).a < jC) {
                i++;
            }
            a aVar = pcnVar.get(i - 1);
            a aVar2 = pcnVar.get(i);
            long j3 = aVar.a;
            float f = (jC - j3) / (aVar2.a - j3);
            long j4 = aVar.b;
            jC = ((long) (f * (aVar2.b - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !b(i3, j)) {
                if (this.d[i3].j <= jC) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public static class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final fqe0 f;

        public b(int i) {
            this.a = 10000;
            this.b = i;
            this.c = 25000;
            this.d = 1279;
            this.e = 719;
            this.f = vs7.a;
        }

        public b() {
            this(25000);
        }
    }
}

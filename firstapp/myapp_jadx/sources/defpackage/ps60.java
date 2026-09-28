package defpackage;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ps60 implements njg0 {
    public androidx.media3.common.a A;
    public androidx.media3.common.a B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final ns60 a;
    public final nef d;
    public final mef.a e;
    public c f;
    public androidx.media3.common.a g;
    public lef h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final a b = new a();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public njg0.a[] o = new njg0.a[1000];
    public final bsa0<b> c = new bsa0<>(new os60());
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public static final class a {
        public int a;
        public long b;
        public njg0.a c;
    }

    public static final class b {
        public final androidx.media3.common.a a;
        public final nef.b b;

        public b(androidx.media3.common.a aVar, nef.b bVar) {
            this.a = aVar;
            this.b = bVar;
        }
    }

    public interface c {
        void t();
    }

    public ps60(tf tfVar, nef nefVar, mef.a aVar) {
        this.d = nefVar;
        this.e = aVar;
        this.a = new ns60(tfVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0122, B:110:0x0193, B:112:0x019c, B:89:0x013b, B:91:0x0144, B:93:0x0149, B:95:0x015b, B:99:0x0164, B:100:0x0169, B:102:0x016f, B:106:0x017d, B:108:0x0182, B:109:0x0190, B:92:0x0147), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x017a  */
    /* JADX WARN: Code duplicated, block: B:105:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0182 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0122, B:110:0x0193, B:112:0x019c, B:89:0x013b, B:91:0x0144, B:93:0x0149, B:95:0x015b, B:99:0x0164, B:100:0x0169, B:102:0x016f, B:106:0x017d, B:108:0x0182, B:109:0x0190, B:92:0x0147), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:89:0x013b A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0122, B:110:0x0193, B:112:0x019c, B:89:0x013b, B:91:0x0144, B:93:0x0149, B:95:0x015b, B:99:0x0164, B:100:0x0169, B:102:0x016f, B:106:0x017d, B:108:0x0182, B:109:0x0190, B:92:0x0147), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0144 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0122, B:110:0x0193, B:112:0x019c, B:89:0x013b, B:91:0x0144, B:93:0x0149, B:95:0x015b, B:99:0x0164, B:100:0x0169, B:102:0x016f, B:106:0x017d, B:108:0x0182, B:109:0x0190, B:92:0x0147), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0147 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0122, B:110:0x0193, B:112:0x019c, B:89:0x013b, B:91:0x0144, B:93:0x0149, B:95:0x015b, B:99:0x0164, B:100:0x0169, B:102:0x016f, B:106:0x017d, B:108:0x0182, B:109:0x0190, B:92:0x0147), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x015b A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0122, B:110:0x0193, B:112:0x019c, B:89:0x013b, B:91:0x0144, B:93:0x0149, B:95:0x015b, B:99:0x0164, B:100:0x0169, B:102:0x016f, B:106:0x017d, B:108:0x0182, B:109:0x0190, B:92:0x0147), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x0163  */
    @Override // defpackage.njg0
    public void a(long j, int i, int i2, int i3, njg0.a aVar) {
        int i4;
        sxa sxaVar;
        bsa0<b> bsa0Var;
        int i5;
        SparseArray<b> sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.z) {
            androidx.media3.common.a aVar2 = this.A;
            ly0.g(aVar2);
            d(aVar2);
        }
        int i6 = i & 1;
        boolean z4 = i6 != 0;
        if (this.x) {
            if (!z4) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = j + this.F;
        if (!this.D) {
            i4 = i;
        } else {
            if (j2 < this.t) {
                return;
            }
            if (i6 == 0) {
                if (!this.E) {
                    cft.g("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.G) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z3 = j2 > this.u;
                } else {
                    synchronized (this) {
                        long jMax = Math.max(this.u, m(this.s));
                        if (jMax >= j2) {
                            z3 = false;
                        } else {
                            int i7 = this.p;
                            int iO = o(i7 - 1);
                            while (i7 > this.s && this.n[iO] >= j2) {
                                i7--;
                                iO--;
                                if (iO == -1) {
                                    iO = this.i - 1;
                                }
                            }
                            j(this.q + i7);
                            z3 = true;
                        }
                    }
                }
            }
            if (!z3) {
                return;
            } else {
                this.G = false;
            }
        }
        long j3 = (this.a.f - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i8 = this.p;
                if (i8 > 0) {
                    int iO2 = o(i8 - 1);
                    ly0.b(this.k[iO2] + ((long) this.l[iO2]) <= j3);
                }
                this.w = (536870912 & i4) != 0;
                this.v = Math.max(this.v, j2);
                int iO3 = o(this.p);
                this.n[iO3] = j2;
                this.k[iO3] = j3;
                this.l[iO3] = i2;
                this.m[iO3] = i4;
                this.o[iO3] = aVar;
                this.j[iO3] = this.C;
                if (this.c.b.size() == 0) {
                    androidx.media3.common.a aVar3 = this.B;
                    aVar3.getClass();
                    if (this.d != null) {
                        sxaVar = nef.b.a;
                    } else {
                        sxaVar = nef.b.a;
                    }
                    bsa0Var = this.c;
                    i5 = this.q + this.p;
                    b bVar = new b(aVar3, sxaVar);
                    sparseArray = bsa0Var.b;
                    if (bsa0Var.a == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ly0.f(z2);
                        bsa0Var.a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i5 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ly0.b(z);
                        if (iKeyAt == i5) {
                            bsa0Var.c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, bVar);
                } else {
                    SparseArray<b> sparseArray2 = this.c.b;
                    if (!sparseArray2.valueAt(sparseArray2.size() - 1).a.equals(this.B)) {
                        androidx.media3.common.a aVar4 = this.B;
                        aVar4.getClass();
                        if (this.d != null) {
                            sxaVar = nef.b.a;
                        } else {
                            sxaVar = nef.b.a;
                        }
                        bsa0Var = this.c;
                        i5 = this.q + this.p;
                        b bVar2 = new b(aVar4, sxaVar);
                        sparseArray = bsa0Var.b;
                        if (bsa0Var.a == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ly0.f(z2);
                            bsa0Var.a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i5 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ly0.b(z);
                            if (iKeyAt == i5) {
                                bsa0Var.c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i5, bVar2);
                    }
                }
                int i9 = this.p + 1;
                this.p = i9;
                int i10 = this.i;
                if (i9 == i10) {
                    int i11 = i10 + 1000;
                    long[] jArr = new long[i11];
                    long[] jArr2 = new long[i11];
                    long[] jArr3 = new long[i11];
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    njg0.a[] aVarArr = new njg0.a[i11];
                    int i12 = this.r;
                    int i13 = i10 - i12;
                    System.arraycopy(this.k, i12, jArr2, 0, i13);
                    System.arraycopy(this.n, this.r, jArr3, 0, i13);
                    System.arraycopy(this.m, this.r, iArr, 0, i13);
                    System.arraycopy(this.l, this.r, iArr2, 0, i13);
                    System.arraycopy(this.o, this.r, aVarArr, 0, i13);
                    System.arraycopy(this.j, this.r, jArr, 0, i13);
                    int i14 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i13, i14);
                    System.arraycopy(this.n, 0, jArr3, i13, i14);
                    System.arraycopy(this.m, 0, iArr, i13, i14);
                    System.arraycopy(this.l, 0, iArr2, i13, i14);
                    System.arraycopy(this.o, 0, aVarArr, i13, i14);
                    System.arraycopy(this.j, 0, jArr, i13, i14);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = aVarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i11;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.njg0
    public final void b(nsz nszVar, int i, int i2) {
        while (i > 0) {
            ns60 ns60Var = this.a;
            int iC = ns60Var.c(i);
            ns60.a aVar = ns60Var.e;
            bw bwVar = aVar.c;
            nszVar.h(bwVar.a, ((int) (ns60Var.f - aVar.a)) + bwVar.b, iC);
            i -= iC;
            long j = ns60Var.f + ((long) iC);
            ns60Var.f = j;
            ns60.a aVar2 = ns60Var.e;
            if (j == aVar2.b) {
                ns60Var.e = aVar2.d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0026, B:15:0x003d, B:19:0x0055, B:18:0x0053), top: B:29:0x000a }] */
    @Override // defpackage.njg0
    public final void d(androidx.media3.common.a aVar) {
        androidx.media3.common.a aVarL = l(aVar);
        boolean z = false;
        this.z = false;
        this.A = aVar;
        synchronized (this) {
            try {
                this.y = false;
                if (!Objects.equals(aVarL, this.B)) {
                    if (this.c.b.size() == 0) {
                        this.B = aVarL;
                    } else {
                        SparseArray<b> sparseArray = this.c.b;
                        if (sparseArray.valueAt(sparseArray.size() - 1).a.equals(aVarL)) {
                            SparseArray<b> sparseArray2 = this.c.b;
                            aVarL = sparseArray2.valueAt(sparseArray2.size() - 1).a;
                            this.B = aVarL;
                        } else {
                            this.B = aVarL;
                        }
                    }
                    this.D &= gqv.a(aVarL.n, aVarL.k);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.f;
        if (cVar == null || !z) {
            return;
        }
        cVar.t();
    }

    @Override // defpackage.njg0
    public final int e(tpc tpcVar, int i, boolean z) throws EOFException {
        ns60 ns60Var = this.a;
        int iC = ns60Var.c(i);
        ns60.a aVar = ns60Var.e;
        bw bwVar = aVar.c;
        int i2 = tpcVar.read(bwVar.a, ((int) (ns60Var.f - aVar.a)) + bwVar.b, iC);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = ns60Var.f + ((long) i2);
        ns60Var.f = j;
        ns60.a aVar2 = ns60Var.e;
        if (j == aVar2.b) {
            ns60Var.e = aVar2.d;
        }
        return i2;
    }

    public final long g(int i) {
        this.u = Math.max(this.u, m(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        bsa0<b> bsa0Var = this.c;
        SparseArray<b> sparseArray = bsa0Var.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            bsa0Var.c.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = bsa0Var.a;
            if (i8 > 0) {
                bsa0Var.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void h(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        ns60 ns60Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long jG = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z2) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iK = k(z, i2, i, j);
                            if (iK != -1) {
                                jG = g(iK);
                            }
                        }
                    }
                    ns60Var.b(jG);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void i() {
        long jG;
        ns60 ns60Var = this.a;
        synchronized (this) {
            int i = this.p;
            jG = i == 0 ? -1L : g(i);
        }
        ns60Var.b(jG);
    }

    public final long j(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        ly0.b(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, m(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        bsa0<b> bsa0Var = this.c;
        SparseArray<b> sparseArray = bsa0Var.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            bsa0Var.c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        bsa0Var.a = sparseArray.size() > 0 ? Math.min(bsa0Var.a, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        int iO = o(i6 - 1);
        return this.k[iO] + ((long) this.l[iO]);
    }

    public final int k(boolean z, int i, int i2, long j) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public androidx.media3.common.a l(androidx.media3.common.a aVar) {
        if (this.F == 0 || aVar.s == Long.MAX_VALUE) {
            return aVar;
        }
        androidx.media3.common.a.C0062a c0062aA = aVar.a();
        c0062aA.r = aVar.s + this.F;
        return new androidx.media3.common.a(c0062aA);
    }

    public final long m(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iO]);
            if ((this.m[iO] & 1) != 0) {
                return jMax;
            }
            iO--;
            if (iO == -1) {
                iO = this.i - 1;
            }
        }
        return jMax;
    }

    public final int n() {
        return this.q + this.s;
    }

    public final int o(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int p(long j, boolean z) throws Throwable {
        try {
            try {
                int iO = o(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iO]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iK = k(true, iO, i2 - i, j);
                if (iK == -1) {
                    return 0;
                }
                return iK;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized androidx.media3.common.a q() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean r(boolean z) {
        androidx.media3.common.a aVar;
        boolean z2 = false;
        if (this.s != this.p) {
            if (this.c.a(n()).a != this.g) {
                return true;
            }
            return s(o(this.s));
        }
        if (z || this.w || ((aVar = this.B) != null && aVar != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean s(int i) {
        lef lefVar = this.h;
        if (lefVar == null || lefVar.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.g();
    }

    public final void t(androidx.media3.common.a aVar, yti ytiVar) {
        androidx.media3.common.a aVar2;
        androidx.media3.common.a aVar3 = this.g;
        boolean z = aVar3 == null;
        DrmInitData drmInitData = aVar3 == null ? null : aVar3.r;
        this.g = aVar;
        DrmInitData drmInitData2 = aVar.r;
        nef nefVar = this.d;
        if (nefVar != null) {
            int iG = nefVar.g(aVar);
            androidx.media3.common.a.C0062a c0062aA = aVar.a();
            c0062aA.N = iG;
            aVar2 = new androidx.media3.common.a(c0062aA);
        } else {
            aVar2 = aVar;
        }
        ytiVar.b = aVar2;
        ytiVar.a = this.h;
        if (nefVar == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            lef lefVar = this.h;
            mef.a aVar4 = this.e;
            lef lefVarF = nefVar.f(aVar4, aVar);
            this.h = lefVarF;
            ytiVar.a = lefVarF;
            if (lefVar != null) {
                lefVar.i(aVar4);
            }
        }
    }

    public final synchronized long u() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[o(this.s)] : this.C;
    }

    public final int v(yti ytiVar, g5d g5dVar, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        a aVar = this.b;
        synchronized (this) {
            try {
                g5dVar.e = false;
                i2 = -3;
                if (this.s != this.p) {
                    androidx.media3.common.a aVar2 = this.c.a(n()).a;
                    if (z2 || aVar2 != this.g) {
                        t(aVar2, ytiVar);
                        i2 = -5;
                    } else {
                        int iO = o(this.s);
                        if (s(iO)) {
                            g5dVar.a = this.m[iO];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                g5dVar.e(536870912);
                            }
                            g5dVar.f = this.n[iO];
                            aVar.a = this.l[iO];
                            aVar.b = this.k[iO];
                            aVar.c = this.o[iO];
                            i2 = -4;
                        } else {
                            g5dVar.e = true;
                        }
                    }
                } else if (z || this.w) {
                    g5dVar.a = 4;
                    g5dVar.f = Long.MIN_VALUE;
                    i2 = -4;
                } else {
                    androidx.media3.common.a aVar3 = this.B;
                    if (aVar3 != null && (z2 || aVar3 != this.g)) {
                        t(aVar3, ytiVar);
                        i2 = -5;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !g5dVar.i(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                ns60 ns60Var = this.a;
                a aVar4 = this.b;
                if (z3) {
                    ns60.f(ns60Var.d, g5dVar, aVar4, ns60Var.b);
                } else {
                    ns60Var.d = ns60.f(ns60Var.d, g5dVar, aVar4, ns60Var.b);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void w(boolean z) {
        ns60 ns60Var = this.a;
        ns60Var.a(ns60Var.c);
        ns60.a aVar = ns60Var.c;
        ly0.f(aVar.c == null);
        aVar.a = 0L;
        aVar.b = 65536L;
        ns60.a aVar2 = ns60Var.c;
        ns60Var.d = aVar2;
        ns60Var.e = aVar2;
        ns60Var.f = 0L;
        ns60Var.a.d();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        bsa0<b> bsa0Var = this.c;
        SparseArray<b> sparseArray = bsa0Var.b;
        for (int i = 0; i < sparseArray.size(); i++) {
            bsa0Var.c.accept(sparseArray.valueAt(i));
        }
        bsa0Var.a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean x(int i) {
        synchronized (this) {
            this.s = 0;
            ns60 ns60Var = this.a;
            ns60Var.d = ns60Var.c;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean y(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            r11.s = r0     // Catch: java.lang.Throwable -> L7c
            ns60 r1 = r11.a     // Catch: java.lang.Throwable -> L7c
            ns60$a r2 = r1.c     // Catch: java.lang.Throwable -> L7c
            r1.d = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L79
            int r5 = r11.o(r0)     // Catch: java.lang.Throwable -> L6f
            int r1 = r11.s     // Catch: java.lang.Throwable -> L74
            int r2 = r11.p     // Catch: java.lang.Throwable -> L74
            r9 = 1
            if (r1 == r2) goto L19
            r3 = r9
            goto L1a
        L19:
            r3 = r0
        L1a:
            if (r3 == 0) goto L2c
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L6f
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 < 0) goto L2c
            long r3 = r11.v     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            if (r14 != 0) goto L2e
        L2c:
            r3 = r11
            goto L72
        L2e:
            boolean r3 = r11.D     // Catch: java.lang.Throwable -> L6f
            r10 = -1
            if (r3 == 0) goto L56
            int r2 = r2 - r1
            r1 = r0
        L35:
            if (r1 >= r2) goto L4f
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L4b
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L4b
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 < 0) goto L41
            r2 = r1
            goto L53
        L41:
            int r5 = r5 + 1
            int r3 = r11.i     // Catch: java.lang.Throwable -> L4b
            if (r5 != r3) goto L48
            r5 = r0
        L48:
            int r1 = r1 + 1
            goto L35
        L4b:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L85
        L4f:
            if (r14 == 0) goto L52
            goto L53
        L52:
            r2 = r10
        L53:
            r3 = r11
            r7 = r12
            goto L5f
        L56:
            int r6 = r2 - r1
            r4 = 1
            r3 = r11
            r7 = r12
            int r2 = r3.k(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6c
        L5f:
            if (r2 != r10) goto L63
            monitor-exit(r3)
            return r0
        L63:
            r3.t = r7     // Catch: java.lang.Throwable -> L6c
            int r11 = r3.s     // Catch: java.lang.Throwable -> L6c
            int r11 = r11 + r2
            r3.s = r11     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r3)
            return r9
        L6c:
            r0 = move-exception
        L6d:
            r12 = r0
            goto L85
        L6f:
            r0 = move-exception
            r3 = r11
            goto L6d
        L72:
            monitor-exit(r3)
            return r0
        L74:
            r0 = move-exception
            r3 = r11
        L76:
            r11 = r0
            r12 = r11
            goto L85
        L79:
            r0 = move-exception
            r3 = r11
            goto L76
        L7c:
            r0 = move-exception
            r3 = r11
        L7e:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            goto L76
        L83:
            r0 = move-exception
            goto L7e
        L85:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps60.y(long, boolean):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void z(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        ly0.b(z);
        this.s += i;
    }
}

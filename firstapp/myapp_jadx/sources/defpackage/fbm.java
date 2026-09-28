package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.g;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class fbm implements nxs.a<mn7>, nxs.e, xc80, m4h, ps60.c {
    public static final Set<Integer> n0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final int A;
    public final lam.b B;
    public final ArrayList<nam> C;
    public final List<nam> D;
    public final cbm E;
    public final dbm F;
    public final Handler G;
    public final ArrayList<abm> H;
    public final Map<String, DrmInitData> I;
    public mn7 J;
    public b[] K;
    public int[] L;
    public final HashSet M;
    public final SparseIntArray N;
    public a O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public androidx.media3.common.a U;
    public androidx.media3.common.a V;
    public boolean W;
    public ljg0 X;
    public Set<jjg0> Y;
    public int[] Z;
    public final String a;
    public int a0;
    public final int b;
    public boolean b0;
    public final qam.a c;
    public boolean[] c0;
    public final lam d;
    public boolean[] d0;
    public final tf e;
    public long e0;
    public final androidx.media3.common.a f;
    public long f0;
    public boolean g0;
    public boolean h0;
    public final nef i;
    public boolean i0;
    public boolean j0;
    public long k0;
    public DrmInitData l0;
    public nam m0;
    public final mef.a v;
    public final sws w;
    public final nxs y = new nxs("Loader:HlsSampleStreamWrapper");
    public final mkv.a z;

    public static class a implements njg0 {
        public static final androidx.media3.common.a f;
        public static final androidx.media3.common.a g;
        public final njg0 a;
        public final androidx.media3.common.a b;
        public androidx.media3.common.a c;
        public byte[] d;
        public int e;

        static {
            androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
            c0062a.m = gqv.m("application/id3");
            f = new androidx.media3.common.a(c0062a);
            androidx.media3.common.a.C0062a c0062a2 = new androidx.media3.common.a.C0062a();
            c0062a2.m = gqv.m("application/x-emsg");
            g = new androidx.media3.common.a(c0062a2);
        }

        public a(njg0 njg0Var, int i) {
            this.a = njg0Var;
            if (i == 1) {
                this.b = f;
            } else {
                if (i != 3) {
                    hb5.a(hce0.a(i, "Unknown metadataType: "));
                    throw null;
                }
                this.b = g;
            }
            this.d = new byte[0];
            this.e = 0;
        }

        @Override // defpackage.njg0
        public final void a(long j, int i, int i2, int i3, njg0.a aVar) {
            this.c.getClass();
            int i4 = this.e - i3;
            nsz nszVar = new nsz(Arrays.copyOfRange(this.d, i4 - i2, i4));
            byte[] bArr = this.d;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.e = i3;
            String str = this.c.n;
            androidx.media3.common.a aVar2 = this.b;
            String str2 = aVar2.n;
            String str3 = aVar2.n;
            if (!Objects.equals(str, str2)) {
                if (!"application/x-emsg".equals(this.c.n)) {
                    cft.g("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.n);
                    return;
                }
                xpg xpgVarW = ypg.w(nszVar);
                androidx.media3.common.a aVarA = xpgVarW.a();
                if (aVarA == null || !Objects.equals(str3, aVarA.n)) {
                    cft.g("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + xpgVarW.a());
                    return;
                }
                byte[] bArrC = xpgVarW.c();
                bArrC.getClass();
                nszVar = new nsz(bArrC);
            }
            int iA = nszVar.a();
            njg0 njg0Var = this.a;
            njg0Var.f(iA, nszVar);
            njg0Var.a(j, i, iA, 0, aVar);
        }

        @Override // defpackage.njg0
        public final void b(nsz nszVar, int i, int i2) {
            int i3 = this.e + i;
            byte[] bArrCopyOf = this.d;
            if (bArrCopyOf.length < i3) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i3 / 2) + i3);
                this.d = bArrCopyOf;
            }
            nszVar.h(bArrCopyOf, this.e, i);
            this.e += i;
        }

        @Override // defpackage.njg0
        public final void d(androidx.media3.common.a aVar) {
            this.c = aVar;
            this.a.d(this.b);
        }

        @Override // defpackage.njg0
        public final int e(tpc tpcVar, int i, boolean z) throws EOFException {
            int i2 = this.e + i;
            byte[] bArrCopyOf = this.d;
            if (bArrCopyOf.length < i2) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i2 / 2) + i2);
                this.d = bArrCopyOf;
            }
            int i3 = tpcVar.read(bArrCopyOf, this.e, i);
            if (i3 != -1) {
                this.e += i3;
                return i3;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
    }

    public static final class b extends ps60 {
        public final Map<String, DrmInitData> H;
        public DrmInitData I;

        public b(tf tfVar, nef nefVar, mef.a aVar, Map<String, DrmInitData> map) {
            super(tfVar, nefVar, aVar);
            this.H = map;
        }

        @Override // defpackage.ps60
        public final androidx.media3.common.a l(androidx.media3.common.a aVar) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = aVar.r;
            }
            if (drmInitData2 != null && (drmInitData = this.H.get(drmInitData2.c)) != null) {
                drmInitData2 = drmInitData;
            }
            uov uovVar = aVar.l;
            uov uovVar2 = null;
            if (uovVar == null) {
                uovVar = uovVar2;
            } else {
                uov.a[] aVarArr = uovVar.a;
                int length = aVarArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    uov.a aVar2 = aVarArr[i2];
                    if ((aVar2 instanceof rw20) && "com.apple.streaming.transportStreamTimestamp".equals(((rw20) aVar2).b)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (length != 1) {
                        uov.a[] aVarArr2 = new uov.a[length - 1];
                        while (i < length) {
                            if (i != i2) {
                                aVarArr2[i < i2 ? i : i - 1] = aVarArr[i];
                            }
                            i++;
                        }
                        uovVar2 = new uov(aVarArr2);
                    }
                    uovVar = uovVar2;
                }
            }
            if (drmInitData2 != aVar.r || uovVar != aVar.l) {
                androidx.media3.common.a.C0062a c0062aA = aVar.a();
                c0062aA.q = drmInitData2;
                c0062aA.k = uovVar;
                aVar = new androidx.media3.common.a(c0062aA);
            }
            return super.l(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [cbm] */
    /* JADX WARN: Type inference failed for: r1v13, types: [dbm] */
    public fbm(String str, int i, qam.a aVar, lam lamVar, Map map, tf tfVar, long j, androidx.media3.common.a aVar2, nef nefVar, mef.a aVar3, sws swsVar, mkv.a aVar4, int i2) {
        this.a = str;
        this.b = i;
        this.c = aVar;
        this.d = lamVar;
        this.I = map;
        this.e = tfVar;
        this.f = aVar2;
        this.i = nefVar;
        this.v = aVar3;
        this.w = swsVar;
        this.z = aVar4;
        this.A = i2;
        lam.b bVar = new lam.b();
        bVar.a = null;
        bVar.b = false;
        bVar.c = null;
        this.B = bVar;
        this.L = new int[0];
        Set<Integer> set = n0;
        this.M = new HashSet(set.size());
        this.N = new SparseIntArray(set.size());
        this.K = new b[0];
        this.d0 = new boolean[0];
        this.c0 = new boolean[0];
        ArrayList<nam> arrayList = new ArrayList<>();
        this.C = arrayList;
        this.D = Collections.unmodifiableList(arrayList);
        this.H = new ArrayList<>();
        this.E = new Runnable() { // from class: cbm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F();
            }
        };
        this.F = new Runnable() { // from class: dbm
            @Override // java.lang.Runnable
            public final void run() {
                fbm fbmVar = this.a;
                fbmVar.R = true;
                fbmVar.F();
            }
        };
        this.G = jrh0.p(null);
        this.e0 = j;
        this.f0 = j;
    }

    public static androidx.media3.common.a A(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, boolean z) {
        String strB;
        if (aVar == null) {
            return aVar2;
        }
        String str = aVar.k;
        String strD = aVar2.n;
        int iH = gqv.h(strD);
        if (jrh0.u(iH, str) == 1) {
            strB = jrh0.v(iH, str);
            strD = gqv.d(strB);
        } else {
            strB = gqv.b(str, strD);
        }
        androidx.media3.common.a.C0062a c0062aA = aVar2.a();
        c0062aA.a = aVar.a;
        c0062aA.b = aVar.b;
        c0062aA.c = pcn.j(aVar.c);
        c0062aA.d = aVar.d;
        c0062aA.e = aVar.e;
        c0062aA.f = aVar.f;
        c0062aA.h = z ? aVar.h : -1;
        c0062aA.i = z ? aVar.i : -1;
        c0062aA.j = strB;
        if (iH == 2) {
            c0062aA.t = aVar.u;
            c0062aA.u = aVar.v;
            c0062aA.x = aVar.y;
        }
        if (strD != null) {
            c0062aA.m = gqv.m(strD);
        }
        int i = aVar.F;
        if (i != -1 && iH == 1) {
            c0062aA.E = i;
        }
        uov uovVarB = aVar.l;
        if (uovVarB != null) {
            uov uovVar = aVar2.l;
            if (uovVar != null) {
                uovVarB = uovVar.b(uovVarB);
            }
            c0062aA.k = uovVarB;
        }
        return new androidx.media3.common.a(c0062aA);
    }

    public static int D(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static dre y(int i, int i2) {
        cft.g("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new dre();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    public final void B(int i) {
        ArrayList<nam> arrayList;
        ns60.a aVar;
        ly0.f(!this.y.b());
        int i2 = i;
        while (true) {
            arrayList = this.C;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (x(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j = C().h;
        nam namVar = arrayList.get(i2);
        int size = arrayList.size();
        String str = jrh0.a;
        if (i2 < 0 || size > arrayList.size() || i2 > size) {
            d580.a();
            return;
        }
        if (i2 != size) {
            arrayList.subList(i2, size).clear();
        }
        for (int i3 = 0; i3 < this.K.length; i3++) {
            int iE = namVar.e(i3);
            b bVar = this.K[i3];
            ns60 ns60Var = bVar.a;
            long j2 = bVar.j(iE);
            ly0.b(j2 <= ns60Var.f);
            ns60Var.f = j2;
            if (j2 != 0) {
                ns60.a aVar2 = ns60Var.c;
                if (j2 == aVar2.a) {
                    ns60Var.a(ns60Var.c);
                    ns60.a aVar3 = new ns60.a(ns60Var.f);
                    ns60Var.c = aVar3;
                    ns60Var.d = aVar3;
                    ns60Var.e = aVar3;
                } else {
                    while (true) {
                        long j3 = ns60Var.f;
                        long j4 = aVar2.b;
                        aVar = aVar2.d;
                        if (j3 <= j4) {
                            break;
                        } else {
                            aVar2 = aVar;
                        }
                    }
                    aVar.getClass();
                    ns60Var.a(aVar);
                    ns60.a aVar4 = new ns60.a(aVar2.b);
                    aVar2.d = aVar4;
                    if (ns60Var.f == aVar2.b) {
                        aVar2 = aVar4;
                    }
                    ns60Var.e = aVar2;
                    if (ns60Var.d == aVar) {
                        ns60Var.d = aVar4;
                    }
                }
            } else {
                ns60Var.a(ns60Var.c);
                ns60.a aVar5 = new ns60.a(ns60Var.f);
                ns60Var.c = aVar5;
                ns60Var.d = aVar5;
                ns60Var.e = aVar5;
            }
        }
        if (arrayList.isEmpty()) {
            this.f0 = this.e0;
        } else {
            ((nam) t3p.a(arrayList)).J = true;
        }
        this.i0 = false;
        pjv pjvVar = new pjv(1, this.P, null, 3, null, jrh0.Z(namVar.g), jrh0.Z(j));
        mkv.a aVar6 = this.z;
        ekv.b bVar2 = aVar6.b;
        bVar2.getClass();
        aVar6.a(new kkv(aVar6, bVar2, pjvVar));
    }

    public final nam C() {
        return (nam) rh6.a(1, this.C);
    }

    public final boolean E() {
        return this.f0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        if (!this.W && this.Z == null && this.R) {
            int i2 = 0;
            for (b bVar : this.K) {
                if (bVar.q() == null) {
                    return;
                }
            }
            ljg0 ljg0Var = this.X;
            if (ljg0Var != null) {
                int i3 = ljg0Var.a;
                int[] iArr = new int[i3];
                this.Z = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        b[] bVarArr = this.K;
                        if (i5 >= bVarArr.length) {
                            break;
                        }
                        androidx.media3.common.a aVarQ = bVarArr[i5].q();
                        ly0.g(aVarQ);
                        androidx.media3.common.a aVar = this.X.a(i4).d[0];
                        String str = aVarQ.n;
                        String str2 = aVar.n;
                        int iH = gqv.h(str);
                        if (iH != 3) {
                            if (iH == gqv.h(str2)) {
                                this.Z[i4] = i5;
                                break;
                            }
                            i5++;
                        } else {
                            if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || aVarQ.K == aVar.K)) {
                                this.Z[i4] = i5;
                                break;
                                break;
                            }
                            i5++;
                        }
                    }
                }
                ArrayList<abm> arrayList = this.H;
                int size = arrayList.size();
                while (i2 < size) {
                    abm abmVar = arrayList.get(i2);
                    i2++;
                    abmVar.d();
                }
                return;
            }
            int length = this.K.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                androidx.media3.common.a aVarQ2 = this.K[i6].q();
                ly0.g(aVarQ2);
                String str3 = aVarQ2.n;
                if (gqv.l(str3)) {
                    i9 = 2;
                } else if (!gqv.i(str3)) {
                    i9 = gqv.k(str3) ? 3 : -2;
                }
                if (D(i9) > D(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            jjg0 jjg0Var = this.d.h;
            int i10 = jjg0Var.a;
            this.a0 = -1;
            this.Z = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.Z[i11] = i11;
            }
            jjg0[] jjg0VarArr = new jjg0[length];
            int i12 = 0;
            while (i12 < length) {
                androidx.media3.common.a aVarQ3 = this.K[i12].q();
                ly0.g(aVarQ3);
                String str4 = this.a;
                androidx.media3.common.a aVar2 = this.f;
                if (i12 == i7) {
                    androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        androidx.media3.common.a aVarD = jjg0Var.d[i13];
                        if (i8 == 1 && aVar2 != null) {
                            aVarD = aVarD.d(aVar2);
                        }
                        aVarArr[i13] = i10 == 1 ? aVarQ3.d(aVarD) : A(aVarD, aVarQ3, true);
                    }
                    jjg0VarArr[i12] = new jjg0(str4, aVarArr);
                    this.a0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !gqv.i(aVarQ3.n)) {
                        aVar2 = null;
                    }
                    StringBuilder sbB = mq0.b(str4, ":muxed:");
                    sbB.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    jjg0VarArr[i12] = new jjg0(sbB.toString(), A(aVar2, aVarQ3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.X = z(jjg0VarArr);
            ly0.f(this.Y == null ? 1 : i14);
            this.Y = Collections.EMPTY_SET;
            this.S = true;
            this.c.a();
        }
    }

    public final void G() {
        nxs nxsVar = this.y;
        IOException iOException = nxsVar.c;
        if (iOException != null) {
            throw iOException;
        }
        nxs.c<? extends nxs.d> cVar = nxsVar.b;
        if (cVar != null) {
            int i = cVar.a;
            IOException iOException2 = cVar.e;
            if (iOException2 != null && cVar.f > i) {
                throw iOException2;
            }
        }
        lam lamVar = this.d;
        ae2 ae2Var = lamVar.n;
        if (ae2Var != null) {
            throw ae2Var;
        }
        Uri uri = lamVar.o;
        if (uri == null || !uri.equals(lamVar.p)) {
            return;
        }
        lamVar.g.f(lamVar.o);
    }

    public final void H(jjg0[] jjg0VarArr, int... iArr) {
        this.X = z(jjg0VarArr);
        this.Y = new HashSet();
        for (int i : iArr) {
            this.Y.add(this.X.a(i));
        }
        this.a0 = 0;
        final qam.a aVar = this.c;
        this.G.post(new Runnable() { // from class: ebm
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a();
            }
        });
        this.S = true;
    }

    public final void I() {
        for (b bVar : this.K) {
            bVar.w(this.g0);
        }
        this.g0 = false;
    }

    public final boolean J(long j, boolean z) {
        nam namVar;
        boolean zY;
        this.e0 = j;
        if (E()) {
            this.f0 = j;
            return true;
        }
        boolean z2 = this.d.q;
        ArrayList<nam> arrayList = this.C;
        if (!z2) {
            namVar = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                namVar = null;
                break;
            }
            namVar = arrayList.get(i);
            if (namVar.g == j) {
                break;
            }
            i++;
        }
        if (this.R && !z && !arrayList.isEmpty()) {
            int length = this.K.length;
            for (int i2 = 0; i2 < length; i2++) {
                b bVar = this.K[i2];
                if (namVar != null) {
                    zY = bVar.x(namVar.e(i2));
                } else {
                    long jD = d();
                    zY = bVar.y(j, jD == Long.MIN_VALUE || j < jD);
                }
                if (zY || (!this.d0[i2] && this.b0)) {
                }
            }
            return false;
        }
        this.f0 = j;
        this.i0 = false;
        arrayList.clear();
        nxs nxsVar = this.y;
        if (!nxsVar.b()) {
            nxsVar.c = null;
            I();
            return true;
        }
        if (this.R) {
            for (b bVar2 : this.K) {
                bVar2.i();
            }
        }
        nxsVar.a();
        return true;
    }

    @Override // defpackage.xc80
    public final boolean a() {
        return this.y.b();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:102:0x021a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0220  */
    /* JADX WARN: Code duplicated, block: B:106:0x0224  */
    /* JADX WARN: Code duplicated, block: B:107:0x022c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0254  */
    /* JADX WARN: Code duplicated, block: B:122:0x0276  */
    /* JADX WARN: Code duplicated, block: B:126:0x0282  */
    /* JADX WARN: Code duplicated, block: B:128:0x0286  */
    /* JADX WARN: Code duplicated, block: B:130:0x0289  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x029e  */
    /* JADX WARN: Code duplicated, block: B:143:0x02af  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x0306  */
    /* JADX WARN: Code duplicated, block: B:167:0x0308  */
    /* JADX WARN: Code duplicated, block: B:170:0x032b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0330  */
    /* JADX WARN: Code duplicated, block: B:174:0x034a  */
    /* JADX WARN: Code duplicated, block: B:175:0x034d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0351  */
    /* JADX WARN: Code duplicated, block: B:178:0x035b  */
    /* JADX WARN: Code duplicated, block: B:180:0x035e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0369  */
    /* JADX WARN: Code duplicated, block: B:184:0x036f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0371  */
    /* JADX WARN: Code duplicated, block: B:186:0x0373  */
    /* JADX WARN: Code duplicated, block: B:188:0x0376  */
    /* JADX WARN: Code duplicated, block: B:189:0x0380  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:195:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:198:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:211:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:214:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:217:0x0402 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x040f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0417  */
    /* JADX WARN: Code duplicated, block: B:229:0x0443  */
    /* JADX WARN: Code duplicated, block: B:233:0x0475  */
    /* JADX WARN: Code duplicated, block: B:235:0x047f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0484 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x0486  */
    /* JADX WARN: Code duplicated, block: B:240:0x049a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x049e  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:245:0x04ab A[EDGE_INSN: B:245:0x04ab->B:264:0x04fb BREAK  A[LOOP:3: B:255:0x04d4->B:263:0x04f6], PHI: r32
      0x04ab: PHI (r32v6 java.util.ArrayList<nam>) = 
      (r32v3 java.util.ArrayList<nam>)
      (r32v3 java.util.ArrayList<nam>)
      (r32v3 java.util.ArrayList<nam>)
      (r32v4 java.util.ArrayList<nam>)
     binds: [B:244:0x04a9, B:251:0x04c8, B:253:0x04cc, B:286:0x04ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:246:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:248:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:249:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:266:0x0518 A[LOOP:1: B:265:0x0516->B:266:0x0518, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x0537  */
    /* JADX WARN: Code duplicated, block: B:271:0x0545  */
    /* JADX WARN: Code duplicated, block: B:283:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0161  */
    /* JADX WARN: Code duplicated, block: B:77:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x019f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        long jMax;
        long j;
        long j2;
        long j3;
        List<nam> list;
        long j4;
        List<nam> list2;
        long jMax2;
        long j5;
        Uri[] uriArr;
        ddd dddVar;
        long j6;
        long jMax3;
        long j7;
        nam namVar;
        Uri[] uriArr2;
        ddd dddVar2;
        ArrayList<nam> arrayList;
        int iQ;
        boolean z;
        Uri uri;
        ram ramVarB;
        long j8;
        long j9;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        int i;
        ram ramVar;
        lam.e eVarD;
        String str;
        boolean z2;
        long j10;
        lam.e eVarD2;
        lam.b bVar;
        boolean z3;
        ram.f fVar;
        ram.e eVar;
        long j11;
        Uri uriD;
        lam.a aVarE;
        String str2;
        Uri uriD2;
        lam.a aVarE2;
        boolean z4;
        boolean z5;
        zpc zpcVar;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i2;
        boolean z6;
        byte[] bArrD;
        zpc anVar;
        ram.e eVar2;
        gqc gqcVar;
        zpc zpcVar2;
        boolean z7;
        int i3;
        p6n p6nVar;
        nsz nszVar;
        oam oamVar;
        SparseArray sparseArray;
        zxf0 zxf0Var;
        gqc gqcVar2;
        boolean z8;
        boolean z9;
        oam oamVar2;
        boolean z10;
        byte[] bArrD2;
        zpc anVar2;
        String str3;
        boolean z11;
        mn7 mn7Var;
        Uri uri2;
        nam namVar2;
        ArrayList<nam> arrayList2;
        pcn.a aVar;
        int i4;
        int i5;
        ArrayList<nam> arrayList3 = this.C;
        lam.b bVar2 = this.B;
        nxs nxsVar = this.y;
        if (this.i0 || nxsVar.b()) {
            return false;
        }
        if (nxsVar.c != null) {
            return false;
        }
        long j12 = -9223372036854775807L;
        if (E()) {
            List<nam> list3 = Collections.EMPTY_LIST;
            long j13 = this.f0;
            for (b bVar3 : this.K) {
                bVar3.t = this.f0;
            }
            list = list3;
            j = -9223372036854775807L;
            j2 = j13;
            j3 = j2;
        } else {
            List<nam> list4 = this.D;
            nam namVarC = C();
            boolean z12 = namVarC.H;
            long j14 = namVarC.g;
            if (z12 && namVarC.f()) {
                long j15 = namVarC.K;
                jMax = j15 != -9223372036854775807L ? j14 + j15 : -9223372036854775807L;
            } else {
                jMax = Math.max(this.e0, j14);
            }
            long jMax4 = this.e0;
            if (this.R) {
                b[] bVarArr = this.K;
                int length = bVarArr.length;
                int i6 = 0;
                while (i6 < length) {
                    b bVar4 = bVarArr[i6];
                    synchronized (bVar4) {
                        j4 = j12;
                        list2 = list4;
                        jMax2 = Math.max(bVar4.u, bVar4.m(bVar4.s));
                    }
                    jMax4 = Math.max(jMax4, jMax2);
                    i6++;
                    j12 = j4;
                    list4 = list2;
                }
            }
            j = j12;
            j2 = jMax;
            j3 = jMax4;
            list = list4;
        }
        bVar2.a = null;
        bVar2.b = false;
        bVar2.c = null;
        lam lamVar = this.d;
        boolean z13 = this.S || !list.isEmpty();
        w8j w8jVar = lamVar.j;
        Uri[] uriArr3 = lamVar.e;
        ddd dddVar3 = lamVar.g;
        nam namVar3 = list.isEmpty() ? null : (nam) t3p.a(list);
        int iA = namVar3 == null ? -1 : lamVar.h.a(namVar3.d);
        List<nam> list5 = list;
        long j16 = gVar.a;
        long jMax5 = j2 - j16;
        int i7 = iA;
        long j17 = lamVar.s;
        long j18 = j17 != j ? j17 - j16 : j;
        if (namVar3 != null && !lamVar.q) {
            j5 = j18;
            long j19 = namVar3.h - namVar3.g;
            uriArr = uriArr3;
            dddVar = dddVar3;
            jMax5 = Math.max(0L, jMax5 - j19);
            if (j5 != j) {
                jMax3 = Math.max(0L, j5 - j19);
                j6 = jMax5;
            }
            j7 = j2;
            namVar = namVar3;
            uriArr2 = uriArr;
            dddVar2 = dddVar;
            arrayList = arrayList3;
            lamVar.r.l(j16, j6, jMax3, list5, lamVar.a(namVar3, j2));
            iQ = lamVar.r.q();
            if (i7 != iQ) {
                z = true;
            } else {
                z = false;
            }
            uri = uriArr2[iQ];
            if (dddVar2.d(uri)) {
                ramVarB = dddVar2.b(true, uri);
                ramVarB.getClass();
                lamVar.q = ramVarB.c;
                if (ramVarB.o) {
                    j8 = j;
                } else {
                    j8 = (ramVarB.h + ramVarB.u) - dddVar2.C;
                }
                lamVar.s = j8;
                j9 = ramVarB.h - dddVar2.C;
                Pair<Long, Integer> pairC = lamVar.c(namVar, z, ramVarB, j9, j7);
                jLongValue = ((Long) pairC.first).longValue();
                iIntValue = ((Integer) pairC.second).intValue();
                if (z || namVar == null || (jLongValue >= ramVarB.k && ((eVarD = lam.d(ramVarB, jLongValue, iIntValue)) == null || j9 + eVarD.a.e >= j3))) {
                    iIntValue2 = iIntValue;
                    ramVar = ramVarB;
                    i = iQ;
                } else {
                    uri = uriArr2[i7];
                    ram ramVarB2 = dddVar2.b(true, uri);
                    ramVarB2.getClass();
                    j9 = ramVarB2.h - dddVar2.C;
                    Pair<Long, Integer> pairC2 = lamVar.c(namVar, false, ramVarB2, j9, j7);
                    jLongValue = ((Long) pairC2.first).longValue();
                    iIntValue2 = ((Integer) pairC2.second).intValue();
                    i = i7;
                    ramVar = ramVarB2;
                }
                str = ramVar.a;
                z2 = ramVar.c;
                j10 = ramVar.k;
                pcn pcnVar = ramVar.r;
                if (i != i7 && i7 != -1) {
                    dddVar2.a(uriArr2[i7]);
                }
                if (jLongValue < j10) {
                    lamVar.n = new ae2();
                    bVar = bVar2;
                } else {
                    eVarD2 = lam.d(ramVar, jLongValue, iIntValue2);
                    if (eVarD2 == null) {
                        bVar = bVar2;
                    } else if (ramVar.o) {
                        bVar = bVar2;
                        if (!z13 || pcnVar.isEmpty()) {
                            bVar.b = true;
                        } else {
                            eVarD2 = new lam.e((ram.f) t3p.a(pcnVar), (j10 + ((long) pcnVar.size())) - 1, -1);
                        }
                    } else {
                        bVar = bVar2;
                        bVar.c = uri;
                        r19.p = uri;
                    }
                    z3 = eVarD2.d;
                    fVar = eVarD2.a;
                    r19.p = null;
                    SystemClock.elapsedRealtime();
                    eVar = fVar.b;
                    j11 = fVar.e;
                    if (eVar != null || (str3 = eVar.i) == null) {
                        uriD = null;
                    } else {
                        uriD = pmh0.d(ramVar.a, str3);
                    }
                    aVarE = r19.e(uriD, i, true);
                    bVar.a = aVarE;
                    if (aVarE == null) {
                        str2 = fVar.i;
                        if (str2 == null) {
                            uriD2 = null;
                        } else {
                            uriD2 = pmh0.d(ramVar.a, str2);
                        }
                        aVarE2 = r19.e(uriD2, i, false);
                        bVar.a = aVarE2;
                        if (aVarE2 == null) {
                            if (fVar instanceof ram.c) {
                                z4 = z2;
                            } else if (!((ram.c) fVar).A || (eVarD2.c == 0 && z2)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (namVar == 0) {
                                AtomicInteger atomicInteger = nam.M;
                            } else {
                                if (uri.equals(namVar.m) || !namVar.H) {
                                    z5 = z4 || j9 + j11 < j7;
                                }
                                if (z5 || !z3) {
                                    mam mamVar = r19.a;
                                    zpcVar = r19.b;
                                    androidx.media3.common.a aVar2 = r19.f[i];
                                    List<androidx.media3.common.a> list6 = r19.i;
                                    int iS = r19.r.s();
                                    Object objI = r19.r.i();
                                    boolean z14 = r19.l;
                                    hkg hkgVar = r19.d;
                                    if (uriD2 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = w8jVar.a.get(uriD2);
                                    }
                                    if (uriD == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = w8jVar.a.get(uriD);
                                    }
                                    sp10 sp10Var = r19.k;
                                    AtomicInteger atomicInteger2 = nam.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriD3 = pmh0.d(str, fVar.a);
                                    lam.e eVar3 = eVarD2;
                                    long j20 = fVar.w;
                                    long j21 = fVar.y;
                                    if (z3) {
                                        i2 = 8;
                                    } else {
                                        i2 = 0;
                                    }
                                    ly0.h(uriD3, "The uri must be set.");
                                    gqc gqcVar3 = new gqc(uriD3, 0L, 1, null, map, j20, j21, null, i2);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str4 = fVar.v;
                                        str4.getClass();
                                        bArrD = nam.d(str4);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        anVar = new an(zpcVar, bArr, bArrD);
                                    } else {
                                        anVar = zpcVar;
                                    }
                                    eVar2 = fVar.b;
                                    if (eVar2 != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str5 = eVar2.v;
                                            str5.getClass();
                                            bArrD2 = nam.d(str5);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriD4 = pmh0.d(str, eVar2.a);
                                        long j22 = eVar2.w;
                                        boolean z15 = z10;
                                        long j23 = eVar2.y;
                                        ly0.h(uriD4, "The uri must be set.");
                                        gqc gqcVar4 = new gqc(uriD4, 0L, 1, null, map, j22, j23, null, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            anVar2 = new an(zpcVar, bArr2, bArrD2);
                                        } else {
                                            anVar2 = zpcVar;
                                        }
                                        z7 = z15;
                                        zpcVar2 = anVar2;
                                        gqcVar = gqcVar4;
                                    } else {
                                        gqcVar = null;
                                        zpcVar2 = null;
                                        z7 = false;
                                    }
                                    long j24 = j9 + j11;
                                    long j25 = j24 + fVar.c;
                                    i3 = ramVar.j + fVar.d;
                                    if (namVar != 0) {
                                        gqcVar2 = namVar.q;
                                        if (gqcVar != gqcVar2 || (gqcVar != null && gqcVar2 != null && gqcVar.a.equals(gqcVar2.a) && gqcVar.f == gqcVar2.f)) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (uri.equals(namVar.m) || !namVar.H) {
                                            z9 = false;
                                        } else {
                                            z9 = true;
                                        }
                                        p6nVar = namVar.y;
                                        nszVar = namVar.z;
                                        if (z8 || !z9 || namVar.J || namVar.l != i3) {
                                            oamVar2 = null;
                                        } else {
                                            oamVar2 = namVar.C;
                                        }
                                        oamVar = oamVar2;
                                    } else {
                                        p6nVar = new p6n(null);
                                        nszVar = new nsz(10);
                                        oamVar = null;
                                    }
                                    p6n p6nVar2 = p6nVar;
                                    nsz nszVar2 = nszVar;
                                    long j26 = eVar3.b;
                                    int i8 = eVar3.c;
                                    boolean z16 = !z3;
                                    boolean z17 = fVar.z;
                                    sparseArray = (SparseArray) hkgVar.a;
                                    zxf0Var = (zxf0) sparseArray.get(i3);
                                    if (zxf0Var == null) {
                                        zxf0Var = new zxf0(9223372036854775806L);
                                        sparseArray.put(i3, zxf0Var);
                                    }
                                    bVar.a = new nam(mamVar, anVar, gqcVar3, aVar2, z6, zpcVar2, gqcVar, z7, uri, list6, iS, objI, j24, j25, j26, i8, z16, i3, z17, z14, zxf0Var, fVar.f, oamVar, p6nVar2, nszVar2, z5, z4, sp10Var);
                                }
                            }
                            if (z5) {
                                mam mamVar2 = r19.a;
                                zpcVar = r19.b;
                                androidx.media3.common.a aVar3 = r19.f[i];
                                List<androidx.media3.common.a> list7 = r19.i;
                                int iS2 = r19.r.s();
                                Object objI2 = r19.r.i();
                                boolean z18 = r19.l;
                                hkg hkgVar2 = r19.d;
                                if (uriD2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = w8jVar.a.get(uriD2);
                                }
                                if (uriD == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = w8jVar.a.get(uriD);
                                }
                                sp10 sp10Var2 = r19.k;
                                AtomicInteger atomicInteger3 = nam.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriD5 = pmh0.d(str, fVar.a);
                                lam.e eVar4 = eVarD2;
                                long j27 = fVar.w;
                                long j28 = fVar.y;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                ly0.h(uriD5, "The uri must be set.");
                                gqc gqcVar5 = new gqc(uriD5, 0L, 1, null, map, j27, j28, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str6 = fVar.v;
                                    str6.getClass();
                                    bArrD = nam.d(str6);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    anVar = new an(zpcVar, bArr, bArrD);
                                } else {
                                    anVar = zpcVar;
                                }
                                eVar2 = fVar.b;
                                if (eVar2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str7 = eVar2.v;
                                        str7.getClass();
                                        bArrD2 = nam.d(str7);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriD6 = pmh0.d(str, eVar2.a);
                                    long j29 = eVar2.w;
                                    boolean z19 = z10;
                                    long j210 = eVar2.y;
                                    ly0.h(uriD6, "The uri must be set.");
                                    gqc gqcVar6 = new gqc(uriD6, 0L, 1, null, map, j29, j210, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        anVar2 = new an(zpcVar, bArr2, bArrD2);
                                    } else {
                                        anVar2 = zpcVar;
                                    }
                                    z7 = z19;
                                    zpcVar2 = anVar2;
                                    gqcVar = gqcVar6;
                                } else {
                                    gqcVar = null;
                                    zpcVar2 = null;
                                    z7 = false;
                                }
                                long j211 = j9 + j11;
                                long j212 = j211 + fVar.c;
                                i3 = ramVar.j + fVar.d;
                                if (namVar != 0) {
                                    gqcVar2 = namVar.q;
                                    if (gqcVar != gqcVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(namVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    p6nVar = namVar.y;
                                    nszVar = namVar.z;
                                    if (z8) {
                                        oamVar2 = null;
                                    } else {
                                        oamVar2 = null;
                                    }
                                    oamVar = oamVar2;
                                } else {
                                    p6nVar = new p6n(null);
                                    nszVar = new nsz(10);
                                    oamVar = null;
                                }
                                p6n p6nVar3 = p6nVar;
                                nsz nszVar3 = nszVar;
                                long j213 = eVar4.b;
                                int i9 = eVar4.c;
                                boolean z110 = !z3;
                                boolean z111 = fVar.z;
                                sparseArray = (SparseArray) hkgVar2.a;
                                zxf0Var = (zxf0) sparseArray.get(i3);
                                if (zxf0Var == null) {
                                    zxf0Var = new zxf0(9223372036854775806L);
                                    sparseArray.put(i3, zxf0Var);
                                }
                                bVar.a = new nam(mamVar2, anVar, gqcVar5, aVar3, z6, zpcVar2, gqcVar, z7, uri, list7, iS2, objI2, j211, j212, j213, i9, z110, i3, z111, z18, zxf0Var, fVar.f, oamVar, p6nVar3, nszVar3, z5, z4, sp10Var2);
                            } else {
                                mam mamVar3 = r19.a;
                                zpcVar = r19.b;
                                androidx.media3.common.a aVar4 = r19.f[i];
                                List<androidx.media3.common.a> list8 = r19.i;
                                int iS3 = r19.r.s();
                                Object objI3 = r19.r.i();
                                boolean z112 = r19.l;
                                hkg hkgVar3 = r19.d;
                                if (uriD2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = w8jVar.a.get(uriD2);
                                }
                                if (uriD == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = w8jVar.a.get(uriD);
                                }
                                sp10 sp10Var3 = r19.k;
                                AtomicInteger atomicInteger4 = nam.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriD7 = pmh0.d(str, fVar.a);
                                lam.e eVar5 = eVarD2;
                                long j214 = fVar.w;
                                long j215 = fVar.y;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                ly0.h(uriD7, "The uri must be set.");
                                gqc gqcVar7 = new gqc(uriD7, 0L, 1, null, map, j214, j215, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str8 = fVar.v;
                                    str8.getClass();
                                    bArrD = nam.d(str8);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    anVar = new an(zpcVar, bArr, bArrD);
                                } else {
                                    anVar = zpcVar;
                                }
                                eVar2 = fVar.b;
                                if (eVar2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str9 = eVar2.v;
                                        str9.getClass();
                                        bArrD2 = nam.d(str9);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriD8 = pmh0.d(str, eVar2.a);
                                    long j216 = eVar2.w;
                                    boolean z113 = z10;
                                    long j217 = eVar2.y;
                                    ly0.h(uriD8, "The uri must be set.");
                                    gqc gqcVar8 = new gqc(uriD8, 0L, 1, null, map, j216, j217, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        anVar2 = new an(zpcVar, bArr2, bArrD2);
                                    } else {
                                        anVar2 = zpcVar;
                                    }
                                    z7 = z113;
                                    zpcVar2 = anVar2;
                                    gqcVar = gqcVar8;
                                } else {
                                    gqcVar = null;
                                    zpcVar2 = null;
                                    z7 = false;
                                }
                                long j218 = j9 + j11;
                                long j219 = j218 + fVar.c;
                                i3 = ramVar.j + fVar.d;
                                if (namVar != 0) {
                                    gqcVar2 = namVar.q;
                                    if (gqcVar != gqcVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(namVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    p6nVar = namVar.y;
                                    nszVar = namVar.z;
                                    if (z8) {
                                        oamVar2 = null;
                                    } else {
                                        oamVar2 = null;
                                    }
                                    oamVar = oamVar2;
                                } else {
                                    p6nVar = new p6n(null);
                                    nszVar = new nsz(10);
                                    oamVar = null;
                                }
                                p6n p6nVar4 = p6nVar;
                                nsz nszVar4 = nszVar;
                                long j2110 = eVar5.b;
                                int i10 = eVar5.c;
                                boolean z114 = !z3;
                                boolean z115 = fVar.z;
                                sparseArray = (SparseArray) hkgVar3.a;
                                zxf0Var = (zxf0) sparseArray.get(i3);
                                if (zxf0Var == null) {
                                    zxf0Var = new zxf0(9223372036854775806L);
                                    sparseArray.put(i3, zxf0Var);
                                }
                                bVar.a = new nam(mamVar3, anVar, gqcVar7, aVar4, z6, zpcVar2, gqcVar, z7, uri, list8, iS3, objI3, j218, j219, j2110, i10, z114, i3, z115, z112, zxf0Var, fVar.f, oamVar, p6nVar4, nszVar4, z5, z4, sp10Var3);
                            }
                        }
                    }
                }
            } else {
                bVar2.c = uri;
                lamVar.p = uri;
                bVar = bVar2;
            }
            z11 = bVar.b;
            mn7Var = bVar.a;
            uri2 = bVar.c;
            if (z11) {
                this.f0 = j;
                this.i0 = true;
                return true;
            }
            if (mn7Var == null) {
                if (uri2 != null) {
                    return false;
                }
                qam.this.b.d.get(uri2).c(true);
                return false;
            }
            if (mn7Var instanceof nam) {
                namVar2 = (nam) mn7Var;
                if (!arrayList.isEmpty()) {
                    arrayList2 = arrayList;
                    break;
                }
                if (!C().f()) {
                    B(arrayList.size() - 1);
                }
                if (!namVar2.n || !namVar2.L) {
                    arrayList2 = arrayList;
                    break;
                }
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        arrayList2 = arrayList;
                        break;
                    }
                    arrayList2 = arrayList;
                    long j30 = arrayList2.get(size).g;
                    long j31 = namVar2.g;
                    if (j30 < j31) {
                        break;
                    }
                    if (j30 == j31 && x(size)) {
                        B(size);
                        namVar2.L = false;
                        break;
                    }
                    size--;
                    arrayList = arrayList2;
                }
                this.m0 = namVar2;
                this.U = namVar2.d;
                this.f0 = -9223372036854775807L;
                arrayList2.add(namVar2);
                pcn.b bVar5 = pcn.b;
                aVar = new pcn.a();
                for (b bVar6 : this.K) {
                    aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                }
                c150 c150VarG = aVar.g();
                namVar2.D = this;
                namVar2.I = c150VarG;
                for (b bVar7 : this.K) {
                    bVar7.getClass();
                    bVar7.C = namVar2.k;
                    if (namVar2.L) {
                        bVar7.G = true;
                    }
                }
            }
            this.J = mn7Var;
            nxsVar.d(mn7Var, this, this.w.b(mn7Var.c));
            return true;
        }
        j5 = j18;
        uriArr = uriArr3;
        dddVar = dddVar3;
        j6 = jMax5;
        jMax3 = j5;
        j7 = j2;
        namVar = namVar3;
        uriArr2 = uriArr;
        dddVar2 = dddVar;
        arrayList = arrayList3;
        lamVar.r.l(j16, j6, jMax3, list5, lamVar.a(namVar3, j2));
        iQ = lamVar.r.q();
        if (i7 != iQ) {
            z = true;
        } else {
            z = false;
        }
        uri = uriArr2[iQ];
        if (dddVar2.d(uri)) {
            bVar2.c = uri;
            lamVar.p = uri;
            bVar = bVar2;
        } else {
            ramVarB = dddVar2.b(true, uri);
            ramVarB.getClass();
            lamVar.q = ramVarB.c;
            if (ramVarB.o) {
                j8 = j;
            } else {
                j8 = (ramVarB.h + ramVarB.u) - dddVar2.C;
            }
            lamVar.s = j8;
            j9 = ramVarB.h - dddVar2.C;
            Pair<Long, Integer> pairC3 = lamVar.c(namVar, z, ramVarB, j9, j7);
            jLongValue = ((Long) pairC3.first).longValue();
            iIntValue = ((Integer) pairC3.second).intValue();
            if (z) {
                iIntValue2 = iIntValue;
                ramVar = ramVarB;
                i = iQ;
            } else {
                uri = uriArr2[i7];
                ram ramVarB3 = dddVar2.b(true, uri);
                ramVarB3.getClass();
                j9 = ramVarB3.h - dddVar2.C;
                Pair<Long, Integer> pairC4 = lamVar.c(namVar, false, ramVarB3, j9, j7);
                jLongValue = ((Long) pairC4.first).longValue();
                iIntValue2 = ((Integer) pairC4.second).intValue();
                i = i7;
                ramVar = ramVarB3;
            }
            str = ramVar.a;
            z2 = ramVar.c;
            j10 = ramVar.k;
            pcn pcnVar2 = ramVar.r;
            if (i != i7) {
                dddVar2.a(uriArr2[i7]);
            }
            if (jLongValue < j10) {
                lamVar.n = new ae2();
                bVar = bVar2;
            } else {
                eVarD2 = lam.d(ramVar, jLongValue, iIntValue2);
                if (eVarD2 == null) {
                    bVar = bVar2;
                } else if (ramVar.o) {
                    bVar = bVar2;
                    bVar.c = uri;
                    r19.p = uri;
                } else {
                    bVar = bVar2;
                    if (z13) {
                    }
                    bVar.b = true;
                }
                z3 = eVarD2.d;
                fVar = eVarD2.a;
                r19.p = null;
                SystemClock.elapsedRealtime();
                eVar = fVar.b;
                j11 = fVar.e;
                if (eVar != null) {
                    uriD = null;
                } else {
                    uriD = null;
                }
                aVarE = r19.e(uriD, i, true);
                bVar.a = aVarE;
                if (aVarE == null) {
                    str2 = fVar.i;
                    if (str2 == null) {
                        uriD2 = null;
                    } else {
                        uriD2 = pmh0.d(ramVar.a, str2);
                    }
                    aVarE2 = r19.e(uriD2, i, false);
                    bVar.a = aVarE2;
                    if (aVarE2 == null) {
                        if (fVar instanceof ram.c) {
                            z4 = z2;
                        } else if (((ram.c) fVar).A) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (namVar == 0) {
                            AtomicInteger atomicInteger5 = nam.M;
                        } else {
                            if (uri.equals(namVar.m)) {
                                if (z4) {
                                }
                            } else if (z4) {
                            }
                            if (z5) {
                                mam mamVar4 = r19.a;
                                zpcVar = r19.b;
                                androidx.media3.common.a aVar5 = r19.f[i];
                                List<androidx.media3.common.a> list9 = r19.i;
                                int iS4 = r19.r.s();
                                Object objI4 = r19.r.i();
                                boolean z116 = r19.l;
                                hkg hkgVar4 = r19.d;
                                if (uriD2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = w8jVar.a.get(uriD2);
                                }
                                if (uriD == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = w8jVar.a.get(uriD);
                                }
                                sp10 sp10Var4 = r19.k;
                                AtomicInteger atomicInteger6 = nam.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriD9 = pmh0.d(str, fVar.a);
                                lam.e eVar6 = eVarD2;
                                long j2111 = fVar.w;
                                long j2112 = fVar.y;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                ly0.h(uriD9, "The uri must be set.");
                                gqc gqcVar9 = new gqc(uriD9, 0L, 1, null, map, j2111, j2112, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str10 = fVar.v;
                                    str10.getClass();
                                    bArrD = nam.d(str10);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    anVar = new an(zpcVar, bArr, bArrD);
                                } else {
                                    anVar = zpcVar;
                                }
                                eVar2 = fVar.b;
                                if (eVar2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str11 = eVar2.v;
                                        str11.getClass();
                                        bArrD2 = nam.d(str11);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriD10 = pmh0.d(str, eVar2.a);
                                    long j2113 = eVar2.w;
                                    boolean z117 = z10;
                                    long j2114 = eVar2.y;
                                    ly0.h(uriD10, "The uri must be set.");
                                    gqc gqcVar10 = new gqc(uriD10, 0L, 1, null, map, j2113, j2114, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        anVar2 = new an(zpcVar, bArr2, bArrD2);
                                    } else {
                                        anVar2 = zpcVar;
                                    }
                                    z7 = z117;
                                    zpcVar2 = anVar2;
                                    gqcVar = gqcVar10;
                                } else {
                                    gqcVar = null;
                                    zpcVar2 = null;
                                    z7 = false;
                                }
                                long j2115 = j9 + j11;
                                long j2116 = j2115 + fVar.c;
                                i3 = ramVar.j + fVar.d;
                                if (namVar != 0) {
                                    gqcVar2 = namVar.q;
                                    if (gqcVar != gqcVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(namVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    p6nVar = namVar.y;
                                    nszVar = namVar.z;
                                    if (z8) {
                                        oamVar2 = null;
                                    } else {
                                        oamVar2 = null;
                                    }
                                    oamVar = oamVar2;
                                } else {
                                    p6nVar = new p6n(null);
                                    nszVar = new nsz(10);
                                    oamVar = null;
                                }
                                p6n p6nVar5 = p6nVar;
                                nsz nszVar5 = nszVar;
                                long j2117 = eVar6.b;
                                int i11 = eVar6.c;
                                boolean z118 = !z3;
                                boolean z119 = fVar.z;
                                sparseArray = (SparseArray) hkgVar4.a;
                                zxf0Var = (zxf0) sparseArray.get(i3);
                                if (zxf0Var == null) {
                                    zxf0Var = new zxf0(9223372036854775806L);
                                    sparseArray.put(i3, zxf0Var);
                                }
                                bVar.a = new nam(mamVar4, anVar, gqcVar9, aVar5, z6, zpcVar2, gqcVar, z7, uri, list9, iS4, objI4, j2115, j2116, j2117, i11, z118, i3, z119, z116, zxf0Var, fVar.f, oamVar, p6nVar5, nszVar5, z5, z4, sp10Var4);
                            } else {
                                mam mamVar5 = r19.a;
                                zpcVar = r19.b;
                                androidx.media3.common.a aVar6 = r19.f[i];
                                List<androidx.media3.common.a> list10 = r19.i;
                                int iS5 = r19.r.s();
                                Object objI5 = r19.r.i();
                                boolean z1110 = r19.l;
                                hkg hkgVar5 = r19.d;
                                if (uriD2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = w8jVar.a.get(uriD2);
                                }
                                if (uriD == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = w8jVar.a.get(uriD);
                                }
                                sp10 sp10Var5 = r19.k;
                                AtomicInteger atomicInteger7 = nam.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriD11 = pmh0.d(str, fVar.a);
                                lam.e eVar7 = eVarD2;
                                long j2118 = fVar.w;
                                long j2119 = fVar.y;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                ly0.h(uriD11, "The uri must be set.");
                                gqc gqcVar11 = new gqc(uriD11, 0L, 1, null, map, j2118, j2119, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str12 = fVar.v;
                                    str12.getClass();
                                    bArrD = nam.d(str12);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    anVar = new an(zpcVar, bArr, bArrD);
                                } else {
                                    anVar = zpcVar;
                                }
                                eVar2 = fVar.b;
                                if (eVar2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str13 = eVar2.v;
                                        str13.getClass();
                                        bArrD2 = nam.d(str13);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriD12 = pmh0.d(str, eVar2.a);
                                    long j21110 = eVar2.w;
                                    boolean z1111 = z10;
                                    long j21111 = eVar2.y;
                                    ly0.h(uriD12, "The uri must be set.");
                                    gqc gqcVar12 = new gqc(uriD12, 0L, 1, null, map, j21110, j21111, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        anVar2 = new an(zpcVar, bArr2, bArrD2);
                                    } else {
                                        anVar2 = zpcVar;
                                    }
                                    z7 = z1111;
                                    zpcVar2 = anVar2;
                                    gqcVar = gqcVar12;
                                } else {
                                    gqcVar = null;
                                    zpcVar2 = null;
                                    z7 = false;
                                }
                                long j21112 = j9 + j11;
                                long j21113 = j21112 + fVar.c;
                                i3 = ramVar.j + fVar.d;
                                if (namVar != 0) {
                                    gqcVar2 = namVar.q;
                                    if (gqcVar != gqcVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(namVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    p6nVar = namVar.y;
                                    nszVar = namVar.z;
                                    if (z8) {
                                        oamVar2 = null;
                                    } else {
                                        oamVar2 = null;
                                    }
                                    oamVar = oamVar2;
                                } else {
                                    p6nVar = new p6n(null);
                                    nszVar = new nsz(10);
                                    oamVar = null;
                                }
                                p6n p6nVar6 = p6nVar;
                                nsz nszVar6 = nszVar;
                                long j21114 = eVar7.b;
                                int i12 = eVar7.c;
                                boolean z1112 = !z3;
                                boolean z1113 = fVar.z;
                                sparseArray = (SparseArray) hkgVar5.a;
                                zxf0Var = (zxf0) sparseArray.get(i3);
                                if (zxf0Var == null) {
                                    zxf0Var = new zxf0(9223372036854775806L);
                                    sparseArray.put(i3, zxf0Var);
                                }
                                bVar.a = new nam(mamVar5, anVar, gqcVar11, aVar6, z6, zpcVar2, gqcVar, z7, uri, list10, iS5, objI5, j21112, j21113, j21114, i12, z1112, i3, z1113, z1110, zxf0Var, fVar.f, oamVar, p6nVar6, nszVar6, z5, z4, sp10Var5);
                            }
                        }
                        if (z5) {
                            mam mamVar6 = r19.a;
                            zpcVar = r19.b;
                            androidx.media3.common.a aVar7 = r19.f[i];
                            List<androidx.media3.common.a> list11 = r19.i;
                            int iS6 = r19.r.s();
                            Object objI6 = r19.r.i();
                            boolean z1114 = r19.l;
                            hkg hkgVar6 = r19.d;
                            if (uriD2 == null) {
                                bArr = null;
                            } else {
                                bArr = w8jVar.a.get(uriD2);
                            }
                            if (uriD == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = w8jVar.a.get(uriD);
                            }
                            sp10 sp10Var6 = r19.k;
                            AtomicInteger atomicInteger8 = nam.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriD13 = pmh0.d(str, fVar.a);
                            lam.e eVar8 = eVarD2;
                            long j21115 = fVar.w;
                            long j21116 = fVar.y;
                            if (z3) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            ly0.h(uriD13, "The uri must be set.");
                            gqc gqcVar13 = new gqc(uriD13, 0L, 1, null, map, j21115, j21116, null, i2);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str14 = fVar.v;
                                str14.getClass();
                                bArrD = nam.d(str14);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                anVar = new an(zpcVar, bArr, bArrD);
                            } else {
                                anVar = zpcVar;
                            }
                            eVar2 = fVar.b;
                            if (eVar2 != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str15 = eVar2.v;
                                    str15.getClass();
                                    bArrD2 = nam.d(str15);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriD14 = pmh0.d(str, eVar2.a);
                                long j21117 = eVar2.w;
                                boolean z1115 = z10;
                                long j21118 = eVar2.y;
                                ly0.h(uriD14, "The uri must be set.");
                                gqc gqcVar14 = new gqc(uriD14, 0L, 1, null, map, j21117, j21118, null, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    anVar2 = new an(zpcVar, bArr2, bArrD2);
                                } else {
                                    anVar2 = zpcVar;
                                }
                                z7 = z1115;
                                zpcVar2 = anVar2;
                                gqcVar = gqcVar14;
                            } else {
                                gqcVar = null;
                                zpcVar2 = null;
                                z7 = false;
                            }
                            long j21119 = j9 + j11;
                            long j211110 = j21119 + fVar.c;
                            i3 = ramVar.j + fVar.d;
                            if (namVar != 0) {
                                gqcVar2 = namVar.q;
                                if (gqcVar != gqcVar2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uri.equals(namVar.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                p6nVar = namVar.y;
                                nszVar = namVar.z;
                                if (z8) {
                                    oamVar2 = null;
                                } else {
                                    oamVar2 = null;
                                }
                                oamVar = oamVar2;
                            } else {
                                p6nVar = new p6n(null);
                                nszVar = new nsz(10);
                                oamVar = null;
                            }
                            p6n p6nVar7 = p6nVar;
                            nsz nszVar7 = nszVar;
                            long j211111 = eVar8.b;
                            int i13 = eVar8.c;
                            boolean z1116 = !z3;
                            boolean z1117 = fVar.z;
                            sparseArray = (SparseArray) hkgVar6.a;
                            zxf0Var = (zxf0) sparseArray.get(i3);
                            if (zxf0Var == null) {
                                zxf0Var = new zxf0(9223372036854775806L);
                                sparseArray.put(i3, zxf0Var);
                            }
                            bVar.a = new nam(mamVar6, anVar, gqcVar13, aVar7, z6, zpcVar2, gqcVar, z7, uri, list11, iS6, objI6, j21119, j211110, j211111, i13, z1116, i3, z1117, z1114, zxf0Var, fVar.f, oamVar, p6nVar7, nszVar7, z5, z4, sp10Var6);
                        } else {
                            mam mamVar7 = r19.a;
                            zpcVar = r19.b;
                            androidx.media3.common.a aVar8 = r19.f[i];
                            List<androidx.media3.common.a> list12 = r19.i;
                            int iS7 = r19.r.s();
                            Object objI7 = r19.r.i();
                            boolean z1118 = r19.l;
                            hkg hkgVar7 = r19.d;
                            if (uriD2 == null) {
                                bArr = null;
                            } else {
                                bArr = w8jVar.a.get(uriD2);
                            }
                            if (uriD == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = w8jVar.a.get(uriD);
                            }
                            sp10 sp10Var7 = r19.k;
                            AtomicInteger atomicInteger9 = nam.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriD15 = pmh0.d(str, fVar.a);
                            lam.e eVar9 = eVarD2;
                            long j211112 = fVar.w;
                            long j211113 = fVar.y;
                            if (z3) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            ly0.h(uriD15, "The uri must be set.");
                            gqc gqcVar15 = new gqc(uriD15, 0L, 1, null, map, j211112, j211113, null, i2);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str16 = fVar.v;
                                str16.getClass();
                                bArrD = nam.d(str16);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                anVar = new an(zpcVar, bArr, bArrD);
                            } else {
                                anVar = zpcVar;
                            }
                            eVar2 = fVar.b;
                            if (eVar2 != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str17 = eVar2.v;
                                    str17.getClass();
                                    bArrD2 = nam.d(str17);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriD16 = pmh0.d(str, eVar2.a);
                                long j211114 = eVar2.w;
                                boolean z1119 = z10;
                                long j211115 = eVar2.y;
                                ly0.h(uriD16, "The uri must be set.");
                                gqc gqcVar16 = new gqc(uriD16, 0L, 1, null, map, j211114, j211115, null, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    anVar2 = new an(zpcVar, bArr2, bArrD2);
                                } else {
                                    anVar2 = zpcVar;
                                }
                                z7 = z1119;
                                zpcVar2 = anVar2;
                                gqcVar = gqcVar16;
                            } else {
                                gqcVar = null;
                                zpcVar2 = null;
                                z7 = false;
                            }
                            long j211116 = j9 + j11;
                            long j211117 = j211116 + fVar.c;
                            i3 = ramVar.j + fVar.d;
                            if (namVar != 0) {
                                gqcVar2 = namVar.q;
                                if (gqcVar != gqcVar2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uri.equals(namVar.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                p6nVar = namVar.y;
                                nszVar = namVar.z;
                                if (z8) {
                                    oamVar2 = null;
                                } else {
                                    oamVar2 = null;
                                }
                                oamVar = oamVar2;
                            } else {
                                p6nVar = new p6n(null);
                                nszVar = new nsz(10);
                                oamVar = null;
                            }
                            p6n p6nVar8 = p6nVar;
                            nsz nszVar8 = nszVar;
                            long j211118 = eVar9.b;
                            int i14 = eVar9.c;
                            boolean z11110 = !z3;
                            boolean z11111 = fVar.z;
                            sparseArray = (SparseArray) hkgVar7.a;
                            zxf0Var = (zxf0) sparseArray.get(i3);
                            if (zxf0Var == null) {
                                zxf0Var = new zxf0(9223372036854775806L);
                                sparseArray.put(i3, zxf0Var);
                            }
                            bVar.a = new nam(mamVar7, anVar, gqcVar15, aVar8, z6, zpcVar2, gqcVar, z7, uri, list12, iS7, objI7, j211116, j211117, j211118, i14, z11110, i3, z11111, z1118, zxf0Var, fVar.f, oamVar, p6nVar8, nszVar8, z5, z4, sp10Var7);
                        }
                    }
                }
            }
        }
        z11 = bVar.b;
        mn7Var = bVar.a;
        uri2 = bVar.c;
        if (z11) {
            this.f0 = j;
            this.i0 = true;
            return true;
        }
        if (mn7Var == null) {
            if (uri2 != null) {
                return false;
            }
            qam.this.b.d.get(uri2).c(true);
            return false;
        }
        if (mn7Var instanceof nam) {
            namVar2 = (nam) mn7Var;
            if (!arrayList.isEmpty()) {
                arrayList2 = arrayList;
                break;
            }
            if (!C().f()) {
                B(arrayList.size() - 1);
            }
            if (!namVar2.n) {
                arrayList2 = arrayList;
                break;
            }
            arrayList2 = arrayList;
            break;
            this.m0 = namVar2;
            this.U = namVar2.d;
            this.f0 = -9223372036854775807L;
            arrayList2.add(namVar2);
            pcn.b bVar8 = pcn.b;
            aVar = new pcn.a();
            while (i4 < r5) {
                aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
            }
            c150 c150VarG2 = aVar.g();
            namVar2.D = this;
            namVar2.I = c150VarG2;
            while (i5 < r4) {
                bVar7.getClass();
                bVar7.C = namVar2.k;
                if (namVar2.L) {
                    bVar7.G = true;
                }
            }
        }
        this.J = mn7Var;
        nxsVar.d(mn7Var, this, this.w.b(mn7Var.c));
        return true;
    }

    @Override // defpackage.xc80
    public final long d() {
        if (E()) {
            return this.f0;
        }
        if (this.i0) {
            return Long.MIN_VALUE;
        }
        return C().h;
    }

    @Override // nxs.a
    public final void e(nxs.d dVar, long j, long j2) {
        mn7 mn7Var = (mn7) dVar;
        this.J = null;
        if (mn7Var instanceof lam.a) {
            lam.a aVar = (lam.a) mn7Var;
            byte[] bArr = aVar.j;
            lam lamVar = this.d;
            lamVar.m = bArr;
            w8j w8jVar = lamVar.j;
            Uri uri = aVar.b.a;
            byte[] bArr2 = aVar.l;
            bArr2.getClass();
            v8j v8jVar = w8jVar.a;
            uri.getClass();
            v8jVar.put(uri, bArr2);
        }
        long j3 = mn7Var.a;
        tws twsVar = new tws(mn7Var.i.d, j2);
        this.w.getClass();
        this.z.c(twsVar, mn7Var.c, this.b, mn7Var.d, mn7Var.e, mn7Var.f, mn7Var.g, mn7Var.h);
        if (this.S) {
            this.c.e(this);
            return;
        }
        g.a aVar2 = new g.a();
        aVar2.a = this.e0;
        b(new g(aVar2));
    }

    @Override // nxs.a
    public final void g(nxs.d dVar, long j, long j2, int i) {
        tws twsVar;
        mn7 mn7Var = (mn7) dVar;
        if (i == 0) {
            long j3 = mn7Var.a;
            twsVar = new tws(mn7Var.b);
        } else {
            long j4 = mn7Var.a;
            twsVar = new tws(mn7Var.i.d, j2);
        }
        tws twsVar2 = twsVar;
        this.z.e(twsVar2, mn7Var.c, this.b, mn7Var.d, mn7Var.e, mn7Var.f, mn7Var.g, mn7Var.h, i);
    }

    @Override // nxs.a
    public final nxs.b i(nxs.d dVar, long j, long j2, IOException iOException, int i) {
        boolean zG;
        nxs.b bVar;
        int i2;
        mn7 mn7Var = (mn7) dVar;
        boolean z = mn7Var instanceof nam;
        if (z && !((nam) mn7Var).f() && (iOException instanceof qom) && ((i2 = ((qom) iOException).c) == 410 || i2 == 404)) {
            return nxs.d;
        }
        long j3 = mn7Var.i.b;
        tws twsVar = new tws(mn7Var.i.d, j2);
        jrh0.Z(mn7Var.g);
        jrh0.Z(mn7Var.h);
        sws.c cVar = new sws.c(iOException, i);
        lam lamVar = this.d;
        sws.a aVarA = sjg0.a(lamVar.r);
        sws swsVar = this.w;
        sws.b bVarC = swsVar.c(aVarA, cVar);
        if (bVarC == null || bVarC.a != 2) {
            zG = false;
        } else {
            long j4 = bVarC.b;
            oyg oygVar = lamVar.r;
            zG = oygVar.g(oygVar.k(lamVar.h.a(mn7Var.d)), j4);
        }
        if (zG) {
            if (z && j3 == 0) {
                ArrayList<nam> arrayList = this.C;
                ly0.f(arrayList.remove(arrayList.size() - 1) == mn7Var);
                if (arrayList.isEmpty()) {
                    this.f0 = this.e0;
                } else {
                    ((nam) t3p.a(arrayList)).J = true;
                }
            }
            bVar = nxs.e;
        } else {
            long jA = swsVar.a(cVar);
            bVar = jA != -9223372036854775807L ? new nxs.b(0, jA) : nxs.f;
        }
        nxs.b bVar2 = bVar;
        int i3 = bVar2.a;
        boolean z2 = i3 == 0 || i3 == 1;
        this.z.d(twsVar, mn7Var.c, this.b, mn7Var.d, mn7Var.e, mn7Var.f, mn7Var.g, mn7Var.h, iOException, !z2);
        if (!z2) {
            this.J = null;
        }
        if (zG) {
            if (!this.S) {
                g.a aVar = new g.a();
                aVar.a = this.e0;
                b(new g(aVar));
                return bVar2;
            }
            this.c.e(this);
        }
        return bVar2;
    }

    @Override // nxs.e
    public final void l() {
        for (b bVar : this.K) {
            bVar.w(true);
            lef lefVar = bVar.h;
            if (lefVar != null) {
                lefVar.i(bVar.e);
                bVar.h = null;
                bVar.g = null;
            }
        }
    }

    @Override // defpackage.m4h
    public final void n() {
        this.j0 = true;
        this.G.post(this.F);
    }

    @Override // nxs.a
    public final void p(nxs.d dVar, long j, long j2, boolean z) {
        mn7 mn7Var = (mn7) dVar;
        this.J = null;
        long j3 = mn7Var.a;
        tws twsVar = new tws(mn7Var.i.d, j2);
        this.w.getClass();
        this.z.b(twsVar, mn7Var.c, this.b, mn7Var.d, mn7Var.e, mn7Var.f, mn7Var.g, mn7Var.h);
        if (z) {
            return;
        }
        if (E() || this.T == 0) {
            I();
        }
        if (this.T > 0) {
            this.c.e(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [fbm$b[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fbm$b[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [njg0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [fbm$b, ps60] */
    /* JADX WARN: Type inference failed for: r5v6, types: [dre] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.m4h
    public final njg0 r(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set<Integer> set = n0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.M;
        SparseIntArray sparseIntArray = this.N;
        ?? bVar = 0;
        bVar = 0;
        if (zContains) {
            ly0.b(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.L[i3] = i;
                }
                bVar = this.L[i3] == i ? this.K[i3] : y(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.K;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.L[i4] == i) {
                    bVar = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (bVar == 0) {
            if (this.j0) {
                return y(i, i2);
            }
            int length = this.K.length;
            boolean z = i2 == 1 || i2 == 2;
            bVar = new b(this.e, this.i, this.v, this.I);
            bVar.t = this.e0;
            if (z) {
                bVar.I = this.l0;
                bVar.z = true;
            }
            long j = this.k0;
            if (bVar.F != j) {
                bVar.F = j;
                bVar.z = true;
            }
            nam namVar = this.m0;
            if (namVar != null) {
                bVar.C = namVar.k;
            }
            bVar.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.L, i5);
            this.L = iArrCopyOf;
            iArrCopyOf[length] = i;
            b[] bVarArr = this.K;
            String str = jrh0.a;
            ?? CopyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
            CopyOf[bVarArr.length] = bVar;
            this.K = (b[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.d0, i5);
            this.d0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.b0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (D(i2) > D(this.P)) {
                this.Q = length;
                this.P = i2;
            }
            this.c0 = Arrays.copyOf(this.c0, i5);
        }
        if (i2 != 5) {
            return bVar;
        }
        a aVar = this.O;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(bVar, this.A);
        this.O = aVar2;
        return aVar2;
    }

    @Override // defpackage.xc80
    public final long s() {
        long j;
        ArrayList<nam> arrayList = this.C;
        if (this.i0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.f0;
        }
        long jMax = this.e0;
        nam namVarC = C();
        if (!namVarC.H) {
            namVarC = arrayList.size() > 1 ? (nam) rh6.a(2, arrayList) : null;
        }
        if (namVarC != null) {
            jMax = Math.max(jMax, namVarC.h);
        }
        if (this.R) {
            for (b bVar : this.K) {
                synchronized (bVar) {
                    j = bVar.v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // ps60.c
    public final void t() {
        this.G.post(this.E);
    }

    @Override // defpackage.xc80
    public final void v(long j) {
        nxs nxsVar = this.y;
        if (nxsVar.c == null && !E()) {
            boolean zB = nxsVar.b();
            lam lamVar = this.d;
            List<nam> list = this.D;
            if (zB) {
                this.J.getClass();
                if (lamVar.n != null ? false : lamVar.r.d(j, this.J, list)) {
                    nxsVar.a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && lamVar.b(list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                B(size);
            }
            int size2 = (lamVar.n != null || lamVar.r.length() < 2) ? list.size() : lamVar.r.p(j, list);
            if (size2 < this.C.size()) {
                B(size2);
            }
        }
    }

    public final void w() {
        ly0.f(this.S);
        this.X.getClass();
        this.Y.getClass();
    }

    public final boolean x(int i) {
        int i2 = i;
        while (true) {
            ArrayList<nam> arrayList = this.C;
            if (i2 >= arrayList.size()) {
                nam namVar = arrayList.get(i);
                for (int i3 = 0; i3 < this.K.length; i3++) {
                    if (this.K[i3].n() > namVar.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i2).L) {
                return false;
            }
            i2++;
        }
    }

    public final ljg0 z(jjg0[] jjg0VarArr) {
        for (int i = 0; i < jjg0VarArr.length; i++) {
            jjg0 jjg0Var = jjg0VarArr[i];
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[jjg0Var.a];
            for (int i2 = 0; i2 < jjg0Var.a; i2++) {
                androidx.media3.common.a aVar = jjg0Var.d[i2];
                int iG = this.i.g(aVar);
                androidx.media3.common.a.C0062a c0062aA = aVar.a();
                c0062aA.N = iG;
                aVarArr[i2] = new androidx.media3.common.a(c0062aA);
            }
            jjg0VarArr[i] = new jjg0(jjg0Var.b, aVarArr);
        }
        return new ljg0(jjg0VarArr);
    }

    @Override // defpackage.m4h
    public final void k(p480 p480Var) {
    }
}

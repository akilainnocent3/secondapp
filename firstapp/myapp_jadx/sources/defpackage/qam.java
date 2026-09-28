package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.g;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qam implements zjv, xam {
    public final jbd A;
    public final boolean B;
    public final int C;
    public final sp10 D;
    public final a E = new a();
    public zjv.a F;
    public int G;
    public ljg0 H;
    public fbm[] I;
    public fbm[] J;
    public int K;
    public kma L;
    public final mam a;
    public final ddd b;
    public final add c;
    public final mrg0 d;
    public final nef e;
    public final mef.a f;
    public final sws i;
    public final mkv.a v;
    public final tf w;
    public final IdentityHashMap<rs60, Integer> y;
    public final hkg z;

    public class a implements xc80.a {
        public a() {
        }

        public final void a() {
            qam qamVar = qam.this;
            int i = qamVar.G - 1;
            qamVar.G = i;
            if (i > 0) {
                return;
            }
            int i2 = 0;
            for (fbm fbmVar : qamVar.I) {
                fbmVar.w();
                i2 += fbmVar.X.a;
            }
            jjg0[] jjg0VarArr = new jjg0[i2];
            int i3 = 0;
            for (fbm fbmVar2 : qamVar.I) {
                fbmVar2.w();
                int i4 = fbmVar2.X.a;
                int i5 = 0;
                while (i5 < i4) {
                    fbmVar2.w();
                    jjg0VarArr[i3] = fbmVar2.X.a(i5);
                    i5++;
                    i3++;
                }
            }
            qamVar.H = new ljg0(jjg0VarArr);
            qamVar.F.g(qamVar);
        }

        @Override // xc80.a
        public final void e(xc80 xc80Var) {
            qam qamVar = qam.this;
            qamVar.F.e(qamVar);
        }
    }

    public qam(mam mamVar, ddd dddVar, add addVar, mrg0 mrg0Var, nef nefVar, mef.a aVar, sws swsVar, mkv.a aVar2, tf tfVar, jbd jbdVar, boolean z, int i, sp10 sp10Var) {
        this.a = mamVar;
        this.b = dddVar;
        this.c = addVar;
        this.d = mrg0Var;
        this.e = nefVar;
        this.f = aVar;
        this.i = swsVar;
        this.v = aVar2;
        this.w = tfVar;
        this.A = jbdVar;
        this.B = z;
        this.C = i;
        this.D = sp10Var;
        jbdVar.getClass();
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        this.L = new kma(c150Var, c150Var);
        this.y = new IdentityHashMap<>();
        this.z = new hkg();
        this.I = new fbm[0];
        this.J = new fbm[0];
    }

    public static androidx.media3.common.a k(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, boolean z) {
        uov uovVar;
        int i;
        String str;
        String str2;
        pcn pcnVar;
        int i2;
        int i3;
        String str3;
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        if (aVar2 != null) {
            str2 = aVar2.k;
            uovVar = aVar2.l;
            i2 = aVar2.F;
            i = aVar2.e;
            i3 = aVar2.f;
            str = aVar2.d;
            str3 = aVar2.b;
            pcnVar = aVar2.c;
        } else {
            String strV = jrh0.v(1, aVar.k);
            uovVar = aVar.l;
            if (z) {
                i2 = aVar.F;
                i = aVar.e;
                i3 = aVar.f;
                str = aVar.d;
                str3 = aVar.b;
                str2 = strV;
                pcnVar = aVar.c;
            } else {
                i = 0;
                str = null;
                str2 = strV;
                pcnVar = c150Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strD = gqv.d(str2);
        int i4 = z ? aVar.h : -1;
        int i5 = z ? aVar.i : -1;
        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
        c0062a.a = aVar.a;
        c0062a.b = str3;
        c0062a.c = pcn.j(pcnVar);
        c0062a.l = gqv.m(aVar.m);
        c0062a.m = gqv.m(strD);
        c0062a.j = str2;
        c0062a.k = uovVar;
        c0062a.h = i4;
        c0062a.i = i5;
        c0062a.E = i2;
        c0062a.e = i;
        c0062a.f = i3;
        c0062a.d = str;
        return new androidx.media3.common.a(c0062a);
    }

    @Override // defpackage.xc80
    public final boolean a() {
        return this.L.a();
    }

    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        if (this.H != null) {
            return this.L.b(gVar);
        }
        for (fbm fbmVar : this.I) {
            if (!fbmVar.S) {
                g.a aVar = new g.a();
                aVar.a = fbmVar.e0;
                fbmVar.b(new g(aVar));
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0277  */
    /* JADX WARN: Code duplicated, block: B:123:0x0280  */
    /* JADX WARN: Code duplicated, block: B:125:0x0284  */
    /* JADX WARN: Code duplicated, block: B:127:0x028a  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:197:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x019b  */
    @Override // defpackage.zjv
    public final long c(oyg[] oygVarArr, boolean[] zArr, rs60[] rs60VarArr, boolean[] zArr2, long j) {
        IdentityHashMap<rs60, Integer> identityHashMap;
        rs60[] rs60VarArr2;
        int[] iArr;
        boolean z;
        lam lamVar;
        int i;
        int i2;
        rs60[] rs60VarArr3;
        int i3;
        int[] iArr2;
        fbm[] fbmVarArr;
        fbm fbmVar;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        rs60[] rs60VarArr4;
        int i6;
        int i7;
        int[] iArr3 = new int[oygVarArr.length];
        int[] iArr4 = new int[oygVarArr.length];
        int i8 = 0;
        while (true) {
            int length = oygVarArr.length;
            identityHashMap = this.y;
            if (i8 >= length) {
                break;
            }
            rs60 rs60Var = rs60VarArr[i8];
            iArr3[i8] = rs60Var == null ? -1 : identityHashMap.get(rs60Var).intValue();
            iArr4[i8] = -1;
            oyg oygVar = oygVarArr[i8];
            if (oygVar != null) {
                jjg0 jjg0VarM = oygVar.m();
                int i9 = 0;
                while (true) {
                    fbm[] fbmVarArr2 = this.I;
                    if (i9 >= fbmVarArr2.length) {
                        break;
                    }
                    fbm fbmVar2 = fbmVarArr2[i9];
                    fbmVar2.w();
                    int iIndexOf = fbmVar2.X.b.indexOf(jjg0VarM);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        iArr4[i8] = i9;
                        break;
                    }
                    i9++;
                }
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = oygVarArr.length;
        rs60[] rs60VarArr5 = new rs60[length2];
        int length3 = oygVarArr.length;
        rs60[] rs60VarArr6 = new rs60[length3];
        int length4 = oygVarArr.length;
        oyg[] oygVarArr2 = new oyg[length4];
        fbm[] fbmVarArr3 = new fbm[this.I.length];
        int i10 = length3;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        while (i11 < this.I.length) {
            int i13 = length2;
            int i14 = 0;
            while (true) {
                rs60VarArr2 = rs60VarArr5;
                if (i14 >= oygVarArr.length) {
                    break;
                }
                rs60VarArr6[i14] = iArr3[i14] == i11 ? rs60VarArr[i14] : null;
                oygVarArr2[i14] = iArr4[i14] == i11 ? oygVarArr[i14] : null;
                i14++;
                rs60VarArr5 = rs60VarArr2;
            }
            fbm fbmVar3 = this.I[i11];
            nxs nxsVar = fbmVar3.y;
            int i15 = i11;
            lam lamVar2 = fbmVar3.d;
            Uri[] uriArr = lamVar2.e;
            ddd dddVar = lamVar2.g;
            ArrayList<nam> arrayList = fbmVar3.C;
            fbmVar3.w();
            int i16 = fbmVar3.T;
            rs60[] rs60VarArr7 = rs60VarArr6;
            int i17 = 0;
            while (i17 < length4) {
                abm abmVar = (abm) rs60VarArr7[i17];
                if (abmVar == null || (oygVarArr2[i17] != null && zArr[i17])) {
                    i7 = i17;
                } else {
                    i7 = i17;
                    fbmVar3.T--;
                    if (abmVar.c != -1) {
                        fbm fbmVar4 = abmVar.b;
                        int i18 = abmVar.a;
                        fbmVar4.w();
                        fbmVar4.Z.getClass();
                        int i19 = fbmVar4.Z[i18];
                        ly0.f(fbmVar4.c0[i19]);
                        fbmVar4.c0[i19] = false;
                        abmVar.c = -1;
                    }
                    rs60VarArr7[i7] = null;
                }
                i17 = i7 + 1;
                oygVarArr2 = oygVarArr2;
            }
            oyg[] oygVarArr3 = oygVarArr2;
            boolean z5 = true;
            if (z4) {
                iArr = iArr3;
            } else {
                if (fbmVar3.h0) {
                    if (i16 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                } else {
                    iArr = iArr3;
                    z = j != fbmVar3.e0;
                }
            }
            oyg oygVar2 = lamVar2.r;
            boolean z6 = z;
            oyg oygVar3 = oygVar2;
            int i20 = 0;
            while (i20 < length4) {
                int i21 = i20;
                oyg oygVar4 = oygVarArr3[i21];
                if (oygVar4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z7 = z6;
                    int iIndexOf2 = fbmVar3.X.b.indexOf(oygVar4.m());
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = -1;
                    }
                    if (iIndexOf2 == fbmVar3.a0) {
                        dddVar.a(uriArr[lamVar2.r.q()]);
                        lamVar2.r = oygVar4;
                        oygVar3 = oygVar4;
                    }
                    if (rs60VarArr7[i21] == null) {
                        fbmVar3.T++;
                        abm abmVar2 = new abm(fbmVar3, iIndexOf2);
                        rs60VarArr7[i21] = abmVar2;
                        zArr2[i21] = z5;
                        if (fbmVar3.Z != null) {
                            abmVar2.d();
                            if (z7) {
                                z6 = z7;
                            } else {
                                fbm.b bVar = fbmVar3.K[fbmVar3.Z[iIndexOf2]];
                                z6 = (bVar.n() == 0 || bVar.y(j, z5)) ? false : true;
                            }
                        } else {
                            z6 = z7;
                        }
                    } else {
                        z6 = z7;
                    }
                }
                i20 = i21 + 1;
                length4 = i6;
                z5 = true;
            }
            int i22 = length4;
            boolean z8 = z6;
            if (fbmVar3.T == 0) {
                dddVar.a(uriArr[lamVar2.r.q()]);
                lamVar2.n = null;
                fbmVar3.V = null;
                fbmVar3.g0 = true;
                arrayList.clear();
                if (nxsVar.b()) {
                    if (fbmVar3.R) {
                        for (fbm.b bVar2 : fbmVar3.K) {
                            bVar2.i();
                        }
                    }
                    nxsVar.a();
                } else {
                    fbmVar3.I();
                }
                int[] iArr5 = iArr4;
                fbmVar = fbmVar3;
                i4 = i10;
                iArr2 = iArr5;
                lamVar = lamVar2;
                i2 = i13;
                rs60VarArr3 = rs60VarArr2;
                i3 = i15;
                z3 = z8;
                fbmVarArr = fbmVarArr3;
            } else {
                boolean z9 = true;
                if (arrayList.isEmpty() || Objects.equals(oygVar3, oygVar2)) {
                    lamVar = lamVar2;
                    i = i10;
                    i2 = i13;
                    rs60VarArr3 = rs60VarArr2;
                    i3 = i15;
                    iArr2 = iArr4;
                    fbmVarArr = fbmVarArr3;
                    fbmVar = fbmVar3;
                } else {
                    if (fbmVar3.h0) {
                        lamVar = lamVar2;
                        i = i10;
                        i2 = i13;
                        rs60VarArr3 = rs60VarArr2;
                        i3 = i15;
                        iArr2 = iArr4;
                        fbmVarArr = fbmVarArr3;
                        fbmVar = fbmVar3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        nam namVarC = fbmVar3.C();
                        long j3 = j2;
                        tiv[] tivVarArrA = lamVar2.a(namVarC, j);
                        lamVar = lamVar2;
                        List<nam> list = fbmVar3.D;
                        i = i10;
                        i2 = i13;
                        rs60VarArr3 = rs60VarArr2;
                        i3 = i15;
                        iArr2 = iArr4;
                        fbmVarArr = fbmVarArr3;
                        fbmVar = fbmVar3;
                        oyg oygVar5 = oygVar3;
                        oygVar5.l(j, j3, -9223372036854775807L, list, tivVarArrA);
                        if (oygVar5.q() != lamVar.h.a(namVarC.d)) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                    }
                    fbmVar.g0 = z9;
                    z2 = z9;
                    z3 = z2;
                    if (z3) {
                        fbmVar.J(j, z2);
                        i5 = 0;
                        i4 = i;
                        while (i5 < i4) {
                            if (rs60VarArr7[i5] != null) {
                                zArr2[i5] = z9;
                            }
                            i5++;
                            z9 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z4;
                z3 = z8;
                if (z3) {
                    fbmVar.J(j, z2);
                    i5 = 0;
                    i4 = i;
                    while (i5 < i4) {
                        if (rs60VarArr7[i5] != null) {
                            zArr2[i5] = z9;
                        }
                        i5++;
                        z9 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList<abm> arrayList2 = fbmVar.H;
            arrayList2.clear();
            for (int i23 = 0; i23 < i4; i23++) {
                rs60 rs60Var2 = rs60VarArr7[i23];
                if (rs60Var2 != null) {
                    arrayList2.add((abm) rs60Var2);
                }
            }
            fbmVar.h0 = true;
            boolean z10 = false;
            int i24 = 0;
            while (i24 < oygVarArr.length) {
                rs60 rs60Var3 = rs60VarArr7[i24];
                int i25 = i3;
                if (iArr2[i24] == i25) {
                    rs60Var3.getClass();
                    rs60VarArr4 = rs60VarArr3;
                    rs60VarArr4[i24] = rs60Var3;
                    identityHashMap.put(rs60Var3, Integer.valueOf(i25));
                    z10 = true;
                } else {
                    rs60VarArr4 = rs60VarArr3;
                    if (iArr[i24] == i25) {
                        ly0.f(rs60Var3 == null);
                    }
                }
                i24++;
                rs60VarArr3 = rs60VarArr4;
                i3 = i25;
            }
            rs60[] rs60VarArr8 = rs60VarArr3;
            int i26 = i3;
            if (z10) {
                int i27 = i12;
                fbmVarArr[i27] = fbmVar;
                i12 = i27 + 1;
                if (i27 == 0) {
                    lamVar.l = true;
                    if (z3) {
                        ((SparseArray) this.z.a).clear();
                        z4 = true;
                    } else {
                        fbm[] fbmVarArr4 = this.J;
                        if (fbmVarArr4.length == 0 || fbmVar != fbmVarArr4[0]) {
                            ((SparseArray) this.z.a).clear();
                            z4 = true;
                        }
                    }
                } else {
                    lamVar.l = i26 < this.K;
                }
            }
            i11 = i26 + 1;
            rs60VarArr5 = rs60VarArr8;
            iArr4 = iArr2;
            iArr3 = iArr;
            fbmVarArr3 = fbmVarArr;
            rs60VarArr6 = rs60VarArr7;
            oygVarArr2 = oygVarArr3;
            length4 = i22;
            i10 = i4;
            length2 = i2;
        }
        System.arraycopy(rs60VarArr5, 0, rs60VarArr, 0, length2);
        fbm[] fbmVarArr5 = (fbm[]) jrh0.Q(i12, fbmVarArr3);
        this.J = fbmVarArr5;
        c150 c150VarK = pcn.k(fbmVarArr5);
        AbstractList abstractListA = cjs.a(c150VarK, new pam());
        this.A.getClass();
        this.L = new kma(c150VarK, abstractListA);
        return j;
    }

    @Override // defpackage.xc80
    public final long d() {
        return this.L.d();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    @Override // defpackage.xam
    public final boolean e(Uri uri, sws.c cVar, boolean z) {
        boolean z2;
        long j;
        boolean z3;
        int iK;
        sws.b bVarC;
        boolean z4 = true;
        for (fbm fbmVar : this.I) {
            lam lamVar = fbmVar.d;
            Uri[] uriArr = lamVar.e;
            if (jrh0.l(uri, uriArr)) {
                if (z || (bVarC = fbmVar.w.c(sjg0.a(lamVar.r), cVar)) == null || bVarC.a != 2) {
                    z2 = true;
                    j = -9223372036854775807L;
                } else {
                    z2 = true;
                    j = bVarC.b;
                }
                int i = 0;
                while (true) {
                    if (i >= uriArr.length) {
                        i = -1;
                        break;
                    }
                    if (uriArr[i].equals(uri)) {
                        break;
                    }
                    i++;
                }
                if (i == -1 || (iK = lamVar.r.k(i)) == -1) {
                    z3 = z2;
                } else {
                    lamVar.o = uri;
                    if (j != -9223372036854775807L && lamVar.r.g(iK, j)) {
                        ddd.b bVar = lamVar.g.d.get(uri);
                        if (bVar != null ? bVar.a(j) ^ z2 : false) {
                            z3 = z2;
                        }
                    }
                    z3 = false;
                }
            } else {
                z3 = true;
            }
            z4 &= z3;
        }
        this.F.e(this);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zjv
    public final long f(long j, q480 q480Var) {
        for (fbm fbmVar : this.J) {
            if (fbmVar.P == 2) {
                lam lamVar = fbmVar.d;
                ddd dddVar = lamVar.g;
                int iC = lamVar.r.c();
                Uri[] uriArr = lamVar.e;
                ram ramVarB = (iC >= uriArr.length || iC == -1) ? null : dddVar.b(true, uriArr[lamVar.r.q()]);
                if (ramVarB == null) {
                    break;
                }
                pcn pcnVar = ramVarB.r;
                if (pcnVar.isEmpty()) {
                    break;
                }
                long j2 = ramVarB.h - dddVar.C;
                long j3 = j - j2;
                int iC2 = jrh0.c(pcnVar, Long.valueOf(j3), true);
                long j4 = ((ram.e) pcnVar.get(iC2)).e;
                return q480Var.a(j3, j4, (!ramVarB.c || iC2 == pcnVar.size() - 1) ? j4 : ((ram.e) pcnVar.get(iC2 + 1)).e) + j2;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xam
    public final void g() {
        int i = 0;
        for (fbm fbmVar : this.I) {
            nxs nxsVar = fbmVar.y;
            lam lamVar = fbmVar.d;
            ArrayList<nam> arrayList = fbmVar.C;
            if (!arrayList.isEmpty()) {
                nam namVar = (nam) t3p.a(arrayList);
                int iB = lamVar.b(namVar);
                int i2 = namVar.o;
                if (iB == 1) {
                    if (!namVar.f()) {
                        ly0.f(i2 != -1);
                        ram ramVarB = lamVar.g.b(false, lamVar.e[lamVar.h.a(namVar.d)]);
                        ramVarB.getClass();
                        pcn pcnVar = ramVarB.r;
                        int i3 = (int) (namVar.j - ramVarB.k);
                        namVar.K = i3 < 0 ? 0L : ((ram.c) (i3 < pcnVar.size() ? ((ram.e) pcnVar.get(i3)).B : ramVarB.s).get(i2)).c;
                    }
                } else if (iB == 0) {
                    fbmVar.G.post(new bbm(i, fbmVar, namVar));
                } else if (iB == 2 && !fbmVar.i0 && nxsVar.b()) {
                    nxsVar.a();
                }
            }
        }
        this.F.e(this);
    }

    @Override // defpackage.zjv
    public final long h(long j) {
        fbm[] fbmVarArr = this.J;
        if (fbmVarArr.length > 0) {
            boolean zJ = fbmVarArr[0].J(j, false);
            int i = 1;
            while (true) {
                fbm[] fbmVarArr2 = this.J;
                if (i >= fbmVarArr2.length) {
                    break;
                }
                fbmVarArr2[i].J(j, zJ);
                i++;
            }
            if (zJ) {
                ((SparseArray) this.z.a).clear();
            }
        }
        return j;
    }

    public final fbm i(String str, int i, Uri[] uriArr, androidx.media3.common.a[] aVarArr, androidx.media3.common.a aVar, List<androidx.media3.common.a> list, Map<String, DrmInitData> map, long j) {
        return new fbm(str, i, this.E, new lam(this.a, this.b, uriArr, aVarArr, this.c, this.d, this.z, list, this.D), map, this.w, j, aVar, this.e, this.f, this.i, this.v, this.C);
    }

    @Override // defpackage.zjv
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // defpackage.zjv
    public final void m() throws ssz {
        for (fbm fbmVar : this.I) {
            fbmVar.G();
            if (fbmVar.i0 && !fbmVar.S) {
                throw ssz.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.zjv
    public final ljg0 q() {
        ljg0 ljg0Var = this.H;
        ljg0Var.getClass();
        return ljg0Var;
    }

    @Override // defpackage.xc80
    public final long s() {
        return this.L.s();
    }

    @Override // defpackage.zjv
    public final void u(long j, boolean z) throws Throwable {
        for (fbm fbmVar : this.J) {
            if (fbmVar.R && !fbmVar.E()) {
                int length = fbmVar.K.length;
                for (int i = 0; i < length; i++) {
                    fbmVar.K[i].h(j, z, fbmVar.c0[i]);
                }
            }
        }
    }

    @Override // defpackage.xc80
    public final void v(long j) {
        this.L.v(j);
    }

    @Override // defpackage.zjv
    public final void o(zjv.a aVar, long j) {
        mam mamVar;
        boolean z;
        List<tam.a> list;
        List<tam.a> list2;
        fbm[] fbmVarArr;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.F = aVar;
        ddd dddVar = this.b;
        dddVar.e.add(this);
        tam tamVar = dddVar.y;
        tamVar.getClass();
        List<tam.a> list3 = tamVar.g;
        List<tam.b> list4 = tamVar.e;
        Map<String, DrmInitData> map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List<tam.a> list5 = tamVar.h;
        int i4 = 0;
        this.G = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mam mamVar2 = this.a;
        boolean z4 = this.B;
        if (zIsEmpty) {
            mamVar = mamVar2;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            androidx.media3.common.a aVar2 = tamVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                androidx.media3.common.a aVar3 = list4.get(i5).b;
                int i7 = aVar3.v;
                String str = aVar3.k;
                if (i7 > 0 || jrh0.v(2, str) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (jrh0.v(1, str) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] == 2) {
                    }
                    i8++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    tam.b bVar = list4.get(i8);
                    uriArr[i9] = bVar.a;
                    aVarArr[i9] = bVar.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = aVarArr[0].k;
            int iU = jrh0.u(2, str2);
            int iU2 = jrh0.u(1, str2);
            boolean z5 = (iU2 == 1 || (iU2 == 0 && list3.isEmpty())) && iU <= 1 && iU2 + iU > 0;
            mamVar = mamVar2;
            list = list3;
            z = z4;
            fbm fbmVarI = i("main", (z2 || iU2 <= 0) ? 0 : 1, uriArr3, aVarArr, tamVar.j, tamVar.k, map, j);
            arrayList.add(fbmVarI);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (iU > 0) {
                    androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        androidx.media3.common.a aVar4 = aVarArr[i10];
                        String strV = jrh0.v(2, aVar4.k);
                        String strD = gqv.d(strV);
                        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                        c0062a.a = aVar4.a;
                        c0062a.b = aVar4.b;
                        c0062a.c = pcn.j(aVar4.c);
                        c0062a.l = gqv.m(aVar4.m);
                        c0062a.m = gqv.m(strD);
                        c0062a.j = strV;
                        c0062a.k = aVar4.l;
                        c0062a.h = aVar4.h;
                        c0062a.i = aVar4.i;
                        c0062a.t = aVar4.u;
                        c0062a.u = aVar4.v;
                        c0062a.x = aVar4.y;
                        c0062a.e = aVar4.e;
                        c0062a.f = aVar4.f;
                        aVarArr2[i10] = new androidx.media3.common.a(c0062a);
                        i10++;
                        aVarArr = aVarArr;
                    }
                    androidx.media3.common.a[] aVarArr3 = aVarArr;
                    arrayList3.add(new jjg0("main", aVarArr2));
                    if (iU2 > 0 && (aVar2 != null || list.isEmpty())) {
                        arrayList3.add(new jjg0("main:audio", k(aVarArr3[0], aVar2, false)));
                    }
                    List<androidx.media3.common.a> list6 = tamVar.k;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new jjg0(hce0.a(i11, "main:cc:"), ((bdd) mamVar).b(list6.get(i11))));
                        }
                    }
                } else {
                    androidx.media3.common.a[] aVarArr4 = new androidx.media3.common.a[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        aVarArr4[i12] = k(aVarArr[i12], aVar2, true);
                    }
                    arrayList3.add(new jjg0("main", aVarArr4));
                }
                androidx.media3.common.a.C0062a c0062a2 = new androidx.media3.common.a.C0062a();
                c0062a2.a = "ID3";
                c0062a2.m = gqv.m("application/id3");
                jjg0 jjg0Var = new jjg0(iKBWavCysVP.MFPgHV, new androidx.media3.common.a(c0062a2));
                arrayList3.add(jjg0Var);
                fbmVarI.H((jjg0[]) arrayList3.toArray(new jjg0[0]), arrayList3.indexOf(jjg0Var));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List<tam.a> list7 = list;
            String str3 = list7.get(i13).c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(list7.get(i14).c)) {
                        tam.a aVar5 = list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = aVar5.a;
                        androidx.media3.common.a aVar6 = aVar5.b;
                        arrayList4.add(uri);
                        arrayList5.add(aVar6);
                        z6 &= jrh0.u(1, aVar6.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = jrh0.a;
                list = list7;
                i2 = i13;
                fbm fbmVarI2 = i(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (androidx.media3.common.a[]) arrayList5.toArray(new androidx.media3.common.a[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(c0p.t(arrayList6));
                arrayList.add(fbmVarI2);
                if (z && z6) {
                    fbmVarI2.H(new jjg0[]{new jjg0(strConcat, (androidx.media3.common.a[]) arrayList5.toArray(new androidx.media3.common.a[0]))}, new int[0]);
                }
            } else {
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
        }
        this.K = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            list2 = list2;
            String str5 = list2.get(i15).c;
            if (hashSet2.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list2.size(); i16++) {
                    if (str5.equals(list2.get(i16).c)) {
                        tam.a aVar7 = list2.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(aVar7.a);
                        arrayList8.add(aVar7.b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                androidx.media3.common.a[] aVarArr5 = (androidx.media3.common.a[]) arrayList8.toArray(new androidx.media3.common.a[0]);
                String str6 = jrh0.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                pcn.b bVar2 = pcn.b;
                i = i15;
                fbm fbmVarI3 = i(strConcat2, 3, uriArr4, aVarArr5, null, c150.e, map, j);
                arrayList2.add(c0p.t(arrayList9));
                arrayList.add(fbmVarI3);
                int length = aVarArr5.length;
                androidx.media3.common.a[] aVarArr6 = new androidx.media3.common.a[length];
                for (int i17 = 0; i17 < length; i17++) {
                    aVarArr6[i17] = ((bdd) mamVar).b(aVarArr5[i17]);
                }
                fbmVarI3.H(new jjg0[]{new jjg0(strConcat2, aVarArr6)}, new int[0]);
            } else {
                i = i15;
            }
            i15 = i + 1;
        }
        this.I = (fbm[]) arrayList.toArray(new fbm[0]);
        this.G = this.I.length;
        int i18 = 0;
        while (true) {
            int i19 = this.K;
            fbmVarArr = this.I;
            if (i18 >= i19) {
                break;
            }
            fbmVarArr[i18].d.l = true;
            i18++;
        }
        for (fbm fbmVar : fbmVarArr) {
            if (!fbmVar.S) {
                g.a aVar8 = new g.a();
                aVar8.a = fbmVar.e0;
                fbmVar.b(new g(aVar8));
            }
        }
        this.J = this.I;
    }
}

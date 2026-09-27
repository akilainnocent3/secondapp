package s0;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f extends o {

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final int f128282h2 = 8;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final boolean f128283i2 = false;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final boolean f128284j2 = false;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final boolean f128285k2 = false;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static int f128286l2;
    public t0.b C1;
    public t0.e D1;
    public int E1;
    public t0.b.InterfaceC1394b F1;
    public boolean G1;
    public i0.f H1;
    public i0.e I1;
    public int J1;
    public int K1;
    public int L1;
    public int M1;
    public int N1;
    public int O1;
    public c[] P1;
    public c[] Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public int U1;
    public int V1;
    public int W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public int f128287a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public WeakReference<d> f128288b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public WeakReference<d> f128289c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public WeakReference<d> f128290d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public WeakReference<d> f128291e2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public HashSet<e> f128292f2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public t0.b.a f128293g2;

    public f() {
        this.C1 = new t0.b(this);
        this.D1 = new t0.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new i0.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f128287a2 = 0;
        this.f128288b2 = null;
        this.f128289c2 = null;
        this.f128290d2 = null;
        this.f128291e2 = null;
        this.f128292f2 = new HashSet<>();
        this.f128293g2 = new t0.b.a();
    }

    public static boolean S2(int i10, e eVar, t0.b.InterfaceC1394b interfaceC1394b, t0.b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC1394b == null) {
            return false;
        }
        if (eVar.l0() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f135875e = 0;
            aVar.f135876f = 0;
            return false;
        }
        aVar.f135871a = eVar.H();
        aVar.f135872b = eVar.j0();
        aVar.f135873c = eVar.m0();
        aVar.f135874d = eVar.D();
        aVar.f135879i = false;
        aVar.f135880j = i11;
        e.b bVar = aVar.f135871a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f135872b == bVar2;
        boolean z12 = z10 && eVar.f128235f0 > 0.0f;
        boolean z13 = z11 && eVar.f128235f0 > 0.0f;
        if (z10 && eVar.r0(0) && eVar.f128268w == 0 && !z12) {
            aVar.f135871a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f128270x == 0) {
                aVar.f135871a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.r0(1) && eVar.f128270x == 0 && !z13) {
            aVar.f135872b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f128268w == 0) {
                aVar.f135872b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.G0()) {
            aVar.f135871a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.H0()) {
            aVar.f135872b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f128272y[0] == 4) {
                aVar.f135871a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f135872b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f135874d;
                } else {
                    aVar.f135871a = e.b.WRAP_CONTENT;
                    interfaceC1394b.b(eVar, aVar);
                    i13 = aVar.f135876f;
                }
                aVar.f135871a = bVar4;
                aVar.f135873c = (int) (eVar.A() * i13);
            }
        }
        if (z13) {
            if (eVar.f128272y[1] == 4) {
                aVar.f135872b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f135871a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f135873c;
                } else {
                    aVar.f135872b = e.b.WRAP_CONTENT;
                    interfaceC1394b.b(eVar, aVar);
                    i12 = aVar.f135875e;
                }
                aVar.f135872b = bVar6;
                if (eVar.B() == -1) {
                    aVar.f135874d = (int) (i12 / eVar.A());
                } else {
                    aVar.f135874d = (int) (eVar.A() * i12);
                }
            }
        }
        interfaceC1394b.b(eVar, aVar);
        eVar.d2(aVar.f135875e);
        eVar.z1(aVar.f135876f);
        eVar.y1(aVar.f135878h);
        eVar.h1(aVar.f135877g);
        aVar.f135880j = t0.b.a.f135868k;
        return aVar.f135879i;
    }

    public void A2(d dVar) {
        WeakReference<d> weakReference = this.f128288b2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f128288b2.get().f()) {
            this.f128288b2 = new WeakReference<>(dVar);
        }
    }

    public void B2() {
        this.D1.f(H(), j0());
    }

    public boolean C2(boolean z10) {
        return this.D1.g(z10);
    }

    public boolean D2(boolean z10) {
        return this.D1.h(z10);
    }

    public boolean E2(boolean z10, int i10) {
        return this.D1.i(z10, i10);
    }

    public void F2(i0.f fVar) {
        this.H1 = fVar;
        this.I1.D(fVar);
    }

    public ArrayList<h> G2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.B1.get(i10);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.o2() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public t0.b.InterfaceC1394b H2() {
        return this.F1;
    }

    public int I2() {
        return this.W1;
    }

    public i0.e J2() {
        return this.I1;
    }

    public ArrayList<h> K2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.B1.get(i10);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.o2() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean L2() {
        return false;
    }

    public void M2() {
        this.D1.o();
    }

    public void N2() {
        this.D1.p();
    }

    public boolean O2() {
        return this.Z1;
    }

    public boolean P2() {
        return this.G1;
    }

    public boolean Q2() {
        return this.Y1;
    }

    @Override // s0.o, s0.e
    public void R0() {
        this.I1.W();
        this.J1 = 0;
        this.L1 = 0;
        this.K1 = 0;
        this.M1 = 0;
        this.X1 = false;
        super.R0();
    }

    public long R2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.J1 = i17;
        this.K1 = i18;
        return this.C1.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean T2(int i10) {
        return (this.W1 & i10) == i10;
    }

    public final void U2() {
        this.N1 = 0;
        this.O1 = 0;
    }

    public void V2(t0.b.InterfaceC1394b interfaceC1394b) {
        this.F1 = interfaceC1394b;
        this.D1.u(interfaceC1394b);
    }

    public void W2(int i10) {
        this.W1 = i10;
        i0.e.f90176w = T2(512);
    }

    public void X2(int i10, int i11, int i12, int i13) {
        this.J1 = i10;
        this.K1 = i11;
        this.L1 = i12;
        this.M1 = i13;
    }

    public void Y2(int i10) {
        this.E1 = i10;
    }

    public void Z2(boolean z10) {
        this.G1 = z10;
    }

    public boolean a3(i0.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zT2 = T2(64);
        k2(eVar, zT2);
        int size = this.B1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = this.B1.get(i10);
            eVar2.k2(eVar, zT2);
            if (eVar2.t0()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // s0.e
    public void b0(StringBuilder sb2) {
        sb2.append(this.f128252o + ":{\n");
        sb2.append("  actualWidth:" + this.f128231d0);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append("  actualHeight:" + this.f128233e0);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        Iterator<e> it = m2().iterator();
        while (it.hasNext()) {
            it.next().b0(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public void b3() {
        this.C1.e(this);
    }

    @Override // s0.e
    public String f0() {
        return "ConstraintLayout";
    }

    @Override // s0.e
    public void j2(boolean z10, boolean z11) {
        super.j2(z10, z11);
        int size = this.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.B1.get(i10).j2(z10, z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x021f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0228  */
    /* JADX WARN: Code duplicated, block: B:127:0x0231 A[LOOP:5: B:126:0x022f->B:127:0x0231, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:160:0x0313  */
    /* JADX WARN: Code duplicated, block: B:167:0x0334 A[PHI: r13 r19
      0x0334: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:153:0x02f0, B:162:0x0319, B:163:0x031b, B:165:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0334: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:153:0x02f0, B:162:0x0319, B:163:0x031b, B:165:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x0338  */
    /* JADX WARN: Code duplicated, block: B:170:0x033b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // s0.o
    public void o2() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        ?? r18;
        char c10;
        ?? S2;
        int i13;
        ?? A3;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i14;
        ?? r112;
        ?? r15;
        ?? r16;
        e.b bVar;
        e.b bVar2;
        ?? r10;
        ?? r17;
        ?? r11;
        e.b bVar3;
        int i15 = 0;
        this.f128239h0 = 0;
        this.f128241i0 = 0;
        this.Y1 = false;
        this.Z1 = false;
        int size = this.B1.size();
        int iMax3 = Math.max(0, m0());
        int iMax4 = Math.max(0, D());
        e.b[] bVarArr = this.f128227b0;
        boolean z11 = true;
        e.b bVar4 = bVarArr[1];
        e.b bVar5 = bVarArr[0];
        i0.f fVar = this.H1;
        if (fVar != null) {
            fVar.K++;
        }
        if (this.E1 == 0 && k.b(this.W1, 1)) {
            t0.h.j(this, H2());
            for (int i16 = 0; i16 < size; i16++) {
                e eVar = this.B1.get(i16);
                if (eVar.F0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof n) && !eVar.E0()) {
                    e.b bVarZ = eVar.z(0);
                    e.b bVarZ2 = eVar.z(1);
                    e.b bVar6 = e.b.MATCH_CONSTRAINT;
                    if (bVarZ != bVar6 || eVar.f128268w == 1 || bVarZ2 != bVar6 || eVar.f128270x == 1) {
                        S2(0, eVar, this.F1, new t0.b.a(), t0.b.a.f135868k);
                    }
                }
            }
        }
        char c11 = 2;
        if (size <= 2 || !((bVar5 == (bVar3 = e.b.WRAP_CONTENT) || bVar4 == bVar3) && k.b(this.W1, 1024) && t0.i.c(this, H2()))) {
            i10 = iMax4;
            i11 = iMax3;
            z10 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax3 >= m0() || iMax3 <= 0) {
                    iMax3 = m0();
                } else {
                    d2(iMax3);
                    this.Y1 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax4 >= D() || iMax4 <= 0) {
                    iMax4 = D();
                } else {
                    z1(iMax4);
                    this.Z1 = true;
                }
            }
            i10 = iMax4;
            i11 = iMax3;
            z10 = true;
        }
        boolean z12 = T2(64) || T2(128);
        i0.e eVar2 = this.I1;
        eVar2.f90188i = false;
        eVar2.f90189j = false;
        if (this.W1 != 0 && z12) {
            eVar2.f90189j = true;
        }
        ArrayList<e> arrayList = this.B1;
        e.b bVarH = H();
        e.b bVar7 = e.b.WRAP_CONTENT;
        boolean z13 = bVarH == bVar7 || j0() == bVar7;
        U2();
        for (int i17 = 0; i17 < size; i17++) {
            e eVar3 = this.B1.get(i17);
            if (eVar3 instanceof o) {
                ((o) eVar3).o2();
            }
        }
        boolean zT2 = T2(64);
        ?? r113 = z10;
        int i18 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i19 = i18 + 1;
            try {
                this.I1.W();
                U2();
                o(this.I1);
                int i20 = i15;
                while (i20 < size) {
                    i12 = i15;
                    try {
                        c10 = c11;
                        try {
                            this.B1.get(i20).o(this.I1);
                            i20++;
                            i15 = i12;
                            c11 = c10;
                        } catch (Exception e10) {
                            e = e10;
                            r18 = z11;
                            S2 = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (S2 != 0) {
                                A3 = a3(this.I1, k.f128352n);
                            } else {
                                k2(this.I1, zT2);
                                for (i13 = i12; i13 < size; i13++) {
                                    this.B1.get(i13).k2(this.I1, zT2);
                                }
                                A3 = i12;
                            }
                            if (z13) {
                                r19 = A3 == true ? 1 : 0;
                            } else {
                                r19 = A3 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f128253o0, m0());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > m0()) {
                                d2(iMax);
                                this.f128227b0[i12] = e.b.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.f128255p0, D());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > D()) {
                                z1(iMax2);
                                this.f128227b0[r18] = e.b.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                bVar = this.f128227b0[i12];
                                bVar2 = e.b.WRAP_CONTENT;
                                if (bVar == bVar2) {
                                    r14 = r17;
                                    r10 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r10 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.f128227b0[r10] == bVar2) {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i14 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i19 > i14) {
                                r16 = i12;
                            } else {
                                r16 = r112;
                            }
                            i18 = i19;
                            i15 = i12;
                            c11 = c10;
                            z11 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        c10 = c11;
                    }
                }
                i12 = i15;
                c10 = c11;
                S2 = s2(this.I1);
                WeakReference<d> weakReference = this.f128288b2;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z11;
                } else {
                    boolean z14 = z11;
                    try {
                        x2(this.f128288b2.get(), this.I1.s(this.R));
                        this.f128288b2 = null;
                        r18 = z14;
                    } catch (Exception e12) {
                        e = e12;
                        S2 = S2;
                        r18 = z14;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<d> weakReference2 = this.f128290d2;
                if (weakReference2 != null && weakReference2.get() != null) {
                    w2(this.f128290d2.get(), this.I1.s(this.T));
                    this.f128290d2 = null;
                }
                WeakReference<d> weakReference3 = this.f128289c2;
                if (weakReference3 != null && weakReference3.get() != null) {
                    x2(this.f128289c2.get(), this.I1.s(this.Q));
                    this.f128289c2 = null;
                }
                WeakReference<d> weakReference4 = this.f128291e2;
                if (weakReference4 != null && weakReference4.get() != null) {
                    w2(this.f128291e2.get(), this.I1.s(this.S));
                    this.f128291e2 = null;
                }
                if (S2 != 0) {
                    this.I1.R();
                }
            } catch (Exception e13) {
                e = e13;
                i12 = i15;
                r18 = z11;
                c10 = c11;
                S2 = r114;
            }
            if (S2 != 0) {
                A3 = a3(this.I1, k.f128352n);
            } else {
                k2(this.I1, zT2);
                while (i13 < size) {
                    this.B1.get(i13).k2(this.I1, zT2);
                }
                A3 = i12;
            }
            if (z13 || i19 >= 8 || !k.f128352n[c10]) {
                r19 = A3 == true ? 1 : 0;
            } else {
                int i21 = i12;
                int iMax5 = i21;
                int iMax6 = iMax5;
                while (i21 < size) {
                    r11 = A3;
                    e eVar4 = this.B1.get(i21);
                    iMax5 = Math.max(iMax5, eVar4.f128239h0 + eVar4.m0());
                    iMax6 = Math.max(iMax6, eVar4.f128241i0 + eVar4.D());
                    i21++;
                    r11 = r11 == true ? 1 : 0;
                }
                r11 = A3;
                ?? r116 = r11;
                int iMax7 = Math.max(this.f128253o0, iMax5);
                int iMax8 = Math.max(this.f128255p0, iMax6);
                e.b bVar8 = e.b.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (bVar5 == bVar8 && m0() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    d2(iMax7);
                    this.f128227b0[i12] = bVar8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (bVar4 == bVar8 && D() < iMax8) {
                    z1(iMax8);
                    this.f128227b0[r18] = bVar8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f128253o0, m0());
            r13 = r113;
            r110 = r19;
            if (iMax > m0()) {
                d2(iMax);
                this.f128227b0[i12] = e.b.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.f128255p0, D());
            r14 = r13;
            r111 = r110;
            if (iMax2 > D()) {
                z1(iMax2);
                this.f128227b0[r18] = e.b.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                bVar = this.f128227b0[i12];
                bVar2 = e.b.WRAP_CONTENT;
                if (bVar == bVar2 || i11 <= 0 || m0() <= i11) {
                    r14 = r17;
                    r10 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r12 = r18;
                    this.Y1 = r12;
                    this.f128227b0[i12] = e.b.FIXED;
                    d2(i11);
                    boolean z15 = r12 == true ? 1 : 0;
                    r111 = z15 ? 1 : 0;
                    r10 = r12;
                    r14 = z15;
                }
                if (this.f128227b0[r10] == bVar2 || i10 <= 0 || D() <= i10) {
                    r14 = r17;
                    i14 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.Z1 = r10;
                    this.f128227b0[r10] = e.b.FIXED;
                    z1(i10);
                    i14 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i14 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i19 > i14) {
                r16 = i12;
            } else {
                r16 = r112;
            }
            i18 = i19;
            i15 = i12;
            c11 = c10;
            z11 = true;
            r113 = r15;
            r114 = r16;
        }
        int i22 = i15;
        this.B1 = arrayList;
        if (r113 != 0) {
            e.b[] bVarArr2 = this.f128227b0;
            bVarArr2[i22] = bVar5;
            bVarArr2[1] = bVar4;
        }
        W0(this.I1.E());
    }

    public void r2(e eVar, int i10) {
        if (i10 == 0) {
            t2(eVar);
        } else if (i10 == 1) {
            y2(eVar);
        }
    }

    public boolean s2(i0.e eVar) {
        f fVar;
        i0.e eVar2;
        boolean zT2 = T2(64);
        g(eVar, zT2);
        int size = this.B1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar3 = this.B1.get(i10);
            eVar3.H1(0, false);
            eVar3.H1(1, false);
            if (eVar3 instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar4 = this.B1.get(i11);
                if (eVar4 instanceof a) {
                    ((a) eVar4).t2();
                }
            }
        }
        this.f128292f2.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar5 = this.B1.get(i12);
            if (eVar5.f()) {
                if (eVar5 instanceof n) {
                    this.f128292f2.add(eVar5);
                } else {
                    eVar5.g(eVar, zT2);
                }
            }
        }
        while (this.f128292f2.size() > 0) {
            int size2 = this.f128292f2.size();
            Iterator<e> it = this.f128292f2.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.p2(this.f128292f2)) {
                    nVar.g(eVar, zT2);
                    this.f128292f2.remove(nVar);
                    break;
                }
            }
            if (size2 == this.f128292f2.size()) {
                Iterator<e> it2 = this.f128292f2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(eVar, zT2);
                }
                this.f128292f2.clear();
            }
        }
        if (i0.e.f90176w) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar6 = this.B1.get(i13);
                if (!eVar6.f()) {
                    hashSet.add(eVar6);
                }
            }
            fVar = this;
            eVar2 = eVar;
            fVar.e(this, eVar2, hashSet, H() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar7 : hashSet) {
                k.a(this, eVar2, eVar7);
                eVar7.g(eVar2, zT2);
            }
        } else {
            fVar = this;
            eVar2 = eVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar8 = fVar.B1.get(i14);
                if (eVar8 instanceof f) {
                    e.b[] bVarArr = eVar8.f128227b0;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar8.E1(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar8.Z1(e.b.FIXED);
                    }
                    eVar8.g(eVar2, zT2);
                    if (bVar == bVar3) {
                        eVar8.E1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar8.Z1(bVar2);
                    }
                } else {
                    k.a(this, eVar2, eVar8);
                    if (!eVar8.f()) {
                        eVar8.g(eVar2, zT2);
                    }
                }
            }
        }
        if (fVar.N1 > 0) {
            b.b(this, eVar2, null, 0);
        }
        if (fVar.O1 > 0) {
            b.b(this, eVar2, null, 1);
        }
        return true;
    }

    public final void t2(e eVar) {
        int i10 = this.N1 + 1;
        c[] cVarArr = this.Q1;
        if (i10 >= cVarArr.length) {
            this.Q1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Q1[this.N1] = new c(eVar, 0, P2());
        this.N1++;
    }

    public void u2(d dVar) {
        WeakReference<d> weakReference = this.f128291e2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f128291e2.get().f()) {
            this.f128291e2 = new WeakReference<>(dVar);
        }
    }

    public void v2(d dVar) {
        WeakReference<d> weakReference = this.f128289c2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f128289c2.get().f()) {
            this.f128289c2 = new WeakReference<>(dVar);
        }
    }

    public final void w2(d dVar, i0.i iVar) {
        this.I1.h(iVar, this.I1.s(dVar), 0, 5);
    }

    public final void x2(d dVar, i0.i iVar) {
        this.I1.h(this.I1.s(dVar), iVar, 0, 5);
    }

    public final void y2(e eVar) {
        int i10 = this.O1 + 1;
        c[] cVarArr = this.P1;
        if (i10 >= cVarArr.length) {
            this.P1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.P1[this.O1] = new c(eVar, 1, P2());
        this.O1++;
    }

    public void z2(d dVar) {
        WeakReference<d> weakReference = this.f128290d2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f128290d2.get().f()) {
            this.f128290d2 = new WeakReference<>(dVar);
        }
    }

    public f(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.C1 = new t0.b(this);
        this.D1 = new t0.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new i0.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f128287a2 = 0;
        this.f128288b2 = null;
        this.f128289c2 = null;
        this.f128290d2 = null;
        this.f128291e2 = null;
        this.f128292f2 = new HashSet<>();
        this.f128293g2 = new t0.b.a();
    }

    public f(int i10, int i11) {
        super(i10, i11);
        this.C1 = new t0.b(this);
        this.D1 = new t0.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new i0.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f128287a2 = 0;
        this.f128288b2 = null;
        this.f128289c2 = null;
        this.f128290d2 = null;
        this.f128291e2 = null;
        this.f128292f2 = new HashSet<>();
        this.f128293g2 = new t0.b.a();
    }

    public f(String str, int i10, int i11) {
        super(i10, i11);
        this.C1 = new t0.b(this);
        this.D1 = new t0.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new i0.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f128287a2 = 0;
        this.f128288b2 = null;
        this.f128289c2 = null;
        this.f128290d2 = null;
        this.f128291e2 = null;
        this.f128292f2 = new HashSet<>();
        this.f128293g2 = new t0.b.a();
        k1(str);
    }
}

package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iln extends ywx {
    public static final b90 l0;
    public final g4f0 j0;
    public a k0;

    public final class a extends ykt {
        @Override // defpackage.xkt
        public final int G0(kt ktVar) {
            blt bltVar = this.E.E.V.q;
            bltVar.getClass();
            wkt wktVar = bltVar.H;
            if (!bltVar.z) {
                ysr ysrVar = bltVar.f;
                if (ysrVar.d == tsr.d.b) {
                    wktVar.f = true;
                    if (wktVar.b) {
                        ysrVar.f = true;
                        ysrVar.g = true;
                    }
                } else {
                    wktVar.g = true;
                }
            }
            a aVar = bltVar.U().k0;
            if (aVar != null) {
                aVar.z = true;
            }
            bltVar.J();
            a aVar2 = bltVar.U().k0;
            if (aVar2 != null) {
                aVar2.z = false;
            }
            Integer num = (Integer) wktVar.i.get(ktVar);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.J.h(iIntValue, ktVar);
            return iIntValue;
        }

        @Override // defpackage.mzo
        public final int R(int i) {
            zzo zzoVarG = this.E.E.G();
            aiv aivVarA = zzoVarG.a();
            tsr tsrVar = zzoVarG.a;
            return aivVarA.i(tsrVar.U.d, tsrVar.y(), i);
        }

        @Override // defpackage.mzo
        public final int a0(int i) {
            zzo zzoVarG = this.E.E.G();
            aiv aivVarA = zzoVarG.a();
            tsr tsrVar = zzoVarG.a;
            return aivVarA.e(tsrVar.U.d, tsrVar.y(), i);
        }

        @Override // defpackage.mzo
        public final int b0(int i) {
            zzo zzoVarG = this.E.E.G();
            aiv aivVarA = zzoVarG.a();
            tsr tsrVar = zzoVarG.a;
            return aivVarA.a(tsrVar.U.d, tsrVar.y(), i);
        }

        @Override // defpackage.vhv
        public final y d0(long j) {
            w0(j);
            ywx ywxVar = this.E;
            duw<tsr> duwVarK = ywxVar.E.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                blt bltVar = tsrVarArr[i2].V.q;
                bltVar.getClass();
                bltVar.y = tsr.f.c;
            }
            tsr tsrVar = ywxVar.E;
            m1(tsrVar.L.c(this, tsrVar.y(), j));
            return this;
        }

        @Override // defpackage.ykt
        public final void h1() {
            blt bltVar = this.E.E.V.q;
            bltVar.getClass();
            bltVar.K0();
        }

        @Override // defpackage.mzo
        public final int x(int i) {
            zzo zzoVarG = this.E.E.G();
            aiv aivVarA = zzoVarG.a();
            tsr tsrVar = zzoVarG.a;
            return aivVarA.g(tsrVar.U.d, tsrVar.y(), i);
        }
    }

    static {
        b90 b90VarA = c90.a();
        b90VarA.m(j58.g);
        b90VarA.r(1.0f);
        b90VarA.h(1);
        l0 = b90VarA;
    }

    public iln(tsr tsrVar) {
        super(tsrVar);
        g4f0 g4f0Var = new g4f0();
        g4f0Var.d = 0;
        this.j0 = g4f0Var;
        g4f0Var.v = this;
        this.k0 = tsrVar.v != null ? new a(this) : null;
    }

    @Override // defpackage.ywx
    public final d.c E1() {
        return this.j0;
    }

    @Override // defpackage.xkt
    public final int G0(kt ktVar) {
        a aVar = this.k0;
        if (aVar != null) {
            return aVar.G0(ktVar);
        }
        zhv zhvVar = this.E.V.p;
        vsr vsrVar = zhvVar.N;
        if (!zhvVar.B) {
            if (zhvVar.f.d == tsr.d.a) {
                vsrVar.f = true;
                if (vsrVar.b) {
                    zhvVar.L = true;
                    zhvVar.M = true;
                }
            } else {
                vsrVar.g = true;
            }
        }
        zhvVar.U().z = true;
        zhvVar.J();
        zhvVar.U().z = false;
        Integer num = (Integer) vsrVar.i.get(ktVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.mzo
    public final int R(int i) {
        zzo zzoVarG = this.E.G();
        aiv aivVarA = zzoVarG.a();
        tsr tsrVar = zzoVarG.a;
        return aivVarA.i(tsrVar.U.d, tsrVar.z(), i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.ywx
    public final void X1(ywx.e eVar, long j, iam iamVar, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        tsr[] tsrVarArr;
        int i3;
        tsr tsrVar;
        boolean z4;
        long jB;
        long j2 = j;
        tsr tsrVar2 = this.E;
        ywx.e eVar2 = eVar;
        if (eVar2.d(tsrVar2)) {
            if (u2(j2)) {
                i2 = i;
                z2 = z;
                z3 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(k1(j2, D1())) & Reader.READ_DONE) < 2139095040) {
                    z3 = true;
                    z2 = false;
                }
            }
            if (z3) {
                int i4 = iamVar.c;
                duw<tsr> duwVarJ = tsrVar2.J();
                tsrVarArr = duwVarJ.a;
                i3 = duwVarJ.c - 1;
                loop0: while (i3 >= 0) {
                    tsrVar = tsrVarArr[i3];
                    if (tsrVar.i()) {
                        int i5 = i2;
                        z4 = z2;
                        eVar2.c(tsrVar, j2, iamVar, i5, z4);
                        jB = iamVar.b();
                        if (ite.b(jB) < 0.0f && ite.d(jB) && !ite.c(jB)) {
                            ywx ywxVar = tsrVar.U.d;
                            ywxVar.getClass();
                            d.c cVarL1 = ywxVar.L1(dxx.g(16));
                            if (cVarL1 == null || !cVarL1.C) {
                                break;
                            }
                            if (!cVarL1.a.C) {
                                wkn.c("visitLocalDescendants called on an unattached node");
                            }
                            d.c cVar = cVarL1.a;
                            if ((cVar.d & 16) == 0) {
                                break;
                            }
                            while (true) {
                                if (cVar == null) {
                                    break loop0;
                                }
                                if ((cVar.c & 16) != 0) {
                                    ?? C = cVar;
                                    ?? duwVar = 0;
                                    while (C != 0) {
                                        if (C instanceof s020) {
                                            if (((s020) C).S1()) {
                                                iamVar.c = iamVar.a.b - 1;
                                                break;
                                            }
                                        } else if ((C.c & 16) != 0 && (C instanceof tkd)) {
                                            d.c cVar2 = ((tkd) C).E;
                                            int i6 = 0;
                                            while (cVar2 != null) {
                                                if ((cVar2.c & 16) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        C = C;
                                                        duwVar = duwVar;
                                                        duwVar = duwVar;
                                                        C = cVar2;
                                                    } else {
                                                        if (duwVar == 0) {
                                                            duwVar = new duw(new d.c[16]);
                                                        }
                                                        if (C != 0) {
                                                            duwVar.b(C);
                                                            C = 0;
                                                        }
                                                        duwVar.b(cVar2);
                                                    }
                                                } else {
                                                    C = C;
                                                    duwVar = duwVar;
                                                }
                                                cVar2 = cVar2.f;
                                                C = C;
                                                duwVar = duwVar;
                                            }
                                            if (i6 == 1) {
                                                C = C;
                                                duwVar = duwVar;
                                            } else {
                                                C = C;
                                                duwVar = duwVar;
                                            }
                                        }
                                        C = pkd.c(duwVar);
                                    }
                                }
                                cVar = cVar.f;
                            }
                        }
                    } else {
                        z4 = z2;
                    }
                    i3--;
                    eVar2 = eVar;
                    j2 = j;
                    z2 = z4;
                    i2 = i;
                }
                iamVar.c = i4;
            }
        }
        i2 = i;
        z2 = z;
        z3 = false;
        if (z3) {
            int i7 = iamVar.c;
            duw<tsr> duwVarJ2 = tsrVar2.J();
            tsrVarArr = duwVarJ2.a;
            i3 = duwVarJ2.c - 1;
            loop0: while (i3 >= 0) {
                tsrVar = tsrVarArr[i3];
                if (tsrVar.i()) {
                    int i8 = i2;
                    z4 = z2;
                    eVar2.c(tsrVar, j2, iamVar, i8, z4);
                    jB = iamVar.b();
                    if (ite.b(jB) < 0.0f) {
                        continue;
                    }
                } else {
                    z4 = z2;
                }
                i3--;
                eVar2 = eVar;
                j2 = j;
                z2 = z4;
                i2 = i;
            }
            iamVar.c = i7;
        }
    }

    @Override // defpackage.mzo
    public final int a0(int i) {
        zzo zzoVarG = this.E.G();
        aiv aivVarA = zzoVarG.a();
        tsr tsrVar = zzoVarG.a;
        return aivVarA.e(tsrVar.U.d, tsrVar.z(), i);
    }

    @Override // defpackage.mzo
    public final int b0(int i) {
        zzo zzoVarG = this.E.G();
        aiv aivVarA = zzoVarG.a();
        tsr tsrVar = zzoVarG.a;
        return aivVarA.a(tsrVar.U.d, tsrVar.z(), i);
    }

    @Override // defpackage.vhv
    public final y d0(long j) {
        if (this.G) {
            a aVar = this.k0;
            aVar.getClass();
            j = aVar.d;
        }
        w0(j);
        tsr tsrVar = this.E;
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsrVarArr[i2].V.p.A = tsr.f.c;
        }
        m2(tsrVar.L.c(this, tsrVar.z(), j));
        e2();
        return this;
    }

    @Override // defpackage.ywx
    public final void i2(lc6 lc6Var, v6l v6lVar) throws Throwable {
        tsr tsrVar = this.E;
        wgz wgzVarA = xsr.a(tsrVar);
        duw<tsr> duwVarJ = tsrVar.J();
        tsr[] tsrVarArr = duwVarJ.a;
        int i = duwVarJ.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar2 = tsrVarArr[i2];
            if (tsrVar2.i()) {
                tsrVar2.w(lc6Var, v6lVar);
            }
        }
        if (wgzVarA.getShowLayoutBounds()) {
            long j = this.c;
            lc6Var.v(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, l0);
        }
    }

    @Override // defpackage.ywx
    public final void o1() {
        if (this.k0 == null) {
            this.k0 = new a(this);
        }
    }

    @Override // defpackage.ywx, androidx.compose.ui.layout.y
    public final void r0(long j, float f, v6l v6lVar) {
        super.r0(j, f, v6lVar);
        if (this.y) {
            return;
        }
        this.E.V.p.N0();
    }

    @Override // defpackage.ywx, androidx.compose.ui.layout.y
    public final void t0(long j, float f, Function1<? super a7l, Unit> function1) {
        super.t0(j, f, function1);
        if (this.y) {
            return;
        }
        this.E.V.p.N0();
    }

    @Override // defpackage.mzo
    public final int x(int i) {
        zzo zzoVarG = this.E.G();
        aiv aivVarA = zzoVarG.a();
        tsr tsrVar = zzoVarG.a;
        return aivVarA.g(tsrVar.U.d, tsrVar.z(), i);
    }

    @Override // defpackage.ywx
    public final ykt x1() {
        return this.k0;
    }
}

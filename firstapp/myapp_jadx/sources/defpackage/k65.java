package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class k65 {
    public static final void a(final op8 op8Var, d dVar, final l65 l65Var, final float f, float f2, final qx80 qx80Var, final long j, long j2, final float f3, final Function2 function2, final boolean z, gaj gajVar, final long j3, long j4, final op8 op8Var2, a aVar, final int i) {
        d dVar2;
        final float f4;
        final long j5;
        final gaj gajVar2;
        final long j6;
        gaj gajVar3;
        long j7;
        long jB;
        float f5;
        b bVarI = aVar.i(920075480);
        int i2 = i | 48 | (bVarI.M(l65Var) ? 256 : 128) | 24576 | (bVarI.M(qx80Var) ? 131072 : 65536) | 104857600;
        if ((i & 805306368) == 0) {
            i2 |= bVarI.c(f3) ? 536870912 : 268435456;
        }
        if (bVarI.q(i2 & 1, (306783379 & i2) != 306783378)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                float f6 = c55.b;
                long jB2 = g68.b(j, bVarI);
                gajVar3 = ht8.a;
                j7 = jB2;
                jB = g68.b(j3, bVarI);
                f5 = f6;
                dVar2 = d.a.b;
            } else {
                bVarI.G();
                dVar2 = dVar;
                f5 = f2;
                j7 = j2;
                gajVar3 = gajVar;
                jB = j4;
            }
            bVarI.Y();
            d dVarB = androidx.compose.foundation.a.b(j.e(dVar2, 1.0f), j3, zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            long j8 = jB;
            j730 j730VarA = tp0.a(j8, iza.a);
            float f7 = f5;
            hna.a(j730VarA, pp8.b(999829022, new t55(l65Var, op8Var2, f, f7, z, qx80Var, j, j7, f3, function2, op8Var, gajVar3), bVarI), bVarI, 56);
            bVarI.X(true);
            f4 = f7;
            j5 = j7;
            gajVar2 = gajVar3;
            j6 = j8;
        } else {
            bVarI.G();
            dVar2 = dVar;
            f4 = f2;
            j5 = j2;
            gajVar2 = gajVar;
            j6 = j4;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2() { // from class: k55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    k65.a(op8Var, dVar3, l65Var, f, f4, qx80Var, j, j5, f3, function2, z, gajVar2, j3, j6, op8Var2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final op8 op8Var, final op8 op8Var2, final op8 op8Var3, final Function0 function0, final j590 j590Var, a aVar, final int i) {
        b bVarI = aVar.i(-1217723575);
        int i2 = (bVarI.A(null) ? 4 : 2) | i | (bVarI.A(function0) ? 16384 : 8192) | (bVarI.M(j590Var) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            List listK = kotlin.collections.b.k(ht8.b, op8Var, op8Var2, op8Var3);
            boolean z = ((i2 & 57344) == 16384) | ((458752 & i2) == 131072);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new v55(j590Var, function0);
                bVarI.r(objY);
            }
            z8w z8wVar = (z8w) objY;
            op8 op8VarB = lsr.b(listK);
            boolean zM = bVarI.M(z8wVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new a9w(z8wVar);
                bVarI.r(objY2);
            }
            aiv aivVar = (aiv) objY2;
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVar, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            w1i.a(0, op8VarB, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var2, op8Var3, function0, j590Var, i) { // from class: p55
                public final /* synthetic */ op8 b;
                public final /* synthetic */ op8 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ j590 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3505);
                    k65.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final j590 j590Var, final float f, final float f2, final boolean z, final qx80 qx80Var, final long j, final long j2, final float f3, final Function2 function2, final op8 op8Var, a aVar, final int i) {
        b bVar;
        d dVarA;
        b bVarI = aVar.i(-2108849428);
        int i2 = i | (bVarI.M(j590Var) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.c(f2) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.M(qx80Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.e(j) ? 131072 : 65536) | (bVarI.e(j2) ? 1048576 : 524288) | (bVarI.c(0.0f) ? 8388608 : 4194304) | (bVarI.c(f3) ? 67108864 : 33554432) | (bVarI.A(function2) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && ((bVarI.A(op8Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            z5w z5wVar = z5w.a;
            final goh gohVarB = a6w.b(z5wVar, bVarI);
            final goh gohVarB2 = a6w.b(z5wVar, bVarI);
            final goh gohVarB3 = a6w.b(z5w.d, bVarI);
            int i3 = i2 & 14;
            boolean zA = (i3 == 4) | bVarI.A(gohVarB2) | bVarI.A(gohVarB3) | bVarI.A(gohVarB);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: l55
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        j590 j590Var2 = j590Var;
                        j590Var2.f = gohVarB2;
                        j590Var2.g = gohVarB3;
                        j590Var2.d = gohVarB;
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            i3z i3zVar = i3z.a;
            final float fC1 = ((mmd) bVarI.O(kna.h)).C1(f);
            d.a aVar2 = d.a.b;
            if (z) {
                bVarI.N(2049456610);
                boolean zM = bVarI.M(j590Var.e);
                Object objY3 = bVarI.y();
                if (zM || objY3 == c0042a) {
                    Function1 function1 = new Function1() { // from class: m55
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ej5.c(v5bVar, null, null, new j65(j590Var, ((Float) obj).floatValue(), null), 3);
                            return Unit.a;
                        }
                    };
                    gzg0 gzg0Var = b590.a;
                    objY3 = new y490(j590Var, function1);
                    bVarI.r(objY3);
                }
                dVarA = androidx.compose.ui.input.nestedscroll.a.a(aVar2, (flx) objY3, null);
                bVarI.X(false);
            } else {
                bVarI.N(2049851798);
                bVarI.X(false);
                dVarA = aVar2;
            }
            d dVarN = j.m(j.g(j.y(aVar2, 0.0f, f2, 1), 1.0f), f, Float.NaN).n(dVarA);
            c20<k590> c20Var = j590Var.e;
            boolean zC = (i3 == 4) | bVarI.c(fC1);
            Object objY4 = bVarI.y();
            if (zC || objY4 == c0042a) {
                objY4 = new Function2() { // from class: n55
                    /* JADX WARN: Code duplicated, block: B:20:0x006a A[PHI: r7
                      0x006a: PHI (r7v6 k590) = (r7v5 k590), (r7v7 k590), (r7v8 k590), (r7v9 k590), (r7v10 k590), (r7v11 k590), (r7v12 k590) binds: [B:39:0x00a4, B:30:0x0089, B:33:0x0092, B:36:0x009b, B:19:0x0068, B:22:0x0072, B:25:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        k590 k590Var;
                        float fH = kxa.h(((kxa) obj2).a);
                        float f4 = (int) (((jxo) obj).a & 4294967295L);
                        o9f o9fVar = new o9f();
                        j590 j590Var2 = j590Var;
                        boolean z2 = j590Var2.a;
                        float f5 = fC1;
                        if (!z2) {
                            o9fVar.a(k590.c, fH - f5);
                        }
                        if (f4 != f5) {
                            o9fVar.a(k590.b, Math.max(fH - f4, 0.0f));
                        }
                        if (!j590Var2.c) {
                            o9fVar.a(k590.a, fH);
                        }
                        Unit unit = Unit.a;
                        LinkedHashMap linkedHashMap = o9fVar.a;
                        bou bouVar = new bou(linkedHashMap);
                        k590 k590Var2 = (k590) j590Var2.e.h.getValue();
                        int iOrdinal = k590Var2.ordinal();
                        if (iOrdinal == 0) {
                            k590Var = k590.a;
                            if (linkedHashMap.containsKey(k590Var)) {
                                k590Var2 = k590Var;
                            }
                        } else if (iOrdinal == 1) {
                            k590Var = k590.b;
                            if (linkedHashMap.containsKey(k590Var)) {
                                k590Var2 = k590Var;
                            } else {
                                k590Var = k590.c;
                                if (linkedHashMap.containsKey(k590Var)) {
                                    k590Var2 = k590Var;
                                } else {
                                    k590Var = k590.a;
                                    if (linkedHashMap.containsKey(k590Var)) {
                                        k590Var2 = k590Var;
                                    }
                                }
                            }
                        } else {
                            if (iOrdinal != 2) {
                                uhc.a();
                                return null;
                            }
                            k590Var = k590.c;
                            if (linkedHashMap.containsKey(k590Var)) {
                                k590Var2 = k590Var;
                            } else {
                                k590Var = k590.b;
                                if (linkedHashMap.containsKey(k590Var)) {
                                    k590Var2 = k590Var;
                                } else {
                                    k590Var = k590.a;
                                    if (linkedHashMap.containsKey(k590Var)) {
                                        k590Var2 = k590Var;
                                    }
                                }
                            }
                        }
                        return new Pair(bouVar, k590Var2);
                    }
                };
                bVarI.r(objY4);
            }
            d dVarA2 = androidx.compose.material3.internal.a.a(dVarN, c20Var, (Function2) objY4);
            c20<k590> c20Var2 = j590Var.e;
            d dVarA3 = androidx.compose.ui.graphics.a.a(y9f.a(dVarA2, c20Var2.f, i3zVar, z, null, ((x5a0) c20Var2.l).getValue() != null, null, new b10(c20Var2, null), false, 32), new i55(j590Var, 0));
            op8 op8VarB = pp8.b(1508311921, new i65(j590Var, function2, op8Var, v5bVar, z), bVarI);
            int i4 = i2 >> 9;
            bVar = bVarI;
            ihe0.a(dVarA3, qx80Var, j, j2, 0.0f, f3, null, op8VarB, bVar, (i4 & 458752) | (i4 & 112) | 12582912 | (i4 & 896) | (i4 & 7168) | (57344 & i4), 64);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f2, z, qx80Var, j, j2, f3, function2, op8Var, i) { // from class: o55
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ qx80 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long i;
                public final /* synthetic */ float v;
                public final /* synthetic */ Function2 w;
                public final /* synthetic */ op8 y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k65.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final l65 d(j590 j590Var, a aVar, int i) {
        if ((i & 1) != 0) {
            j590Var = e(0, 7, aVar);
        }
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (objY == obj) {
            objY = new v3a0();
            aVar.r(objY);
        }
        v3a0 v3a0Var = (v3a0) objY;
        boolean zM = aVar.M(j590Var) | aVar.M(v3a0Var);
        Object objY2 = aVar.y();
        if (zM || objY2 == obj) {
            objY2 = new l65(j590Var, v3a0Var);
            aVar.r(objY2);
        }
        return (l65) objY2;
    }

    public static final j590 e(int i, int i2, a aVar) {
        k590 k590Var = k590.b;
        if ((i2 & 1) != 0) {
            k590Var = k590.c;
        }
        k590 k590Var2 = k590Var;
        Object objY = aVar.y();
        if (objY == a.C0041a.a) {
            objY = new x00(1);
            aVar.r(objY);
        }
        return b590.b(false, (Function1) objY, k590Var2, (i2 & 4) != 0, aVar, ((i << 6) & 896) | ((i << 3) & 7168), 49);
    }
}

package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class dg1 {
    public static final void a(final String str, final d dVar, final imf0 imf0Var, final long j, tmz tmzVar, final long j2, a aVar, final int i) {
        final tmz umzVar;
        int i2;
        int i3;
        str.getClass();
        b bVarI = aVar.i(1376998316);
        int i4 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16) | (bVarI.M(imf0Var) ? 256 : 128) | (bVarI.d(3) ? 131072 : 65536) | 524288;
        boolean z = true;
        if (bVarI.q(i4 & 1, (4793491 & i4) != 4793490)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                i2 = i4 & (-3670017);
            } else {
                bVarI.G();
                i2 = i4 & (-3670017);
                umzVar = tmzVar;
            }
            bVarI.Y();
            long jF = imf0Var.a.b;
            if ((jF & 1095216660480L) == 0) {
                jF = d2l.f(16);
            }
            d dVarE = h.e(dVar, umzVar);
            boolean zE = ((i2 & 14) == 4) | bVarI.e(jF) | ((i2 & 896) == 256);
            if ((((458752 & i2) ^ 196608) <= 131072 || !bVarI.d(3)) && (i2 & 196608) != 131072) {
                z = false;
            }
            boolean z2 = zE | z;
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                final long j3 = jF;
                i3 = 0;
                Function2 function2 = new Function2() { // from class: zf1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.ui.layout.y] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        long j4;
                        ?? D0;
                        rce0 rce0Var = (rce0) obj;
                        final kxa kxaVar = (kxa) obj2;
                        rce0Var.getClass();
                        final cq40 cq40Var = new cq40();
                        cq40Var.a = j3;
                        final dq40 dq40Var = new dq40();
                        final dq40 dq40Var2 = new dq40();
                        while (true) {
                            Float fValueOf = Float.valueOf(omf0.c(cq40Var.a));
                            final String str2 = str;
                            final imf0 imf0Var2 = imf0Var;
                            final long j5 = j2;
                            vhv vhvVar = rce0Var.K(fValueOf, new op8(-301795156, new Function2() { // from class: bg1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        String strConcat = str2;
                                        if (strConcat.length() >= 8) {
                                            strConcat = wae0.K(7, strConcat).concat("x");
                                        }
                                        imf0 imf0VarB = imf0.b(imf0Var2, 0L, cq40Var.a, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                                        gdf0 gdf0Var = new gdf0(3);
                                        final dq40 dq40Var3 = dq40Var2;
                                        lkf0.b(strConcat, null, j5, 0L, null, null, null, 0L, gdf0Var, 0L, 0, false, 1, 0, new Function1() { // from class: yf1
                                            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, ukf0] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj5) {
                                                ?? r1 = (ukf0) obj5;
                                                r1.getClass();
                                                dq40Var3.a = r1;
                                                return Unit.a;
                                            }
                                        }, imf0VarB, aVar2, 0, 0, 24058);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true)).get(0);
                            j4 = kxaVar.a;
                            D0 = vhvVar.d0(j4);
                            ukf0 ukf0Var = (ukf0) dq40Var2.a;
                            if (ukf0Var != null && (ukf0Var.d() || ukf0Var.e())) {
                                long j6 = cq40Var.a;
                                long j7 = j;
                                d2l.b(j6, j7);
                                if (Float.compare(omf0.c(j6), omf0.c(j7)) <= 0) {
                                    break;
                                }
                                cq40Var.a = gkw.a(0.9f, cq40Var.a, 4294967296L);
                            } else {
                                break;
                            }
                        }
                        dq40Var.a = D0;
                        int i5 = kxa.i(j4);
                        y yVar = (y) dq40Var.a;
                        return t.z1(rce0Var, i5, yVar != null ? yVar.b : kxa.j(j4), new Function1() { // from class: cg1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                y.a aVar2 = (y.a) obj3;
                                aVar2.getClass();
                                dq40 dq40Var3 = dq40Var;
                                y yVar2 = (y) dq40Var3.a;
                                if (yVar2 != null) {
                                    y.a.A(aVar2, yVar2, (kxa.i(kxaVar.a) - ((y) dq40Var3.a).a) / 2, 0);
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(function2);
                objY = function2;
            } else {
                i3 = 0;
            }
            f0.a(dVarE, (Function2) objY, bVarI, i3, i3);
        } else {
            bVarI.G();
            umzVar = tmzVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, j, j2, umzVar, imf0Var, dVar, str) { // from class: ag1
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;
                public final /* synthetic */ imf0 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ tmz e;
                public final /* synthetic */ long f;

                {
                    this.a = str;
                    this.b = dVar;
                    this.c = imf0Var;
                    this.d = j;
                    this.e = umzVar;
                    this.f = j2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(12610561);
                    dg1.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

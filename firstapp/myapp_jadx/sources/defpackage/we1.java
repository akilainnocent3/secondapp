package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class we1 {
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void a(final String str, final d dVar, final imf0 imf0Var, final long j, long j2, long j3, int i, tmz tmzVar, a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z;
        final long j4;
        final tmz tmzVar2;
        final int i6;
        final long j5;
        e eVarZ;
        long jG0;
        int i7;
        final int i8;
        final long j6;
        long j7;
        int i9;
        final tmz umzVar;
        str.getClass();
        b bVarI = aVar.i(572315708);
        int i10 = (bVarI.M(str) ? 4 : 2) | i2 | (bVarI.M(dVar) ? 32 : 16) | (bVarI.M(imf0Var) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i10 |= bVarI.e(j) ? 2048 : 1024;
        }
        int i11 = i10 | 65536;
        if ((i3 & 64) == 0) {
            i4 = i;
            int i12 = bVarI.d(i4) ? 1048576 : 524288;
            i5 = i11 | i12 | 4194304;
            if ((4785299 & i5) != 4785298) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) != 0 || bVarI.h0()) {
                    if ((i3 & 16) != 0) {
                        jG0 = ((mmd) bVarI.O(kna.h)).g0(((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources().getDimension(R.dimen._16ssp));
                        i5 &= -57345;
                    } else {
                        jG0 = j2;
                    }
                    long jG1 = ((mmd) bVarI.O(kna.h)).g0(((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources().getDimension(R.dimen._8ssp));
                    i7 = i5 & (-458753);
                    if ((i3 & 64) != 0) {
                        i7 = i5 & (-4128769);
                        i4 = 3;
                    }
                    i8 = i4;
                    j6 = jG1;
                    j7 = jG0;
                    i9 = i7 & (-29360129);
                    umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    bVarI.G();
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    int i13 = i5 & (-458753);
                    if ((i3 & 64) != 0) {
                        i13 = i5 & (-4128769);
                    }
                    int i14 = i13 & (-29360129);
                    j7 = j2;
                    umzVar = tmzVar;
                    i9 = i14;
                    i8 = i4;
                    j6 = j3;
                }
                bVarI.Y();
                q75.a(dVar, null, false, pp8.b(-1088037742, new gaj() { // from class: ne1
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        r75 r75Var = (r75) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        r75Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            r75Var.d();
                            d dVarG = j.g(d.a.b, 1.0f);
                            aiv aivVarC = g75.c(ht.a.a, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarG);
                            yka.k.getClass();
                            tsr.a aVar3 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar3);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC, yka.a.f);
                            hlh0.a(aVar2, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, yka.a.d);
                            final imf0 imf0Var2 = imf0Var;
                            long jF = imf0Var2.a.b;
                            if ((1095216660480L & jF) == 0) {
                                jF = d2l.f(16);
                            }
                            final long j8 = jF;
                            d dVarE = h.e(dVar, umzVar);
                            boolean zE = aVar2.e(j8) | aVar2.M(imf0Var2);
                            final String str2 = str;
                            boolean zM = zE | aVar2.M(str2);
                            final long j9 = j;
                            boolean zE2 = zM | aVar2.e(j9);
                            final int i15 = i8;
                            boolean zD = zE2 | aVar2.d(i15);
                            final long j10 = j6;
                            boolean zE3 = aVar2.e(j10) | zD;
                            Object objY = aVar2.y();
                            if (zE3 || objY == a.C0041a.a) {
                                Function2 function2 = new Function2() { // from class: re1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.ui.layout.y] */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        final int i16;
                                        long j11;
                                        ?? D0;
                                        rce0 rce0Var = (rce0) obj4;
                                        final kxa kxaVar = (kxa) obj5;
                                        rce0Var.getClass();
                                        final cq40 cq40Var = new cq40();
                                        cq40Var.a = j8;
                                        final dq40 dq40Var = new dq40();
                                        final dq40 dq40Var2 = new dq40();
                                        while (true) {
                                            Float fValueOf = Float.valueOf(omf0.c(cq40Var.a));
                                            final imf0 imf0Var3 = imf0Var2;
                                            final String str3 = str2;
                                            final long j12 = j9;
                                            i16 = i15;
                                            vhv vhvVar = rce0Var.K(fValueOf, new op8(47130776, new Function2() { // from class: te1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj6, Object obj7) {
                                                    a aVar4 = (a) obj6;
                                                    int iIntValue2 = ((Integer) obj7).intValue();
                                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        lkf0.b(str3, null, j12, 0L, null, null, null, 0L, new gdf0(i16), 0L, 0, false, 1, 0, new ve1(dq40Var2, 0), imf0.b(imf0Var3, 0L, cq40Var.a, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), aVar4, 0, 3072, 24058);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true)).get(0);
                                            j11 = kxaVar.a;
                                            D0 = vhvVar.d0(j11);
                                            ukf0 ukf0Var = (ukf0) dq40Var2.a;
                                            if (ukf0Var != null && (ukf0Var.d() || ukf0Var.e())) {
                                                long j13 = cq40Var.a;
                                                long j14 = j10;
                                                d2l.b(j13, j14);
                                                if (Float.compare(omf0.c(j13), omf0.c(j14)) <= 0) {
                                                    break;
                                                }
                                                cq40Var.a = gkw.a(0.9f, cq40Var.a, 4294967296L);
                                            } else {
                                                break;
                                            }
                                        }
                                        dq40Var.a = D0;
                                        int i17 = kxa.i(j11);
                                        y yVar = (y) dq40Var.a;
                                        return t.z1(rce0Var, i17, yVar != null ? yVar.b : kxa.j(j11), new Function1() { // from class: ue1
                                            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                int i18;
                                                long j15 = kxaVar.a;
                                                y.a aVar4 = (y.a) obj6;
                                                aVar4.getClass();
                                                int i19 = i16;
                                                dq40 dq40Var3 = dq40Var;
                                                if (i19 == 5 || i19 == 1) {
                                                    i18 = 0;
                                                } else if (i19 == 3) {
                                                    int i20 = kxa.i(j15);
                                                    T t = dq40Var3.a;
                                                    t.getClass();
                                                    i18 = (i20 - ((y) t).a) / 2;
                                                } else if (i19 == 6 || i19 == 2) {
                                                    int i21 = kxa.i(j15);
                                                    T t2 = dq40Var3.a;
                                                    t2.getClass();
                                                    i18 = i21 - ((y) t2).a;
                                                } else {
                                                    i18 = 0;
                                                }
                                                y yVar2 = (y) dq40Var3.a;
                                                if (yVar2 != null) {
                                                    y.a.A(aVar4, yVar2, i18, 0);
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    }
                                };
                                aVar2.r(function2);
                                objY = function2;
                            }
                            f0.a(dVarE, (Function2) objY, aVar2, 0, 0);
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i9 >> 3) & 14) | 3072, 6);
                i6 = i8;
                j4 = j6;
                tmzVar2 = umzVar;
                j5 = j7;
            } else {
                bVarI.G();
                j4 = j3;
                tmzVar2 = tmzVar;
                i6 = i4;
                j5 = j2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: pe1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        we1.a(str, dVar, imf0Var, j, j5, j4, i6, tmzVar2, (a) obj, iA, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 = i;
        i5 = i11 | i12 | 4194304;
        if ((4785299 & i5) != 4785298) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i5 & 1, z)) {
            bVarI.A0();
            if ((i2 & 1) != 0) {
                if ((i3 & 16) != 0) {
                    jG0 = ((mmd) bVarI.O(kna.h)).g0(((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources().getDimension(R.dimen._16ssp));
                    i5 &= -57345;
                } else {
                    jG0 = j2;
                }
                long jG2 = ((mmd) bVarI.O(kna.h)).g0(((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources().getDimension(R.dimen._8ssp));
                i7 = i5 & (-458753);
                if ((i3 & 64) != 0) {
                    i7 = i5 & (-4128769);
                    i4 = 3;
                }
                i8 = i4;
                j6 = jG2;
                j7 = jG0;
                i9 = i7 & (-29360129);
                umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                if ((i3 & 16) != 0) {
                    jG0 = ((mmd) bVarI.O(kna.h)).g0(((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources().getDimension(R.dimen._16ssp));
                    i5 &= -57345;
                } else {
                    jG0 = j2;
                }
                long jG3 = ((mmd) bVarI.O(kna.h)).g0(((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources().getDimension(R.dimen._8ssp));
                i7 = i5 & (-458753);
                if ((i3 & 64) != 0) {
                    i7 = i5 & (-4128769);
                    i4 = 3;
                }
                i8 = i4;
                j6 = jG3;
                j7 = jG0;
                i9 = i7 & (-29360129);
                umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
            }
            bVarI.Y();
            q75.a(dVar, null, false, pp8.b(-1088037742, new gaj() { // from class: ne1
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        r75Var.d();
                        d dVarG = j.g(d.a.b, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        final imf0 imf0Var2 = imf0Var;
                        long jF = imf0Var2.a.b;
                        if ((1095216660480L & jF) == 0) {
                            jF = d2l.f(16);
                        }
                        final long j8 = jF;
                        d dVarE = h.e(dVar, umzVar);
                        boolean zE = aVar2.e(j8) | aVar2.M(imf0Var2);
                        final String str2 = str;
                        boolean zM = zE | aVar2.M(str2);
                        final long j9 = j;
                        boolean zE2 = zM | aVar2.e(j9);
                        final int i15 = i8;
                        boolean zD = zE2 | aVar2.d(i15);
                        final long j10 = j6;
                        boolean zE3 = aVar2.e(j10) | zD;
                        Object objY = aVar2.y();
                        if (zE3 || objY == a.C0041a.a) {
                            Function2 function2 = new Function2() { // from class: re1
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.ui.layout.y] */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    final int i16;
                                    long j11;
                                    ?? D0;
                                    rce0 rce0Var = (rce0) obj4;
                                    final kxa kxaVar = (kxa) obj5;
                                    rce0Var.getClass();
                                    final cq40 cq40Var = new cq40();
                                    cq40Var.a = j8;
                                    final dq40 dq40Var = new dq40();
                                    final dq40 dq40Var2 = new dq40();
                                    while (true) {
                                        Float fValueOf = Float.valueOf(omf0.c(cq40Var.a));
                                        final imf0 imf0Var3 = imf0Var2;
                                        final String str3 = str2;
                                        final long j12 = j9;
                                        i16 = i15;
                                        vhv vhvVar = rce0Var.K(fValueOf, new op8(47130776, new Function2() { // from class: te1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                a aVar4 = (a) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    lkf0.b(str3, null, j12, 0L, null, null, null, 0L, new gdf0(i16), 0L, 0, false, 1, 0, new ve1(dq40Var2, 0), imf0.b(imf0Var3, 0L, cq40Var.a, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), aVar4, 0, 3072, 24058);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true)).get(0);
                                        j11 = kxaVar.a;
                                        D0 = vhvVar.d0(j11);
                                        ukf0 ukf0Var = (ukf0) dq40Var2.a;
                                        if (ukf0Var != null && (ukf0Var.d() || ukf0Var.e())) {
                                            long j13 = cq40Var.a;
                                            long j14 = j10;
                                            d2l.b(j13, j14);
                                            if (Float.compare(omf0.c(j13), omf0.c(j14)) <= 0) {
                                                break;
                                            }
                                            cq40Var.a = gkw.a(0.9f, cq40Var.a, 4294967296L);
                                        } else {
                                            break;
                                        }
                                    }
                                    dq40Var.a = D0;
                                    int i17 = kxa.i(j11);
                                    y yVar = (y) dq40Var.a;
                                    return t.z1(rce0Var, i17, yVar != null ? yVar.b : kxa.j(j11), new Function1() { // from class: ue1
                                        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i18;
                                            long j15 = kxaVar.a;
                                            y.a aVar4 = (y.a) obj6;
                                            aVar4.getClass();
                                            int i19 = i16;
                                            dq40 dq40Var3 = dq40Var;
                                            if (i19 == 5 || i19 == 1) {
                                                i18 = 0;
                                            } else if (i19 == 3) {
                                                int i20 = kxa.i(j15);
                                                T t = dq40Var3.a;
                                                t.getClass();
                                                i18 = (i20 - ((y) t).a) / 2;
                                            } else if (i19 == 6 || i19 == 2) {
                                                int i21 = kxa.i(j15);
                                                T t2 = dq40Var3.a;
                                                t2.getClass();
                                                i18 = i21 - ((y) t2).a;
                                            } else {
                                                i18 = 0;
                                            }
                                            y yVar2 = (y) dq40Var3.a;
                                            if (yVar2 != null) {
                                                y.a.A(aVar4, yVar2, i18, 0);
                                            }
                                            return Unit.a;
                                        }
                                    });
                                }
                            };
                            aVar2.r(function2);
                            objY = function2;
                        }
                        f0.a(dVarE, (Function2) objY, aVar2, 0, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i9 >> 3) & 14) | 3072, 6);
            i6 = i8;
            j4 = j6;
            tmzVar2 = umzVar;
            j5 = j7;
        } else {
            bVarI.G();
            j4 = j3;
            tmzVar2 = tmzVar;
            i6 = i4;
            j5 = j2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pe1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    we1.a(str, dVar, imf0Var, j, j5, j4, i6, tmzVar2, (a) obj, iA, i3);
                    return Unit.a;
                }
            };
        }
    }
}

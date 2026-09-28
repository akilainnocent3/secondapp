package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import com.sportygames.vip.data.TurboUsageCountResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes8.dex */
public final class lyg0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final lei0 lei0Var, final TurboUsageCountResponse turboUsageCountResponse, d dVar, float f, float f2, long j, long j2, long j3, long j4, final boolean z, final boolean z2, a aVar, final int i) {
        int i2;
        final d dVar2;
        final float fC;
        final float f3;
        final long jB;
        final long j5;
        final long j6;
        b bVar;
        final long j7;
        final long jD;
        final long jD2;
        final float f4;
        final d dVar3;
        final long j8;
        Double turboValue;
        b bVarI = aVar.i(-833803439);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(lei0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(turboUsageCountResponse) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.d(R.drawable.turbo_prog) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.d(R.drawable.turbo_activated) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 = 90112 | i2;
        }
        int i4 = 920125440 | i3;
        if (bVarI.q(i4 & 1, ((306783379 & i4) == 306783378 && ((((bVarI.b(z) ? ' ' : (char) 16) | 6) | (bVarI.b(z2) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                fC = i18.c(R.dimen._23sdp, 6, bVarI);
                jB = r58.b(1711276032);
                long jB2 = r58.b(452984831);
                jD = r58.d(4289572269L);
                jD2 = r58.d(4294952489L);
                f4 = 2.0f;
                dVar3 = d.a.b;
                j8 = jB2;
            } else {
                bVarI.G();
                dVar3 = dVar;
                fC = f;
                f4 = f2;
                jB = j;
                j8 = j2;
                jD = j3;
                jD2 = j4;
            }
            bVarI.Y();
            ytw ytwVarA = n95.a(lei0Var.e, new com.sportygames.newcms.b(0), null, bVarI, 0, 2);
            double dDoubleValue = (turboUsageCountResponse == null || (turboValue = turboUsageCountResponse.getTurboValue()) == null) ? 0.0d : turboValue.doubleValue();
            final twd0<Boolean> twd0Var = gci0.x;
            final twd0 twd0VarB = xe0.b((float) f.c(dDoubleValue / 100.0d, 0.0d, 1.0d), yi0.e(500, 0, null, 6), "turboProgress", null, bVarI, 3120, 20);
            if (z2) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    final d dVar4 = dVar3;
                    final float f5 = f4;
                    final long j9 = j8;
                    final long j10 = jD2;
                    final long j11 = jD;
                    eVarZ.d = new Function2() { // from class: gyg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            lyg0.a(lei0Var, turboUsageCountResponse, dVar4, fC, f5, jB, j9, j11, j10, z, z2, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            final float f6 = fC;
            final long j12 = jB;
            c.a((com.sportygames.newcms.b) ytwVarA.getValue(), pp8.b(32660170, new Function2() { // from class: hyg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    yka.a.d dVar5;
                    yka.a.b bVar2;
                    a.C0041a.C0042a c0042a;
                    androidx.compose.foundation.layout.d dVar6;
                    yka.a.C1350a c1350a;
                    a aVar2;
                    d.a aVar3;
                    final boolean z4;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar5 = d.a.b;
                        d dVarE = j.e(aVar5, 1.0f);
                        n54 n54Var = ht.a.e;
                        aiv aivVarC = g75.c(n54Var, false);
                        int iHashCode = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC = androidx.compose.ui.c.c(aVar4, dVarE);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar4, aivVarC, bVar3);
                        yka.a.d dVar7 = yka.a.e;
                        hlh0.a(aVar4, ne00VarO, dVar7);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar4, iHashCode, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar4, dVarC, cVar);
                        boolean z5 = z;
                        final twd0 twd0Var2 = twd0Var;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        androidx.compose.foundation.layout.d dVar8 = androidx.compose.foundation.layout.d.a;
                        if (z5 && Intrinsics.g((Boolean) twd0Var2.getValue(), Boolean.TRUE)) {
                            aVar4.N(331900805);
                            String strD = c.d(xai0.Q.L, "https://s.sporty.net/cms/turbo_Icon_6dc08f65dc.gif", aVar4);
                            d dVarF = dVar8.f(aVar5);
                            Object objY = aVar4.y();
                            if (objY == c0042a2) {
                                objY = new jyg0();
                                aVar4.r(objY);
                            }
                            aVar2 = aVar4;
                            dVar6 = dVar8;
                            dVar5 = dVar7;
                            c1350a = c1350a2;
                            z3 = z5;
                            bVar2 = bVar3;
                            c0042a = c0042a2;
                            mw90.a(strD, null, androidx.compose.ui.graphics.a.a(dVarF, (Function1) objY), null, null, d0b.a.g, null, aVar2, 1572912, 1976);
                        } else {
                            z3 = z5;
                            dVar5 = dVar7;
                            bVar2 = bVar3;
                            c0042a = c0042a2;
                            dVar6 = dVar8;
                            c1350a = c1350a2;
                            aVar2 = aVar4;
                            aVar2.N(328791474);
                        }
                        aVar2.H();
                        d dVarR = j.r(dVar3, f6);
                        i060 i060Var = j060.a;
                        d dVarB = androidx.compose.foundation.a.b(dVarR, j12, i060Var);
                        Boolean bool = (Boolean) twd0Var2.getValue();
                        Boolean bool2 = Boolean.TRUE;
                        d dVarA = dw.a(dVarB, Intrinsics.g(bool, bool2) ? 1.0f : 0.5f);
                        aiv aivVarC2 = g75.c(n54Var, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = androidx.compose.ui.c.c(aVar2, dVarA);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar6);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC2, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar5);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        boolean z6 = z3;
                        if (z6 && Intrinsics.g((Boolean) twd0Var2.getValue(), bool2)) {
                            aVar2.N(1134479646);
                            aVar3 = aVar5;
                            g75.a(androidx.compose.foundation.a.a(dVar6.f(aVar3), new vu30(kotlin.collections.b.k(new j58(r58.d(3436600576L)), new j58(r58.b(869691904))), null, 9205357640488583168L, Float.POSITIVE_INFINITY), i060Var, 0.0f, 4), aVar2, 0);
                        } else {
                            aVar3 = aVar5;
                            aVar2.N(1130361420);
                        }
                        aVar2.H();
                        float fFloatValue = Intrinsics.g((Boolean) twd0Var2.getValue(), bool2) ? ((Number) twd0VarB.getValue()).floatValue() : 0.0f;
                        d dVarE2 = j.e(aVar3, 1.0f);
                        final float f7 = f4;
                        boolean zC = aVar2.c(f7) | aVar2.b(z6);
                        final long j13 = j8;
                        boolean zE = zC | aVar2.e(j13);
                        final long j14 = jD2;
                        boolean zE2 = zE | aVar2.e(j14);
                        final long j15 = jD;
                        boolean zE3 = aVar2.e(j15) | zE2 | aVar2.c(fFloatValue);
                        Object objY2 = aVar2.y();
                        if (zE3 || objY2 == c0042a) {
                            final float f8 = fFloatValue;
                            z4 = z6;
                            objY2 = new Function1() { // from class: kyg0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    long j16;
                                    long j17;
                                    twd0 twd0Var3;
                                    float f9;
                                    tcf tcfVar = (tcf) obj3;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(f7);
                                    float fC2 = yw90.c(tcfVar.d()) - fC1;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - fC2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) - fC2) / 2.0f)) & 4294967295L);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L);
                                    boolean z7 = z4;
                                    twd0 twd0Var4 = twd0Var2;
                                    boolean z8 = z7 && Intrinsics.g((Boolean) twd0Var4.getValue(), Boolean.TRUE);
                                    if (z8) {
                                        j16 = jFloatToRawIntBits;
                                        j17 = jFloatToRawIntBits2;
                                        twd0Var3 = twd0Var4;
                                    } else {
                                        twd0Var3 = twd0Var4;
                                        tcf.I(tcfVar, j13, -90.0f, 360.0f, false, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, new yae0(fC1, 0.0f, 1, 0, null, 26), 832);
                                        j17 = jFloatToRawIntBits2;
                                        j16 = jFloatToRawIntBits;
                                    }
                                    long j18 = z8 ? j14 : j15;
                                    float fD = 0.0f;
                                    if (Intrinsics.g((Boolean) twd0Var3.getValue(), Boolean.TRUE)) {
                                        f9 = 360.0f;
                                        if (!z7) {
                                            fD = f.d(f8, 0.0f, 1.0f) * 360.0f;
                                            f9 = fD;
                                        }
                                    } else {
                                        f9 = fD;
                                    }
                                    yae0 yae0Var = new yae0(fC1, 0.0f, 1, 0, null, 26);
                                    tcf.I(tcfVar, j18, -90.0f, f9, false, j16, j17, 0.0f, yae0Var, 832);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        } else {
                            z4 = z6;
                        }
                        rxo.b(dVarE2, (Function1) objY2, aVar2, 6);
                        a aVar7 = aVar2;
                        h9n.a(erz.a((z4 && Intrinsics.g((Boolean) twd0Var2.getValue(), bool2)) ? R.drawable.turbo_activated : R.drawable.turbo_prog, 0, aVar2), "Turbo progress", j.c(j.g(aVar3, 0.5f), 0.8f), null, null, 0.0f, null, aVar7, 432, 120);
                        aVar7.s();
                        aVar7.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
            bVar = bVarI;
            dVar2 = dVar3;
            f3 = f4;
            j7 = j8;
            j6 = jD2;
            j5 = jD;
        } else {
            bVarI.G();
            dVar2 = dVar;
            fC = f;
            f3 = f2;
            jB = j;
            j5 = j3;
            j6 = j4;
            bVar = bVarI;
            j7 = j2;
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: iyg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    lyg0.a(lei0Var, turboUsageCountResponse, dVar2, fC, f3, jB, j7, j5, j6, z, z2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

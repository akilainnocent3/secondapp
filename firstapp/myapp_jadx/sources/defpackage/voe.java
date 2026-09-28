package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class voe {
    public static final void a(d dVar, lme lmeVar, op8 op8Var, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        final op8 op8Var2;
        final lme lmeVar2;
        final d dVar3;
        b bVarI = aVar.i(161015543);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.d(lmeVar == null ? -1 : lmeVar.ordinal()) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            final d dVar4 = i4 != 0 ? aVar2 : dVar2;
            lme lmeVar3 = i5 != 0 ? lme.a : lmeVar;
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int iOrdinal = lmeVar3.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(-803810365);
                bVarI.X(false);
            } else if (iOrdinal == 1) {
                bVarI.N(-803749946);
                mw90.a("https://s.sporty.net/cms/L1_cc74f78c3a.png", "diamond", j.t(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), 63.0f, 47.0f), null, null, null, null, bVarI, 438, 2040);
                bVarI.X(false);
            } else if (iOrdinal == 2) {
                bVarI.N(-803399274);
                mw90.a("https://s.sporty.net/cms/R1_17f6416d6b.png", "diamond", j.t(g.d(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.c), 0.0f, 15.0f, 1), 59.0f, 50.0f), null, null, null, null, bVarI, 54, 2040);
                bVarI.X(false);
            } else {
                if (iOrdinal != 3) {
                    throw igf0.a(bVarI, 1775185543, false);
                }
                bVarI.N(-803004024);
                mw90.a("https://s.sporty.net/cms/L2_4b6ddfccd1.png", "diamond", j.t(g.d(aVar2, 0.0f, 62.0f, 1), 48.0f, 45.0f), null, null, null, null, bVarI, 438, 2040);
                bVarI.X(false);
            }
            op8Var2 = op8Var;
            rrt.a(null, trt.d, pp8.b(218930149, new Function2() { // from class: toe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG = j.g(dVar4, 1.0f);
                        final long jD = r58.d(4285783781L);
                        dVarG.getClass();
                        d dVarC2 = androidx.compose.ui.draw.a.c(dVarG, new Function1() { // from class: mme
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) throws Throwable {
                                qc6.b bVar;
                                long j;
                                lza lzaVar = (lza) obj3;
                                lzaVar.getClass();
                                lzaVar.b2();
                                lk40 lk40VarB = pk40.b(0L, lzaVar.d());
                                float f = lk40VarB.d;
                                float f2 = lk40VarB.b;
                                b90 b90VarA = c90.a();
                                b90VarA.m(jD);
                                float fC1 = lzaVar.C1(10.0f);
                                float f3 = 2.0f * fC1;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                                qc6.b bVarF1 = lzaVar.F1();
                                long jD2 = bVarF1.d();
                                bVarF1.a().p();
                                try {
                                    bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                    lc6 lc6VarA = lzaVar.F1().a();
                                    lc6VarA.s(lk40VarB, b90VarA);
                                    try {
                                        float f4 = f2 - f3;
                                        j = jD2;
                                        try {
                                            float f5 = f + f3;
                                            try {
                                                bVar = bVarF1;
                                                try {
                                                    lc6VarA.l(lk40VarB.a, f4, lk40VarB.c, f5, lzaVar.C1(8.0f), lzaVar.C1(8.0f), b90VarA);
                                                    Paint paint = b90VarA.a;
                                                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                                    paint.setMaskFilter(new BlurMaskFilter(fC1, BlurMaskFilter.Blur.NORMAL));
                                                    lc6VarA.l(lk40VarB.a, f4, lk40VarB.c, f5, lzaVar.C1(8.0f), lzaVar.C1(8.0f), b90VarA);
                                                    paint.setXfermode(null);
                                                    paint.setMaskFilter(null);
                                                    hrh.a(bVar, j);
                                                    return Unit.a;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    hrh.a(bVar, j);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bVar = bVarF1;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bVar = bVarF1;
                                            hrh.a(bVar, j);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        j = jD2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVar = bVarF1;
                                    j = jD2;
                                }
                            }
                        });
                        aiv aivVarC2 = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC3 = c.c(aVar4, dVarC2);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar5);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, aivVarC2, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC3, yka.a.d);
                        fc0.a(0, op8Var2, aVar4);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 432, 1);
            bVarI.X(true);
            dVar3 = dVar4;
            lmeVar2 = lmeVar3;
        } else {
            op8Var2 = op8Var;
            bVarI.G();
            lmeVar2 = lmeVar;
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final op8 op8Var3 = op8Var2;
            eVarZ.d = new Function2() { // from class: uoe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    voe.a(dVar3, lmeVar2, op8Var3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}

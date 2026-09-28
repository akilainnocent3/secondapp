package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.BetComponentColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ud3 {
    public static final void a(final BetComponentColors betComponentColors, float f, final float f2, final boolean z, a aVar, final int i) {
        int i2;
        final float f3;
        betComponentColors.getClass();
        b bVarI = aVar.i(289730613);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(betComponentColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f3 = f;
            i2 |= bVarI.c(f3) ? 32 : 16;
        } else {
            f3 = f;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            i060 i060VarC = j060.c(f3);
            d dVarA = d35.a(j.c(j.g(d.a.b, 1.0f), 1.0f), 1.0f, betComponentColors.getWaitingButtonBorderColor(), i060VarC);
            umz umzVar = ek5.a;
            ak5 ak5VarA = ek5.a(z ? j58.c(0.4f, j58.b) : betComponentColors.getBackgroundDisabled(), 0L, 0L, 0L, bVarI, 14);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new rd3();
                bVarI.r(objY);
            }
            nk5.a((Function0) objY, dVarA, false, i060VarC, ak5VarA, null, null, null, null, pp8.b(-376036315, new gaj() { // from class: sd3
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 54);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC = c.c(aVar2, aVar3);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG = j.g(aVar3, 1.0f);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarH = h.h(dVarG.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 2.0f, 0.0f, 2);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarH);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        wf1.a(op5.c(op5.a, pwo.e(R.string.waiting_for_next_round_cms, aVar2), pwo.e(R.string.waiting_for_next_round_to_start, aVar2)), androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.e), o6a.a(ni60.e(((sfd0) aVar2.O(ni60.b)).c), f2), 3, d2l.f(10), null, 3, null, j58.f, aVar2, 100690944, 160);
                        aVar2.s();
                        ty0.a(aVar2, j.i(aVar3, 2.0f));
                        d dVarC3 = j.C(aVar3, null, 3);
                        if (0.2f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        aha.a(2131233707, 0, aVar2, dVarC3.n(new LayoutWeightElement(0.2f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.2f, true)));
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 805306374, 484);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: td3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ud3.a(betComponentColors, f3, f2, z, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}

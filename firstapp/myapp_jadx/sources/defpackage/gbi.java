package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gbi {
    public static final void a(final wr50.b bVar, Function0<Unit> function0, Function0<Unit> function1, a aVar, final int i) {
        int i2;
        boolean z;
        boolean z2;
        final Function0<Unit> function2 = function0;
        final Function0<Unit> function3 = function1;
        b bVarA = v2g.a(function2, function3, aVar, -532987105);
        if ((i & 6) == 0) {
            i2 = (bVarA.M(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function3) ? 256 : 128;
        }
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarA, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarA, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarA, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarA, dVarC, cVar);
            d dVarG = j.g(aVar2, 1.0f);
            i060 i060VarC = j060.c(4.0f);
            qyd0 qyd0Var = cst.e;
            d dVarG2 = h.g(androidx.compose.foundation.a.b(dVarG, ((ast) bVarA.O(qyd0Var)).i, i060VarC), 24.0f, 16.0f);
            i78 i78VarA = g78.a(new kw0.i(16.0f, true, new hw0()), ht.a.m, bVarA, 6);
            int iHashCode2 = Long.hashCode(bVarA.T);
            ne00 ne00VarS2 = bVarA.S();
            d dVarC2 = c.c(bVarA, dVarG2);
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, i78VarA, bVar2);
            hlh0.a(bVarA, ne00VarS2, dVar);
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarA, iHashCode2, c1350a);
            }
            hlh0.a(bVarA, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.page_loyalty__vdate_closed_event, new Object[]{bVar.a}, bVarA), null, c68.a(R.color.brand_tertiary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarA), bVarA, 0, 0, 131066);
            d dVarG3 = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarA, 48);
            int iHashCode3 = Long.hashCode(bVarA.T);
            ne00 ne00VarS3 = bVarA.S();
            d dVarC3 = c.c(bVarA, dVarG3);
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA, bVar2);
            hlh0.a(bVarA, ne00VarS3, dVar);
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarA, iHashCode3, c1350a);
            }
            hlh0.a(bVarA, dVarC3, cVar);
            mw90.a("https://s.sporty.net/cms/Frame_1000005707_ecbc36a63e.png", AnalyticsParam.HOME_NAV_ICON, j.r(aVar2, 40.0f), null, null, null, null, bVarA, 438, 2040);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.o, bVarA, 54);
            int iHashCode4 = Long.hashCode(bVarA.T);
            ne00 ne00VarS4 = bVarA.S();
            d dVarC4 = c.c(bVarA, layoutWeightElement);
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, i78VarA2, bVar2);
            hlh0.a(bVarA, ne00VarS4, dVar);
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarA, iHashCode4, c1350a);
            }
            hlh0.a(bVarA, dVarC4, cVar);
            lkf0.d(cb40.a(R.string.page_loyalty__potential_rewards, new Object[0], bVarA), null, c68.a(R.color.brand_tertiary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarA), bVarA, 0, 0, 131066);
            d160 d160VarA2 = b160.a(new kw0.i(((cjb0) bVarA.O(ejb0.a)).c, true, new hw0()), ht.a.l, bVarA, 48);
            int iHashCode5 = Long.hashCode(bVarA.T);
            ne00 ne00VarS5 = bVarA.S();
            d dVarC5 = c.c(bVarA, aVar2);
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA2, bVar2);
            hlh0.a(bVarA, ne00VarS5, dVar);
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarA, iHashCode5, c1350a);
            }
            hlh0.a(bVarA, dVarC5, cVar);
            lkf0.d(bVar.b, new WithAlignmentLineElement(mt.a), j58.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(0L, mla.m(16.0f, bVarA), new t9i(900), null, f8i.b, 0L, null, null, 0, mla.m(18.4f, bVarA), null, null, 16646105), bVarA, 384, 0, 131064);
            if (bVar.e != null) {
                bVarA.N(-637098552);
                lkf0.d(bVar.e, new WithAlignmentLineElement(mt.a), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((z0u) bVarA.O(b1u.a)).a, ((ast) bVarA.O(qyd0Var)).a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVarA, 0, 0, 131068);
                z = false;
                bVarA.X(false);
            } else {
                z = false;
                bVarA.N(-636806563);
                bVarA.X(false);
            }
            f30.a(bVarA, true, true, true);
            if (bVar.d) {
                bVarA.N(122137083);
                function3 = function1;
                uy20.a(function3, bVarA, (i2 >> 6) & 14);
                bVarA.X(z);
                function2 = function0;
                z2 = true;
            } else {
                function3 = function1;
                bVarA.N(122231509);
                d dVarI = j.i(j.g(aVar2, 1.0f), 28.0f);
                alb0 alb0Var = sya.a;
                z2 = true;
                function2 = function0;
                xya.b(dVarI, false, sya.a(r58.d(4278251433L), 0L, 0L, 0L, bVarA, 24582, 14), null, null, 0.0f, inm.a("claim_reward_button_batchId_", bVar.c), function2, c29.a, bVarA, ((i2 << 18) & 29360128) | 100663302, 58);
                bVarA.X(z);
            }
            bVarA.X(z2);
            bVarA.X(z2);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fbi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    gbi.a(bVar, function2, function3, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

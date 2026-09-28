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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z91 {
    public static final void a(final int i, final i91 i91Var, a aVar, final d dVar, Function1 function1) {
        int i2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        final Function1 function2 = function1;
        i91Var.getClass();
        b bVarI = aVar.i(-567051100);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(i91Var) : bVarI.A(i91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarH = g3w.h(h.f(androidx.compose.foundation.a.b(j.g(dVar, 1.0f), c68.a(R.color.bg_primary_d_base, bVarI), j060.c(2.0f)), 12.0f), "auto_bet_ongoing_card_" + i91Var.a);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar5 = d.a.b;
            d dVarH2 = g3w.h(j.g(aVar5, 1.0f), "auto_bet_ongoing_header");
            kw0.j jVar = kw0.a;
            d160 d160VarA = b160.a(jVar, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            int i3 = i2;
            d dVarC2 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(vch0.a(i91Var.e, bVarI), g3w.h(aVar5, "auto_bet_ongoing_order_type"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 48, 0, 131064);
            ty0.a(bVarI, j.w(aVar5, 4.0f));
            lkf0.d(vch0.a(i91Var.d, bVarI), g3w.h(h.g(androidx.compose.foundation.a.b(aVar5, c68.a(R.color.bg_brand_sub_secondary_d_base, bVarI), j060.c(2.0f)), 8.0f, 2.0f), "auto_bet_ongoing_status_badge"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131064);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            ty0.a(bVarI, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            r5y.a(i91Var.f, 0, bVarI, null);
            bVarI.X(true);
            ute.b(h.h(aVar5, 0.0f, 10.0f, 1), 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 54, 0);
            boolean z = false;
            okf0.b(g3w.h(aVar5, "auto_bet_ongoing_match_row"), cb40.a(R.string.component_betslip__match, new Object[0], bVarI), i91Var.g, 0, 0, null, bVarI, 6, 56);
            ty0.a(bVarI, j.i(aVar5, 4.0f));
            okf0.b(g3w.h(aVar5, "auto_bet_ongoing_market_row"), cb40.a(R.string.common_functions__market, new Object[0], bVarI), i91Var.h, 0, 0, null, bVarI, 6, 56);
            ty0.a(bVarI, j.i(aVar5, 4.0f));
            okf0.b(g3w.h(aVar5, "auto_bet_ongoing_outcome_row"), cb40.a(R.string.component_betslip__outcome, new Object[0], bVarI), null, 0, 0, pp8.b(-1664369722, new Function2() { // from class: w91
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    i91 i91Var2;
                    a aVar6 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d160 d160VarA2 = b160.a(kw0.a, ht.a.k, aVar6, 48);
                        int iHashCode3 = Long.hashCode(aVar6.m());
                        ne00 ne00VarO = aVar6.o();
                        d.a aVar7 = d.a.b;
                        d dVarC3 = c.c(aVar6, aVar7);
                        yka.k.getClass();
                        tsr.a aVar8 = yka.a.b;
                        if (aVar6.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar6.D();
                        if (aVar6.g()) {
                            aVar6.F(aVar8);
                        } else {
                            aVar6.p();
                        }
                        hlh0.a(aVar6, d160VarA2, yka.a.f);
                        hlh0.a(aVar6, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar6, iHashCode3, c1350a3);
                        }
                        hlh0.a(aVar6, dVarC3, yka.a.d);
                        i91 i91Var3 = i91Var;
                        String str = i91Var3.j;
                        if (str == null || str.length() <= 0) {
                            i91Var2 = i91Var3;
                            aVar6.N(1263287061);
                            h6n.b(erz.a(R.drawable.ic_sport_default, 0, aVar6), null, j.r(aVar7, 16.0f), c68.a(R.color.icon_primary, aVar6), aVar6, 432, 0);
                            aVar6.H();
                        } else {
                            aVar6.N(1262774693);
                            i91Var2 = i91Var3;
                            mw90.b(i91Var3.j, null, j.r(aVar7, 16.0f), null, erz.a(R.drawable.ic_sport_default, 0, aVar6), null, null, null, d0b.a.b, 0.0f, new gf4(c68.a(R.color.icon_primary, aVar6), 5), aVar6, 432, 6, 27624);
                            aVar6 = aVar6;
                            aVar6.H();
                        }
                        ty0.a(aVar6, j.w(aVar7, 2.0f));
                        a aVar9 = aVar6;
                        lkf0.d(i91Var2.i, null, c68.a(R.color.text_primary, aVar6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar6), aVar9, 0, 0, 131066);
                        aVar9.s();
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196614, 28);
            d dVarH3 = g3w.h(hib0.a(aVar5, 4.0f, bVarI, aVar5, 1.0f), "auto_bet_ongoing_bottom_row");
            d160 d160VarA2 = b160.a(jVar, ht.a.l, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH3);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar4;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar4;
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a2;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarH4 = g3w.h(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "auto_bet_ongoing_detail_column");
            i78 i78VarA2 = g78.a(new kw0.i(0.0f, true, new hw0()), aVar3, bVarI, 6);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarH4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            okf0.b(g3w.h(aVar5, "auto_bet_ongoing_stake_row"), cb40.a(R.string.common_functions__stake, new Object[0], bVarI), i91Var.k, 0, R.style.B1_B, null, bVarI, 6, 40);
            ty0.a(bVarI, j.i(aVar5, 4.0f));
            okf0.b(g3w.h(aVar5, "auto_bet_ongoing_current_odds_row"), cb40.a(R.string.component_betslip__current_odds, new Object[0], bVarI), i91Var.l, 0, R.style.B1_B, null, bVarI, 6, 40);
            ty0.a(bVarI, j.i(aVar5, 4.0f));
            okf0.b(g3w.h(aVar5, "auto_bet_ongoing_target_odds_row"), "Target odds", i91Var.m, 0, R.style.B1_B, null, bVarI, 54, 40);
            bVarI.X(true);
            ty0.a(bVarI, j.w(aVar5, 12.0f));
            String strA = cb40.a(R.string.common_functions__remove, new Object[0], bVarI);
            uxs uxsVar = i91Var.o ? uxs.LOADING : uxs.ENABLE;
            alb0 alb0VarA = alb0.a(sya.b, new g7f(36.0f), null, 0L, 0.0f, 29);
            d dVarH5 = g3w.h(aVar5, "auto_bet_ongoing_remove_button");
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && bVarI.A(i91Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objY = bVarI.y();
            if (z3 || objY == a.C0041a.a) {
                function2 = function1;
                objY = new Function0() { // from class: x91
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(i91Var.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                function2 = function1;
            }
            aza.a(dVarH5, strA, uxsVar, null, alb0VarA, null, null, null, (Function0) objY, null, bVarI, 6, 744);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y91
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z91.a(qj40.a(i | 1), i91Var, (a) obj, dVar, function2);
                    return Unit.a;
                }
            };
        }
    }
}

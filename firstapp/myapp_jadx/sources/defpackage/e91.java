package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e91 {
    public static final void a(final i91 i91Var, final d dVar, a aVar, final int i) {
        int i2;
        i91Var.getClass();
        b bVarI = aVar.i(-1174619779);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? bVarI.M(i91Var) : bVarI.A(i91Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarH = g3w.h(h.f(androidx.compose.foundation.a.b(j.g(dVar, 1.0f), c68.a(R.color.bg_surface_secondary, bVarI), j060.c(2.0f)), 12.0f), "auto_bet_expired_card_" + i91Var.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            d dVarH2 = g3w.h(j.g(aVar3, 1.0f), "auto_bet_expired_header");
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String strA = null;
            lkf0.d(vch0.a(i91Var.e, bVarI), g3w.h(aVar3, "auto_bet_expired_order_type"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 48, 0, 131064);
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            lkf0.d(vch0.a(i91Var.d, bVarI), g3w.h(h.g(androidx.compose.foundation.a.b(aVar3, c68.a(R.color.bg_danger_secondary, bVarI), j060.c(2.0f)), 8.0f, 2.0f), "auto_bet_expired_status_badge"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131064);
            d040.a(1.0f, true, bVarI);
            r5y.a(i91Var.f, 0, bVarI, null);
            bVarI.X(true);
            ute.b(h.h(aVar3, 0.0f, 10.0f, 1), 1.0f, c68.a(R.color.bg_secondary_d_lighter, bVarI), bVarI, 54, 0);
            okf0.a(g3w.h(aVar3, "auto_bet_expired_match_row"), cb40.a(R.string.component_betslip__match, new Object[0], bVarI), i91Var.g, 0, 0, null, bVarI, 6, 56);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_expired_market_row"), cb40.a(R.string.common_functions__market, new Object[0], bVarI), i91Var.h, 0, 0, null, bVarI, 6, 56);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_expired_outcome_row"), cb40.a(R.string.component_betslip__outcome, new Object[0], bVarI), null, 0, 0, pp8.b(637241350, new c91(i91Var, 0), bVarI), bVarI, 196614, 28);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_expired_stake_row"), cb40.a(R.string.common_functions__stake, new Object[0], bVarI), i91Var.k, 0, R.style.B1_B, null, bVarI, 6, 40);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_expired_target_odds_row"), cb40.a(R.string.component_betslip__target_odds, new Object[0], bVarI), i91Var.m, 0, R.style.B1_B, null, bVarI, 6, 40);
            ute.b(h.h(aVar3, 0.0f, 10.0f, 1), 1.0f, c68.a(R.color.bg_secondary_d_lighter, bVarI), bVarI, 54, 0);
            d dVarH3 = g3w.h(aVar3, "auto_bet_expired_fail_reason_row");
            d160 d160VarA2 = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            h6n.b(erz.a(R.drawable.ic__exclamtion_circle, 0, bVarI), null, j.r(aVar3, 14.0f), c68.a(R.color.icon_primary, bVarI), bVarI, 432, 0);
            bVarI = bVarI;
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            UiText uiText = i91Var.n;
            if (uiText == null) {
                bVarI.N(443815081);
            } else {
                bVarI.N(568505944);
                strA = vch0.a(uiText, bVarI);
            }
            bVarI.X(false);
            String str = strA;
            if (str == null) {
                bVarI.N(443836688);
                bVarI.X(false);
            } else {
                bVarI.N(443836689);
                lkf0.d(str, g3w.h(aVar3, "auto_bet_expired_fail_reason"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
                bVarI = bVarI;
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d91
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    e91.a(i91Var, dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

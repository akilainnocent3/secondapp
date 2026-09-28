package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.book.domain.entity.EventStatus;
import com.sporty.android.book.domain.entity.Market;
import com.sporty.android.book.domain.entity.Outcome;
import com.sporty.android.book.domain.entity.RelatedBet;
import com.sportybet.android.gp.tz.R;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q150 {
    public static final void a(final RelatedBet relatedBet, final boolean z, final Function1 function1, final Function1 function2, a aVar, final int i) {
        int i2;
        relatedBet.getClass();
        b bVarI = aVar.i(-847118567);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(relatedBet) : bVarI.A(relatedBet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            u4b u4bVar = ((uy80) bVarI.O(xy80.a)).a;
            d dVarA = ls7.a(j.w(j.c(d35.a(d.a.b, 1.0f, c68.a(R.color.brand_secondary_disable, bVarI), u4bVar), 1.0f), ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp / 3), u4bVar);
            boolean z2 = (relatedBet.isLoading() || z) ? false : true;
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(relatedBet)));
            Object objY = bVarI.y();
            if (z3 || objY == a.C0041a.a) {
                objY = new ph(1, function1, relatedBet);
                bVarI.r(objY);
            }
            rg6.a(androidx.compose.foundation.d.d(dVarA, z2, null, null, (Function0) objY, 14), null, gg6.b(j58.l, 0L, bVarI, 24582, 14), null, null, pp8.b(-713685529, new gaj() { // from class: o150
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strL;
                    d dVarH;
                    a aVar2;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar4 = d.a.b;
                        d dVarF = h.f(j.g(j.c(aVar4, 1.0f), 1.0f), 8.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarF);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar3, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        RelatedBet relatedBet2 = relatedBet;
                        if (relatedBet2.isLoading()) {
                            aVar3.N(1980820259);
                            q330.a(androidx.compose.foundation.layout.d.a.b(aVar4, ht.a.e), c68.a(R.color.brand_secondary_disable, aVar3), 0.0f, 0L, 0, 0.0f, aVar3, 0, 60);
                            aVar3.H();
                            aVar2 = aVar3;
                        } else {
                            aVar3.N(1981172357);
                            d dVarE = j.e(aVar4, 1.0f);
                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                            int iHashCode2 = Long.hashCode(aVar3.m());
                            ne00 ne00VarO2 = aVar3.o();
                            d dVarC2 = c.c(aVar3, dVarE);
                            if (aVar3.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar3.D();
                            if (aVar3.g()) {
                                aVar3.F(aVar5);
                            } else {
                                aVar3.p();
                            }
                            hlh0.a(aVar3, i78VarA, bVar);
                            hlh0.a(aVar3, ne00VarO2, dVar);
                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar3, dVarC2, cVar);
                            kw0.j jVar = kw0.a;
                            n54.b bVar2 = ht.a.k;
                            d160 d160VarA = b160.a(jVar, bVar2, aVar3, 48);
                            int iHashCode3 = Long.hashCode(aVar3.m());
                            ne00 ne00VarO3 = aVar3.o();
                            d dVarC3 = c.c(aVar3, aVar4);
                            if (aVar3.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar3.D();
                            if (aVar3.g()) {
                                aVar3.F(aVar5);
                            } else {
                                aVar3.p();
                            }
                            hlh0.a(aVar3, d160VarA, bVar);
                            hlh0.a(aVar3, ne00VarO3, dVar);
                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                            }
                            hlh0.a(aVar3, dVarC3, cVar);
                            mw90.b(relatedBet2.getEvent().getSportIconUrl(), null, j.r(aVar4, 14.0f), erz.a(R.drawable.ic_sport_default, 0, aVar3), erz.a(R.drawable.ic_sport_default, 0, aVar3), null, null, null, null, 0.0f, new gf4(c68.a(R.color.text_type1_primary, aVar3), 5), aVar3, 432, 0, 28640);
                            ty0.a(aVar3, j.w(aVar4, 4.0f));
                            Outcome primaryOutcome = relatedBet2.getEvent().getPrimaryOutcome();
                            String desc = primaryOutcome != null ? primaryOutcome.getDesc() : null;
                            if (desc == null) {
                                desc = "";
                            }
                            lkf0.d(desc, null, c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B1_M, aVar3), aVar3, 0, 24960, 110586);
                            aVar3.s();
                            ty0.a(aVar3, j.i(aVar4, 4.0f));
                            Market primaryMarket = relatedBet2.getEvent().getPrimaryMarket();
                            String desc2 = primaryMarket != null ? primaryMarket.getDesc() : null;
                            if (desc2 == null) {
                                desc2 = "";
                            }
                            lkf0.d(desc2, null, c68.a(R.color.text_type1_secondary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.C1_R, aVar3), aVar3, 0, 24960, 110586);
                            ty0.a(aVar3, j.i(aVar4, 4.0f));
                            lkf0.d(relatedBet2.getEvent().getHomeTeamName(), null, c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B2_R, aVar3), aVar3, 0, 24960, 110586);
                            lkf0.d(inm.a("vs ", relatedBet2.getEvent().getAwayTeamName()), null, c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B2_R, aVar3), aVar3, 0, 24960, 110586);
                            ty0.a(aVar3, j.i(aVar4, 4.0f));
                            d160 d160VarA2 = b160.a(jVar, bVar2, aVar3, 48);
                            int iHashCode4 = Long.hashCode(aVar3.m());
                            ne00 ne00VarO4 = aVar3.o();
                            d dVarC4 = c.c(aVar3, aVar4);
                            if (aVar3.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar3.D();
                            if (aVar3.g()) {
                                aVar3.F(aVar5);
                            } else {
                                aVar3.p();
                            }
                            hlh0.a(aVar3, d160VarA2, bVar);
                            hlh0.a(aVar3, ne00VarO4, dVar);
                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode4))) {
                                j3c.a(iHashCode4, aVar3, iHashCode4, c1350a);
                            }
                            hlh0.a(aVar3, dVarC4, cVar);
                            EventStatus eventStatus = relatedBet2.getEvent().getEventStatus();
                            EventStatus eventStatus2 = EventStatus.LIVE;
                            if (eventStatus == eventStatus2) {
                                aVar3.N(-1613465509);
                                strL = cb40.a(R.string.common_functions__live, new Object[0], aVar3);
                                aVar3.H();
                            } else {
                                aVar3.N(-1613462456);
                                aVar3.H();
                                Date date = new Date(relatedBet2.getEvent().getEstimateStartTime());
                                Locale locale = Locale.getDefault();
                                locale.getClass();
                                strL = bwf0.l(date, "HH:mm - dd MMM", locale, 2, 0);
                            }
                            imf0 imf0VarL = mla.l(R.style.C1_R, aVar3);
                            long jA = c68.a(relatedBet2.getEvent().getEventStatus() == eventStatus2 ? R.color.brand_quinary : R.color.text_type1_secondary, aVar3);
                            if (relatedBet2.getEvent().getEventStatus() == eventStatus2) {
                                aVar3.N(-1613439034);
                                dVarH = h.h(androidx.compose.foundation.a.b(aVar4, c68.a(R.color.custom_brand_secondary_variable_type1_type3, aVar3), zk40.a), 2.0f, 0.0f, 2);
                                aVar3.H();
                            } else {
                                aVar3.N(-1613437132);
                                aVar3.H();
                                dVarH = aVar4;
                            }
                            lkf0.d(strL, dVarH, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar3, 0, 0, 131064);
                            aVar3.s();
                            ty0.a(aVar3, j.i(aVar4, 4.0f));
                            d dVarG = j.g(j.i(aVar4, 24.0f), 1.0f);
                            Outcome primaryOutcome2 = relatedBet2.getEvent().getPrimaryOutcome();
                            boolean z4 = !z;
                            Function1 function3 = function2;
                            boolean zM = aVar3.M(function3) | aVar3.A(relatedBet2);
                            Object objY2 = aVar3.y();
                            if (zM || objY2 == a.C0041a.a) {
                                objY2 = new sh(1, relatedBet2, function3);
                                aVar3.r(objY2);
                            }
                            d8z.a(dVarG, primaryOutcome2, z4, (Function0) objY2, aVar3, (Outcome.$stable << 3) | 6);
                            aVar2 = aVar3;
                            aVar2.s();
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608, 26);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p150
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q150.a(relatedBet, z, function1, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}

package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qe70 {

    public static final class a implements Function1<pb80, Unit> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pb80 pb80Var) {
            pb80 pb80Var2 = pb80Var;
            pb80Var2.getClass();
            mb80.a(pb80Var2);
            return Unit.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class c implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;

        public c(List list) {
            this.a = list;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                le70 le70Var = (le70) this.a.get(iIntValue);
                aVar2.N(568812722);
                Object objY = aVar2.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = a.a;
                    aVar2.r(objY);
                }
                d.a aVar3 = d.a.b;
                d dVarH = g3w.h(xa80.b(aVar3, false, (Function1) objY), "overview_stats_match_results_cell");
                kw0.k kVar = kw0.c;
                n54.a aVar4 = ht.a.m;
                i78 i78VarA = g78.a(kVar, aVar4, aVar2, 0);
                int iHashCode = Long.hashCode(aVar2.m());
                ne00 ne00VarO = aVar2.o();
                d dVarC = androidx.compose.ui.c.c(aVar2, dVarH);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar5);
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
                qe70.c(le70Var.a, le70Var.b, le70Var.c, aVar2, 0);
                ty0.a(aVar2, j.i(aVar3, 8.0f));
                d dVarA = ls7.a(aVar3, j060.c(((zib0) aVar2.O(ajb0.a)).d));
                i78 i78VarA2 = g78.a(kVar, aVar4, aVar2, 0);
                int iHashCode2 = Long.hashCode(aVar2.m());
                ne00 ne00VarO2 = aVar2.o();
                d dVarC2 = androidx.compose.ui.c.c(aVar2, dVarA);
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar5);
                } else {
                    aVar2.p();
                }
                hlh0.a(aVar2, i78VarA2, bVar);
                hlh0.a(aVar2, ne00VarO2, dVar);
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                    j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                }
                hlh0.a(aVar2, dVarC2, cVar);
                qe70.b(0, aVar2);
                aVar2.N(1025420283);
                Iterator<ue70> it = le70Var.d.iterator();
                while (it.hasNext()) {
                    qe70.a(it.next(), aVar2, 0);
                }
                aVar2.H();
                aVar2.s();
                aVar2.s();
                ty0.a(aVar2, j.i(aVar3, 16.0f));
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(ue70 ue70Var, androidx.compose.runtime.a aVar, final int i) {
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        final ue70 ue70Var2 = ue70Var;
        androidx.compose.runtime.b bVarI = aVar.i(242420514);
        int i2 = i | (bVarI.M(ue70Var2) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar3 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar3, 1.0f), 36.0f), c68.a(ue70Var2.a, bVarI), zk40.a);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new ne70();
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarB, false, (Function1) objY), "overview_stats_match_results_event_row");
            kw0.j jVar = kw0.a;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            lkf0.d(ue70Var2.b, j.w(aVar3, 40.0f), fjb0.b(bVarI).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 48, 0, 130040);
            f160 f160Var = f160.a;
            d dVarA = f160Var.a(1.0f, aVar3, true);
            d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar4;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar4;
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarA2 = f160Var.a(1.0f, aVar3, true);
            d160 d160VarA3 = b160.a(new kw0.i(4.0f, true, new iw0(ht.a.o)), bVar, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            yka.a.C1350a c1350a3 = c1350a;
            tsr.a aVar5 = aVar2;
            mw90.b(ue70Var.c, null, j.r(aVar3, 20.0f), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
            lkf0.d(ue70Var.d, j.y(aVar3, 32.0f, 0.0f, 2), fjb0.b(bVarI).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).i, bVarI, 48, 0, 130040);
            dd3.b(aVar3, 5.0f, bVarI, true);
            lkf0.d(cb40.a(R.string.bet_history__vs, new Object[0], bVarI), null, fjb0.b(bVarI).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).i, bVarI, 0, 0, 131066);
            d dVarA3 = f160Var.a(1.0f, aVar3, true);
            d160 d160VarA4 = b160.a(new kw0.i(4.0f, true, new iw0(ht.a.m)), bVar, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarA3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            ty0.a(bVarI, j.w(aVar3, 5.0f));
            ue70Var2 = ue70Var;
            lkf0.d(ue70Var2.f, j.y(aVar3, 32.0f, 0.0f, 2), fjb0.b(bVarI).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).i, bVarI, 48, 0, 130040);
            mw90.b(ue70Var2.e, null, j.r(aVar3, 20.0f), erz.a(R.drawable.ic_default_team_logo_away, 0, bVarI), erz.a(R.drawable.ic_default_team_logo_away, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
            bVarI.X(true);
            bVarI.X(true);
            lkf0.d(ue70Var2.g, g3w.h(j.w(aVar3, 56.0f), "overview_stats_match_results_event_half_time_score_text"), fjb0.b(bVarI).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).m, bVarI, 48, 0, 130040);
            lkf0.d(ue70Var2.h, g3w.h(j.w(aVar3, 56.0f), "overview_stats_match_results_event_full_time_score_text"), fjb0.b(bVarI).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).m, bVarI, 48, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: oe70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    qe70.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(1789399171);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 28.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI, ((lib0) bVarI.O(qyd0Var)).q0, zk40.a);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ty0.a(bVarI, j.w(aVar2, 40.0f));
            String strA = cb40.a(R.string.page_instant_virtual__stats_popup_team, new Object[0], bVarI);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            long j = ((lib0) bVarI.O(qyd0Var)).a;
            gdf0 gdf0Var = new gdf0(3);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strA, layoutWeightElement, j, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).m, bVarI, 0, 0, 130040);
            lkf0.d(cb40.a(R.string.bet_history__ht_abbreviation, new Object[0], bVarI), j.w(aVar2, 56.0f), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).m, bVarI, 48, 0, 130040);
            lkf0.d(cb40.a(R.string.bet_history__ft_abbreviation, new Object[0], bVarI), j.w(aVar2, 56.0f), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).m, bVarI, 48, 0, 130040);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new pe70();
        }
    }

    public static final void c(final String str, final UiText uiText, UiText uiText2, androidx.compose.runtime.a aVar, final int i) {
        final UiText uiText3;
        androidx.compose.runtime.b bVarI = aVar.i(-1346386805);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(uiText) ? 32 : 16) | (bVarI.M(uiText2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarA = ls7.a(j.g(aVar2, 1.0f), j060.c(16.0f));
            qyd0 qyd0Var = oib0.a;
            d dVarG = h.g(androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var)).B0, zk40.a), 8.0f, 4.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mw90.b(str, null, j.r(aVar2, 12.0f), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, (i2 & 14) | 432, 0, 32736);
            uiText.getClass();
            qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
            String strG = uiText.g((Context) bVarI.O(qyd0Var2));
            d dVarJ = h.j(new LayoutWeightElement(1.0f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            long j = ((lib0) bVarI.O(qyd0Var)).a;
            qyd0 qyd0Var3 = kjb0.a;
            lkf0.d(strG, dVarJ, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var3)).q, bVarI, 0, 0, 131064);
            uiText3 = uiText2;
            lkf0.d(uiText3.g((Context) bVarI.O(qyd0Var2)), null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var3)).q, bVarI, 0, 0, 131066);
            bVarI.X(true);
        } else {
            uiText3 = uiText2;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, uiText, uiText3, str) { // from class: me70
                public final /* synthetic */ String a;
                public final /* synthetic */ UiText b;
                public final /* synthetic */ UiText c;

                {
                    this.a = str;
                    this.b = uiText;
                    this.c = uiText3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    qe70.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(re70 re70Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(2030294851);
        int i2 = (bVarI.M(re70Var) ? 4 : 2) | i;
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarJ = h.j(h.h(androidx.compose.foundation.a.b(d.a.b, ((lib0) bVarI.O(oib0.a)).i0, zk40.a), 24.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new dfb(re70Var, i3);
                bVarI.r(objY);
            }
            aur.a(dVarJ, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new esk(re70Var, i);
        }
    }
}

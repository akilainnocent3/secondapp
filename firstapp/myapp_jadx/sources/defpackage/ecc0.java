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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ecc0 {
    public static final void a(final int i, final int i2, a aVar) {
        b bVarI = aVar.i(735413432);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 8.0f, 0.0f, 7.0f, 5);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            if (0.5f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            g75.a(g3w.h(androidx.compose.foundation.a.a(ls7.a(j.i(new LayoutWeightElement(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true), 59.0f), j060.d(100.0f, 8.0f, 8.0f, 100.0f)), c(bVarI), null, 0.0f, 6), "sporty_legends_loading_market_" + i + "_left_outcome_content"), bVarI, 0);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            if (0.5f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            g75.a(g3w.h(androidx.compose.foundation.a.a(ls7.a(j.i(new LayoutWeightElement(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true), 59.0f), j060.d(100.0f, 8.0f, 8.0f, 100.0f)), c(bVarI), null, 0.0f, 6), "sporty_legends_loading_market_" + i + "_right_outcome_content"), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2) { // from class: dcc0
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ecc0.a(this.a, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        int i2;
        b bVarI = aVar.i(-1908901306);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.bg_inverse_primary_d_base, bVarI), zk40.a), 16.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new kic(1);
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarF, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(aVar2, 1.0f);
            kw0.g gVar = kw0.g;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar2, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            g75.a(g3w.h(androidx.compose.foundation.a.a(ls7.a(j.t(aVar2, 124.0f, 140.0f), j060.c(8.0f)), c(bVarI), null, 0.0f, 6), "sporty_legends_loading_home_team_card"), bVarI, 0);
            g75.a(g3w.h(androidx.compose.foundation.a.a(ls7.a(j.t(aVar2, 124.0f, 140.0f), j060.c(8.0f)), c(bVarI), null, 0.0f, 6), "sporty_legends_loading_away_team_card"), bVarI, 0);
            bVarI.X(true);
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 29.0f, 0.0f, 20.0f, 5);
            d160 d160VarA2 = b160.a(gVar, bVar2, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            if (0.6f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            g75.a(g3w.h(androidx.compose.foundation.a.a(ls7.a(j.i(new LayoutWeightElement(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), 36.0f), j060.c(2.0f)), c(bVarI), null, 0.0f, 6), "sporty_legends_loading_market_tab_content"), bVarI, 0);
            ty0.a(bVarI, j.w(aVar2, 16.0f));
            if (0.3f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            g75.a(g3w.h(androidx.compose.foundation.a.a(ls7.a(j.i(new LayoutWeightElement(0.3f <= Float.MAX_VALUE ? 0.3f : Float.MAX_VALUE, true), 36.0f), j060.c(2.0f)), c(bVarI), null, 0.0f, 6), "sporty_legends_loading_filter_content"), bVarI, 0);
            bVarI.X(true);
            i2 = 0;
            g75.a(g3w.h(androidx.compose.foundation.a.a(j.i(h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 18.0f), c(bVarI), null, 0.0f, 6), "sporty_legends_loading_market_header_content"), bVarI, 0);
            bVarI.N(-1011870651);
            for (int i3 = 0; i3 < 4; i3++) {
                a(i3, 0, bVarI);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            i2 = 0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ccc0(i, i2);
        }
    }

    public static final hfs c(a aVar) {
        return m590.a(kotlin.collections.b.k(new j58(c68.a(R.color.skeleton_inverse_load_start, aVar)), new j58(c68.a(R.color.skeleton_inverse_load_end, aVar)), new j58(c68.a(R.color.skeleton_inverse_load_start, aVar))), aVar, 2);
    }
}

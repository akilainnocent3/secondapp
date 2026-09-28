package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.orders.JokerInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.RSelection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uap {
    public static final void a(RSelection rSelection, a aVar, int i) {
        b bVar;
        String actualOutcomeOdds;
        b bVarI = aVar.i(2074957393);
        int i2 = (bVarI.A(rSelection) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.g(aVar2, 1.0f), 12.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String str = rSelection.outcomeDesc;
            String str2 = rSelection.odds;
            str2.getClass();
            lkf0.d(cb40.a(R.string.app_common__pick_value, new Object[]{str, gky.a.a(str2, false)}, bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            JokerInfo jokerInfo = rSelection.joker;
            lkf0.d(inm.a(" ", (jokerInfo == null || (actualOutcomeOdds = jokerInfo.getActualOutcomeOdds()) == null) ? null : gky.a.a(actualOutcomeOdds, false)), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_R, bVarI), 0L, 0L, null, null, null, 0L, yef0.d, null, null, 0, 0L, null, null, 16773119), bVarI, 0, 0, 131066);
            lkf0.d(inm.a(" | ", rSelection.marketDesc), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            szg.a(bVarI, true, aVar2, 2.0f, bVarI);
            lkf0.d(oxc.a(rSelection.home, " vs ", rSelection.away), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new rap(rSelection, i);
        }
    }

    public static final void b(final boolean z, final List list, d dVar, a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(-3617308);
        int i2 = (bVarI.M(list) ? 32 : 16) | i | 384;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            i060 i060VarC = j060.c(4.0f);
            dVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(d35.a(ls7.a(dVar2, i060VarC), 1.0f, c68.a(R.color.line_type1_primary, bVarI), j060.c(4.0f)), c68.a(R.color.bg_secondary_d_lighter, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(dVar2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (z) {
                bVarI.N(514564902);
                d(0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(514614874);
                bVarI.X(false);
            }
            bVarI.N(293696040);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RSelection rSelection = (RSelection) it.next();
                ty0.a(bVarI, j.i(dVar2, 8.0f));
                a(rSelection, bVarI, 0);
            }
            bVarI.X(false);
            bVarI.X(true);
            if (z) {
                bVarI.N(-1434665816);
                c(g.c(androidx.compose.foundation.layout.d.a.b(dVar2, ht.a.c), 8.0f, -8.0f), bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-1434485148);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, list, dVar2, i) { // from class: tap
                public final /* synthetic */ boolean a;
                public final /* synthetic */ List b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    uap.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(d dVar, a aVar, int i) {
        b bVarI = aVar.i(-1392164532);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            float f = r0b.d((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)) ? 0.3f : 1.0f;
            d dVarA = androidx.compose.foundation.a.a(ls7.a(j.r(dVar, 56.0f), j060.a), new hfs(kotlin.collections.b.k(new j58(c68.a(R.color.icon_brand_sub_primary_d_base, bVarI)), new j58(j58.l)), null, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0), null, 0.4f, 2);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            h6n.b(erz.a(R.drawable.ic_joker_arrow_up, 0, bVarI), "Arrow Up", null, j58.c(f, c68.a(R.color.icon_inverse_primary, bVarI)), bVarI, 48, 4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cvj(dVar, i);
        }
    }

    public static final void d(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(-312321675);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarA = androidx.compose.foundation.a.a(h.j(j.i(j.g(aVar2, 1.0f), 32.0f), 0.0f, 0.0f, 48.0f, 0.0f, 11), ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(c68.a(R.color.icon_brand_sub_primary_d_base, bVarI)), new j58(j58.l))), null, 0.2f, 2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            lkf0.d(cb40.a(R.string.common_functions__joker_outcome_positive, new Object[0], bVarI), h.j(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.d), 12.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 0, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new sap();
        }
    }
}

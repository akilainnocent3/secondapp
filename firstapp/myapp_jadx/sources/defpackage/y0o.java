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
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y0o {
    public static final void a(final qcn<u0o> qcnVar, a aVar, final int i) {
        qcnVar.getClass();
        b bVarI = aVar.i(706916163);
        int i2 = (bVarI.M(qcnVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarG = j.g(d.a.b, 1.0f);
            long jA = c68.a(R.color.bg_primary_d_base, bVarI);
            zk40.a aVar2 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarG, jA, aVar2);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(907597386);
            Iterator<u0o> it = qcnVar.iterator();
            while (it.hasNext()) {
                b(d35.a(new LayoutWeightElement(1.0f, true), 1.0f, c68.a(R.color.border_primary, bVarI), aVar2), it.next(), bVarI, 0);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, qcnVar) { // from class: v0o
                public final /* synthetic */ qcn a;

                {
                    this.a = qcnVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    y0o.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, u0o u0oVar, a aVar, int i) {
        int i2;
        b bVarI = aVar.i(2098258867);
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(u0oVar) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarI = j.i(dVar, 70.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new w0o();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarI, false, (Function1) objY);
            int i4 = u0oVar.a;
            d dVarH = g3w.h(dVarB, "racing_ranking_item_rank_" + i4);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar3 = d.a.b;
            d dVarH2 = g3w.h(h.j(aVar3, 0.0f, 0.0f, 0.0f, 6.0f, 7), "racing_ranking_item_rank_text_" + i4);
            String strValueOf = String.valueOf(i4);
            if (i4 == 1) {
                i2 = R.color.text_brand_sub_primary_d_lighter;
            } else if (i4 != 2) {
                i2 = i4 != 3 ? R.color.text_secondary : R.color.text_tertiary;
            } else {
                i2 = R.color.text_brand_sub_secondary;
            }
            lkf0.d(strValueOf, dVarH2, c68.a(i2, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 0, 0, 131064);
            bVarI = bVarI;
            mw90.a(u0oVar.c, null, g3w.h(j.r(aVar3, 32.0f), "racing_ranking_item_racer_" + u0oVar.b), null, null, null, null, bVarI, 48, 2040);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new x0o(dVar, i, 0, u0oVar);
        }
    }
}

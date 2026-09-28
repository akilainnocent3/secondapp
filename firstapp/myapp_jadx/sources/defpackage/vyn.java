package defpackage;

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
public final class vyn {
    public static final void a(final d dVar, final wyn wynVar, final g7f g7fVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1767058276);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(wynVar) : bVarI.A(wynVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(g7fVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new tyn(0);
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVar, false, (Function1) objY), "racer_row_racer_info");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            mw90.a(wynVar.e, "Number image", j.r(aVar3, 24.0f), null, null, null, null, bVarI, 432, 2040);
            d dVarJ = h.j(aVar3, 6.0f, 0.0f, 0.0f, 0.0f, 14);
            d dVarW = aVar3;
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
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (g7fVar != null) {
                dVarW = j.w(dVarW, g7fVar.a);
            }
            lkf0.d(wynVar.c, dVarW, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 0, 0, 130040);
            bVarI = bVarI;
            dko.a(0.0f, 0.0f, wynVar.d, bVarI, 0);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uyn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    vyn.a(dVar, wynVar, g7fVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

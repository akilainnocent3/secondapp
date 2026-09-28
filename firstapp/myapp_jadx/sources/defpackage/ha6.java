package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ha6 {
    public static final void a(final int i, a aVar, final String str, final Function0 function0) {
        int i2;
        b bVarA = mzj.a(-1599702630, aVar, str, function0);
        if ((i & 6) == 0) {
            i2 = i | (bVarA.M(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarA.q(i3 & 1, (i3 & 19) != 18)) {
            i060 i060VarC = j060.c(100.0f);
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.i(androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(ls7.a(aVar2, i060VarC), r58.d(4294954815L), zk40.a), false, null, null, function0, 15), 20.0f), 6.0f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarA, 54);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            lkf0.b(str, null, r58.d(4281216558L), i7f.b(10.0f, bVarA), null, t9i.E, null, 0L, new gdf0(3), i7f.b(12.0f, bVarA), 0, false, 0, 0, null, null, bVarA, (i3 & 14) | 196992, 0, 129490);
            bVarA = bVarA;
            h6n.a(dop.a(), null, j.r(aVar2, 12.0f), r58.d(4281216558L), bVarA, 3504, 0);
            bVarA.X(true);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ga6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ha6.a(qj40.a(i | 1), (a) obj, str, function0);
                    return Unit.a;
                }
            };
        }
    }
}

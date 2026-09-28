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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ka20 {
    public static final void a(final int i, a aVar, d dVar, final Function0 function0) {
        int i2;
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(1507698672);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.g(aVar2, 1.0f), 40.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = cb40.a(R.string.gift__pre_ftd_no_gift_text, new Object[0], bVarI);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).k;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            lkf0.d(cb40.a(R.string.gift__pre_ftd_no_gift_title, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).a, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, 12.0f));
            lkf0.d(cb40.a(R.string.gift__pre_ftd_no_gift_description, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).k, bVarI, 0, 0, 130042);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar2, 12.0f));
            dVar2 = aVar2;
            xya.a(j.i(aVar2, 48.0f), false, cb40.a(R.string.page_login__deposit_now__MX, new Object[0], bVarI), null, null, null, null, null, null, function0, bVarI, ((i3 << 27) & 1879048192) | 6, 506);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ja20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ka20.a(qj40.a(i | 1), (a) obj, dVar2, function0);
                    return Unit.a;
                }
            };
        }
    }
}

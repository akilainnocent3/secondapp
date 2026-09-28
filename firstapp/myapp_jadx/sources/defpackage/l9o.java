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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l9o {
    public static final void a(final int i, a aVar, final String str, Function0 function0, final boolean z) {
        int i2;
        boolean z2;
        final Function0 function1 = function0;
        b bVarA = mzj.a(99587757, aVar, str, function1);
        if ((i & 6) == 0) {
            i2 = (bVarA.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarA.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarF = h.f(j.e(aVar2, 1.0f), 72.0f);
            i78 i78VarA = g78.a(new kw0.i(24.0f, true, new hw0()), ht.a.n, bVarA, 54);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, i78VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            mw90.a(str, "Empty data image", j.w(aVar2, 200.0f), null, null, null, null, bVarA, (i3 & 14) | 432, 2040);
            lkf0.d(cb40.a(R.string.bet_history__no_bets_available, new Object[0], bVarA), null, ((lib0) bVarA.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarA.O(kjb0.a)).f, bVarA, 0, 0, 131066);
            if (z) {
                bVarA.N(-496613959);
                Object objY = bVarA.y();
                if (objY == a.C0041a.a) {
                    objY = new j9o();
                    bVarA.r(objY);
                }
                z2 = true;
                vuc0.a(g3w.h(xa80.b(aVar2, false, (Function1) objY), "empty_content_button"), false, null, null, function1, null, g9z.c, null, null, v69.a, bVarA, (57344 & (i3 << 6)) | 805306368, 430);
                bVarA = bVarA;
                function1 = function1;
                bVarA.X(false);
            } else {
                z2 = true;
                bVarA.N(-496054657);
                bVarA.X(false);
            }
            bVarA.X(z2);
        } else {
            str = str;
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k9o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l9o.a(qj40.a(i | 1), (a) obj, str, function1, z);
                    return Unit.a;
                }
            };
        }
    }
}

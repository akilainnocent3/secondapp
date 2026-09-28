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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class afe0 {
    public static final void a(final String str, a aVar, final int i) {
        b bVarI = aVar.i(988168723);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.g(aVar2, 1.0f), 66.0f, 0.0f, 2);
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
            h9n.a(erz.a(R.drawable.ic__feature__match_status_won, 0, bVarI), null, g3w.h(j.r(aVar2, 32.0f), "cashout_success_single_icon"), null, null, 0.0f, null, bVarI, 432, 120);
            qyd0 qyd0Var = ejb0.a;
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).f));
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).a;
            qyd0 qyd0Var3 = oib0.a;
            lkf0.d(str, g3w.h(aVar2, "cashout_success_single_amount"), ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, (i2 & 14) | 48, 0, 131064);
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).d));
            lkf0.d(cb40.a(R.string.cashout__cashout_succeeded, new Object[0], bVarI), g3w.h(aVar2, "cashout_success_single_success_text"), ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).k, bVarI, 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: zee0
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    afe0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

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
public final class whq {
    public static final void a(final Function0<Unit> function0, a aVar, final int i) {
        b bVar;
        function0.getClass();
        b bVarI = aVar.i(2043907895);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarW = j.w(aVar2, 320.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarF = h.f(androidx.compose.foundation.a.b(dVarW, ((lib0) bVarI.O(qyd0Var)).i0, j060.c(8.0f)), 24.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.o, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            d dVarG = j.g(aVar2, 1.0f);
            String strA = cb40.a(R.string.page_lucky_numbers__result_date, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strA, dVarG, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).a, bVarI, 48, 0, 131064);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__result_date_info_dialog, new Object[0], bVarI), h.j(j.g(aVar2, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).l, bVarI, 48, 0, 131064);
            lkf0.d(cb40.a(R.string.common_functions__ok, new Object[0], bVarI), h.g(androidx.compose.foundation.d.d(ls7.a(h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13), j060.c(8.0f)), false, null, null, function0, 15), 12.0f, 10.0f), ((lib0) bVarI.O(qyd0Var)).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).j, bVarI, 0, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: vhq
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    whq.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

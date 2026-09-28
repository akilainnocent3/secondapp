package defpackage;

import androidx.compose.foundation.layout.h;
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
public final class ixq {
    public static final void a(final Function0<Unit> function0, a aVar, final int i) {
        b bVar;
        function0.getClass();
        b bVarI = aVar.i(-2117009059);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            String strA = cb40.a(R.string.page_lucky_numbers__no_content_yet, new Object[0], bVarI);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).d;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__no_content_yet_description, new Object[0], bVarI), h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 48, 0, 130040);
            d dVarB = androidx.compose.foundation.a.b(ls7.a(h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), j060.c(2.0f)), ((lib0) bVarI.O(qyd0Var2)).x0, zk40.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            lkf0.d(cb40.a(R.string.common_functions__refresh, new Object[0], bVarI), h.i(androidx.compose.foundation.d.b(dVarB, (psw) objY, ut50.b(0.0f, 3, ((lib0) bVarI.O(qyd0Var2)).i, false), false, null, function0, 28), 12.0f, 8.0f, 12.0f, 8.0f), ((lib0) bVarI.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262136);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: hxq
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ixq.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

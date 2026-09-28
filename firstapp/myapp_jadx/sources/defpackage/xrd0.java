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
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class xrd0 {
    public static final void a(final d dVar, final asd0 asd0Var, final Function0 function0, a aVar, final int i) {
        b bVar;
        asd0Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(158860645);
        int i2 = (bVarI.M(asd0Var) ? 32 : 16) | i | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarT = j.t(dVar, 92.0f, 28.0f);
            asd0.a aVar2 = asd0Var.c;
            d dVarF = h.f(d35.a(androidx.compose.foundation.d.d(dVarT, aVar2 != asd0.a.c, null, null, function0, 14), 1.0f, c68.a(aVar2.a, bVarI), j060.c(2.0f)), 4.0f);
            aiv aivVarC = g75.c(ht.a.f, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String str = asd0Var.b;
            if (StringsKt.U(str)) {
                bVarI.N(809028863);
                lkf0.d(cb40.a(R.string.component_betslip__min_vstake, new Object[]{asd0Var.a}, bVarI), null, ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVarI, 0, 0, 131066);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                bVar.N(809247971);
                bVar.X(false);
            }
            lkf0.d(str, null, c68.a(aVar2.b, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ijb0) bVar.O(kjb0.a)).k, bVar, 0, 24576, 114682);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(asd0Var, function0, i) { // from class: trd0
                public final /* synthetic */ asd0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    xrd0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

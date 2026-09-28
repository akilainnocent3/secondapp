package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sue {
    public static final void a(aue aueVar, Function1<? super wae, Unit> function1, a aVar, final int i) {
        int i2;
        final aue aueVar2;
        final Function1<? super wae, Unit> function2;
        function1.getClass();
        b bVarI = aVar.i(-2132003960);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(aueVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            aiv aivVarC = g75.c(ht.a.a, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = cst.e;
            aueVar2 = aueVar;
            function2 = function1;
            pue.c(h.f(androidx.compose.foundation.a.b(dVarG, ((ast) bVarI.O(qyd0Var)).i, j060.c(4.0f)), 16.0f), aueVar2, ((ast) bVarI.O(qyd0Var)).a, function2, bVarI, ((i2 << 3) & 112) | ((i2 << 6) & 7168));
            bVarI.X(true);
        } else {
            aueVar2 = aueVar;
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rue
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    sue.a(aueVar2, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

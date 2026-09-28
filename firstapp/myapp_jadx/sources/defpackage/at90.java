package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class at90 {
    public static final void a(final bt90 bt90Var, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1359674298);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(bt90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(bt90Var.b, bVarI), zk40.a), 40.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
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
            crz crzVarA = erz.a(R.drawable.ic__arrow_tail_left, 0, bVarI);
            d dVarJ = h.j(aVar2, ((cjb0) bVarI.O(ejb0.a)).e, 0.0f, 0.0f, 0.0f, 14);
            n54 n54Var = ht.a.d;
            androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
            d dVarR = j.r(androidx.compose.foundation.d.d(dVar.b(dVarJ, n54Var), false, null, null, function0, 15), 24.0f);
            qyd0 qyd0Var = oib0.a;
            h6n.b(crzVarA, "Navigate back", dVarR, ((lib0) bVarI.O(qyd0Var)).a0, bVarI, 48, 0);
            lkf0.d(bt90Var.a.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), dVar.b(aVar2, ht.a.e), ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zs90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    at90.a(bt90Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

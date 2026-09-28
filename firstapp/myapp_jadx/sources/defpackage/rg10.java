package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rg10 {
    public static final void a(final d dVar, final sg10 sg10Var, final Function0 function0, a aVar, final int i) {
        int i2;
        b bVar;
        d dVarH;
        function0.getClass();
        b bVarI = aVar.i(-1959005845);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(sg10Var) : bVarI.A(sg10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            sg10.a aVar2 = sg10Var.e;
            int i3 = aVar2.b;
            d dVarH2 = h.h(androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVar, c68.a(aVar2.a, bVarI), zk40.a), aVar2 == sg10.a.d, null, null, function0, 14), 20.0f, 0.0f, 2);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new n4o(1);
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarH2, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
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
            String str = sg10Var.b;
            d.a aVar4 = d.a.b;
            d dVar2 = (str == null || (dVarH = g3w.h(aVar4, str)) == null) ? aVar4 : dVarH;
            ResourceUiText resourceUiText = sg10Var.a;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            lkf0.d(resourceUiText.g((Context) bVarI.O(qyd0Var)), dVar2, c68.a(i3, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 0, 24960, 110584);
            bVar = bVarI;
            lkf0.d(sg10Var.c.g((Context) bVar.O(qyd0Var)), g3w.h(aVar4, sg10Var.d), c68.a(i3, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B2_M, bVar), bVarI, 0, 24960, 110584);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qg10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    rg10.a(dVar, sg10Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c7a0 {
    public static final void a(final List<a7a0> list, a aVar, final int i) {
        list.getClass();
        b bVarI = aVar.i(-652634805);
        int i2 = (bVarI.A(list) ? 4 : 2) | i;
        boolean z = true;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            bVarI.N(1161814690);
            for (a7a0 a7a0Var : list) {
                nan.a aVar4 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                aVar4.c = a7a0Var.a;
                fn80.a(aVar4.a(), "snow", androidx.compose.foundation.layout.d.a.b(j.i(j.g(aVar2, a7a0Var.b), a7a0Var.c), a7a0Var.d), d0b.a.g, null, 0.0f, null, null, null, bVarI, 3120, 2032);
                aVar2 = aVar2;
                z = true;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, i) { // from class: b7a0
                public final /* synthetic */ List a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c7a0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

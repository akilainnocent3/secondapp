package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zmf0 {
    public static final void a(d dVar, final float f, final Function2 function2, final op8 op8Var, a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(-180562000);
        int i2 = i | 3078;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            i78 i78VarA = g78.a(kw0.g, ht.a.n, bVarI, 54);
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
            if (function2 != null) {
                bVarI.N(-2034026384);
                function2.invoke(bVarI, 6);
                iib0.a(aVar2, f, bVarI, false);
            } else {
                bVarI.N(-2033953348);
                bVarI.X(false);
            }
            op8Var.invoke(bVarI, 6);
            bVarI.N(-2033825380);
            bVarI.X(false);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, function2, op8Var, i) { // from class: ymf0
                public final /* synthetic */ float b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ op8 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(25009);
                    zmf0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes7.dex */
public final class ot00 {
    public static final void a(final int i, a aVar, d dVar, final String str, final Function0 function0, final boolean z) {
        int i2;
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(-23754761);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            twd0 twd0VarB = xe0.b(z ? 0.0f : -90.0f, null, "chevronRotation", null, bVarI, 3072, 22);
            d.a aVar2 = d.a.b;
            d dVarD = androidx.compose.foundation.d.d(j.g(aVar2, 1.0f), false, null, null, function0, 15);
            qyd0 qyd0Var = ejb0.a;
            d dVarF = h.f(dVarD, ((cjb0) bVarI.O(qyd0Var)).e);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            crz crzVarA = erz.a(R.drawable.ic_arrow_triangle_down, 0, bVarI);
            qyd0 qyd0Var2 = oib0.a;
            h6n.b(crzVarA, null, p1a.a(j.r(aVar2, ((cjb0) bVarI.O(qyd0Var)).e), ((Number) twd0VarB.getValue()).floatValue()), ((lib0) bVarI.O(qyd0Var2)).U, bVarI, 48, 0);
            ty0.a(bVarI, j.w(aVar2, ((cjb0) bVarI.O(qyd0Var)).e));
            lkf0.d(str, new LayoutWeightElement(1.0f, true), ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).j, bVarI, i3 & 14, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nt00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ot00.a(qj40.a(i | 1), (a) obj, dVar2, str, function0, z);
                    return Unit.a;
                }
            };
        }
    }
}

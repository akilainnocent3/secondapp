package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vze {
    public static final void a(final d dVar, final i0f i0fVar, final Function1 function1, a aVar, final int i) {
        int i2;
        boolean z;
        i0fVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(694960859);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(i0fVar) : bVarI.A(i0fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            n54 n54Var = ht.a.b;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            d.a aVar3 = d.a.b;
            d dVarG = j.g(dVar2.b(aVar3, n54Var), 1.0f);
            d0b.a.d dVar3 = d0b.a.d;
            mw90.a("https://s.sporty.net/cms/sp_field_top_8f189b9b63.png", null, dVarG, null, null, dVar3, null, bVarI, 1572918, 1976);
            n54 n54Var2 = ht.a.h;
            mw90.a("https://s.sporty.net/cms/sp_field_bottom_aa8363577c.png", null, j.i(j.g(dVar2.b(aVar3, n54Var2), 1.0f), i0fVar.c), null, null, d0b.a.g, null, bVarI, 1572918, 1976);
            d dVarW = j.w(h.j(dVar2.b(aVar3, n54Var2), 0.0f, 0.0f, 0.0f, i0fVar.d, 7), i0fVar.e);
            boolean z2 = (i2 & 896) == 256;
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                z = true;
                objY = new s61(1, function1);
                bVarI.r(objY);
            } else {
                z = true;
            }
            mw90.a("https://s.sporty.net/cms/sp_field_goal_bdca53c43e.png", null, v.a(dVarW, (Function1) objY), null, null, dVar3, null, bVarI, 1572918, 1976);
            bVarI.X(z);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uze
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    vze.a(dVar, i0fVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

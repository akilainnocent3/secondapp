package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wpj {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-2107144108);
        if (bVarI.q(i & 1, i != 0)) {
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
            n54 n54Var = ht.a.b;
            androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
            d dVarI = j.i(j.g(dVar.b(aVar2, n54Var), 1.0f), 120.0f);
            long j = j58.b;
            List listK = kotlin.collections.b.k(new j58(j58.c(0.9f, j)), new j58(j58.c(0.0f, j)));
            ya5.a aVar4 = ya5.a;
            ty0.a(bVarI, androidx.compose.foundation.a.a(dVarI, ya5.a.h(aVar4, listK, 0.0f, 0.0f, 14), null, 0.0f, 6));
            ty0.a(bVarI, androidx.compose.foundation.a.a(j.c(j.g(dVar.b(aVar2, ht.a.h), 1.0f), 0.33f), ya5.a.h(aVar4, kotlin.collections.b.k(new j58(j58.c(0.0f, j)), new j58(j58.c(0.9f, j))), 0.0f, 0.0f, 14), null, 0.0f, 6));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vpj();
        }
    }
}

package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ux90 {
    public static final void a(List list, a aVar, int i) {
        b bVarI = aVar.i(1878378446);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, -69812799, list);
            int i2 = 0;
            while (itA.hasNext()) {
                Object next = itA.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                g75.a(j.i(j.g(androidx.compose.foundation.a.a(h.h(aVar2, 20.0f, 0.0f, 2), m590.a(null, bVarI, 3), null, 0.0f, 6), ((Number) next).floatValue()), 16.0f), bVarI, 0);
                if (i2 < list.size()) {
                    hnw.a(bVarI, -1405113429, aVar2, 8.0f, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1405044237);
                    bVarI.X(false);
                }
                i2 = i3;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new oes(list, i);
        }
    }
}

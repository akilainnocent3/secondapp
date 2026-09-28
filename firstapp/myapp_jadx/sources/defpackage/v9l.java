package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v9l {
    public static final void a(hfs hfsVar, a aVar, int i) {
        b bVarI = aVar.i(875352302);
        int i2 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarF = h.f(d35.a(ls7.a(j.g(aVar2, 1.0f), j060.c(12.0f)), 1.0f, ((lib0) bVarI.O(oib0.a)).G, j060.c(12.0f)), 12.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g75.a(androidx.compose.foundation.a.a(ls7.a(j.g(j.i(aVar2, 18.0f), 0.3f), j060.c(4.0f)), hfsVar, null, 0.0f, 6), bVarI, 0);
            ty0.a(bVarI, j.i(aVar2, 12.0f));
            bVarI.N(-1877264366);
            for (int i3 = 0; i3 < 4; i3++) {
                g75.a(androidx.compose.foundation.a.a(ls7.a(j.g(j.i(aVar2, 20.0f), 1.0f), j060.c(4.0f)), hfsVar, null, 0.0f, 6), bVarI, 0);
                if (i3 < 3) {
                    hnw.a(bVarI, -1057902, aVar2, 8.0f, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-988710);
                    bVarI.X(false);
                }
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new p9l(hfsVar, i);
        }
    }

    public static final void b(d dVar, a aVar, int i) {
        d dVar2;
        b bVarI = aVar.i(-356625873);
        int i2 = i | 6;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qyd0 qyd0Var = oib0.a;
            final hfs hfsVarA = p590.a(kotlin.collections.b.k(new j58(((lib0) bVarI.O(qyd0Var)).M), new j58(((lib0) bVarI.O(qyd0Var)).N), new j58(((lib0) bVarI.O(qyd0Var)).M)), null, 0, 0L, null, bVarI, 0, 123);
            dVar2 = d.a.b;
            d dVarG = j.g(dVar2, 1.0f);
            umz umzVar = new umz(16.0f, 12.0f, 16.0f, 12.0f);
            kw0.i iVar = new kw0.i(12.0f, true, new hw0());
            boolean zM = bVarI.M(hfsVarA);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                objY = new Function1() { // from class: q9l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        ArrayList arrayList = new ArrayList(4);
                        for (int iA = 0; iA < 4; iA = ndv.a(iA, iA, 1, arrayList)) {
                        }
                        szrVar.d(arrayList.size(), new s9l(new r9l(), arrayList), new t9l(arrayList), new op8(802480018, new u9l(arrayList, hfsVarA), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            aur.a(dVarG, null, umzVar, false, iVar, null, null, false, null, (Function1) objY, bVarI, 24960, 490);
            bVarI = bVarI;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new wy7(dVar2, i);
        }
    }
}

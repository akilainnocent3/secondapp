package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u3l {
    public static final void a(final crz crzVar, final long j, final List list, d dVar, a aVar, final int i) {
        final d dVar2;
        crzVar.getClass();
        list.getClass();
        b bVarI = aVar.i(231592928);
        crz crzVar2 = crzVar;
        int i2 = i | (bVarI.A(crzVar2) ? 4 : 2) | (bVarI.e(j) ? 256 : 128) | (bVarI.M(list) ? 2048 : 1024) | 196608;
        boolean z = true;
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarR = j.r(aVar2, 128.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarR);
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
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, -117547817, list);
            while (itA.hasNext()) {
                v3l v3lVar = (v3l) itA.next();
                d dVarE = j.e(aVar2, 1.0f);
                float f = v3lVar.a;
                h9n.a(crzVar2, null, lg4.a(dVarE, f, f, null), null, null, 0.0f, new gf4(j58.c(1.0f, j), 5), bVarI, (i2 & 14) | 48, 56);
                z = true;
                crzVar2 = crzVar;
            }
            bVarI.X(false);
            h9n.a(crzVar, "Streak Trophy", j.e(aVar2, 1.0f), null, null, 0.0f, null, bVarI, (i2 & 14) | 432, 120);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, list, dVar2, i) { // from class: t3l
                public final /* synthetic */ long b;
                public final /* synthetic */ List c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(24625);
                    u3l.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class aha {
    public static final void a(final int i, final int i2, a aVar, final d dVar) {
        dVar.getClass();
        b bVarI = aVar.i(-1256914142);
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i2 | (bVarI.d(i) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            egn.a aVarA = kgn.a(kgn.b(null, bVarI, 1), 0.0f, 360.0f, yi0.a(yi0.e(1000, 0, xkf.d, 2), l850.a, 0L, 4), null, bVarI, 4536, 8);
            aiv aivVarC = g75.c(ht.a.e, false);
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
            h9n.a(erz.a(i, (i3 >> 3) & 14, bVarI), "Loading", p1a.a(j.C(d.a.b, null, 3), ((Number) ((x5a0) aVarA.c).getValue()).floatValue()), null, null, 0.0f, null, bVarI, 48, 120);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, dVar) { // from class: zga
                public final /* synthetic */ d a;
                public final /* synthetic */ int b;

                {
                    this.a = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    aha.a(this.b, iA, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }
}

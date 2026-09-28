package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lsr {
    @fae
    public static final void a(d dVar, op8 op8Var, aiv aivVar, a aVar, int i) {
        b bVarI = aVar.i(-1663319424);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(aivVar) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Integer.hashCode(bVarI.I());
            d dVarC = c.c(bVarI, dVar);
            ne00 ne00VarS = bVarI.S();
            tsr.a aVar2 = tsr.h0;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.k.getClass();
            hlh0.a(bVarI, aivVar, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            if (bVarI.g()) {
                bVarI.a(Unit.a, new u6d0(isr.a));
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            w1i.a(6, op8Var, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new jsr(dVar, op8Var, aivVar, i);
        }
    }

    public static final op8 b(List list) {
        return new op8(1271844412, new ksr(list), true);
    }
}

package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e2w {
    public static final void a(int i, op8 op8Var, a aVar) {
        b bVarI = aVar.i(875667125);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            float f = ((Configuration) bVarI.O(chfVar)).screenWidthDp / ((Configuration) bVarI.O(chfVar)).screenHeightDp;
            d.a aVar2 = d.a.b;
            n54 n54Var = ht.a.e;
            if (0.5625f > f) {
                bVarI.N(-631757887);
                d dVarA = c.a(j.g(aVar2, 1.0f), 0.5625f);
                aiv aivVarC = g75.c(n54Var, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
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
                op8Var.invoke(bVarI, 6);
                bVarI.X(true);
                bVarI.X(false);
            } else {
                bVarI.N(-631581280);
                d dVarA2 = c.a(j.c(aVar2, 1.0f), 0.5625f);
                aiv aivVarC2 = g75.c(n54Var, false);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                op8Var.invoke(bVarI, 6);
                bVarI.X(true);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new utc(i, op8Var);
        }
    }
}

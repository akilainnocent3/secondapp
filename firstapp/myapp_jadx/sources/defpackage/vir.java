package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vir {
    public static final void a(int i, a aVar, d dVar, String str, Function0 function0, boolean z) {
        d dVar2;
        d dVarA;
        long j;
        function0.getClass();
        str.getClass();
        b bVarI = aVar.i(-1295921549);
        int i2 = i | 6 | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarI.N(159913434);
            d.a aVar2 = d.a.b;
            if (z) {
                bVarI.N(-103759555);
                dVarA = androidx.compose.foundation.a.b(aVar2, fjb0.b(bVarI).B0, j060.c(100.0f));
                bVarI.X(false);
            } else {
                bVarI.N(-103545500);
                dVarA = d35.a(androidx.compose.foundation.a.b(aVar2, fjb0.b(bVarI).q0, j060.c(100.0f)), 1.0f, fjb0.b(bVarI).A, j060.c(100.0f));
                bVarI.X(false);
            }
            bVarI.X(false);
            d dVarA2 = ls7.a(dVarA, j060.c(100.0f));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
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
            d dVarF = androidx.compose.foundation.layout.d.a.f(aVar2);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            g75.a(androidx.compose.foundation.d.b(dVarF, (psw) objY, ut50.b(0.0f, 3, fjb0.b(bVarI).x0, false), false, null, function0, 28), bVarI, 0);
            d dVarG = h.g(aVar2, 12.0f, 4.0f);
            imf0 imf0Var = fjb0.e(bVarI).j;
            if (z) {
                bVarI.N(1996131350);
                j = fjb0.b(bVarI).g;
                bVarI.X(false);
            } else {
                bVarI.N(1996199395);
                j = fjb0.b(bVarI).a;
                bVarI.X(false);
            }
            lkf0.d(str, dVarG, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, (i2 >> 9) & 14, 0, 131064);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new uir(i, dVar2, str, function0, z);
        }
    }
}

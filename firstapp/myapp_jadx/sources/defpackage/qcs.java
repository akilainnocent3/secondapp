package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qcs {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(1207848842);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a), 16.0f);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, bVarI, 6);
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
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar2, 1.0f), 180.0f), p590.a(null, null, 0, 0L, null, bVarI, 0, 127), null, 0.0f, 6), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar2, 1.0f), 180.0f), p590.a(null, null, 0, 0L, null, bVarI, 0, 127), null, 0.0f, 6), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar2, 1.0f), 180.0f), p590.a(null, null, 0, 0L, null, bVarI, 0, 127), null, 0.0f, 6), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(h.f(j.g(aVar2, 1.0f), 12.0f), 48.0f), p590.a(null, null, 0, 0L, null, bVarI, 0, 127), null, 0.0f, 6), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(h.f(j.g(aVar2, 1.0f), 12.0f), 200.0f), p590.a(null, null, 0, 0L, null, bVarI, 0, 127), null, 0.0f, 6), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new mo9(i);
        }
    }
}

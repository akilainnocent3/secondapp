package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iys {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-838023977);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(d35.a(ls7.a(j.g(j.i(aVar2, 70.0f), 1.0f), j060.c(4.0f)), 1.0f, c68.a(R.color.line_type1_primary, bVarI), j060.c(4.0f)), c68.a(R.color.bg_secondary_d_lighter, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
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
            q330.a(j.r(aVar2, 24.0f), c68.a(R.color.text_secondary, bVarI), 2.0f, 0L, 0, 0.0f, bVarI, 390, 56);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            lkf0.d(cb40.a(R.string.common_functions__joker_outcome_loading, new Object[0], bVarI), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new hys();
        }
    }
}

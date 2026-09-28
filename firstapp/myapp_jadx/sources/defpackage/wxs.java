package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wxs {
    public static final void a(final float f, final float f2, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1200719475);
        if ((i & 6) == 0) {
            i2 = (bVarI.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.N(-1454784271);
            float fU1 = ((mmd) bVarI.O(kna.h)).u1((int) (((a8j0) bVarI.O(kna.t)).a() & 4294967295L));
            bVarI.X(false);
            g7f g7fVar = new g7f(fU1 - 250.0f);
            g7f g7fVar2 = new g7f(0.0f);
            if (g7fVar.compareTo(g7fVar2) >= 0) {
                g7fVar2 = g7fVar;
            }
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(j.c(j.g(j.j(aVar2, f, f2), 1.0f), 1.0f), "auto_bet_list_loading_content");
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            ty0.a(bVarI, j.i(aVar2, 80.0f));
            q330.a(g3w.h(j.r(aVar2, 31.0f), "auto_bet_list_loading_indicator"), c68.a(R.color.text_type1_secondary, bVarI), 2.0f, 0L, 0, 0.0f, bVarI, 390, 56);
            iib0.a(aVar2, g7fVar2.a, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vxs
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    wxs.a(f, f2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

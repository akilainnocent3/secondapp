package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gfr {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, a aVar, final int i) {
        int i2;
        b bVar;
        bxg0 bxg0Var;
        b bVarI = aVar.i(-946384254);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            if (z) {
                bVarI.N(-1567883527);
                bxg0Var = new bxg0(new j58(fjb0.b(bVarI).H0), new j58(fjb0.b(bVarI).o), new j58(fjb0.b(bVarI).k0));
                bVarI.X(false);
            } else {
                bVarI.N(-1567776081);
                bxg0Var = new bxg0(new j58(fjb0.b(bVarI).s0), new j58(fjb0.b(bVarI).a), new j58(fjb0.b(bVarI).O));
                bVarI.X(false);
            }
            long j = ((j58) bxg0Var.a).a;
            long j2 = ((j58) bxg0Var.b).a;
            long j3 = ((j58) bxg0Var.c).a;
            i060 i060VarC = j060.c(2.0f);
            d.a aVar2 = d.a.b;
            d dVarI = h.i(androidx.compose.foundation.a.b(aVar2, j, i060VarC), 2.0f, 2.0f, 4.0f, 2.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g75.a(androidx.compose.foundation.a.b(h.f(j.r(aVar2, 11.0f), 4.0f), j3, j060.a), bVarI, 0);
            String upperCase = cb40.a(R.string.common_functions__live, new Object[0], bVarI).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            lkf0.d(upperCase, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).m, bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ffr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    gfr.a(z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

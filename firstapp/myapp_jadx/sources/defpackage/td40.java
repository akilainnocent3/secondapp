package defpackage;

import androidx.compose.foundation.layout.h;
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

/* JADX INFO: loaded from: classes6.dex */
public final class td40 {
    public static final void a(final d dVar, a aVar, final int i) {
        b bVarI = aVar.i(-196822067);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.l, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            crz crzVarA = erz.a(R.drawable.recap_logo, 0, bVarI);
            d.a aVar3 = d.a.b;
            h9n.a(crzVarA, "SportyRecap Logo", j.t(aVar3, 138.0f, 24.0f), null, d0b.a.b, 0.0f, null, bVarI, 25008, 104);
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            lkf0.d(yk10.a(pwo.e(R.string.common_dates__year, bVarI), " 2025"), h.j(aVar3, 0.0f, 0.0f, 0.0f, 4.0f, 7), c68.a(R.color.text_type2_tertiary, bVarI), null, mla.m(10.0f, bVarI), new n9i(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 48, 0, 262088);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: sd40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    td40.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

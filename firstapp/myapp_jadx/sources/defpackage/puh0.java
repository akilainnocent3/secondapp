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

/* JADX INFO: loaded from: classes4.dex */
public final class puh0 {
    public static final void a(d dVar, final boolean z, final String str, imf0 imf0Var, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        final imf0 imf0Var2;
        imf0 imf0VarL;
        int i4;
        b bVarI = aVar.i(1800345110);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i6 = i3 | (bVarI.b(z) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | 1024;
        if (bVarI.q(i6 & 1, (i6 & 1171) != 1170)) {
            bVarI.A0();
            int i7 = i & 1;
            d.a aVar2 = d.a.b;
            if (i7 == 0 || bVarI.h0()) {
                if (i5 != 0) {
                    dVar2 = aVar2;
                }
                imf0VarL = mla.l(R.style.C1_R, bVarI);
                i4 = i6 & (-7169);
            } else {
                bVarI.G();
                i4 = i6 & (-7169);
                imf0VarL = imf0Var;
            }
            bVarI.Y();
            bVarI.N(-740159653);
            long jA = c68.a(z ? R.color.brand_secondary : R.color.text_disable_type1_primary, bVarI);
            bVarI.X(false);
            d160 d160VarA = b160.a(new kw0.i(6.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar2);
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
            h6n.b(erz.a(R.drawable.ic_check_no_padding, 0, bVarI), null, j.r(aVar2, 12.0f), jA, bVarI, 432, 0);
            lkf0.d(str, null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, (i4 >> 6) & 14, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            imf0Var2 = imf0VarL;
        } else {
            bVarI.G();
            imf0Var2 = imf0Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ouh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    puh0.a(dVar2, z, str, imf0Var2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}

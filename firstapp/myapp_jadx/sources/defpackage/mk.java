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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mk {
    public static final void a(final int i, a aVar, final Function0 function0, final boolean z) {
        int i2;
        function0.getClass();
        b bVarI = aVar.i(2116219231);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int i3 = R.color.text_disabled_action;
            int i4 = z ? R.color.text_disabled_action : R.color.icon_brand_sub_primary_d_lighter;
            if (!z) {
                i3 = R.color.text_brand_sub_primary_d_lighter;
            }
            d.a aVar2 = d.a.b;
            d dVarG = h.g(g3w.f(androidx.compose.foundation.a.b(ls7.a(j.g(aVar2, 1.0f), j060.c(8.0f)), c68.a(R.color.bg_secondary_d_lighter, bVarI), zk40.a), !z, function0), 12.0f, 16.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            h6n.b(erz.a(R.drawable.ic_plus_circle, 0, bVarI), null, j.r(h.j(aVar2, 0.0f, 0.0f, 12.0f, 0.0f, 11), 20.0f), c68.a(i4, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_payment__add_a_new_number, new Object[0], bVarI), null, c68.a(i3, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    mk.a(qj40.a(i | 1), (a) obj, function0, z);
                    return Unit.a;
                }
            };
        }
    }
}

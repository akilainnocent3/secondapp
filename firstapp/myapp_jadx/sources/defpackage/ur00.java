package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
public final class ur00 {
    public static final void a(final ys00 ys00Var, final boolean z, final Function0<Unit> function0, a aVar, final int i) {
        ys00Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(169561120);
        int i2 = (bVarI.M(ys00Var) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = h.g(g3w.f(j.g(aVar2, 1.0f), true, function0), 12.0f, 16.0f);
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
            if (z) {
                bVarI.N(1937472346);
                h6n.b(erz.a(R.drawable.ic_check, 0, bVarI), null, j.r(aVar2, 20.0f), c68.a(R.color.icon_brand_sub_primary_d_lighter, bVarI), bVarI, 432, 0);
                bVarI.X(false);
            } else {
                bVarI.N(1937770783);
                ty0.a(bVarI, j.r(aVar2, 20.0f));
                bVarI.X(false);
            }
            lkf0.d(ys00Var.b, h.j(new LayoutWeightElement(1.0f, true), 12.0f, 0.0f, 8.0f, 0.0f, 10), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 131064);
            bVarI = bVarI;
            if (ys00Var.a.isDefault()) {
                bVarI.N(1938188198);
                lkf0.d(cb40.a(R.string.common_functions__default, new Object[0], bVarI), h.g(androidx.compose.foundation.a.b(ls7.a(aVar2, j060.c(2.0f)), c68.a(R.color.bg_surface_secondary, bVarI), zk40.a), 4.0f, 2.0f), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131064);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(1938651710);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, i) { // from class: tr00
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ur00.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

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

/* JADX INFO: loaded from: classes6.dex */
public final class oij0 {
    public static final void a(final int i, a aVar, d dVar, final Function0 function0, boolean z, final boolean z2) {
        final d dVar2;
        final boolean z3;
        b bVarI = aVar.i(-1142705966);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = z2 ? R.color.text_brand_sub_primary_d_base : R.color.text_disabled_action;
            dVar2 = d.a.b;
            d dVarJ = h.j(j.g(dVar2, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            kw0.i iVar = new kw0.i(10.0f, true, new hw0());
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(iVar, bVar, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            int i5 = i4;
            lkf0.d(pwo.e(R.string.page_transaction__withdraw_to, bVarI), new LayoutWeightElement(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, 0, 0, 131068);
            bVarI.N(-1063856529);
            d dVarF = g3w.f(h.j(mla.j(dVar2, pij0.a), 0.0f, 0.0f, 12.0f, 0.0f, 11), z2, function0);
            d160 d160VarA2 = b160.a(kw0.a, bVar, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h6n.b(erz.a(R.drawable.ic_global_settings, 0, bVarI), null, h.j(dVar2, 0.0f, 0.0f, 4.0f, 0.0f, 11), c68.a(i5, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_payment__manage_accounts, new Object[0], bVarI), null, c68.a(i5, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            f30.a(bVarI, true, false, true);
            z3 = true;
        } else {
            bVarI.G();
            dVar2 = dVar;
            z3 = z;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nij0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oij0.a(qj40.a(i | 1), (a) obj, dVar2, function0, z3, z2);
                    return Unit.a;
                }
            };
        }
    }
}

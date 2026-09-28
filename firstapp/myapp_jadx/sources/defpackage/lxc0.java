package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lxc0 {
    public static final void a(final mxc0 mxc0Var, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        function0.getClass();
        b bVarI = aVar.i(720540062);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(mxc0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarD = androidx.compose.foundation.d.d(j.k(j.g(aVar2, 1.0f), 34.0f, 0.0f, 2), false, null, null, function0, 15);
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarD, ((lib0) bVarI.O(qyd0Var)).q0, zk40.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new uh4(1);
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarB, false, (Function1) objY), "market_block_content_expansion");
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new iw0(ht.a.n)), ht.a.k, bVarI, 54);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(mxc0Var.a, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, 0, 0, 131066);
            h6n.b(erz.a(R.drawable.ic__arrow_chevron_down, 0, bVarI), "Content expansion icon", p1a.a(j.r(aVar2, 12.0f), ((Number) xe0.b(mxc0Var == mxc0.SHOW_MORE ? 0.0f : -180.0f, null, null, null, bVarI, 0, 30).getValue()).floatValue()), ((lib0) bVarI.O(qyd0Var)).O, bVarI, 48, 0);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kxc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    lxc0.a(mxc0Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w2k0 {
    public static final void a(final String str, a aVar, final int i) {
        int i2;
        str.getClass();
        b bVarI = aVar.i(-603253497);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qyd0 qyd0Var = oib0.a;
            ihe0.a(null, j060.c(((zib0) bVarI.O(ajb0.a)).d), ((lib0) bVarI.O(qyd0Var)).k1, ((lib0) bVarI.O(qyd0Var)).o, 0.0f, 0.0f, null, pp8.b(-1220803102, new Function2() { // from class: u2k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = j.g(aVar3, 1.0f);
                        qyd0 qyd0Var2 = ejb0.a;
                        d dVarF = h.f(dVarG, ((cjb0) aVar2.O(qyd0Var2)).e);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        h6n.b(pib0.a(R.drawable.ic__feature__balance, 0, aVar2), null, j.r(aVar3, 20.0f), 0L, aVar2, 432, 8);
                        ty0.a(aVar2, j.w(aVar3, ((cjb0) aVar2.O(qyd0Var2)).d));
                        lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_pay_amount, new Object[]{str}, aVar2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).i, aVar2, 0, 0, 131070);
                        ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                        h6n.b(erz.a(R.drawable.ic__successful, 0, aVar2), null, j.r(aVar3, 16.0f), ((lib0) aVar2.O(oib0.a)).a0, aVar2, 432, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 12582912, 113);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v2k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    w2k0.a(str, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}

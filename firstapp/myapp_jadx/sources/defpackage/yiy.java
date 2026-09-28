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
public final class yiy {
    public static final void a(final int i, a aVar, final String str, final Function0 function0, final Function0 function1) {
        int i2;
        b bVar;
        str.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(604979980);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d dVarD = androidx.compose.foundation.d.d(ls7.a(h.h(d.a.b, 8.0f, 0.0f, 2), j060.c(26.0f)), false, null, null, function0, 15);
            qyd0 qyd0Var = oib0.a;
            d dVarF = h.f(androidx.compose.foundation.a.b(dVarD, ((lib0) bVarI.O(qyd0Var)).r0, zk40.a), 6.0f);
            d160 d160VarA = b160.a(new kw0.i(2.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            qyd0 qyd0Var2 = kna.s;
            hna.a(qyd0Var2.a(new lvx((z6i0) bVarI.O(qyd0Var2))), pp8.b(875981872, new Function2() { // from class: wiy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h6n.b(erz.a(R.drawable.ic__clear__fill, 0, aVar3), "Clear odds filter", j.r(androidx.compose.foundation.d.d(ls7.a(d.a.b, j060.a), false, null, null, function1, 15), 16.0f), ((lib0) aVar3.O(oib0.a)).S, aVar3, 48, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
            lkf0.d(str, null, ((lib0) bVarI.O(qyd0Var)).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, i3 & 14, 24576, 114682);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xiy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yiy.a(qj40.a(i | 1), (a) obj, str, function0, function1);
                    return Unit.a;
                }
            };
        }
    }
}

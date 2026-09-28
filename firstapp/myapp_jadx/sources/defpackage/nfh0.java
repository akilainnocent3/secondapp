package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nfh0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;

    public nfh0(List list, Function1 function1) {
        this.a = list;
        this.b = function1;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        long j;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            gfh0 gfh0Var = (gfh0) this.a.get(iIntValue);
            aVar2.N(-365180301);
            d dVarG = j.g(d.a.b, 1.0f);
            Function1 function1 = this.b;
            boolean zM = aVar2.M(function1) | aVar2.A(gfh0Var);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new kfh0(function1, gfh0Var);
                aVar2.r(objY);
            }
            d dVarH = h.h(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY, 15), 0.0f, 12.0f, 1);
            Object objY2 = aVar2.y();
            if (objY2 == c0042a) {
                objY2 = lfh0.a;
                aVar2.r(objY2);
            }
            d dVarH2 = g3w.h(xa80.b(dVarH, false, (Function1) objY2), "universal_specifier_option");
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarH2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            String strG = gfh0Var.b.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b));
            if (gfh0Var.c) {
                aVar2.N(-365133033);
                j = ((lib0) aVar2.O(oib0.a)).h;
                aVar2.H();
            } else {
                aVar2.N(-365046233);
                j = ((lib0) aVar2.O(oib0.a)).a;
                aVar2.H();
            }
            lkf0.d(strG, null, j, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar2, 0, 0, 130042);
            aVar2.s();
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

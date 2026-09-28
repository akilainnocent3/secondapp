package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kq8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j78) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d dVarF = h.f(d.a.b, 16.0f);
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, aVar, 6);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar2);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, i78VarA, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            qyd0 qyd0Var = gah0.a;
            lkf0.d("Tool Usage Guide", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) aVar.O(qyd0Var)).h, aVar, 6, 0, 131070);
            lkf0.d("Enter an A/N Test campaign code and its event name from BO config. Press **Test APIs** to trigger real Sporty AN Test API calls:\n\n1. Participate → fetch the campaign variant\n2. Visit → record visitor if convertible\n3. Convert → report conversion event (if applicable)\n\nEach step result will appear in the Test Results section below.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) aVar.O(qyd0Var)).k, aVar, 0, 0, 131070);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}

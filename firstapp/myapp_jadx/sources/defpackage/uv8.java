package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uv8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Float) obj).floatValue();
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.c(fFloatValue) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarA = d35.a(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 6.0f), r58.d(4278519045L), j060.c(10.0f)), 1.0f, r58.d(4293328640L), j060.c(10.0f));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar3);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, aivVarC, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            g75.a(androidx.compose.foundation.layout.d.a.b(androidx.compose.foundation.a.b(j.g(j.c(aVar2, 1.0f), fFloatValue), r58.d(4293328640L), j060.c(10.0f)), ht.a.d), aVar, 0);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}

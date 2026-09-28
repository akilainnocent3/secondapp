package defpackage;

import android.view.Window;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ub9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            final Window windowA = tke.a(aVar);
            boolean zA = aVar.A(windowA);
            Object objY = aVar.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: wb9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Window window = windowA;
                        if (window != null) {
                            window.setGravity(17);
                        }
                        return Unit.a;
                    }
                };
                aVar.r(objY);
            }
            use useVar = xvf.a;
            aVar.t((Function0) objY);
            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.c(0.5f, j58.b), zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarB);
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
            hlh0.a(aVar, aivVarC, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            q330.b(null, 0L, 0.0f, 0L, 0, aVar, 0, 31);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}

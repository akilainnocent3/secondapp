package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b2w implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw a;

    public b2w(ytw ytwVar) {
        this.a = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objY = aVar2.y();
            if (objY == a.C0041a.a) {
                objY = new a2w();
                aVar2.r(objY);
            }
            d dVarB = xa80.b(d.a.b, false, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarB);
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
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            ps.a(0, aVar2, (Function2) this.a.getValue());
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ ytw<urr> b;
    public final /* synthetic */ op8 c;

    public gc0(d dVar, ytw ytwVar, op8 op8Var) {
        this.a = dVar;
        this.b = ytwVar;
        this.c = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objY = aVar2.y();
            if (objY == a.C0041a.a) {
                final ytw<urr> ytwVar = this.b;
                objY = new Function1() { // from class: ec0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ytwVar.setValue((urr) obj);
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            d dVarA = v.a(this.a, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, true);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA);
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
            fc0.a(0, this.c, aVar2);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

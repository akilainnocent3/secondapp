package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ PopupLayout a;
    public final /* synthetic */ ytw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(PopupLayout popupLayout, ytw ytwVar) {
        super(2);
        this.a = popupLayout;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = ga0.a;
                aVar2.r(objY);
            }
            d dVarB = xa80.b(d.a.b, false, (Function1) objY);
            PopupLayout popupLayout = this.a;
            boolean zA = aVar2.A(popupLayout);
            Object objY2 = aVar2.y();
            if (zA || objY2 == c0042a) {
                objY2 = new ha0(popupLayout);
                aVar2.r(objY2);
            }
            d dVarA = dw.a(w.a(dVarB, (Function1) objY2), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
            Function2 function2 = (Function2) this.b.getValue();
            Object objY3 = aVar2.y();
            if (objY3 == c0042a) {
                objY3 = ja0.a;
                aVar2.r(objY3);
            }
            aiv aivVar = (aiv) objY3;
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
            hlh0.a(aVar2, aivVar, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            ps.a(0, aVar2, function2);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.viewinterop.b;
import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import com.sportygames.sportyherocompose.components.SHRangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t5c0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                a6c0 a6c0Var = (a6c0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw<b6c0> ytwVar = a6c0Var.h;
                    d.a aVar2 = d.a.b;
                    d dVarE = j.e(aVar2, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarE);
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
                    x5a0 x5a0Var = (x5a0) ytwVar;
                    final boolean z = ((b6c0) x5a0Var.getValue()) == b6c0.b;
                    final boolean z2 = ((b6c0) x5a0Var.getValue()) == b6c0.c;
                    boolean zA = aVar.A(a6c0Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new ci3(a6c0Var, i2);
                        aVar.r(objY);
                    }
                    Function1 function1 = (Function1) objY;
                    d dVarA = abk0.a(j.e(aVar2, 1.0f), z ? 1.0f : 0.0f);
                    boolean zB = aVar.b(z);
                    Object objY2 = aVar.y();
                    if (zB || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: p5c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                SHOverBetComponent sHOverBetComponent = (SHOverBetComponent) obj4;
                                sHOverBetComponent.getClass();
                                sHOverBetComponent.setVisibility(z ? 0 : 8);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    b.a(function1, dVarA, (Function1) objY2, aVar, 0, 0);
                    boolean zA2 = aVar.A(a6c0Var);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new vev(a6c0Var, 1);
                        aVar.r(objY3);
                    }
                    Function1 function2 = (Function1) objY3;
                    d dVarA2 = abk0.a(j.e(aVar2, 1.0f), z2 ? 1.0f : 0.0f);
                    boolean zB2 = aVar.b(z2);
                    Object objY4 = aVar.y();
                    if (zB2 || objY4 == c0042a) {
                        objY4 = new Function1() { // from class: q5c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                SHRangeComponent sHRangeComponent = (SHRangeComponent) obj4;
                                sHRangeComponent.getClass();
                                sHRangeComponent.setVisibility(z2 ? 0 : 8);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY4);
                    }
                    b.a(function2, dVarA2, (Function1) objY4, aVar, 0, 0);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                pcg0.a((d) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ t5c0(d dVar, int i) {
        this.b = dVar;
    }
}

package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import znf0.a;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ynf0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ynf0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        Object obj3 = this.b;
        int i2 = 2;
        switch (i) {
            case 0:
                znf0 znf0Var = (znf0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(znf0Var);
                    Object objY = aVar.y();
                    if (zA || objY == c0042a) {
                        objY = new z2l(znf0Var, i2);
                        aVar.r(objY);
                    }
                    use useVar = xvf.a;
                    aVar.t((Function0) objY);
                    ytw ytwVarC = wyh.c(znf0Var.m0().V, aVar, 0, 7);
                    ytw ytwVarC2 = wyh.c(znf0Var.m0().B, aVar, 0, 7);
                    k4i k4iVar = (k4i) aVar.O(kna.i);
                    Unit unit = Unit.a;
                    boolean zA2 = aVar.A(znf0Var) | aVar.A(k4iVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = znf0Var.new a(k4iVar, null);
                        aVar.r(objY2);
                    }
                    xvf.e(aVar, unit, (Function2) objY2);
                    c.a((b) ytwVarC2.getValue(), pp8.b(-1316546382, new kc30(znf0Var, ytwVarC), aVar), aVar, 48);
                } else {
                    aVar.G();
                }
                break;
            default:
                final Function1 function1 = (Function1) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM = aVar2.M(function1);
                    Object objY3 = aVar2.y();
                    if (zM || objY3 == c0042a) {
                        objY3 = new rc30(function1, 1);
                        aVar2.r(objY3);
                    }
                    Function0 function0 = (Function0) objY3;
                    boolean zM2 = aVar2.M(function1);
                    Object objY4 = aVar2.y();
                    if (zM2 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: j3k0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(g1k0.f.a);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY4);
                    }
                    v3k0.a(function0, (Function0) objY4, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}

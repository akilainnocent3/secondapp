package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y590 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ y590(vzg0 vzg0Var) {
        this.b = vzg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                f690.e((d) obj3, (a) obj, qj40.a(1));
                break;
            default:
                vzg0 vzg0Var = (vzg0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(vzg0Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new bvh(vzg0Var, i2);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(vzg0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new cvh(vzg0Var, i3);
                        aVar.r(objY2);
                    }
                    e0h0.a(function0, (Function0) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ y590(d dVar, int i) {
        this.b = dVar;
    }
}

package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ie60 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ie60(int i, String str, Function0 function0) {
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pe60.c(qj40.a(1), (a) obj, (String) obj4, (Function0) obj3);
                break;
            default:
                hua0 hua0Var = (hua0) obj4;
                twd0 twd0Var = (twd0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eg60 eg60Var = (eg60) twd0Var.getValue();
                    uua0 uua0VarM0 = hua0Var.m0();
                    boolean zA = aVar.A(uua0VarM0);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        hua0.a aVar2 = new hua0.a(1, uua0VarM0, uua0.class, "handleEvent", "handleEvent(Lcom/sportygames/speedybingo/presentation/SBEvent;)V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    Function1 function1 = (Function1) ((chp) objY);
                    boolean zA2 = aVar.A(hua0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new olj(hua0Var, 1);
                        aVar.r(objY2);
                    }
                    yf60.a(eg60Var, function1, (Function0) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ie60(hua0 hua0Var, twd0 twd0Var) {
        this.b = hua0Var;
        this.c = twd0Var;
    }
}

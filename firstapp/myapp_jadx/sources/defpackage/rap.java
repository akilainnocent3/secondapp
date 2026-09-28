package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.plugin.realsports.data.RSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rap implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ rap(h8y h8yVar) {
        this.b = h8yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                uap.a((RSelection) obj3, (a) obj, qj40.a(1));
                break;
            default:
                h8y h8yVar = (h8y) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y9y y9yVar = (y9y) h8yVar.H.getValue();
                    boolean zA = aVar.A(h8yVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        h8y.a aVar2 = new h8y.a(1, h8yVar, h8y.class, "processSideEffect", "processSideEffect(Lcom/sportybet/android/globalpay/base/PayBaseSideEffect;)V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    Function1 function1 = (Function1) ((chp) objY);
                    boolean zA2 = aVar.A(h8yVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new h8y.b(1, h8yVar, h8y.class, "processSideEffect", "processSideEffect(Lcom/sportybet/android/globalpay/base/withdraw/WithdrawBaseSideEffect;)V", 0);
                        aVar.r(objY2);
                    }
                    Function1 function2 = (Function1) ((chp) objY2);
                    boolean zA3 = aVar.A(h8yVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new hp6(h8yVar, i2);
                        aVar.r(objY3);
                    }
                    v8y.b(y9yVar, function1, function2, (Function1) objY3, aVar, 8);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rap(RSelection rSelection, int i) {
        this.b = rSelection;
    }
}

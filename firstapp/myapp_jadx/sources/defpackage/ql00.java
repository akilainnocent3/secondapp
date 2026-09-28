package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ql00 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ql00(mg40 mg40Var) {
        this.a = 1;
        this.b = mg40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fm00.g((pm00) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                mg40 mg40Var = (mg40) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    scv.b(null, null, null, pp8.b(1506644640, new nhh(mg40Var, i2), aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                zfc0.a((xnc0) obj3, (a) obj, qj40.a(9));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ql00(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}

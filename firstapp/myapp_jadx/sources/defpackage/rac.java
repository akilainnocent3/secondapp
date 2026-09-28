package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class rac implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rac(a6c0 a6c0Var) {
        this.a = 1;
        this.b = a6c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rbc.b((Function0) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                a6c0 a6c0Var = (a6c0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    scv.b(null, null, null, pp8.b(1750122178, new t5c0(a6c0Var), aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pcg0.b((d) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rac(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}

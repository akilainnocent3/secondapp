package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class er9 implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ er9() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c55.a.a(0.0f, ((cjb0) aVar.O(ejb0.a)).b, 196608, 3, ((lib0) aVar.O(oib0.a)).H, j060.c(((zib0) aVar.O(ajb0.a)).d), aVar, null);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dhs.c(qj40.a(1), (a) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ er9(int i) {
    }
}

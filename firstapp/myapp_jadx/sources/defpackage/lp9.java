package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lp9 implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ lp9() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g75.a(androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), r58.d(4280695449L), zk40.a), aVar, 6);
                } else {
                    aVar.G();
                }
                break;
            default:
                num.getClass();
                jy90.c(qj40.a(1), aVar);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lp9(int i) {
    }
}

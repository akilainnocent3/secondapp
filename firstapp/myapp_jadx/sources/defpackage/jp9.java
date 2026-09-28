package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jp9 implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ jp9() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g75.a(androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), r58.d(4280041581L), zk40.a), aVar, 6);
                } else {
                    aVar.G();
                }
                break;
            default:
                num.getClass();
                gy90.a(qj40.a(1), aVar);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jp9(int i) {
    }
}

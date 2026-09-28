package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hy9 implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ hy9() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.G();
                }
                break;
            default:
                num.getClass();
                aba0.b(qj40.a(1), aVar);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hy9(int i) {
    }
}

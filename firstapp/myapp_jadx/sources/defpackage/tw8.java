package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tw8 implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ tw8() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h2f0.a.a(null, 0.0f, 0L, aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                af40.a(qj40.a(1), (a) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tw8(int i) {
    }
}

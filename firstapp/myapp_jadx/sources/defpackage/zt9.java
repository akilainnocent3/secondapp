package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zt9 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.G();
                }
                return Unit.a;
            default:
                ld00 ld00Var = (ld00) obj;
                ld00 ld00Var2 = (ld00) obj2;
                int i = jvd.G;
                ld00Var.getClass();
                ld00Var2.getClass();
                return Boolean.valueOf(ld00Var.f.equals(ld00Var2.f));
        }
    }
}

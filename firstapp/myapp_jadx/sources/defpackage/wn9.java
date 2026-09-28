package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wn9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ wn9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mc70.b(0, aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj).intValue();
                wph0 wph0Var = (wph0) obj2;
                wph0Var.getClass();
                return Integer.valueOf(wph0Var.a);
        }
    }
}

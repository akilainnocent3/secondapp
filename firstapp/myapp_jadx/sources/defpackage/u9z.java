package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u9z implements gaj<jhf0, a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public u9z(Function2<? super a, ? super Integer, Unit> function2) {
        this.a = function2;
    }

    @Override // defpackage.gaj
    public final Unit invoke(jhf0 jhf0Var, a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.a.invoke(aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

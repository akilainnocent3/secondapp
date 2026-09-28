package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rcv implements Function2<a, Integer, Unit> {
    public final /* synthetic */ eah0 a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public rcv(eah0 eah0Var, Function2<? super a, ? super Integer, Unit> function2) {
        this.a = eah0Var;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            lkf0.a(this.a.j, this.b, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

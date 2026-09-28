package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t1f0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public t1f0(Function2<? super a, ? super Integer, Unit> function2) {
        this.a = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            lkf0.a(imf0.b(gah0.a(ir20.f, aVar2), 0L, 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744447), this.a, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

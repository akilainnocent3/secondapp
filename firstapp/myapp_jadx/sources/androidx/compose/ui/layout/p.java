package androidx.compose.ui.layout;

import defpackage.qlr;
import defpackage.x5a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
    public final /* synthetic */ k.b a;
    public final /* synthetic */ Function2<androidx.compose.runtime.a, Integer, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(k.b bVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
        super(2);
        this.a = bVar;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Boolean bool = (Boolean) ((x5a0) this.a.g).getValue();
            boolean zBooleanValue = bool.booleanValue();
            aVar2.B(bool);
            boolean zB = aVar2.b(zBooleanValue);
            if (zBooleanValue) {
                this.b.invoke(aVar2, 0);
            } else {
                aVar2.h(zB);
            }
            aVar2.w();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

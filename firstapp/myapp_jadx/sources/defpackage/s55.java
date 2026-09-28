package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class s55 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ gaj<v3a0, a, Integer, Unit> a;
    public final /* synthetic */ l65 b;

    /* JADX WARN: Multi-variable type inference failed */
    public s55(gaj<? super v3a0, ? super a, ? super Integer, Unit> gajVar, l65 l65Var) {
        this.a = gajVar;
        this.b = l65Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.invoke(this.b.b, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

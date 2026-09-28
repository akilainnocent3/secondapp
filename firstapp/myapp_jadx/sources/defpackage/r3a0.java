package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r3a0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ gaj<j3a0, a, Integer, Unit> a;
    public final /* synthetic */ j3a0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public r3a0(gaj<? super j3a0, ? super a, ? super Integer, Unit> gajVar, j3a0 j3a0Var) {
        this.a = gajVar;
        this.b = j3a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            j3a0 j3a0Var = this.b;
            j3a0Var.getClass();
            this.a.invoke(j3a0Var, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

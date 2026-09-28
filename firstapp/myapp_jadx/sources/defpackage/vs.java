package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vs implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;

    public vs(op8 op8Var) {
        this.a = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            aVar2.N(-1102039173);
            aVar2.H();
            this.a.invoke(aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

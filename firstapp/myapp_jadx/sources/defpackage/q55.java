package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q55 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;
    public final /* synthetic */ float b;

    public q55(float f, op8 op8Var) {
        this.a = op8Var;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.invoke(h.b(0.0f, 0.0f, 0.0f, this.b, 7), aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

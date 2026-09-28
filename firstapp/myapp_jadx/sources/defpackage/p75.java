package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p75 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;
    public final /* synthetic */ e b;

    public p75(op8 op8Var, e eVar) {
        this.a = op8Var;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.invoke(this.b, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

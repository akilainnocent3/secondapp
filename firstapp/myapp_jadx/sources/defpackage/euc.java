package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class euc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ qx80 a;
    public final /* synthetic */ gtc b;
    public final /* synthetic */ op8 c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;
    public final /* synthetic */ op8 e;

    public euc(qx80 qx80Var, gtc gtcVar, op8 op8Var, Function2 function2, op8 op8Var2) {
        this.a = qx80Var;
        this.b = gtcVar;
        this.c = op8Var;
        this.d = function2;
        this.e = op8Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ihe0.a(j.k(j.q(d.a.b, dxc.d), 0.0f, dxc.b, 1), this.a, this.b.a, 0L, 0.0f, 0.0f, null, pp8.b(1782015378, new duc(this.c, this.d, this.e), aVar2), aVar2, 12582918, 104);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

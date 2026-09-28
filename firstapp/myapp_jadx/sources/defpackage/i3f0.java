package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i3f0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ op8 c;

    public i3f0(op8 op8Var, Function2 function2, op8 op8Var2) {
        this.a = op8Var;
        this.b = function2;
        this.c = op8Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarG = j.g(d.a.b, 1.0f);
            op8 op8Var = this.a;
            boolean zM = aVar2.M(op8Var);
            Function2<a, Integer, Unit> function2 = this.b;
            boolean zM2 = zM | aVar2.M(function2);
            op8 op8Var2 = this.c;
            boolean zM3 = zM2 | aVar2.M(op8Var2);
            Object objY = aVar2.y();
            if (zM3 || objY == a.C0041a.a) {
                objY = new tab(op8Var, function2, op8Var2, 1);
                aVar2.r(objY);
            }
            f0.a(dVarG, (Function2) objY, aVar2, 6, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

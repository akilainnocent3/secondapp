package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tvc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ fxc a;
    public final /* synthetic */ gtc b;

    public tvc(fxc fxcVar, gtc gtcVar) {
        this.a = fxcVar;
        this.b = gtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarE = h.e(d.a.b, xvc.a);
            fxc fxcVar = this.a;
            int iD = fxcVar.d();
            boolean zM = aVar2.M(fxcVar);
            Object objY = aVar2.y();
            if (zM || objY == a.C0041a.a) {
                objY = new svc(fxcVar, 0);
                aVar2.r(objY);
            }
            xvc.f(dVarE, iD, (Function1) objY, this.b, aVar2, 6);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xxc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ oyc a;
    public final /* synthetic */ gtc b;

    public xxc(oyc oycVar, gtc gtcVar) {
        this.a = oycVar;
        this.b = gtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarE = h.e(d.a.b, xvc.a);
            final oyc oycVar = this.a;
            int iD = oycVar.d();
            boolean zM = aVar2.M(oycVar);
            Object objY = aVar2.y();
            if (zM || objY == a.C0041a.a) {
                objY = new Function1() { // from class: wxc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mse mseVar = (mse) obj;
                        int i = mseVar.a;
                        oyc oycVar2 = oycVar;
                        Long lF = oycVar2.f();
                        if (lF != null) {
                            oycVar2.c(oycVar2.c.f(lF.longValue()).e);
                        }
                        ((x5a0) oycVar2.h).setValue(mseVar);
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            xvc.f(dVarE, iD, (Function1) objY, this.b, aVar2, 6);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

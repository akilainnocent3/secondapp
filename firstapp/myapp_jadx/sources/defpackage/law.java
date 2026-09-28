package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class law implements Function2<a, Integer, Unit> {
    public final /* synthetic */ oaw a;
    public final /* synthetic */ haw b;

    public law(oaw oawVar, haw hawVar) {
        this.a = oawVar;
        this.b = hawVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            o9w o9wVar = this.a.e;
            ohp<Object>[] ohpVarArr = haw.E;
            ocu ocuVarN0 = this.b.n0();
            boolean zA = aVar2.A(ocuVarN0);
            Object objY = aVar2.y();
            if (zA || objY == a.C0041a.a) {
                kaw kawVar = new kaw(1, ocuVarN0, ocu.class, "handleAction", "handleAction(Lcom/sportybet/feature/multifactorauth/model/MultiFactorAuthAction;)V", 0);
                aVar2.r(kawVar);
                objY = kawVar;
            }
            n9w.c(o9wVar, (Function1) ((chp) objY), aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

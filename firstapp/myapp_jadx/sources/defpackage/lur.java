package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class lur implements iaj<tur, Integer, a, Integer, Unit> {
    public final /* synthetic */ op8 a;

    public lur(op8 op8Var) {
        this.a = op8Var;
    }

    @Override // defpackage.iaj
    public final Unit d(tur turVar, Integer num, a aVar, Integer num2) {
        tur turVar2 = turVar;
        num.intValue();
        a aVar2 = aVar;
        int iIntValue = num2.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.M(turVar2) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 131) != 130)) {
            this.a.invoke(turVar2, aVar2, Integer.valueOf(iIntValue & 14));
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

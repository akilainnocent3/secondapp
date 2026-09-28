package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qvc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ fxc a;
    public final /* synthetic */ gtc b;

    public qvc(fxc fxcVar, gtc gtcVar) {
        this.a = fxcVar;
        this.b = gtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ktc.a.b(this.a.d(), 3120, this.b.b, aVar2, h.e(d.a.b, xvc.b));
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

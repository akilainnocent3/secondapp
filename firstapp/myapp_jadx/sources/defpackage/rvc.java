package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rvc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ fxc a;
    public final /* synthetic */ guc b;
    public final /* synthetic */ gtc c;

    public rvc(fxc fxcVar, guc gucVar, gtc gtcVar) {
        this.a = fxcVar;
        this.b = gucVar;
        this.c = gtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ktc ktcVar = ktc.a;
            fxc fxcVar = this.a;
            ktcVar.a(fxcVar.e(), fxcVar.d(), this.b, h.e(d.a.b, xvc.c), this.c.c, aVar2, 199680);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

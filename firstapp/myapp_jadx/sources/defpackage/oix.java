package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oix implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ifx a;
    public final /* synthetic */ pf0 b;

    public oix(ifx ifxVar, pf0 pf0Var) {
        this.a = ifxVar;
        this.b = pf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        if ((num.intValue() & 3) == 2 && aVar2.j()) {
            aVar2.G();
        } else {
            ifx ifxVar = this.a;
            ygx ygxVar = ifxVar.b;
            ygxVar.getClass();
            ((sga.a) ygxVar).i.d(this.b, ifxVar, aVar2, 0);
        }
        return Unit.a;
    }
}

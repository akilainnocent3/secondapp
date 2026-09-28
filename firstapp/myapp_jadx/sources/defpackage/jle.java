package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jle implements Function2<a, Integer, Unit> {
    public final /* synthetic */ vle.a a;
    public final /* synthetic */ ifx b;

    public jle(vle.a aVar, ifx ifxVar) {
        this.a = aVar;
        this.b = ifxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        if ((num.intValue() & 3) == 2 && aVar2.j()) {
            aVar2.G();
        } else {
            this.a.v.invoke(this.b, aVar2, 0);
        }
        return Unit.a;
    }
}

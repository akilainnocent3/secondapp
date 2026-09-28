package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ogf0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ gaj<jhf0, a, Integer, Unit> a;
    public final /* synthetic */ vgf0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public ogf0(gaj<? super jhf0, ? super a, ? super Integer, Unit> gajVar, vgf0 vgf0Var) {
        this.a = gajVar;
        this.b = vgf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.invoke(this.b, aVar2, 6);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

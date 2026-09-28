package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r1f0 implements gaj<j78, a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;

    public r1f0(op8 op8Var) {
        this.a = op8Var;
    }

    @Override // defpackage.gaj
    public final Unit invoke(j78 j78Var, a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            w1f0.c(0, aVar2, this.a);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}

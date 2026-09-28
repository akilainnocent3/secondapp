package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rjb0 extends saj implements Function1<ijf0, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ijf0 ijf0Var) {
        Object value;
        vjb0 vjb0Var;
        ijf0 ijf0Var2 = ijf0Var;
        ijf0Var2.getClass();
        hkb0 hkb0Var = (hkb0) this.receiver;
        hkb0Var.getClass();
        ((x5a0) hkb0Var.h0).setValue(ijf0Var2);
        nk0 nk0Var = ijf0Var2.a;
        boolean z = nk0Var.b.length() == 16;
        wwd0 wwd0Var = hkb0Var.Y;
        do {
            value = wwd0Var.getValue();
            vjb0Var = (vjb0) value;
        } while (!wwd0Var.g(value, vjb0.a(vjb0Var, null, null, null, null, null, null, null, null, z900.a(vjb0Var.i, (z || nk0Var.b.length() <= 0) ? vch0.a : hkb0.i0), false, 767)));
        hkb0Var.w2(z);
        return Unit.a;
    }
}

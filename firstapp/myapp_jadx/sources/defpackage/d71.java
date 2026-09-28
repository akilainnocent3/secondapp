package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d71 extends saj implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        fb1 fb1Var = (fb1) this.receiver;
        fb1Var.getClass();
        if (zBooleanValue) {
            ej5.c(o8i0.d(fb1Var), fb1Var.a, null, new mb1(fb1Var, null), 2);
        }
        ej5.c(o8i0.d(fb1Var), null, null, new nb1(fb1Var, null), 3);
        return Unit.a;
    }
}

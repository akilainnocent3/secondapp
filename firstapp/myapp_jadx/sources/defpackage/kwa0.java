package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kwa0 extends saj implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        zwa0 zwa0Var = (zwa0) this.receiver;
        zwa0Var.S = zBooleanValue;
        zwa0Var.B1();
        return Unit.a;
    }
}

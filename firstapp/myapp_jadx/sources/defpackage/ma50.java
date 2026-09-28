package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ma50 implements Function1<Boolean, Unit> {
    public v020 a;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        v020 v020Var = this.a;
        if (v020Var != null) {
            v020Var.d = zBooleanValue;
        }
        return Unit.a;
    }
}

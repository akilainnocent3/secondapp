package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0a0 implements Function0 {
    public final /* synthetic */ w0a0 a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0<Unit> function0;
        w0a0 w0a0Var = this.a;
        if (!((Boolean) ((x5a0) w0a0Var.n).getValue()).booleanValue() && (function0 = w0a0Var.b) != null) {
            function0.invoke();
        }
        return Unit.a;
    }
}

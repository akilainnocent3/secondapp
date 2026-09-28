package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yi2 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        fj2 fj2Var = (fj2) this.receiver;
        jvd0 jvd0Var = fj2Var.E;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        fj2Var.E = ej5.c(o8i0.d(fj2Var), null, null, new kj2(fj2Var, null), 3);
        return Unit.a;
    }
}

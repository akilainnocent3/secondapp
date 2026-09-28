package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bny {
    public boolean a;
    public final tb5 b = d77.b(-2, 4, pb5.a);
    public final jvd0 c;

    public bny(v5b v5bVar, boolean z, Function2 function2, qm20 qm20Var) {
        this.a = z;
        this.c = ej5.c(v5bVar, null, null, new any(qm20Var, function2, this, null), 3);
    }

    public final void a() {
        this.b.i(new CancellationException("onBack cancelled"), true);
        this.c.cancel((CancellationException) null);
    }
}

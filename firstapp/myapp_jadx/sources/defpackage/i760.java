package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class i760 implements xb6 {
    public final jvd0 a;

    public i760(jvd0 jvd0Var) {
        this.a = jvd0Var;
    }

    @Override // defpackage.xb6
    public final void cancel() {
        this.a.cancel((CancellationException) null);
    }
}

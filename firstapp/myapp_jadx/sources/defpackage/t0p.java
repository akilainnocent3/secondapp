package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class t0p extends j9p {
    public static final /* synthetic */ long f = s0o.a.objectFieldOffset(t0p.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final Function1<Throwable, Unit> e;

    /* JADX WARN: Multi-variable type inference failed */
    public t0p(Function1<? super Throwable, Unit> function1) {
        this.e = function1;
    }

    @Override // defpackage.j9p
    public final boolean k() {
        return true;
    }

    @Override // defpackage.j9p
    public final void l(Throwable th) {
        if (s0o.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}

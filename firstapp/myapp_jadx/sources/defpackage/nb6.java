package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class nb6 implements ob6 {
    public final ScheduledFuture a;

    public nb6(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.ob6
    public final void b(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}

package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class vse implements wse {
    public final ScheduledFuture a;

    public vse(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.wse
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}

package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hbj implements nv5.c {
    public final /* synthetic */ qis a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ long c;

    public /* synthetic */ hbj(qis qisVar, ScheduledExecutorService scheduledExecutorService, long j) {
        this.a = qisVar;
        this.b = scheduledExecutorService;
        this.c = j;
    }

    @Override // nv5.c
    public final Object a(final nv5.a aVar) {
        final qis qisVar = this.a;
        obj.e(qisVar, aVar);
        if (!qisVar.isDone()) {
            final long j = this.c;
            final ScheduledFuture scheduledFutureSchedule = this.b.schedule(new Callable() { // from class: ibj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.d(new TimeoutException("Future[" + qisVar + "] is not done within " + j + " ms.")));
                }
            }, j, TimeUnit.MILLISECONDS);
            qisVar.k(new Runnable() { // from class: jbj
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, nqe.a());
        }
        return "TimeoutFuture[" + qisVar + "]";
    }
}

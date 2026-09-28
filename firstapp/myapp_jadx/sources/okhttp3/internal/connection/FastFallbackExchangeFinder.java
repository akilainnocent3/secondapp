package okhttp3.internal.connection;

import defpackage.rtg;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/connection/FastFallbackExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RoutePlanner;", "routePlanner", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/connection/RoutePlanner;Lokhttp3/internal/concurrent/TaskRunner;)V", "Lokhttp3/internal/connection/RealConnection;", "find", "()Lokhttp3/internal/connection/RealConnection;", "a", "Lokhttp3/internal/connection/RoutePlanner;", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FastFallbackExchangeFinder implements ExchangeFinder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final RoutePlanner routePlanner;
    public final TaskRunner b;
    public long c;
    public final CopyOnWriteArrayList<RoutePlanner.Plan> d;
    public final BlockingQueue<RoutePlanner.ConnectResult> e;

    public FastFallbackExchangeFinder(RoutePlanner routePlanner, TaskRunner taskRunner) {
        routePlanner.getClass();
        taskRunner.getClass();
        this.routePlanner = routePlanner;
        this.b = taskRunner;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList<>();
        this.e = taskRunner.getBackend().decorate(new LinkedBlockingDeque());
    }

    public final void a() {
        CopyOnWriteArrayList<RoutePlanner.Plan> copyOnWriteArrayList = this.d;
        Iterator<RoutePlanner.Plan> it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            RoutePlanner.Plan next = it.next();
            next.mo249cancel();
            RoutePlanner.Plan planMo251retry = next.mo251retry();
            if (planMo251retry != null) {
                getRoutePlanner().getDeferredPlans().addLast(planMo251retry);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final RoutePlanner.ConnectResult b() {
        final RoutePlanner.Plan failedPlan;
        if (RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
            try {
                failedPlan = getRoutePlanner().plan();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.isReady()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6, null);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).getResult();
            }
            this.d.add(failedPlan);
            final String str = _UtilJvmKt.okHttpName + " connect " + getRoutePlanner().getAddress().url().redact();
            TaskQueue.schedule$default(this.b.newQueue(), new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() throws InterruptedException {
                    RoutePlanner.ConnectResult connectResult;
                    RoutePlanner.Plan plan = failedPlan;
                    try {
                        connectResult = plan.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_RESULT java.lang.String();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(plan, null, th2, 2, null);
                    }
                    FastFallbackExchangeFinder fastFallbackExchangeFinder = this;
                    if (!fastFallbackExchangeFinder.d.contains(plan)) {
                        return -1L;
                    }
                    fastFallbackExchangeFinder.e.put(connectResult);
                    return -1L;
                }
            }, 0L, 2, null);
        }
        return null;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RealConnection find() throws IOException {
        RoutePlanner.ConnectResult connectResultB;
        long j;
        RoutePlanner.ConnectResult connectResultPoll;
        CopyOnWriteArrayList<RoutePlanner.Plan> copyOnWriteArrayList = this.d;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
                    a();
                    iOException.getClass();
                    throw iOException;
                }
                if (getRoutePlanner().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jNanoTime = this.b.getBackend().nanoTime();
                long j2 = this.c - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j2 <= 0) {
                    connectResultB = b();
                    j = 250000000;
                    this.c = jNanoTime + 250000000;
                } else {
                    j = j2;
                    connectResultB = null;
                }
                if (connectResultB == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (connectResultPoll = this.e.poll(j, timeUnit)) == null) {
                        connectResultB = null;
                    } else {
                        copyOnWriteArrayList.remove(connectResultPoll.getPlan());
                        connectResultB = connectResultPoll;
                    }
                    if (connectResultB == null) {
                    }
                }
                if (connectResultB.isSuccess()) {
                    a();
                    if (!connectResultB.getPlan().isReady()) {
                        connectResultB = connectResultB.getPlan().mo253connectTlsEtc();
                    }
                    if (connectResultB.isSuccess()) {
                        RealConnection realConnectionMo250handleSuccess = connectResultB.getPlan().mo250handleSuccess();
                        a();
                        return realConnectionMo250handleSuccess;
                    }
                }
                Throwable throwable = connectResultB.getThrowable();
                if (throwable != null) {
                    if (!(throwable instanceof IOException)) {
                        throw throwable;
                    }
                    if (iOException == null) {
                        iOException = (IOException) throwable;
                    } else {
                        rtg.a(iOException, throwable);
                    }
                }
                RoutePlanner.Plan nextPlan = connectResultB.getNextPlan();
                if (nextPlan != null) {
                    getRoutePlanner().getDeferredPlans().addFirst(nextPlan);
                }
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }
}

package nj;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public abstract class k3 extends j3 implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f117113c;

    public k3(ScheduledExecutorService delegate) {
        super(delegate);
        this.f117113c = delegate;
    }

    @Override // nj.j3, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return this.f117113c.schedule(b(command), delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return this.f117113c.scheduleAtFixedRate(b(command), initialDelay, period, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return this.f117113c.scheduleWithFixedDelay(b(command), initialDelay, delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
        return this.f117113c.schedule(c(task), delay, unit);
    }
}

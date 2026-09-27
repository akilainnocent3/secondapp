package ak;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends o implements l0, AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f5507d;

    public m0(h0 h0Var, ScheduledExecutorService scheduledExecutorService) {
        super(h0Var, scheduledExecutorService);
        this.f5507d = h0Var;
    }

    @Override // ak.o, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    @Override // ak.f0
    public boolean isPaused() {
        return this.f5507d.isPaused();
    }

    @Override // ak.f0
    public void pause() {
        this.f5507d.pause();
    }

    @Override // ak.f0
    public void resume() {
        this.f5507d.resume();
    }

    @Override // ak.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // ak.o, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}

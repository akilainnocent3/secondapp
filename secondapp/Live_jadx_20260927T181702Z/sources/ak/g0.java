package ak;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f5478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f5479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @h1
    public final LinkedBlockingQueue<Runnable> f5480d = new LinkedBlockingQueue<>();

    public g0(boolean z10, Executor executor) {
        this.f5478b = z10;
        this.f5479c = executor;
    }

    public final void a() {
        if (this.f5478b) {
            return;
        }
        Runnable runnablePoll = this.f5480d.poll();
        while (runnablePoll != null) {
            this.f5479c.execute(runnablePoll);
            runnablePoll = !this.f5478b ? this.f5480d.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5480d.offer(runnable);
        a();
    }

    @Override // ak.f0
    public boolean isPaused() {
        return this.f5478b;
    }

    @Override // ak.f0
    public void pause() {
        this.f5478b = true;
    }

    @Override // ak.f0
    public void resume() {
        this.f5478b = false;
        a();
    }
}

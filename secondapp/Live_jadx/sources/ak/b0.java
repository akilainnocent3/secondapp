package ak;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class b0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Semaphore f5457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue<Runnable> f5458d = new LinkedBlockingQueue<>();

    public b0(Executor executor, int i10) {
        zj.j0.a(i10 > 0, "concurrency must be positive.");
        this.f5456b = executor;
        this.f5457c = new Semaphore(i10, true);
    }

    public static /* synthetic */ void a(b0 b0Var, Runnable runnable) {
        b0Var.getClass();
        try {
            runnable.run();
        } finally {
            b0Var.f5457c.release();
            b0Var.d();
        }
    }

    public final Runnable b(final Runnable runnable) {
        return new Runnable() { // from class: ak.a0
            @Override // java.lang.Runnable
            public final void run() {
                b0.a(this.f5449b, runnable);
            }
        };
    }

    public final void d() {
        while (this.f5457c.tryAcquire()) {
            Runnable runnablePoll = this.f5458d.poll();
            if (runnablePoll == null) {
                this.f5457c.release();
                return;
            }
            this.f5456b.execute(b(runnablePoll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5458d.offer(runnable);
        d();
    }
}

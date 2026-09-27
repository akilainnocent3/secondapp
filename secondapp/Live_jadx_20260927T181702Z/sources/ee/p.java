package ee;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class p implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f80806b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f80807b;

        public a(Runnable runnable) {
            this.f80807b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f80807b.run();
            } catch (Exception e10) {
                je.a.f("Executor", "Background execution failure.", e10);
            }
        }
    }

    public p(Executor executor) {
        this.f80806b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f80806b.execute(new a(runnable));
    }
}

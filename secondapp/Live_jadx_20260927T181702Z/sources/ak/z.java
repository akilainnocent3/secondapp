package ak;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class z {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor, int i10) {
        return new b0(executor, i10);
    }

    public static ExecutorService c(ExecutorService executorService, int i10) {
        return new e0(executorService, i10);
    }

    public static ScheduledExecutorService d(ExecutorService executorService, int i10) {
        return new o(c(executorService, i10), ExecutorsRegistrar.f52129d.get());
    }

    public static f0 e(Executor executor) {
        return new g0(false, executor);
    }

    public static h0 f(ExecutorService executorService) {
        return new k0(false, executorService);
    }

    public static l0 g(ScheduledExecutorService scheduledExecutorService) {
        return new m0(f(scheduledExecutorService), ExecutorsRegistrar.f52129d.get());
    }

    public static Executor h(Executor executor) {
        return new n0(executor);
    }
}

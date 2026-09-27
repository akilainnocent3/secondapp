package nj;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
@qj.f("Create an AbstractIdleService")
public interface l2 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void a(long timeout, TimeUnit unit) throws TimeoutException;

    void b(long timeout, TimeUnit unit) throws TimeoutException;

    void c(a listener, Executor executor);

    void d();

    Throwable e();

    void f();

    @qj.a
    l2 g();

    @qj.a
    l2 h();

    boolean isRunning();

    b state();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {
        public void b() {
        }

        public void c() {
        }

        public void d(b from) {
        }

        public void e(b from) {
        }

        public void a(b from, Throwable failure) {
        }
    }
}

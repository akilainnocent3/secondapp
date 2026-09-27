package nj;

import cj.w5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.b
public abstract class a1<V> extends w5 implements Future<V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a<V> extends a1<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Future<V> f116887c;

        public a(Future<V> delegate) {
            this.f116887c = (Future) zi.l0.E(delegate);
        }

        @Override // nj.a1, cj.w5
        /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
        public final Future<V> g2() {
            return this.f116887c;
        }
    }

    @Override // cj.w5
    /* JADX INFO: renamed from: X1 */
    public abstract Future<? extends V> g2();

    @Override // java.util.concurrent.Future
    @qj.a
    public boolean cancel(boolean mayInterruptIfRunning) {
        return g2().cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    @qj.a
    @f2
    public V get() throws ExecutionException, InterruptedException {
        return g2().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return g2().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return g2().isDone();
    }

    @Override // java.util.concurrent.Future
    @f2
    @qj.a
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return g2().get(timeout, unit);
    }
}

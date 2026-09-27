package ak;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"RestrictedApi"})
public class p<V> extends h0.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScheduledFuture<?> f5530j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements b<V> {
        public a() {
        }

        @Override // ak.p.b
        public void a(Throwable th2) {
            p.this.s(th2);
        }

        @Override // ak.p.b
        public void set(V v10) {
            p.this.q(v10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void a(Throwable th2);

        void set(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    public p(c<V> cVar) {
        this.f5530j = cVar.a(new a());
    }

    @Override // h0.a
    public void b() {
        this.f5530j.cancel(v());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f5530j.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f5530j.compareTo(delayed);
    }
}

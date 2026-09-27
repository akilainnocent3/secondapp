package bj;

import java.util.concurrent.atomic.AtomicLong;
import zi.u0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@i
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0<q> f21736a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements u0<q> {
        @Override // zi.u0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public q get() {
            return new s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements u0<q> {
        @Override // zi.u0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public q get() {
            return new c(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends AtomicLong implements q {
        public c() {
        }

        @Override // bj.q
        public void add(long x10) {
            getAndAdd(x10);
        }

        @Override // bj.q
        public void d() {
            getAndIncrement();
        }

        @Override // bj.q
        public long sum() {
            return get();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        u0<q> bVar;
        try {
            new s();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f21736a = bVar;
    }

    public static q a() {
        return f21736a.get();
    }
}

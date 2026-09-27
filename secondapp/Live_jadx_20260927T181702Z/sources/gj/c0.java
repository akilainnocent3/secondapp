package gj;

import java.util.concurrent.atomic.AtomicLong;
import zi.u0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0<b0> f86777a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements u0<b0> {
        @Override // zi.u0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b0 get() {
            return new d0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements u0<b0> {
        @Override // zi.u0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b0 get() {
            return new c(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends AtomicLong implements b0 {
        public c() {
        }

        @Override // gj.b0
        public void add(long x10) {
            getAndAdd(x10);
        }

        @Override // gj.b0
        public void d() {
            getAndIncrement();
        }

        @Override // gj.b0
        public long sum() {
            return get();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        u0<b0> bVar;
        try {
            new d0();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f86777a = bVar;
    }

    public static b0 a() {
        return f86777a.get();
    }
}

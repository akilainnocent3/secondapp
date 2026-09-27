package dh;

import eh.o1;
import java.util.ArrayDeque;
import java.util.Deque;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class l implements dh.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79292f = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f79293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f79294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.h f79295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f79296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f79297e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f79299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f79300c;

        public a(long j10, double d10, long j11) {
            this.f79298a = j10;
            this.f79299b = d10;
            this.f79300c = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        boolean a(Deque<a> deque);
    }

    public l() {
        this(g(10L));
    }

    public static /* synthetic */ boolean c(long j10, eh.h hVar, Deque deque) {
        return !deque.isEmpty() && ((a) o1.o((a) deque.peek())).f79300c + j10 < hVar.elapsedRealtime();
    }

    public static /* synthetic */ boolean d(long j10, Deque deque) {
        return ((long) deque.size()) >= j10;
    }

    public static b e(long j10) {
        return f(j10, eh.h.f80967a);
    }

    @h1
    public static b f(final long j10, final eh.h hVar) {
        return new b() { // from class: dh.k
            @Override // dh.l.b
            public final boolean a(Deque deque) {
                return l.c(j10, hVar, deque);
            }
        };
    }

    public static b g(final long j10) {
        return new b() { // from class: dh.j
            @Override // dh.l.b
            public final boolean a(Deque deque) {
                return l.d(j10, deque);
            }
        };
    }

    @Override // dh.b
    public long a() {
        if (this.f79293a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.f79296d / this.f79297e);
    }

    @Override // dh.b
    public void b(long j10, long j11) {
        while (this.f79294b.a(this.f79293a)) {
            a aVarRemove = this.f79293a.remove();
            double d10 = this.f79296d;
            double d11 = aVarRemove.f79298a;
            double d12 = aVarRemove.f79299b;
            this.f79296d = d10 - (d11 * d12);
            this.f79297e -= d12;
        }
        a aVar = new a((j10 * 8000000) / j11, Math.sqrt(j10), this.f79295c.elapsedRealtime());
        this.f79293a.add(aVar);
        double d13 = this.f79296d;
        double d14 = aVar.f79298a;
        double d15 = aVar.f79299b;
        this.f79296d = d13 + (d14 * d15);
        this.f79297e += d15;
    }

    @Override // dh.b
    public void reset() {
        this.f79293a.clear();
        this.f79296d = 0.0d;
        this.f79297e = 0.0d;
    }

    public l(b bVar) {
        this(bVar, eh.h.f80967a);
    }

    @h1
    public l(b bVar, eh.h hVar) {
        this.f79293a = new ArrayDeque<>();
        this.f79294b = bVar;
        this.f79295c = hVar;
    }
}

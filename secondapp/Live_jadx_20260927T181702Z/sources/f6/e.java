package f6;

import androidx.annotation.Nullable;
import java.io.IOException;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public abstract class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f83415e = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f83416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f83417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f83418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83419d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f83420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f83421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f83422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f83423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f83424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f83425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f83426g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f83420a = dVar;
            this.f83421b = j10;
            this.f83422c = j11;
            this.f83423d = j12;
            this.f83424e = j13;
            this.f83425f = j14;
            this.f83426g = j15;
        }

        @Override // f6.w0
        public /* synthetic */ boolean e() {
            return v0.a(this);
        }

        @Override // f6.w0
        public long getDurationUs() {
            return this.f83421b;
        }

        @Override // f6.w0
        public w0.a getSeekPoints(long j10) {
            return new w0.a(new x0(j10, c.h(this.f83420a.a(j10), this.f83422c, this.f83423d, this.f83424e, this.f83425f, this.f83426g)));
        }

        @Override // f6.w0
        public boolean isSeekable() {
            return true;
        }

        public long l(long j10) {
            return this.f83420a.a(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f83427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f83428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f83429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f83430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f83431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f83432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f83433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f83434h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f83427a = j10;
            this.f83428b = j11;
            this.f83430d = j12;
            this.f83431e = j13;
            this.f83432f = j14;
            this.f83433g = j15;
            this.f83429c = j16;
            this.f83434h = h(j11, j12, j13, j14, j15, j16);
        }

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return b2.y(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f83433g;
        }

        public final long j() {
            return this.f83432f;
        }

        public final long k() {
            return this.f83434h;
        }

        public final long l() {
            return this.f83427a;
        }

        public final long m() {
            return this.f83428b;
        }

        public final void n() {
            this.f83434h = h(this.f83428b, this.f83430d, this.f83431e, this.f83432f, this.f83433g, this.f83429c);
        }

        public final void o(long j10, long j11) {
            this.f83431e = j10;
            this.f83433g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f83430d = j10;
            this.f83432f = j11;
            n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: renamed from: f6.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0823e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f83435d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f83436e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f83437f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f83438g = -3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0823e f83439h = new C0823e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f83440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f83441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f83442c;

        public C0823e(int i10, long j10, long j11) {
            this.f83440a = i10;
            this.f83441b = j10;
            this.f83442c = j11;
        }

        public static C0823e d(long j10, long j11) {
            return new C0823e(-1, j10, j11);
        }

        public static C0823e e(long j10) {
            return new C0823e(0, -9223372036854775807L, j10);
        }

        public static C0823e f(long j10, long j11) {
            return new C0823e(-2, j10, j11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void a();

        C0823e b(v vVar, long j10) throws IOException;
    }

    public e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f83417b = fVar;
        this.f83419d = i10;
        this.f83416a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f83416a.l(j10), this.f83416a.f83422c, this.f83416a.f83423d, this.f83416a.f83424e, this.f83416a.f83425f, this.f83416a.f83426g);
    }

    public final w0 b() {
        return this.f83416a;
    }

    public int c(v vVar, t0 t0Var) throws IOException {
        while (true) {
            c cVar = (c) zi.l0.E(this.f83418c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f83419d) {
                e(false, j10);
                return g(vVar, j10, t0Var);
            }
            if (!i(vVar, jK)) {
                return g(vVar, jK, t0Var);
            }
            vVar.resetPeekPosition();
            C0823e c0823eB = this.f83417b.b(vVar, cVar.m());
            int i10 = c0823eB.f83440a;
            if (i10 == -3) {
                e(false, jK);
                return g(vVar, jK, t0Var);
            }
            if (i10 == -2) {
                cVar.p(c0823eB.f83441b, c0823eB.f83442c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(vVar, c0823eB.f83442c);
                    e(true, c0823eB.f83442c);
                    return g(vVar, c0823eB.f83442c, t0Var);
                }
                cVar.o(c0823eB.f83441b, c0823eB.f83442c);
            }
        }
    }

    public final boolean d() {
        return this.f83418c != null;
    }

    public final void e(boolean z10, long j10) {
        this.f83418c = null;
        this.f83417b.a();
        f(z10, j10);
    }

    public final int g(v vVar, long j10, t0 t0Var) {
        if (j10 == vVar.getPosition()) {
            return 0;
        }
        t0Var.f83653a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f83418c;
        if (cVar == null || cVar.l() != j10) {
            this.f83418c = a(j10);
        }
    }

    public final boolean i(v vVar, long j10) throws IOException {
        long position = j10 - vVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        vVar.skipFully((int) position);
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements d {
        @Override // f6.e.d
        public long a(long j10) {
            return j10;
        }
    }

    public void f(boolean z10, long j10) {
    }
}

package af;

import androidx.annotation.Nullable;
import eh.o1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f4854e = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0016a f4855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f4856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f4857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4858d;

    /* JADX INFO: renamed from: af.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0016a implements d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f4859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f4860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f4861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f4862g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f4863h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f4864i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f4865j;

        public C0016a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f4859d = dVar;
            this.f4860e = j10;
            this.f4861f = j11;
            this.f4862g = j12;
            this.f4863h = j13;
            this.f4864i = j14;
            this.f4865j = j15;
        }

        public long g(long j10) {
            return this.f4859d.a(j10);
        }

        @Override // af.d0
        public long getDurationUs() {
            return this.f4860e;
        }

        @Override // af.d0
        public d0.a getSeekPoints(long j10) {
            return new d0.a(new e0(j10, c.h(this.f4859d.a(j10), this.f4861f, this.f4862g, this.f4863h, this.f4864i, this.f4865j)));
        }

        @Override // af.d0
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f4869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f4871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f4872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f4873h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f4866a = j10;
            this.f4867b = j11;
            this.f4869d = j12;
            this.f4870e = j13;
            this.f4871f = j14;
            this.f4872g = j15;
            this.f4868c = j16;
            this.f4873h = h(j11, j12, j13, j14, j15, j16);
        }

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return o1.x(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f4872g;
        }

        public final long j() {
            return this.f4871f;
        }

        public final long k() {
            return this.f4873h;
        }

        public final long l() {
            return this.f4866a;
        }

        public final long m() {
            return this.f4867b;
        }

        public final void n() {
            this.f4873h = h(this.f4867b, this.f4869d, this.f4870e, this.f4871f, this.f4872g, this.f4868c);
        }

        public final void o(long j10, long j11) {
            this.f4870e = j10;
            this.f4872g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f4869d = j10;
            this.f4871f = j11;
            n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f4874d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f4875e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f4876f = -2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f4877g = -3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f4878h = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4881c;

        public e(int i10, long j10, long j11) {
            this.f4879a = i10;
            this.f4880b = j10;
            this.f4881c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void a();

        e b(n nVar, long j10) throws IOException;
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f4856b = fVar;
        this.f4858d = i10;
        this.f4855a = new C0016a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f4855a.g(j10), this.f4855a.f4861f, this.f4855a.f4862g, this.f4855a.f4863h, this.f4855a.f4864i, this.f4855a.f4865j);
    }

    public final d0 b() {
        return this.f4855a;
    }

    public int c(n nVar, b0 b0Var) throws IOException {
        while (true) {
            c cVar = (c) eh.a.k(this.f4857c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f4858d) {
                e(false, j10);
                return g(nVar, j10, b0Var);
            }
            if (!i(nVar, jK)) {
                return g(nVar, jK, b0Var);
            }
            nVar.resetPeekPosition();
            e eVarB = this.f4856b.b(nVar, cVar.m());
            int i10 = eVarB.f4879a;
            if (i10 == -3) {
                e(false, jK);
                return g(nVar, jK, b0Var);
            }
            if (i10 == -2) {
                cVar.p(eVarB.f4880b, eVarB.f4881c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(nVar, eVarB.f4881c);
                    e(true, eVarB.f4881c);
                    return g(nVar, eVarB.f4881c, b0Var);
                }
                cVar.o(eVarB.f4880b, eVarB.f4881c);
            }
        }
    }

    public final boolean d() {
        return this.f4857c != null;
    }

    public final void e(boolean z10, long j10) {
        this.f4857c = null;
        this.f4856b.a();
        f(z10, j10);
    }

    public final int g(n nVar, long j10, b0 b0Var) {
        if (j10 == nVar.getPosition()) {
            return 0;
        }
        b0Var.f4886a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f4857c;
        if (cVar == null || cVar.l() != j10) {
            this.f4857c = a(j10);
        }
    }

    public final boolean i(n nVar, long j10) throws IOException {
        long position = j10 - nVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        nVar.skipFully((int) position);
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements d {
        @Override // af.a.d
        public long a(long j10) {
            return j10;
        }
    }

    public void f(boolean z10, long j10) {
    }
}

package s5;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e5.k4;
import java.io.IOException;
import u4.y4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface s0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @x4.m1
        public static final a f129488a = c1.f129122b;

        @qj.a
        @x4.t
        @x4.m1
        a a(int i10);

        @x4.m1
        a b(c7.s.a aVar);

        @x4.t
        @x4.m1
        @Deprecated
        a c(boolean z10);

        @x4.m1
        s0 d(u4.c1 c1Var);

        @x4.m1
        a e(j5.a0 a0Var);

        @qj.a
        @x4.m1
        a f(zi.u0<c6.d> u0Var);

        @x4.m1
        a g(z5.g.c cVar);

        @x4.m1
        int[] getSupportedTypes();

        @x4.m1
        a h(z5.q qVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @x4.m1
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f129489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f129490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f129491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f129492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f129493e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f129489a.equals(obj) ? this : new b(obj, this.f129490b, this.f129491c, this.f129492d, this.f129493e);
        }

        public b b(long j10) {
            return this.f129492d == j10 ? this : new b(this.f129489a, this.f129490b, this.f129491c, j10, this.f129493e);
        }

        public boolean c() {
            return this.f129490b != -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f129489a.equals(bVar.f129489a) && this.f129490b == bVar.f129490b && this.f129491c == bVar.f129491c && this.f129492d == bVar.f129492d && this.f129493e == bVar.f129493e;
        }

        public int hashCode() {
            return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f129489a.hashCode()) * 31) + this.f129490b) * 31) + this.f129491c) * 31) + ((int) this.f129492d)) * 31) + this.f129493e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        public b(Object obj, int i10, int i11, long j10, int i12) {
            this.f129489a = obj;
            this.f129490b = i10;
            this.f129491c = i11;
            this.f129492d = j10;
            this.f129493e = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @x4.m1
    public interface c {
        void v(s0 s0Var, y4 y4Var);
    }

    @x4.m1
    void C(Handler handler, b1 b1Var);

    @x4.m1
    void J(c cVar, @Nullable a5.x1 x1Var, k4 k4Var);

    @x4.m1
    void K(u4.c1 c1Var);

    @x4.m1
    void M(c cVar);

    @x4.m1
    void P(Handler handler, j5.v vVar);

    @x4.m1
    void Y(c cVar);

    @x4.m1
    u4.c1 c();

    @Nullable
    @x4.m1
    y4 i();

    @x4.m1
    void maybeThrowSourceInfoRefreshError() throws IOException;

    @x4.m1
    boolean n();

    @x4.m1
    void o(b1 b1Var);

    @x4.m1
    void p(p0 p0Var);

    @x4.m1
    void q(c cVar);

    @x4.m1
    p0 t(b bVar, z5.b bVar2, long j10);

    @x4.m1
    void u(j5.v vVar);

    @x4.m1
    boolean z(u4.c1 c1Var);
}

package zf;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.IOException;
import re.x2;
import re.y7;
import se.b2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface l0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f161282a = u0.f161452b;

        a a(ah.l.b bVar);

        l0 b(x2 x2Var);

        a c(ze.u uVar);

        a d(ah.u0 u0Var);

        int[] getSupportedTypes();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends i0 {
        public b(Object obj) {
            super(obj);
        }

        @Override // zf.i0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(Object obj) {
            return new b(super.a(obj));
        }

        @Override // zf.i0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b b(long j10) {
            return new b(super.b(j10));
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(i0 i0Var) {
            super(i0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void N(l0 l0Var, y7 y7Var);
    }

    void D(c cVar, @Nullable ah.m1 m1Var, b2 b2Var);

    void E(c cVar);

    void Q(Handler handler, t0 t0Var);

    void T(Handler handler, com.google.android.exoplayer2.drm.e eVar);

    void U(com.google.android.exoplayer2.drm.e eVar);

    @Deprecated
    void V(c cVar, @Nullable ah.m1 m1Var);

    x2 c();

    @Nullable
    y7 i();

    void maybeThrowSourceInfoRefreshError() throws IOException;

    boolean n();

    h0 q(b bVar, ah.b bVar2, long j10);

    void s(c cVar);

    void t(h0 h0Var);

    void u(c cVar);

    void z(t0 t0Var);
}

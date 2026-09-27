package d6;

import android.graphics.Bitmap;
import android.view.Surface;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;
import u4.o5;
import x4.j1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f78118a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f78119b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f78120c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78121d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f78122e = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @m1
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f78123a = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements c {
            @Override // d6.a1.c
            public /* synthetic */ void a(e eVar) {
                b1.a(this, eVar);
            }

            @Override // d6.a1.c
            public /* synthetic */ void f() {
                b1.b(this);
            }

            @Override // d6.a1.c
            public /* synthetic */ void h() {
                b1.d(this);
            }

            @Override // d6.a1.c
            public /* synthetic */ void i() {
                b1.c(this);
            }

            @Override // d6.a1.c
            public /* synthetic */ void onVideoSizeChanged(o5 o5Var) {
                b1.e(this, o5Var);
            }
        }

        void a(e eVar);

        void f();

        void h();

        void i();

        void onVideoSizeChanged(o5 o5Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a();

        void b(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f78124b;

        public e(Throwable th2, androidx.media3.common.a aVar) {
            super(th2);
            this.f78124b = aVar;
        }
    }

    void D0(b0 b0Var);

    void R(List<u4.i0> list);

    Surface a();

    void b();

    void d();

    void e(@k.w(from = 0.0d, fromInclusive = false) float f10);

    boolean isEnded();

    boolean isInitialized();

    boolean j(Bitmap bitmap, j1 j1Var);

    void k();

    boolean l(androidx.media3.common.a aVar) throws e;

    void m();

    void n();

    void o();

    void p(int i10);

    void q(c cVar, Executor executor);

    void r(int i10, androidx.media3.common.a aVar, long j10, int i11, List<u4.i0> list);

    void release();

    void render(long j10, long j11) throws e;

    void s(Surface surface, x4.y0 y0Var);

    void t(long j10);

    boolean u(boolean z10);

    boolean v(long j10, d dVar);

    void w();

    void x(boolean z10);

    void y(boolean z10);
}

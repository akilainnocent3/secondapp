package u4;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import cj.v6;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public interface k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f138631a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f138632b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f138633c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f138634d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final long f138635e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f138636f = -2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f138637g = -3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v6<i0> f138638h = v6.A(new a());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements i0 {
        @Override // u4.i0
        public /* synthetic */ long a(long j10) {
            return h0.a(this, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        k5 a(Context context, f0 f0Var, b0 b0Var, boolean z10, Executor executor, d dVar) throws j5;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(int i10, int i11);

        void b();

        void c(j5 j5Var);

        void d(float f10);

        void e(long j10, boolean z10);

        void f(int i10, androidx.media3.common.a aVar, List<i0> list);
    }

    Surface a();

    void b();

    void c(long j10);

    void d();

    boolean e(int i10, long j10);

    void f(@Nullable u4 u4Var);

    void flush();

    boolean g();

    int h();

    boolean i(Bitmap bitmap, x4.j1 j1Var);

    void j(m1 m1Var);

    void k(Runnable runnable);

    void l(int i10, androidx.media3.common.a aVar, List<i0> list, long j10);

    void release();
}

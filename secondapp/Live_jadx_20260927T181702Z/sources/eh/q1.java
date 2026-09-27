package eh;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f81168a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81169b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81170c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f81171d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f81172e = -2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        q1 a(Context context, List<s> list, q qVar, fh.c cVar, fh.c cVar2, boolean z10, Executor executor, c cVar3) throws p1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(int i10, int i11);

        void b();

        void c(p1 p1Var);

        void d(long j10);
    }

    Surface a();

    void b();

    void c(long j10);

    void e(int i10, long j10);

    void flush();

    void g();

    int h();

    void i(r0 r0Var);

    void j(@Nullable b1 b1Var);

    void k(int i10);

    void l(x xVar);

    void m(Bitmap bitmap, long j10, float f10);

    void release();
}

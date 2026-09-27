package u4;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public interface m5 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        m5 a(Context context, b0 b0Var, f0 f0Var, b bVar, Executor executor, long j10, boolean z10);

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(int i10, int i11);

        void c(j5 j5Var);

        void d(float f10);

        void e(long j10, boolean z10);

        void g(long j10);
    }

    boolean a(int i10);

    void b(int i10, Runnable runnable);

    void c(long j10);

    void d();

    boolean e(int i10, Bitmap bitmap, x4.j1 j1Var);

    void f(@Nullable u4 u4Var);

    void flush();

    Surface g(int i10);

    void h(i5 i5Var);

    void i(int i10);

    void initialize() throws j5;

    void j(int i10, int i11, androidx.media3.common.a aVar, List<i0> list, long j10);

    void k(List<i0> list);

    void l(int i10, m1 m1Var);

    boolean m();

    int n(int i10);

    void o(@k.e0(from = 0) int i10) throws j5;

    boolean p(int i10, int i11, long j10);

    void release();
}

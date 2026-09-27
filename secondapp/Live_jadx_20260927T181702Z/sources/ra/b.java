package ra;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import k.y0;
import pa.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public class b implements ra.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f124371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f124372b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f124373c = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable command) {
            b.this.a(command);
        }
    }

    public b(@NonNull Executor backgroundExecutor) {
        this.f124371a = new n(backgroundExecutor);
    }

    @Override // ra.a
    public void a(Runnable runnable) {
        this.f124372b.post(runnable);
    }

    @Override // ra.a
    public Executor b() {
        return this.f124373c;
    }

    @Override // ra.a
    public void c(Runnable runnable) {
        this.f124371a.execute(runnable);
    }

    @Override // ra.a
    @NonNull
    public n getBackgroundExecutor() {
        return this.f124371a;
    }
}

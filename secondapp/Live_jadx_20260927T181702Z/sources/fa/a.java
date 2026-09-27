package fa;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.work.c0;
import k.h1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f83707a;

    public a() {
        this.f83707a = u1.j.a(Looper.getMainLooper());
    }

    @Override // androidx.work.c0
    public void a(@NonNull Runnable runnable) {
        this.f83707a.removeCallbacks(runnable);
    }

    @Override // androidx.work.c0
    public void b(long delayInMillis, @NonNull Runnable runnable) {
        this.f83707a.postDelayed(runnable, delayInMillis);
    }

    @NonNull
    public Handler c() {
        return this.f83707a;
    }

    @h1
    public a(@NonNull Handler handler) {
        this.f83707a = handler;
    }
}

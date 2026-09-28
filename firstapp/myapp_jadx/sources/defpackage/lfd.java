package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class lfd {
    public final Handler a = rcl.a(Looper.getMainLooper());

    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}

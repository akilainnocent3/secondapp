package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class fqe0 implements vs7 {
    @Override // defpackage.vs7
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.vs7
    public final long b() {
        return SystemClock.uptimeMillis();
    }

    @Override // defpackage.vs7
    public final jqe0 c(Looper looper, Handler.Callback callback) {
        return new jqe0(new Handler(looper, callback));
    }

    @Override // defpackage.vs7
    public final long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.vs7
    public final long nanoTime() {
        return System.nanoTime();
    }
}

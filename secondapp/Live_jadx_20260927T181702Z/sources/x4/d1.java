package x4;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class d1 implements l {
    @Override // x4.l
    public y createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new e1(new Handler(looper, callback));
    }

    @Override // x4.l
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // x4.l
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // x4.l
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // x4.l
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // x4.l
    public void a() {
    }
}

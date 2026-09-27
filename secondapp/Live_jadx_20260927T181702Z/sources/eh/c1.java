package eh;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class c1 implements h {
    @Override // eh.h
    public c0 createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new d1(new Handler(looper, callback));
    }

    @Override // eh.h
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // eh.h
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // eh.h
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // eh.h
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // eh.h
    public void a() {
    }
}

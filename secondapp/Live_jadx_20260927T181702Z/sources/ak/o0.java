package ak;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum o0 implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler f5528c = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f5528c.post(runnable);
    }
}

package x4;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Executor f144230a;

    public static synchronized Executor a() {
        try {
            if (f144230a == null) {
                f144230a = b2.O1("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f144230a;
    }

    public static synchronized void b(Executor executor) {
        f144230a = executor;
    }
}

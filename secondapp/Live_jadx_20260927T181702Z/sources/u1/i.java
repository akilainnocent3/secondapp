package u1;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f137545b;

        public a(@NonNull Handler handler) {
            this.f137545b = (Handler) e2.x.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (this.f137545b.post((Runnable) e2.x.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f137545b + " is shutting down");
        }
    }

    @NonNull
    public static Executor a(@NonNull Handler handler) {
        return new a(handler);
    }
}

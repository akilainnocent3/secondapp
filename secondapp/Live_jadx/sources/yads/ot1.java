package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f153606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f153607b;

    public /* synthetic */ ot1() {
        this(new Executor() { // from class: yads.w74
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ot1.a(runnable);
            }
        }, Executors.newFixedThreadPool(2));
    }

    public static final void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public ot1(Executor executor, Executor executor2) {
        this.f153606a = executor;
        this.f153607b = executor2;
    }
}

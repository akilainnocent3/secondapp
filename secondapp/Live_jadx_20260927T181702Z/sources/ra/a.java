package ra;

import java.util.concurrent.Executor;
import k.y0;
import pa.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public interface a {
    void a(Runnable runnable);

    Executor b();

    void c(Runnable runnable);

    n getBackgroundExecutor();
}

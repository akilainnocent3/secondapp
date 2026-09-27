package nj;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@qj.f("Use the methods in Futures (like immediateFuture) or SettableFuture")
public interface t1<V> extends Future<V> {
    void addListener(Runnable listener, Executor executor);
}

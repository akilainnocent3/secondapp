package nj;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public abstract class c1 extends y0 implements y1, AutoCloseable {
    @Override // nj.y0, cj.w5
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public abstract y1 g2();

    @Override // nj.y0, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    @Override // nj.y0, java.util.concurrent.ExecutorService, nj.y1
    public <T> t1<T> submit(Callable<T> task) {
        return g2().submit((Callable) task);
    }

    @Override // nj.y0, java.util.concurrent.ExecutorService, nj.y1
    public t1<?> submit(Runnable task) {
        return g2().submit(task);
    }

    @Override // nj.y0, java.util.concurrent.ExecutorService, nj.y1
    public <T> t1<T> submit(Runnable task, @f2 T result) {
        return g2().submit(task, (Object) result);
    }
}

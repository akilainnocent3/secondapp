package nj;

import cj.x5;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public abstract class w0<E> extends x5<E> implements BlockingQueue<E> {
    @Override // java.util.concurrent.BlockingQueue
    @qj.a
    public int drainTo(Collection<? super E> c10, int maxElements) {
        return g2().drainTo(c10, maxElements);
    }

    @Override // cj.x5
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> g2();

    @Override // java.util.concurrent.BlockingQueue
    @qj.a
    public boolean offer(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return g2().offer(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @qj.a
    @zq.a
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return g2().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        g2().put(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return g2().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    @qj.a
    public E take() throws InterruptedException {
        return g2().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    @qj.a
    public int drainTo(Collection<? super E> c10) {
        return g2().drainTo(c10);
    }
}

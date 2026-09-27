package nj;

import cj.h5;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public abstract class v0<E> extends h5<E> implements BlockingDeque<E> {
    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c10) {
        return g2().drainTo(c10);
    }

    @Override // cj.h5
    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> g2();

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return g2().offer(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return g2().offerFirst(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e10, long timeout, TimeUnit unit) throws InterruptedException {
        return g2().offerLast(e10, timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @zq.a
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return g2().poll(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @zq.a
    public E pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
        return g2().pollFirst(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @zq.a
    public E pollLast(long timeout, TimeUnit unit) throws InterruptedException {
        return g2().pollLast(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        g2().put(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e10) throws InterruptedException {
        g2().putFirst(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e10) throws InterruptedException {
        g2().putLast(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return g2().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return g2().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return g2().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return g2().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c10, int maxElements) {
        return g2().drainTo(c10, maxElements);
    }
}

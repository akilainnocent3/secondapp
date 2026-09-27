package com.yandex.div.internal.viewpool;

import dr.e0;
import dr.w2;
import ds.a;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E> {

    @l
    private final ReentrantLock lock;
    private final Condition notEmpty;

    @l
    private final Queue<E> queue;

    public BatchBlockingQueue(@l Queue<E> queue) {
        this.queue = queue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
    }

    private final <R> R locked(a<? extends R> aVar) {
        this.lock.lock();
        try {
            return aVar.invoke();
        } finally {
            j0.d(1);
            this.lock.unlock();
            j0.c(1);
        }
    }

    private final <R> R lockedInterruptibly(a<? extends R> aVar) throws InterruptedException {
        this.lock.lockInterruptibly();
        try {
            return aVar.invoke();
        } finally {
            j0.d(1);
            this.lock.unlock();
            j0.c(1);
        }
    }

    private final Void notSupported() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e10) {
        return offer(e10);
    }

    public final void batch(@l ds.l<? super BatchBlockingQueue<E>, w2> lVar) {
        this.lock.lock();
        try {
            lVar.invoke(this);
            w2 w2Var = w2.f79517a;
        } finally {
            j0.d(1);
            this.lock.unlock();
            j0.c(1);
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@m Collection<? super E> collection) {
        notSupported();
        throw new e0();
    }

    public int getSize() {
        this.lock.lock();
        try {
            return this.queue.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<E> iterator() {
        notSupported();
        throw new e0();
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, @l TimeUnit timeUnit) {
        return offer(e10);
    }

    @Override // java.util.Queue
    public E peek() {
        this.lock.lock();
        try {
            return this.queue.peek();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Queue
    @m
    public E poll() {
        this.lock.lock();
        try {
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) {
        offer(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        this.lock.lock();
        try {
            return this.queue.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean removeFirstIf(@l ds.l<? super E, Boolean> lVar) {
        this.lock.lock();
        boolean z10 = true;
        try {
            Iterator<E> it = this.queue.iterator();
            while (it.hasNext()) {
                if (lVar.invoke(it.next()).booleanValue()) {
                    it.remove();
                    int i10 = 2;
                    return z10;
                }
            }
            z10 = false;
            int i11 = 2;
            return z10;
        } finally {
            j0.d(1);
            this.lock.unlock();
            j0.c(1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l
    public Spliterator<E> spliterator() {
        notSupported();
        throw new e0();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.lock.lockInterruptibly();
        while (this.queue.isEmpty()) {
            try {
                this.notEmpty.await();
            } catch (Throwable th2) {
                this.lock.unlock();
                throw th2;
            }
        }
        E ePoll = this.queue.poll();
        this.lock.unlock();
        return ePoll;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@m Collection<? super E> collection, int i10) {
        notSupported();
        throw new e0();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e10) {
        this.lock.lock();
        try {
            this.queue.offer(e10);
            this.notEmpty.signal();
            w2 w2Var = w2.f79517a;
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    @m
    public E poll(long j10, @l TimeUnit timeUnit) throws InterruptedException {
        this.lock.lockInterruptibly();
        try {
            long nanos = timeUnit.toNanos(j10);
            while (this.queue.isEmpty() && nanos > 0) {
                nanos = this.notEmpty.awaitNanos(nanos);
            }
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }
}

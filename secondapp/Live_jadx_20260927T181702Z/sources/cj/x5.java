package cj;

import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class x5<E> extends f5<E> implements Queue<E> {
    @Override // java.util.Queue
    @n9
    public E element() {
        return g2().element();
    }

    @Override // cj.f5, cj.w5
    public abstract Queue<E> g2();

    public boolean h2(@n9 E e10) {
        try {
            return add(e10);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @zq.a
    public E i2() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @zq.a
    public E j2() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @qj.a
    public boolean offer(@n9 E o10) {
        return g2().offer(o10);
    }

    @Override // java.util.Queue
    @zq.a
    public E peek() {
        return g2().peek();
    }

    @Override // java.util.Queue
    @qj.a
    @zq.a
    public E poll() {
        return g2().poll();
    }

    @Override // java.util.Queue
    @qj.a
    @n9
    public E remove() {
        return g2().remove();
    }
}

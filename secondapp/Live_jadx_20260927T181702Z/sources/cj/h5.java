package cj;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@j4
@yi.d
public abstract class h5<E> extends x5<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(@n9 E e10) {
        g2().addFirst(e10);
    }

    @Override // java.util.Deque
    public void addLast(@n9 E e10) {
        g2().addLast(e10);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return g2().descendingIterator();
    }

    @Override // java.util.Deque
    @n9
    public E getFirst() {
        return g2().getFirst();
    }

    @Override // java.util.Deque
    @n9
    public E getLast() {
        return g2().getLast();
    }

    @Override // cj.x5
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public abstract Deque<E> g2();

    @Override // java.util.Deque
    @qj.a
    public boolean offerFirst(@n9 E e10) {
        return g2().offerFirst(e10);
    }

    @Override // java.util.Deque
    @qj.a
    public boolean offerLast(@n9 E e10) {
        return g2().offerLast(e10);
    }

    @Override // java.util.Deque
    @zq.a
    public E peekFirst() {
        return g2().peekFirst();
    }

    @Override // java.util.Deque
    @zq.a
    public E peekLast() {
        return g2().peekLast();
    }

    @Override // java.util.Deque
    @qj.a
    @zq.a
    public E pollFirst() {
        return g2().pollFirst();
    }

    @Override // java.util.Deque
    @qj.a
    @zq.a
    public E pollLast() {
        return g2().pollLast();
    }

    @Override // java.util.Deque
    @qj.a
    @n9
    public E pop() {
        return g2().pop();
    }

    @Override // java.util.Deque
    public void push(@n9 E e10) {
        g2().push(e10);
    }

    @Override // java.util.Deque
    @qj.a
    @n9
    public E removeFirst() {
        return g2().removeFirst();
    }

    @Override // java.util.Deque
    @qj.a
    public boolean removeFirstOccurrence(@zq.a Object o10) {
        return g2().removeFirstOccurrence(o10);
    }

    @Override // java.util.Deque
    @qj.a
    @n9
    public E removeLast() {
        return g2().removeLast();
    }

    @Override // java.util.Deque
    @qj.a
    public boolean removeLastOccurrence(@zq.a Object o10) {
        return g2().removeLastOccurrence(o10);
    }
}

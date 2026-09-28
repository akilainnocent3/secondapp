package defpackage;

import com.google.protobuf.Reader;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public abstract class y11<E> extends AbstractQueue<E> implements gov<E> {
    public final AtomicReferenceArray<E> a;
    public final int b;

    public static class a<E> implements Iterator<E> {
        public final long a;
        public final int b;
        public final AtomicReferenceArray<E> c;
        public long d;
        public E e = a();

        public a(long j, long j2, int i, AtomicReferenceArray<E> atomicReferenceArray) {
            this.d = j;
            this.a = j2;
            this.b = i;
            this.c = atomicReferenceArray;
        }

        public final E a() {
            E e;
            do {
                long j = this.d;
                if (j >= this.a) {
                    return null;
                }
                this.d = 1 + j;
                e = this.c.get((int) (j & ((long) this.b)));
            } while (e == null);
            return e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e != null;
        }

        @Override // java.util.Iterator
        public final E next() {
            E e = this.e;
            if (e != null) {
                this.e = a();
                return e;
            }
            lrh0.a();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public y11() {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(2047));
        this.b = iNumberOfLeadingZeros - 1;
        this.a = new AtomicReferenceArray<>(iNumberOfLeadingZeros);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        while (poll() != null) {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return ((o8w) this).i >= ((p8w) this).c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(((o8w) this).i, ((p8w) this).c, this.b, this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long j;
        long j2;
        o8w o8wVar = (o8w) this;
        long j3 = o8wVar.i;
        while (true) {
            j = ((p8w) this).c;
            j2 = o8wVar.i;
            if (j3 == j2) {
                break;
            }
            j3 = j2;
        }
        long j4 = j - j2;
        int i = this.b + 1;
        if (j4 < 0) {
            return 0;
        }
        if (i == -1 || j4 <= i) {
            return j4 > 2147483647L ? Reader.READ_DONE : (int) j4;
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return getClass().getName();
    }
}

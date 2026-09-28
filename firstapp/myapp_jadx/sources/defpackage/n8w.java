package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class n8w<E> extends o8w<Object> {
    @Override // java.util.Queue
    public final boolean offer(E e) {
        e.getClass();
        int i = this.b;
        long j = this.e;
        while (true) {
            long j2 = this.c;
            if (j2 >= j) {
                j = this.i + ((long) i) + 1;
                if (j2 >= j) {
                    return false;
                }
                q8w.f.lazySet(this, j);
            }
            n8w<E> n8wVar = this;
            if (s0o.a.compareAndSwapLong(n8wVar, p8w.d, j2, j2 + 1)) {
                n8wVar.a.lazySet((int) (((long) i) & j2), e);
                return true;
            }
            this = n8wVar;
        }
    }

    @Override // java.util.Queue
    public final E peek() {
        E e;
        AtomicReferenceArray<E> atomicReferenceArray = this.a;
        long j = this.i;
        int i = (int) (((long) this.b) & j);
        E e2 = atomicReferenceArray.get(i);
        if (e2 != null) {
            return e2;
        }
        if (j == this.c) {
            return null;
        }
        do {
            e = atomicReferenceArray.get(i);
        } while (e == null);
        return e;
    }

    @Override // java.util.Queue, defpackage.gov
    public final E poll() {
        long j = this.i;
        int i = (int) (((long) this.b) & j);
        AtomicReferenceArray<E> atomicReferenceArray = this.a;
        E e = atomicReferenceArray.get(i);
        if (e == null) {
            if (j == this.c) {
                return null;
            }
            do {
                e = atomicReferenceArray.get(i);
            } while (e == null);
        }
        atomicReferenceArray.lazySet(i, null);
        o8w.v.lazySet(this, j + 1);
        return e;
    }
}

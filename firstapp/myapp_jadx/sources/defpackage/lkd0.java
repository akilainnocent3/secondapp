package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class lkd0<T> implements gk90<T> {
    public static final int w = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object y = new Object();
    public final AtomicLong a;
    public final int b;
    public long c;
    public final int d;
    public AtomicReferenceArray<Object> e;
    public final int f;
    public AtomicReferenceArray<Object> i;
    public final AtomicLong v;

    public lkd0(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        this.v = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.e = atomicReferenceArray;
        this.d = i2;
        this.b = Math.min(iNumberOfLeadingZeros / 4, w);
        this.i = atomicReferenceArray;
        this.f = i2;
        this.c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // defpackage.lk90
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.lk90
    public final boolean isEmpty() {
        return this.a.get() == this.v.get();
    }

    @Override // defpackage.lk90
    public final boolean offer(T t) {
        if (t == null) {
            bmy.a("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.a;
        long j = atomicLong.get();
        int i = this.d;
        int i2 = ((int) j) & i;
        if (j < this.c) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.b) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.c = j2 - 1;
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, y);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // defpackage.lk90
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.i;
        AtomicLong atomicLong = this.v;
        long j = atomicLong.get();
        int i = this.f;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == y;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.i = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return t2;
    }
}

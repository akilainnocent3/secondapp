package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class v11 implements wye {
    public final AtomicLong a = new AtomicLong();

    @Override // defpackage.wye
    public final void add(double d) {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.a;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, Double.doubleToLongBits(Double.longBitsToDouble(j) + d)));
    }

    public final String toString() {
        return Double.toString(Double.longBitsToDouble(this.a.get()));
    }
}

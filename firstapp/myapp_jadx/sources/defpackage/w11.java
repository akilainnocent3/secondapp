package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class w11 implements ijt {
    public final AtomicLong a = new AtomicLong();

    @Override // defpackage.ijt
    public final void add(long j) {
        AtomicLong atomicLong;
        long j2;
        do {
            atomicLong = this.a;
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, j2 + j));
    }

    @Override // defpackage.ijt
    public final long sum() {
        return this.a.get();
    }

    public final String toString() {
        return Long.toString(this.a.get());
    }
}

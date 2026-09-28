package defpackage;

import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: loaded from: classes8.dex */
public final class ubp implements ijt {
    public final LongAdder a = new LongAdder();

    @Override // defpackage.ijt
    public final void add(long j) {
        this.a.add(j);
    }

    @Override // defpackage.ijt
    public final long sum() {
        return this.a.sum();
    }

    public final String toString() {
        return this.a.toString();
    }
}

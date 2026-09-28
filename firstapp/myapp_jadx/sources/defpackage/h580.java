package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class h580 {
    public static final e580 a = new e580(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<e580>[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference<e580>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(e580 e580Var) {
        e580Var.getClass();
        if (e580Var.f != null || e580Var.g != null) {
            hb5.a("Failed requirement.");
            return;
        }
        if (e580Var.d) {
            return;
        }
        AtomicReference<e580> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        e580 e580Var2 = a;
        e580 andSet = atomicReference.getAndSet(e580Var2);
        if (andSet == e580Var2) {
            return;
        }
        int i = andSet != null ? andSet.c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        e580Var.f = andSet;
        e580Var.b = 0;
        e580Var.c = i + 8192;
        atomicReference.set(e580Var);
    }

    public static final e580 b() {
        AtomicReference<e580> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        e580 e580Var = a;
        e580 andSet = atomicReference.getAndSet(e580Var);
        if (andSet == e580Var) {
            return new e580();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new e580();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}

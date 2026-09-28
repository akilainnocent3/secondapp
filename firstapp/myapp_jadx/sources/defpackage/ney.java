package defpackage;

import java.util.function.LongUnaryOperator;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ney implements LongUnaryOperator {
    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        return Math.max(System.currentTimeMillis(), j + 1);
    }
}

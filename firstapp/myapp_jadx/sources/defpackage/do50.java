package defpackage;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class do50 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(ThreadLocalRandom.current().nextDouble(0.8d, 1.2d));
    }
}

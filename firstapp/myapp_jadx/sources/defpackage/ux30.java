package defpackage;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ux30 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return ThreadLocalRandom.current();
    }
}

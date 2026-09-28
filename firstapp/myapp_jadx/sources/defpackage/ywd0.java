package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ywd0 extends a5<wwd0<?>> {
    public final AtomicReference<Object> a = new AtomicReference<>(null);

    @Override // defpackage.a5
    public final boolean a(y4 y4Var) {
        AtomicReference<Object> atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(xwd0.a);
        return true;
    }

    @Override // defpackage.a5
    public final v1b[] b(y4 y4Var) {
        this.a.set(null);
        return z4.a;
    }
}

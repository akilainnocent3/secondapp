package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ec6 extends AtomicReference<xb6> implements pse {
    @Override // defpackage.pse
    public final void dispose() {
        xb6 andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            qtg.a(e);
            o760.b(e);
        }
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return get() == null;
    }
}

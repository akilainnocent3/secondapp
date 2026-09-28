package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class md80 extends AtomicReference<pse> implements pse {
    @Override // defpackage.pse
    public final void dispose() {
        xse.a(this);
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return xse.b(get());
    }
}

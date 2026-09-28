package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class z1g extends AtomicReference<pse> implements mm8, pse {
    @Override // defpackage.pse
    public final void dispose() {
        xse.a(this);
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return get() == xse.a;
    }

    @Override // defpackage.mm8
    public final void onComplete() {
        lazySet(xse.a);
    }

    @Override // defpackage.mm8
    public final void onError(Throwable th) {
        lazySet(xse.a);
        o760.b(new eoy(th));
    }

    @Override // defpackage.mm8
    public final void onSubscribe(pse pseVar) {
        xse.d(this, pseVar);
    }
}

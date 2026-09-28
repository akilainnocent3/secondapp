package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fte<T> implements zu90<T>, pse {
    final AtomicReference<pse> upstream = new AtomicReference<>();

    @Override // defpackage.pse
    public final void dispose() {
        xse.a(this.upstream);
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.upstream.get() == xse.a;
    }

    @Override // defpackage.zu90
    public final void onSubscribe(pse pseVar) {
        if (uj2.h(this.upstream, pseVar, getClass())) {
            onStart();
        }
    }

    public void onStart() {
    }
}

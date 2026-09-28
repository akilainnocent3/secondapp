package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zse<T> implements kfy<T>, pse {
    public final AtomicReference<pse> a = new AtomicReference<>();

    @Override // defpackage.pse
    public final void dispose() {
        xse.a(this.a);
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.a.get() == xse.a;
    }

    @Override // defpackage.kfy
    public final void onSubscribe(pse pseVar) {
        uj2.h(this.a, pseVar, getClass());
    }
}

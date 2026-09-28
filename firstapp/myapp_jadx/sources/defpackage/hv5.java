package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class hv5 extends AtomicReference<pse> implements mm8, pse, pya<Throwable> {
    public final pya<? super Throwable> a;
    public final ib b;

    public hv5(z0e0 z0e0Var) {
        this.a = this;
        this.b = z0e0Var;
    }

    @Override // defpackage.pya
    public final void accept(Throwable th) {
        o760.b(new eoy(th));
    }

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
        try {
            this.b.run();
        } catch (Throwable th) {
            qtg.a(th);
            o760.b(th);
        }
        lazySet(xse.a);
    }

    @Override // defpackage.mm8
    public final void onError(Throwable th) {
        try {
            this.a.accept(th);
        } catch (Throwable th2) {
            qtg.a(th2);
            o760.b(th2);
        }
        lazySet(xse.a);
    }

    @Override // defpackage.mm8
    public final void onSubscribe(pse pseVar) {
        xse.d(this, pseVar);
    }

    public hv5(pya<? super Throwable> pyaVar, ib ibVar) {
        this.a = pyaVar;
        this.b = ibVar;
    }
}

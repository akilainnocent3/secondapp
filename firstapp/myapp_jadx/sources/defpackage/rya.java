package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class rya<T> extends AtomicReference<pse> implements zu90<T>, pse {
    public final pya<? super T> a;
    public final pya<? super Throwable> b;

    public rya(pya<? super T> pyaVar, pya<? super Throwable> pyaVar2) {
        this.a = pyaVar;
        this.b = pyaVar2;
    }

    @Override // defpackage.pse
    public final void dispose() {
        xse.a(this);
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return get() == xse.a;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        lazySet(xse.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            qtg.a(th2);
            o760.b(new gma(th, th2));
        }
    }

    @Override // defpackage.zu90
    public final void onSubscribe(pse pseVar) {
        xse.d(this, pseVar);
    }

    @Override // defpackage.zu90
    public final void onSuccess(T t) {
        lazySet(xse.a);
        try {
            this.a.accept(t);
        } catch (Throwable th) {
            qtg.a(th);
            o760.b(th);
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class rlr<T> extends AtomicReference<pse> implements kfy<T>, pse {
    public final pya<? super T> a;
    public final pya<? super Throwable> b;
    public final ib c;

    public rlr(pya pyaVar, pya pyaVar2, ib ibVar) {
        this.a = pyaVar;
        this.b = pyaVar2;
        this.c = ibVar;
    }

    @Override // defpackage.pse
    public final void dispose() {
        xse.a(this);
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return get() == xse.a;
    }

    @Override // defpackage.kfy
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(xse.a);
        try {
            this.c.run();
        } catch (Throwable th) {
            qtg.a(th);
            o760.b(th);
        }
    }

    @Override // defpackage.kfy
    public final void onError(Throwable th) {
        if (isDisposed()) {
            o760.b(th);
            return;
        }
        lazySet(xse.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            qtg.a(th2);
            o760.b(new gma(th, th2));
        }
    }

    @Override // defpackage.kfy
    public final void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.a.accept(t);
        } catch (Throwable th) {
            qtg.a(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // defpackage.kfy
    public final void onSubscribe(pse pseVar) {
        xse.d(this, pseVar);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class slr<T> extends AtomicReference<bee0> implements n3i<T>, bee0, pse {
    public final pya<? super T> a;
    public final pya<? super Throwable> b;
    public final ib c;

    public slr(pya pyaVar, pya pyaVar2, ib ibVar) {
        this.a = pyaVar;
        this.b = pyaVar2;
        this.c = ibVar;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (gee0.d(this, bee0Var)) {
            try {
                y2i.a.accept(this);
            } catch (Throwable th) {
                qtg.a(th);
                bee0Var.cancel();
                onError(th);
            }
        }
    }

    @Override // defpackage.bee0
    public final void cancel() {
        gee0.a(this);
    }

    @Override // defpackage.pse
    public final void dispose() {
        gee0.a(this);
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return get() == gee0.a;
    }

    @Override // defpackage.zde0
    public final void onComplete() {
        bee0 bee0Var = get();
        gee0 gee0Var = gee0.a;
        if (bee0Var != gee0Var) {
            lazySet(gee0Var);
            try {
                this.c.run();
            } catch (Throwable th) {
                qtg.a(th);
                o760.b(th);
            }
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        bee0 bee0Var = get();
        gee0 gee0Var = gee0.a;
        if (bee0Var == gee0Var) {
            o760.b(th);
            return;
        }
        lazySet(gee0Var);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            qtg.a(th2);
            o760.b(new gma(th, th2));
        }
    }

    @Override // defpackage.zde0
    public final void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.a.accept(t);
        } catch (Throwable th) {
            qtg.a(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // defpackage.bee0
    public final void request(long j) {
        get().request(j);
    }
}

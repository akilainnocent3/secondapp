package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class yse<T> implements kfy<T>, pse {
    public final kfy<? super T> a;
    public final pya<? super pse> b;
    public final ib c;
    public pse d;

    public yse(kfy kfyVar, vdy vdyVar, taj.d dVar) {
        this.a = kfyVar;
        this.b = vdyVar;
        this.c = dVar;
    }

    @Override // defpackage.pse
    public final void dispose() {
        pse pseVar = this.d;
        xse xseVar = xse.a;
        if (pseVar != xseVar) {
            this.d = xseVar;
            try {
                this.c.run();
            } catch (Throwable th) {
                qtg.a(th);
                o760.b(th);
            }
            pseVar.dispose();
        }
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // defpackage.kfy
    public final void onComplete() {
        pse pseVar = this.d;
        xse xseVar = xse.a;
        if (pseVar != xseVar) {
            this.d = xseVar;
            this.a.onComplete();
        }
    }

    @Override // defpackage.kfy
    public final void onError(Throwable th) {
        pse pseVar = this.d;
        xse xseVar = xse.a;
        if (pseVar == xseVar) {
            o760.b(th);
        } else {
            this.d = xseVar;
            this.a.onError(th);
        }
    }

    @Override // defpackage.kfy
    public final void onNext(T t) {
        this.a.onNext(t);
    }

    @Override // defpackage.kfy
    public final void onSubscribe(pse pseVar) {
        kfy<? super T> kfyVar = this.a;
        try {
            this.b.accept(pseVar);
            if (xse.e(this.d, pseVar)) {
                this.d = pseVar;
                kfyVar.onSubscribe(this);
            }
        } catch (Throwable th) {
            qtg.a(th);
            pseVar.dispose();
            this.d = xse.a;
            kfyVar.onSubscribe(f2g.a);
            kfyVar.onError(th);
        }
    }
}

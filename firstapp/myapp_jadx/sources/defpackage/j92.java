package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j92<T, R> implements kfy<T>, gb30<R> {
    public final kfy<? super R> a;
    public pse b;
    public gb30<T> c;
    public boolean d;
    public int e;

    public j92(kfy<? super R> kfyVar) {
        this.a = kfyVar;
    }

    @Override // defpackage.mb30
    public int b(int i) {
        gb30<T> gb30Var = this.c;
        if (gb30Var == null || (i & 4) != 0) {
            return 0;
        }
        int iB = gb30Var.b(i);
        if (iB == 0) {
            return iB;
        }
        this.e = iB;
        return iB;
    }

    @Override // defpackage.lk90
    public final void clear() {
        this.c.clear();
    }

    @Override // defpackage.pse
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override // defpackage.lk90
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.lk90
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.kfy
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.kfy
    public final void onError(Throwable th) {
        if (this.d) {
            o760.b(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.kfy
    public final void onSubscribe(pse pseVar) {
        if (xse.e(this.b, pseVar)) {
            this.b = pseVar;
            if (pseVar instanceof gb30) {
                this.c = (gb30) pseVar;
            }
            this.a.onSubscribe(this);
        }
    }
}

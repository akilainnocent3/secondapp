package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i92<T, R> implements foa<T>, nb30<R> {
    public final foa<? super R> a;
    public bee0 b;
    public nb30<T> c;
    public boolean d;

    public i92(foa<? super R> foaVar) {
        this.a = foaVar;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (gee0.f(this.b, bee0Var)) {
            this.b = bee0Var;
            if (bee0Var instanceof nb30) {
                this.c = (nb30) bee0Var;
            }
            this.a.a(this);
        }
    }

    public final void c(Throwable th) {
        qtg.a(th);
        this.b.cancel();
        onError(th);
    }

    @Override // defpackage.bee0
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.lk90
    public final void clear() {
        this.c.clear();
    }

    @Override // defpackage.lk90
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.lk90
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.zde0
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.zde0
    public void onError(Throwable th) {
        if (this.d) {
            o760.b(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.bee0
    public final void request(long j) {
        this.b.request(j);
    }
}

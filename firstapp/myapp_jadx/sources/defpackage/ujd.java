package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class ujd<T> extends m92<T> {
    public final zde0<? super T> a;
    public T b;

    public ujd(zde0<? super T> zde0Var) {
        this.a = zde0Var;
    }

    @Override // defpackage.mb30
    public final int b(int i) {
        lazySet(8);
        return 2;
    }

    @Override // defpackage.lk90
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    @Override // defpackage.lk90
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.lk90
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.b;
        this.b = null;
        return t;
    }

    @Override // defpackage.bee0
    public final void request(long j) {
        T t;
        if (gee0.e(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.b) == null) {
                        return;
                    }
                    this.b = null;
                    zde0<? super T> zde0Var = this.a;
                    zde0Var.onNext(t);
                    if (get() != 4) {
                        zde0Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}

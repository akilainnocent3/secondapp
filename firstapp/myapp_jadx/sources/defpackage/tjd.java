package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class tjd<T> extends l92<T> {
    public final kfy<? super T> a;
    public T b;

    public tjd(kfy<? super T> kfyVar) {
        this.a = kfyVar;
    }

    public final void a(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        kfy<? super T> kfyVar = this.a;
        if (i == 8) {
            this.b = t;
            lazySet(16);
            kfyVar.onNext(null);
        } else {
            lazySet(2);
            kfyVar.onNext(t);
        }
        if (get() != 4) {
            kfyVar.onComplete();
        }
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

    public void dispose() {
        set(4);
        this.b = null;
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // defpackage.lk90
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(T t) {
        a(t);
    }

    @Override // defpackage.lk90
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.b;
        this.b = null;
        lazySet(32);
        return t;
    }
}

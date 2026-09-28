package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class l830<T> extends sce0<T> {
    public static final a[] c = new a[0];
    public static final a[] d = new a[0];
    public final AtomicReference<a<T>[]> a = new AtomicReference<>(d);
    public Throwable b;

    public static final class a<T> extends AtomicBoolean implements pse {
        public final kfy<? super T> a;
        public final l830<T> b;

        public a(kfy<? super T> kfyVar, l830<T> l830Var) {
            this.a = kfyVar;
            this.b = l830Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.b.k(this);
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return get();
        }
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        a<T> aVar = new a<>(kfyVar, this);
        kfyVar.onSubscribe(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.a;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == c) {
                Throwable th = this.b;
                if (th != null) {
                    kfyVar.onError(th);
                    return;
                } else {
                    kfyVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get()) {
                        k(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    public final boolean j() {
        return this.a.get() == c && this.b == null;
    }

    public final void k(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.a;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == c || aVarArr2 == (aVarArr = d)) {
                return;
            }
            int length = aVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                }
            }
            return;
        }
    }

    @Override // defpackage.kfy
    public final void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.a;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = c;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (!aVar.get()) {
                aVar.a.onComplete();
            }
        }
    }

    @Override // defpackage.kfy
    public final void onError(Throwable th) {
        yby.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<a<T>[]> atomicReference = this.a;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = c;
        if (aVarArr == aVarArr2) {
            o760.b(th);
            return;
        }
        this.b = th;
        for (a<T> aVar : atomicReference.getAndSet(aVarArr2)) {
            if (aVar.get()) {
                o760.b(th);
            } else {
                aVar.a.onError(th);
            }
        }
    }

    @Override // defpackage.kfy
    public final void onNext(T t) {
        yby.b(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.a.get()) {
            if (!aVar.get()) {
                aVar.a.onNext(t);
            }
        }
    }

    @Override // defpackage.kfy
    public final void onSubscribe(pse pseVar) {
        if (this.a.get() == c) {
            pseVar.dispose();
        }
    }
}

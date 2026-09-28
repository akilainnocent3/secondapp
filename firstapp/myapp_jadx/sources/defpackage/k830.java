package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class k830<T> extends h3i<T> {
    public static final a[] d = new a[0];
    public static final a[] e = new a[0];
    public final AtomicReference<a<T>[]> b = new AtomicReference<>(e);
    public Throwable c;

    public static final class a<T> extends AtomicLong implements bee0 {
        public final zde0<? super T> a;
        public final k830<T> b;

        public a(zde0<? super T> zde0Var, k830<T> k830Var) {
            this.a = zde0Var;
            this.b = k830Var;
        }

        @Override // defpackage.bee0
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.b.l(this);
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.b(this, j);
            }
        }
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (this.b.get() == d) {
            bee0Var.cancel();
        } else {
            bee0Var.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        a<T> aVar = new a<>(zde0Var, this);
        zde0Var.a(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.b;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == d) {
                Throwable th = this.c;
                if (th != null) {
                    zde0Var.onError(th);
                    return;
                } else {
                    zde0Var.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get() == Long.MIN_VALUE) {
                        l(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    public final void l(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.b;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == d || aVarArr2 == (aVarArr = e)) {
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

    @Override // defpackage.zde0
    public final void onComplete() {
        AtomicReference<a<T>[]> atomicReference = this.b;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = d;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.a.onComplete();
            }
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        yby.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<a<T>[]> atomicReference = this.b;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = d;
        if (aVarArr == aVarArr2) {
            o760.b(th);
            return;
        }
        this.c = th;
        for (a<T> aVar : atomicReference.getAndSet(aVarArr2)) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.a.onError(th);
            } else {
                o760.b(th);
            }
        }
    }

    @Override // defpackage.zde0
    public final void onNext(T t) {
        long j;
        long j2;
        yby.b(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.b.get()) {
            zde0<? super T> zde0Var = aVar.a;
            long j3 = aVar.get();
            if (j3 != Long.MIN_VALUE) {
                if (j3 != 0) {
                    zde0Var.onNext(t);
                    do {
                        j = aVar.get();
                        if (j == Long.MIN_VALUE || j == Long.MAX_VALUE) {
                            break;
                        }
                        j2 = j - 1;
                        if (j2 < 0) {
                            o760.b(new IllegalStateException(avg.a(j2, "More produced than requested: ")));
                            j2 = 0;
                        }
                    } while (!aVar.compareAndSet(j, j2));
                } else {
                    aVar.cancel();
                    zde0Var.onError(new sqv("Could not emit value due to lack of requests"));
                }
            }
        }
    }
}

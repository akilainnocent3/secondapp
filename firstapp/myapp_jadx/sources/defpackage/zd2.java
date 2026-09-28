package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes8.dex */
public final class zd2<T> extends sce0<T> {
    public static final Object[] i = new Object[0];
    public static final a[] v = new a[0];
    public static final a[] w = new a[0];
    public final AtomicReference<Object> a;
    public final AtomicReference<a<T>[]> b;
    public final Lock c;
    public final Lock d;
    public final AtomicReference<Throwable> e;
    public long f;

    public static final class a<T> implements pse, nm20 {
        public final kfy<? super T> a;
        public final zd2<T> b;
        public boolean c;
        public boolean d;
        public ou0<Object> e;
        public boolean f;
        public volatile boolean i;
        public long v;

        public a(kfy<? super T> kfyVar, zd2<T> zd2Var) {
            this.a = kfyVar;
            this.b = zd2Var;
        }

        public final void a(Object obj, long j) {
            if (this.i) {
                return;
            }
            if (!this.f) {
                synchronized (this) {
                    try {
                        if (this.i) {
                            return;
                        }
                        if (this.v == j) {
                            return;
                        }
                        if (this.d) {
                            ou0<Object> ou0Var = this.e;
                            if (ou0Var == null) {
                                ou0Var = new ou0<>();
                                this.e = ou0Var;
                            }
                            ou0Var.a(obj);
                            return;
                        }
                        this.c = true;
                        this.f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.b.l(this);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.i;
        }

        @Override // defpackage.nm20
        public final boolean test(Object obj) {
            if (this.i) {
                return true;
            }
            kfy<? super T> kfyVar = this.a;
            if (obj == s2y.a) {
                kfyVar.onComplete();
                return true;
            }
            if (obj instanceof s2y.b) {
                kfyVar.onError(((s2y.b) obj).a);
                return true;
            }
            kfyVar.onNext(obj);
            return false;
        }
    }

    public zd2() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference<>(v);
        this.a = new AtomicReference<>();
        this.e = new AtomicReference<>();
    }

    public static <T> zd2<T> j(T t) {
        zd2<T> zd2Var = new zd2<>();
        zd2Var.a.lazySet(t);
        return zd2Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        ou0<Object> ou0Var;
        Object[] objArr;
        a<T> aVar = new a<>(kfyVar, this);
        kfyVar.onSubscribe(aVar);
        AtomicReference<a<T>[]> atomicReference = this.b;
        while (true) {
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == w) {
                Throwable th = this.e.get();
                if (th == otg.a) {
                    kfyVar.onComplete();
                    return;
                } else {
                    kfyVar.onError(th);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.i) {
                        l(aVar);
                        return;
                    }
                    if (aVar.i) {
                        return;
                    }
                    synchronized (aVar) {
                        try {
                            if (aVar.i) {
                                return;
                            }
                            if (aVar.c) {
                                return;
                            }
                            zd2<T> zd2Var = aVar.b;
                            Lock lock = zd2Var.c;
                            lock.lock();
                            aVar.v = zd2Var.f;
                            Object obj = zd2Var.a.get();
                            lock.unlock();
                            aVar.d = obj != null;
                            aVar.c = true;
                            if (obj == null || aVar.test(obj)) {
                                return;
                            }
                            while (!aVar.i) {
                                synchronized (aVar) {
                                    try {
                                        ou0Var = aVar.e;
                                        if (ou0Var == null) {
                                            aVar.d = false;
                                            return;
                                        }
                                        aVar.e = null;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                for (Object[] objArr2 = ou0Var.a; objArr2 != null; objArr2 = objArr2[4]) {
                                    for (int i2 = 0; i2 < 4 && (objArr = objArr2[i2]) != null; i2++) {
                                        if (aVar.test(objArr)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    public final T k() {
        T t = (T) this.a.get();
        if (t == s2y.a || (t instanceof s2y.b)) {
            return null;
        }
        return t;
    }

    public final void l(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.b;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (aVarArr2[i2] == aVar) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = v;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i2);
                System.arraycopy(aVarArr2, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                aVarArr = aVarArr3;
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
        AtomicReference<Throwable> atomicReference;
        otg.a aVar = otg.a;
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, aVar)) {
                AtomicReference<a<T>[]> atomicReference2 = this.b;
                a<T>[] aVarArr = w;
                a<T>[] andSet = atomicReference2.getAndSet(aVarArr);
                s2y s2yVar = s2y.a;
                if (andSet != aVarArr) {
                    Lock lock = this.d;
                    lock.lock();
                    this.f++;
                    this.a.lazySet(s2yVar);
                    lock.unlock();
                }
                for (a<T> aVar2 : andSet) {
                    aVar2.a(s2yVar, this.f);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // defpackage.kfy
    public final void onError(Throwable th) {
        AtomicReference<Throwable> atomicReference;
        yby.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, th)) {
                s2y.b bVar = new s2y.b(th);
                AtomicReference<a<T>[]> atomicReference2 = this.b;
                a<T>[] aVarArr = w;
                a<T>[] andSet = atomicReference2.getAndSet(aVarArr);
                if (andSet != aVarArr) {
                    Lock lock = this.d;
                    lock.lock();
                    this.f++;
                    this.a.lazySet(bVar);
                    lock.unlock();
                }
                for (a<T> aVar : andSet) {
                    aVar.a(bVar, this.f);
                }
                return;
            }
        } while (atomicReference.get() == null);
        o760.b(th);
    }

    @Override // defpackage.kfy
    public final void onNext(T t) {
        yby.b(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e.get() != null) {
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.f++;
        this.a.lazySet(t);
        lock.unlock();
        for (a<T> aVar : this.b.get()) {
            aVar.a(t, this.f);
        }
    }

    @Override // defpackage.kfy
    public final void onSubscribe(pse pseVar) {
        if (this.e.get() != null) {
            pseVar.dispose();
        }
    }
}

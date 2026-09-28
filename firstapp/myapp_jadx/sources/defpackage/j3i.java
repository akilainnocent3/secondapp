package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class j3i<T> extends jua<T> implements sf50 {
    public final m830<T> b;
    public final int c;
    public final AtomicReference<b<T>> d = new AtomicReference<>();

    public static final class a<T> extends AtomicLong implements bee0 {
        public final zde0<? super T> a;
        public final b<T> b;
        public long c;

        public a(zde0<? super T> zde0Var, b<T> bVar) {
            this.a = zde0Var;
            this.b = bVar;
        }

        public final boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // defpackage.bee0
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                b<T> bVar = this.b;
                bVar.e(this);
                bVar.c();
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            ot1.b(this, j);
            this.b.c();
        }
    }

    public static final class b<T> extends AtomicInteger implements n3i<T>, pse {
        public final AtomicReference<b<T>> a;
        public final AtomicReference<bee0> b = new AtomicReference<>();
        public final AtomicBoolean c = new AtomicBoolean();
        public final AtomicReference<a<T>[]> d = new AtomicReference<>(z);
        public final int e;
        public volatile lk90<T> f;
        public int i;
        public volatile boolean v;
        public Throwable w;
        public int y;
        public static final a[] z = new a[0];
        public static final a[] A = new a[0];

        public b(AtomicReference<b<T>> atomicReference, int i) {
            this.a = atomicReference;
            this.e = i;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.d(this.b, bee0Var)) {
                if (bee0Var instanceof nb30) {
                    nb30 nb30Var = (nb30) bee0Var;
                    int iB = nb30Var.b(7);
                    if (iB == 1) {
                        this.i = iB;
                        this.f = nb30Var;
                        this.v = true;
                        c();
                        return;
                    }
                    if (iB == 2) {
                        this.i = iB;
                        this.f = nb30Var;
                        bee0Var.request(this.e);
                        return;
                    }
                }
                this.f = new kkd0(this.e);
                bee0Var.request(this.e);
            }
        }

        public final boolean b(boolean z2, boolean z3) {
            if (!z2 || !z3) {
                return false;
            }
            Throwable th = this.w;
            if (th != null) {
                f(th);
                return true;
            }
            for (a<T> aVar : this.d.getAndSet(A)) {
                if (!aVar.a()) {
                    aVar.a.onComplete();
                }
            }
            return true;
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            lk90<T> lk90Var = this.f;
            int i = this.y;
            int i2 = this.e;
            int i3 = i2 - (i2 >> 2);
            boolean z2 = this.i != 1;
            lk90<T> lk90Var2 = lk90Var;
            int i4 = i;
            int iAddAndGet = 1;
            while (true) {
                if (lk90Var2 != null) {
                    a<T>[] aVarArr = this.d.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z3 = false;
                    for (a<T> aVar : aVarArr) {
                        long j = aVar.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(j - aVar.c, jMin);
                            z3 = true;
                        }
                    }
                    long j2 = 0;
                    if (!z3) {
                        jMin = 0;
                    }
                    while (true) {
                        if (jMin != j2) {
                            boolean z4 = this.v;
                            try {
                                T tPoll = lk90Var2.poll();
                                boolean z5 = tPoll == null;
                                if (b(z4, z5)) {
                                    return;
                                }
                                if (!z5) {
                                    for (a<T> aVar2 : aVarArr) {
                                        if (!aVar2.a()) {
                                            aVar2.a.onNext(tPoll);
                                            aVar2.c++;
                                        }
                                    }
                                    if (z2 && (i4 = i4 + 1) == i3) {
                                        this.b.get().request(i3);
                                        i4 = 0;
                                    }
                                    jMin--;
                                    if (aVarArr == this.d.get()) {
                                        j2 = 0;
                                    }
                                }
                            } catch (Throwable th) {
                                qtg.a(th);
                                this.b.get().cancel();
                                lk90Var2.clear();
                                this.v = true;
                                f(th);
                                return;
                            }
                        }
                        if (b(this.v, lk90Var2.isEmpty())) {
                            return;
                        }
                    }
                }
                this.y = i4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (lk90Var2 == null) {
                    lk90Var2 = this.f;
                }
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            this.d.getAndSet(A);
            do {
                atomicReference = this.a;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            gee0.a(this.b);
        }

        public final void e(a<T> aVar) {
            a<T>[] aVarArr;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = this.d;
                a<T>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
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
                if (length == 1) {
                    aVarArr = z;
                } else {
                    a<T>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                    }
                }
                return;
            }
        }

        public final void f(Throwable th) {
            for (a<T> aVar : this.d.getAndSet(A)) {
                if (!aVar.a()) {
                    aVar.a.onError(th);
                }
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.d.get() == A;
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.v = true;
            c();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.v) {
                o760.b(th);
                return;
            }
            this.w = th;
            this.v = true;
            c();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.i != 0 || this.f.offer(t)) {
                c();
            } else {
                onError(new sqv("Prefetch queue is full?!"));
            }
        }
    }

    public j3i(m830<T> m830Var, int i) {
        this.b = m830Var;
        this.c = i;
    }

    @Override // defpackage.sf50
    public final void b(pse pseVar) {
        AtomicReference<b<T>> atomicReference;
        b<T> bVar = (b) pseVar;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(bVar, null)) {
                return;
            }
        } while (atomicReference.get() == bVar);
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.d;
            bVar = atomicReference.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference, this.c);
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    bVar = bVar2;
                    break loop0;
                }
            } while (atomicReference.get() == bVar);
        }
        a<T> aVar = new a<>(zde0Var, bVar);
        zde0Var.a(aVar);
        AtomicReference<a<T>[]> atomicReference2 = bVar.d;
        while (true) {
            a<T>[] aVarArr = atomicReference2.get();
            if (aVarArr == b.A) {
                Throwable th = bVar.w;
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
                if (atomicReference2.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.a()) {
                        bVar.e(aVar);
                        return;
                    } else {
                        bVar.c();
                        return;
                    }
                }
            } while (atomicReference2.get() == aVarArr);
        }
    }
}

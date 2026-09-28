package defpackage;

import com.google.protobuf.Reader;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class jdy<T, U> extends j4<T, U> {
    public final faj<? super T, ? extends dey<? extends U>> b;
    public final int c;
    public final int d;

    public static final class a<T, U> extends AtomicReference<pse> implements kfy<U> {
        public final long a;
        public final b<T, U> b;
        public volatile boolean c;
        public volatile lk90<U> d;
        public int e;

        public a(b<T, U> bVar, long j) {
            this.a = j;
            this.b = bVar;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.c = true;
            this.b.c();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (!otg.a(this.b.i, th)) {
                o760.b(th);
                return;
            }
            this.b.b();
            this.c = true;
            this.b.c();
        }

        @Override // defpackage.kfy
        public final void onNext(U u) {
            int i = this.e;
            b<T, U> bVar = this.b;
            if (i != 0) {
                bVar.c();
                return;
            }
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.a.onNext(u);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                lk90 lkd0Var = this.d;
                if (lkd0Var == null) {
                    lkd0Var = new lkd0(bVar.d);
                    this.d = lkd0Var;
                }
                lkd0Var.offer(u);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.d();
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.d(this, pseVar) && (pseVar instanceof gb30)) {
                gb30 gb30Var = (gb30) pseVar;
                int iB = gb30Var.b(7);
                if (iB == 1) {
                    this.e = iB;
                    this.d = gb30Var;
                    this.c = true;
                    this.b.c();
                    return;
                }
                if (iB == 2) {
                    this.e = iB;
                    this.d = gb30Var;
                }
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements pse, kfy<T> {
        public static final a<?, ?>[] E = new a[0];
        public static final a<?, ?>[] F = new a[0];
        public long A;
        public int B;
        public final ArrayDeque C;
        public int D;
        public final kfy<? super U> a;
        public final faj<? super T, ? extends dey<? extends U>> b;
        public final int c;
        public final int d;
        public volatile gk90<U> e;
        public volatile boolean f;
        public final z11 i = new z11();
        public volatile boolean v;
        public final AtomicReference<a<?, ?>[]> w;
        public pse y;
        public long z;

        public b(kfy kfyVar, faj fajVar, int i, int i2) {
            this.a = kfyVar;
            this.b = fajVar;
            this.c = i;
            this.d = i2;
            if (i != Integer.MAX_VALUE) {
                this.C = new ArrayDeque(i);
            }
            this.w = new AtomicReference<>(E);
        }

        public final boolean a() {
            if (!this.v) {
                if (this.i.get() == null) {
                    return false;
                }
                b();
                Throwable thB = otg.b(this.i);
                if (thB != otg.a) {
                    this.a.onError(thB);
                }
            }
            return true;
        }

        public final boolean b() {
            a<?, ?>[] andSet;
            this.y.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.w;
            a<?, ?>[] aVarArr = atomicReference.get();
            a<?, ?>[] aVarArr2 = F;
            if (aVarArr == aVarArr2 || (andSet = atomicReference.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.getClass();
                xse.a(aVar);
            }
            return true;
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* JADX WARN: Code duplicated, block: B:112:0x011f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:0x0102 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:89:0x0101 A[PHI: r4
          0x0101: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:76:0x00e0, B:88:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void d() {
            int size;
            boolean z;
            kfy<? super U> kfyVar = this.a;
            int iAddAndGet = 1;
            while (!a()) {
                gk90<U> gk90Var = this.e;
                int i = 0;
                if (gk90Var != null) {
                    while (!a()) {
                        U uPoll = gk90Var.poll();
                        if (uPoll != null) {
                            kfyVar.onNext(uPoll);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.f;
                    gk90<U> gk90Var2 = this.e;
                    a<?, ?>[] aVarArr = this.w.get();
                    int length = aVarArr.length;
                    if (this.c != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.C.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((gk90Var2 == null || gk90Var2.isEmpty()) && length == 0 && size == 0)) {
                        Throwable thB = otg.b(this.i);
                        if (thB != otg.a) {
                            if (thB == null) {
                                kfyVar.onComplete();
                                return;
                            } else {
                                kfyVar.onError(thB);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j = this.A;
                        int i2 = this.B;
                        if (length <= i2 || aVarArr[i2].a != j) {
                            if (length <= i2) {
                                i2 = 0;
                            }
                            for (int i3 = 0; i3 < length && aVarArr[i2].a != j; i3++) {
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                            }
                            this.B = i2;
                            this.A = aVarArr[i2].a;
                        }
                        for (int i4 = 0; i4 < length; i4++) {
                            if (a()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[i2];
                            lk90<U> lk90Var = aVar.d;
                            if (lk90Var != null) {
                                do {
                                    try {
                                        U uPoll2 = lk90Var.poll();
                                        if (uPoll2 == null) {
                                            z = aVar.c;
                                            lk90<U> lk90Var2 = aVar.d;
                                            if (z && (lk90Var2 == null || lk90Var2.isEmpty())) {
                                                e(aVar);
                                                if (a()) {
                                                    return;
                                                } else {
                                                    i++;
                                                }
                                            }
                                            i2++;
                                            if (i2 == length) {
                                                i2 = 0;
                                            }
                                        } else {
                                            kfyVar.onNext(uPoll2);
                                        }
                                    } catch (Throwable th) {
                                        qtg.a(th);
                                        xse.a(aVar);
                                        otg.a(this.i, th);
                                        if (a()) {
                                            return;
                                        }
                                        e(aVar);
                                        i++;
                                        i2++;
                                        if (i2 == length) {
                                        }
                                    }
                                } while (!a());
                                return;
                            }
                            z = aVar.c;
                            lk90<U> lk90Var3 = aVar.d;
                            if (z) {
                                e(aVar);
                                if (a()) {
                                    return;
                                } else {
                                    i++;
                                }
                            }
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                        }
                        this.B = i2;
                        this.A = aVarArr[i2].a;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.c != Integer.MAX_VALUE) {
                        g(i);
                    }
                } else if (this.c != Integer.MAX_VALUE) {
                    g(i);
                }
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            Throwable thB;
            if (this.v) {
                return;
            }
            this.v = true;
            if (!b() || (thB = otg.b(this.i)) == null || thB == otg.a) {
                return;
            }
            o760.b(thB);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.w;
                a<?, ?>[] aVarArr2 = atomicReference.get();
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
                    aVarArr = E;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v7, types: [lk90] */
        public final void f(dey<? extends U> deyVar) {
            boolean z;
            do {
                z = false;
                if (deyVar instanceof Callable) {
                    try {
                        Object objCall = ((Callable) deyVar).call();
                        if (objCall != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                this.a.onNext(objCall);
                                if (decrementAndGet() != 0) {
                                    d();
                                }
                            } else {
                                gk90<U> gk90Var = this.e;
                                ?? r3 = gk90Var;
                                if (gk90Var == false) {
                                    gk90<U> lkd0Var = this.c == Integer.MAX_VALUE ? new lkd0(this.d) : new kkd0(this.c);
                                    this.e = lkd0Var;
                                    r3 = lkd0Var;
                                }
                                if (r3.offer(objCall)) {
                                    if (getAndIncrement() != 0) {
                                        return;
                                    }
                                    d();
                                } else {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                }
                            }
                        }
                    } catch (Throwable th) {
                        qtg.a(th);
                        otg.a(this.i, th);
                        c();
                    }
                    if (this.c == Integer.MAX_VALUE) {
                        return;
                    }
                    synchronized (this) {
                        try {
                            deyVar = (dey) this.C.poll();
                            if (deyVar == null) {
                                this.D--;
                                z = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    long j = this.z;
                    this.z = 1 + j;
                    a<?, ?> aVar = new a<>(this, j);
                    AtomicReference<a<?, ?>[]> atomicReference = this.w;
                    while (true) {
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == F) {
                            xse.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        do {
                            if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                                deyVar.a(aVar);
                                return;
                            }
                        } while (atomicReference.get() == aVarArr);
                    }
                }
            } while (!z);
            c();
        }

        public final void g(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        dey<? extends U> deyVar = (dey) this.C.poll();
                        if (deyVar == null) {
                            this.D--;
                        } else {
                            f(deyVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                i = i2;
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.v;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            c();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (this.f) {
                o760.b(th);
            } else if (!otg.a(this.i, th)) {
                o760.b(th);
            } else {
                this.f = true;
                c();
            }
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            try {
                dey<? extends U> deyVarApply = this.b.apply(t);
                yby.b(deyVarApply, "The mapper returned a null ObservableSource");
                dey<? extends U> deyVar = deyVarApply;
                if (this.c != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.D;
                            if (i == this.c) {
                                this.C.offer(deyVar);
                                return;
                            }
                            this.D = i + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                f(deyVar);
            } catch (Throwable th2) {
                qtg.a(th2);
                this.y.dispose();
                onError(th2);
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.y, pseVar)) {
                this.y = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public jdy(ucy ucyVar, faj fajVar, int i) {
        super(ucyVar);
        this.b = fajVar;
        this.c = Reader.READ_DONE;
        this.d = i;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super U> kfyVar) {
        dey<T> deyVar = this.a;
        faj<? super T, ? extends dey<? extends U>> fajVar = this.b;
        if (zdy.a(deyVar, kfyVar, fajVar)) {
            return;
        }
        deyVar.a(new b(kfyVar, fajVar, this.c, this.d));
    }
}

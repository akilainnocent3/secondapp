package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class b3i<T> extends e3<T, T> {
    public final qm70 c;
    public final int d;

    public static abstract class a<T> extends m92<T> implements n3i<T>, Runnable {
        public boolean A;
        public final qm70.c a;
        public final int b;
        public final int c;
        public final AtomicLong d = new AtomicLong();
        public bee0 e;
        public lk90<T> f;
        public volatile boolean i;
        public volatile boolean v;
        public Throwable w;
        public int y;
        public long z;

        public a(qm70.c cVar, int i) {
            this.a = cVar;
            this.b = i;
            this.c = i - (i >> 2);
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            this.A = true;
            return 2;
        }

        public final boolean c(boolean z, boolean z2, zde0<?> zde0Var) {
            if (this.i) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.w;
            if (th != null) {
                this.i = true;
                clear();
                zde0Var.onError(th);
                this.a.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.i = true;
            zde0Var.onComplete();
            this.a.dispose();
            return true;
        }

        @Override // defpackage.bee0
        public final void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.e.cancel();
            this.a.dispose();
            if (this.A || getAndIncrement() != 0) {
                return;
            }
            this.f.clear();
        }

        @Override // defpackage.lk90
        public final void clear() {
            this.f.clear();
        }

        public abstract void e();

        public abstract void f();

        public abstract void g();

        public final void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.a.b(this);
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return this.f.isEmpty();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (this.v) {
                return;
            }
            this.v = true;
            h();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.v) {
                o760.b(th);
                return;
            }
            this.w = th;
            this.v = true;
            h();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.v) {
                return;
            }
            if (this.y == 2) {
                h();
                return;
            }
            if (!this.f.offer(t)) {
                this.e.cancel();
                this.w = new sqv("Queue is full?!");
                this.v = true;
            }
            h();
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this.d, j);
                h();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.A) {
                f();
            } else if (this.y == 1) {
                g();
            } else {
                e();
            }
        }
    }

    public static final class b<T> extends a<T> {
        public final foa<? super T> B;
        public long C;

        public b(foa foaVar, qm70.c cVar, int i) {
            super(cVar, i);
            this.B = foaVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.e, bee0Var)) {
                this.e = bee0Var;
                if (bee0Var instanceof nb30) {
                    nb30 nb30Var = (nb30) bee0Var;
                    int iB = nb30Var.b(7);
                    if (iB == 1) {
                        this.y = 1;
                        this.f = nb30Var;
                        this.v = true;
                        this.B.a(this);
                        return;
                    }
                    if (iB == 2) {
                        this.y = 2;
                        this.f = nb30Var;
                        this.B.a(this);
                        bee0Var.request(this.b);
                        return;
                    }
                }
                this.f = new kkd0(this.b);
                this.B.a(this);
                bee0Var.request(this.b);
            }
        }

        @Override // b3i.a
        public final void e() {
            foa<? super T> foaVar = this.B;
            lk90<T> lk90Var = this.f;
            long j = this.z;
            long j2 = this.C;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.d.get();
                while (j != j3) {
                    boolean z = this.v;
                    try {
                        T tPoll = lk90Var.poll();
                        boolean z2 = tPoll == null;
                        if (c(z, z2, foaVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (foaVar.d(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.c) {
                            this.e.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        qtg.a(th);
                        this.i = true;
                        this.e.cancel();
                        lk90Var.clear();
                        foaVar.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j == j3 && c(this.v, lk90Var.isEmpty(), foaVar)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.z = j;
                    this.C = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // b3i.a
        public final void f() {
            int iAddAndGet = 1;
            while (!this.i) {
                boolean z = this.v;
                this.B.onNext(null);
                if (z) {
                    this.i = true;
                    Throwable th = this.w;
                    foa<? super T> foaVar = this.B;
                    if (th != null) {
                        foaVar.onError(th);
                    } else {
                        foaVar.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // b3i.a
        public final void g() {
            foa<? super T> foaVar = this.B;
            lk90<T> lk90Var = this.f;
            long j = this.z;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.d.get();
                while (j != j2) {
                    try {
                        T tPoll = lk90Var.poll();
                        if (this.i) {
                            return;
                        }
                        if (tPoll == null) {
                            this.i = true;
                            foaVar.onComplete();
                            this.a.dispose();
                            return;
                        } else if (foaVar.d(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        qtg.a(th);
                        this.i = true;
                        this.e.cancel();
                        foaVar.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (this.i) {
                    return;
                }
                if (lk90Var.isEmpty()) {
                    this.i = true;
                    foaVar.onComplete();
                    this.a.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.z = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // defpackage.lk90
        public final T poll() {
            T tPoll = this.f.poll();
            if (tPoll != null && this.y != 1) {
                long j = this.C + 1;
                if (j == this.c) {
                    this.C = 0L;
                    this.e.request(j);
                    return tPoll;
                }
                this.C = j;
            }
            return tPoll;
        }
    }

    public static final class c<T> extends a<T> {
        public final zde0<? super T> B;

        public c(zde0 zde0Var, qm70.c cVar, int i) {
            super(cVar, i);
            this.B = zde0Var;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.e, bee0Var)) {
                this.e = bee0Var;
                if (bee0Var instanceof nb30) {
                    nb30 nb30Var = (nb30) bee0Var;
                    int iB = nb30Var.b(7);
                    if (iB == 1) {
                        this.y = 1;
                        this.f = nb30Var;
                        this.v = true;
                        this.B.a(this);
                        return;
                    }
                    if (iB == 2) {
                        this.y = 2;
                        this.f = nb30Var;
                        this.B.a(this);
                        bee0Var.request(this.b);
                        return;
                    }
                }
                this.f = new kkd0(this.b);
                this.B.a(this);
                bee0Var.request(this.b);
            }
        }

        @Override // b3i.a
        public final void e() {
            zde0<? super T> zde0Var = this.B;
            lk90<T> lk90Var = this.f;
            long j = this.z;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.d.get();
                while (j != jAddAndGet) {
                    boolean z = this.v;
                    try {
                        T tPoll = lk90Var.poll();
                        boolean z2 = tPoll == null;
                        if (c(z, z2, zde0Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        zde0Var.onNext(tPoll);
                        j++;
                        if (j == this.c) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.d.addAndGet(-j);
                            }
                            this.e.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        qtg.a(th);
                        this.i = true;
                        this.e.cancel();
                        lk90Var.clear();
                        zde0Var.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && c(this.v, lk90Var.isEmpty(), zde0Var)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.z = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // b3i.a
        public final void f() {
            int iAddAndGet = 1;
            while (!this.i) {
                boolean z = this.v;
                this.B.onNext(null);
                if (z) {
                    this.i = true;
                    Throwable th = this.w;
                    zde0<? super T> zde0Var = this.B;
                    if (th != null) {
                        zde0Var.onError(th);
                    } else {
                        zde0Var.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // b3i.a
        public final void g() {
            zde0<? super T> zde0Var = this.B;
            lk90<T> lk90Var = this.f;
            long j = this.z;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.d.get();
                while (j != j2) {
                    try {
                        T tPoll = lk90Var.poll();
                        if (this.i) {
                            return;
                        }
                        if (tPoll == null) {
                            this.i = true;
                            zde0Var.onComplete();
                            this.a.dispose();
                            return;
                        }
                        zde0Var.onNext(tPoll);
                        j++;
                    } catch (Throwable th) {
                        qtg.a(th);
                        this.i = true;
                        this.e.cancel();
                        zde0Var.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (this.i) {
                    return;
                }
                if (lk90Var.isEmpty()) {
                    this.i = true;
                    zde0Var.onComplete();
                    this.a.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.z = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // defpackage.lk90
        public final T poll() {
            T tPoll = this.f.poll();
            if (tPoll != null && this.y != 1) {
                long j = this.z + 1;
                if (j == this.c) {
                    this.z = 0L;
                    this.e.request(j);
                    return tPoll;
                }
                this.z = j;
            }
            return tPoll;
        }
    }

    public b3i(r2i r2iVar, qm70 qm70Var, int i) {
        super(r2iVar);
        this.c = qm70Var;
        this.d = i;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        qm70.c cVarB = this.c.b();
        boolean z = zde0Var instanceof foa;
        int i = this.d;
        r2i<T> r2iVar = this.b;
        if (z) {
            r2iVar.h(new b((foa) zde0Var, cVarB, i));
        } else {
            r2iVar.h(new c(zde0Var, cVarB, i));
        }
    }
}

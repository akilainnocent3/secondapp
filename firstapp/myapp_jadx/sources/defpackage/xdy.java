package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class xdy<T> extends j4<T, T> {
    public final qm70 b;
    public final int c;

    public static final class a<T> extends l92<T> implements kfy<T>, Runnable {
        public final kfy<? super T> a;
        public final qm70.c b;
        public final int c;
        public lk90<T> d;
        public pse e;
        public Throwable f;
        public volatile boolean i;
        public volatile boolean v;
        public int w;
        public boolean y;

        public a(kfy kfyVar, qm70.c cVar, int i) {
            this.a = kfyVar;
            this.b = cVar;
            this.c = i;
        }

        public final boolean a(boolean z, boolean z2, kfy<? super T> kfyVar) {
            if (this.v) {
                this.d.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f;
            if (th != null) {
                this.v = true;
                this.d.clear();
                kfyVar.onError(th);
                this.b.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.v = true;
            kfyVar.onComplete();
            this.b.dispose();
            return true;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            this.y = true;
            return 2;
        }

        @Override // defpackage.lk90
        public final void clear() {
            this.d.clear();
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.v) {
                return;
            }
            this.v = true;
            this.e.dispose();
            this.b.dispose();
            if (this.y || getAndIncrement() != 0) {
                return;
            }
            this.d.clear();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.v;
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (this.i) {
                o760.b(th);
                return;
            }
            this.f = th;
            this.i = true;
            if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            if (this.i) {
                return;
            }
            if (this.w != 2) {
                this.d.offer(t);
            }
            if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.e, pseVar)) {
                this.e = pseVar;
                if (pseVar instanceof gb30) {
                    gb30 gb30Var = (gb30) pseVar;
                    int iB = gb30Var.b(7);
                    if (iB == 1) {
                        this.w = iB;
                        this.d = gb30Var;
                        this.i = true;
                        this.a.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.b.b(this);
                            return;
                        }
                        return;
                    }
                    if (iB == 2) {
                        this.w = iB;
                        this.d = gb30Var;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.d = new lkd0(this.c);
                this.a.onSubscribe(this);
            }
        }

        @Override // defpackage.lk90
        public final T poll() {
            return this.d.poll();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.y) {
                int iAddAndGet = 1;
                while (!this.v) {
                    boolean z = this.i;
                    Throwable th = this.f;
                    if (z && th != null) {
                        this.v = true;
                        this.a.onError(this.f);
                        this.b.dispose();
                        return;
                    }
                    this.a.onNext(null);
                    if (z) {
                        this.v = true;
                        Throwable th2 = this.f;
                        kfy<? super T> kfyVar = this.a;
                        if (th2 != null) {
                            kfyVar.onError(th2);
                        } else {
                            kfyVar.onComplete();
                        }
                        this.b.dispose();
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            lk90<T> lk90Var = this.d;
            kfy<? super T> kfyVar2 = this.a;
            int iAddAndGet2 = 1;
            while (!a(this.i, lk90Var.isEmpty(), kfyVar2)) {
                while (true) {
                    boolean z2 = this.i;
                    try {
                        T tPoll = lk90Var.poll();
                        boolean z3 = tPoll == null;
                        if (a(z2, z3, kfyVar2)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            kfyVar2.onNext(tPoll);
                        }
                    } catch (Throwable th3) {
                        qtg.a(th3);
                        this.v = true;
                        this.e.dispose();
                        lk90Var.clear();
                        kfyVar2.onError(th3);
                        this.b.dispose();
                        return;
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    public xdy(ucy ucyVar, qm70 qm70Var, int i) {
        super(ucyVar);
        this.b = qm70Var;
        this.c = i;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        qm70 qm70Var = this.b;
        boolean z = qm70Var instanceof wpg0;
        dey<T> deyVar = this.a;
        if (z) {
            deyVar.a(kfyVar);
        } else {
            deyVar.a(new a(kfyVar, qm70Var.b(), this.c));
        }
    }
}

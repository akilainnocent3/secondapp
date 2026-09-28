package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class wcy<T, U> extends j4<T, U> {
    public final taj.h b;
    public final int c;
    public final rcg d;

    public static final class a<T, R> extends AtomicInteger implements kfy<T>, pse {
        public int A;
        public final kfy<? super R> a;
        public final faj<? super T, ? extends dey<? extends R>> b;
        public final int c;
        public final z11 d = new z11();
        public final C1245a<R> e;
        public final boolean f;
        public lk90<T> i;
        public pse v;
        public volatile boolean w;
        public volatile boolean y;
        public volatile boolean z;

        /* JADX INFO: renamed from: wcy$a$a, reason: collision with other inner class name */
        public static final class C1245a<R> extends AtomicReference<pse> implements kfy<R> {
            public final kfy<? super R> a;
            public final a<?, R> b;

            public C1245a(kfy<? super R> kfyVar, a<?, R> aVar) {
                this.a = kfyVar;
                this.b = aVar;
            }

            @Override // defpackage.kfy
            public final void onComplete() {
                a<?, R> aVar = this.b;
                aVar.w = false;
                aVar.a();
            }

            @Override // defpackage.kfy
            public final void onError(Throwable th) {
                a<?, R> aVar = this.b;
                z11 z11Var = aVar.d;
                z11Var.getClass();
                if (!otg.a(z11Var, th)) {
                    o760.b(th);
                    return;
                }
                if (!aVar.f) {
                    aVar.v.dispose();
                }
                aVar.w = false;
                aVar.a();
            }

            @Override // defpackage.kfy
            public final void onNext(R r) {
                this.a.onNext(r);
            }

            @Override // defpackage.kfy
            public final void onSubscribe(pse pseVar) {
                xse.c(this, pseVar);
            }
        }

        public a(kfy kfyVar, taj.h hVar, int i, boolean z) {
            this.a = kfyVar;
            this.b = hVar;
            this.c = i;
            this.f = z;
            this.e = new C1245a<>(kfyVar, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            kfy<? super R> kfyVar = this.a;
            lk90<T> lk90Var = this.i;
            z11 z11Var = this.d;
            while (true) {
                if (!this.w) {
                    if (this.z) {
                        lk90Var.clear();
                        return;
                    }
                    if (!this.f && z11Var.get() != null) {
                        lk90Var.clear();
                        this.z = true;
                        kfyVar.onError(otg.b(z11Var));
                        return;
                    }
                    boolean z = this.y;
                    try {
                        T tPoll = lk90Var.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.z = true;
                            z11Var.getClass();
                            Throwable thB = otg.b(z11Var);
                            if (thB != null) {
                                kfyVar.onError(thB);
                                return;
                            } else {
                                kfyVar.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                dey<? extends R> deyVarApply = this.b.apply(tPoll);
                                yby.b(deyVarApply, "The mapper returned a null ObservableSource");
                                dey<? extends R> deyVar = deyVarApply;
                                if (deyVar instanceof Callable) {
                                    try {
                                        a03 a03Var = (Object) ((Callable) deyVar).call();
                                        if (a03Var != null && !this.z) {
                                            kfyVar.onNext(a03Var);
                                        }
                                    } catch (Throwable th) {
                                        qtg.a(th);
                                        z11Var.getClass();
                                        otg.a(z11Var, th);
                                    }
                                } else {
                                    this.w = true;
                                    deyVar.a(this.e);
                                }
                            } catch (Throwable th2) {
                                qtg.a(th2);
                                this.z = true;
                                this.v.dispose();
                                lk90Var.clear();
                                z11Var.getClass();
                                otg.a(z11Var, th2);
                                kfyVar.onError(otg.b(z11Var));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        qtg.a(th3);
                        this.z = true;
                        this.v.dispose();
                        z11Var.getClass();
                        otg.a(z11Var, th3);
                        kfyVar.onError(otg.b(z11Var));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.z = true;
            this.v.dispose();
            C1245a<R> c1245a = this.e;
            c1245a.getClass();
            xse.a(c1245a);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.z;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.y = true;
            a();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            z11 z11Var = this.d;
            z11Var.getClass();
            if (!otg.a(z11Var, th)) {
                o760.b(th);
            } else {
                this.y = true;
                a();
            }
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            if (this.A == 0) {
                this.i.offer(t);
            }
            a();
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.v, pseVar)) {
                this.v = pseVar;
                if (pseVar instanceof gb30) {
                    gb30 gb30Var = (gb30) pseVar;
                    int iB = gb30Var.b(3);
                    if (iB == 1) {
                        this.A = iB;
                        this.i = gb30Var;
                        this.y = true;
                        this.a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iB == 2) {
                        this.A = iB;
                        this.i = gb30Var;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.i = new lkd0(this.c);
                this.a.onSubscribe(this);
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements kfy<T>, pse {
        public final ie80 a;
        public final faj<? super T, ? extends dey<? extends U>> b;
        public final a<U> c;
        public final int d;
        public lk90<T> e;
        public pse f;
        public volatile boolean i;
        public volatile boolean v;
        public volatile boolean w;
        public int y;

        public static final class a<U> extends AtomicReference<pse> implements kfy<U> {
            public final ie80 a;
            public final b<?, ?> b;

            public a(ie80 ie80Var, b bVar) {
                this.a = ie80Var;
                this.b = bVar;
            }

            @Override // defpackage.kfy
            public final void onComplete() {
                b<?, ?> bVar = this.b;
                bVar.i = false;
                bVar.a();
            }

            @Override // defpackage.kfy
            public final void onError(Throwable th) {
                this.b.dispose();
                this.a.onError(th);
            }

            @Override // defpackage.kfy
            public final void onNext(U u) {
                this.a.onNext(u);
            }

            @Override // defpackage.kfy
            public final void onSubscribe(pse pseVar) {
                xse.c(this, pseVar);
            }
        }

        public b(ie80 ie80Var, taj.h hVar, int i) {
            this.a = ie80Var;
            this.b = hVar;
            this.d = i;
            this.c = new a<>(ie80Var, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.v) {
                if (!this.i) {
                    boolean z = this.w;
                    try {
                        T tPoll = this.e.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.v = true;
                            this.a.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                dey<? extends U> deyVarApply = this.b.apply(tPoll);
                                yby.b(deyVarApply, "The mapper returned a null ObservableSource");
                                dey<? extends U> deyVar = deyVarApply;
                                this.i = true;
                                deyVar.a(this.c);
                            } catch (Throwable th) {
                                qtg.a(th);
                                dispose();
                                this.e.clear();
                                this.a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        qtg.a(th2);
                        dispose();
                        this.e.clear();
                        this.a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.e.clear();
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.v = true;
            a<U> aVar = this.c;
            aVar.getClass();
            xse.a(aVar);
            this.f.dispose();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.v;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.w) {
                return;
            }
            this.w = true;
            a();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (this.w) {
                o760.b(th);
                return;
            }
            this.w = true;
            dispose();
            this.a.onError(th);
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            if (this.w) {
                return;
            }
            if (this.y == 0) {
                this.e.offer(t);
            }
            a();
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.f, pseVar)) {
                this.f = pseVar;
                if (pseVar instanceof gb30) {
                    gb30 gb30Var = (gb30) pseVar;
                    int iB = gb30Var.b(3);
                    if (iB == 1) {
                        this.y = iB;
                        this.e = gb30Var;
                        this.w = true;
                        this.a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iB == 2) {
                        this.y = iB;
                        this.e = gb30Var;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.e = new lkd0(this.d);
                this.a.onSubscribe(this);
            }
        }
    }

    public wcy(ucy ucyVar, int i) {
        super(ucyVar);
        this.b = taj.a;
        this.d = rcg.b;
        this.c = Math.max(8, i);
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super U> kfyVar) {
        dey<T> deyVar = this.a;
        taj.h hVar = this.b;
        if (zdy.a(deyVar, kfyVar, hVar)) {
            return;
        }
        rcg rcgVar = rcg.a;
        int i = this.c;
        rcg rcgVar2 = this.d;
        if (rcgVar2 == rcgVar) {
            deyVar.a(new b(new ie80(kfyVar), hVar, i));
        } else {
            deyVar.a(new a(kfyVar, hVar, i, rcgVar2 == rcg.c));
        }
    }
}

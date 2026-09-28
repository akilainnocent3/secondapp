package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class xcy<T, R> extends ucy<R> {
    public final ady a;
    public final dle0 b;
    public final rcg c = rcg.a;
    public final int d = 2;

    public static final class a<T, R> extends AtomicInteger implements kfy<T>, pse {
        public final kfy<? super R> a;
        public final faj<? super T, ? extends dw90<? extends R>> b;
        public final z11 c = new z11();
        public final C1286a<R> d = new C1286a<>(this);
        public final lkd0 e;
        public final rcg f;
        public pse i;
        public volatile boolean v;
        public volatile boolean w;
        public R y;
        public volatile int z;

        /* JADX INFO: renamed from: xcy$a$a, reason: collision with other inner class name */
        public static final class C1286a<R> extends AtomicReference<pse> implements zu90<R> {
            public final a<?, R> a;

            public C1286a(a<?, R> aVar) {
                this.a = aVar;
            }

            @Override // defpackage.zu90
            public final void onError(Throwable th) {
                a<?, R> aVar = this.a;
                z11 z11Var = aVar.c;
                z11Var.getClass();
                if (!otg.a(z11Var, th)) {
                    o760.b(th);
                    return;
                }
                if (aVar.f != rcg.c) {
                    aVar.i.dispose();
                }
                aVar.z = 0;
                aVar.a();
            }

            @Override // defpackage.zu90
            public final void onSubscribe(pse pseVar) {
                xse.c(this, pseVar);
            }

            @Override // defpackage.zu90
            public final void onSuccess(R r) {
                a<?, R> aVar = this.a;
                aVar.y = r;
                aVar.z = 2;
                aVar.a();
            }
        }

        public a(kfy kfyVar, dle0 dle0Var, int i, rcg rcgVar) {
            this.a = kfyVar;
            this.b = dle0Var;
            this.f = rcgVar;
            this.e = new lkd0(i);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            kfy<? super R> kfyVar = this.a;
            rcg rcgVar = this.f;
            lkd0 lkd0Var = this.e;
            z11 z11Var = this.c;
            int iAddAndGet = 1;
            while (true) {
                if (!this.w) {
                    int i = this.z;
                    if (z11Var.get() != null && (rcgVar == rcg.a || (rcgVar == rcg.b && i == 0))) {
                        break;
                    }
                    if (i == 0) {
                        boolean z = this.v;
                        Object objPoll = lkd0Var.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            Throwable thB = otg.b(z11Var);
                            if (thB == null) {
                                kfyVar.onComplete();
                                return;
                            } else {
                                kfyVar.onError(thB);
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                dw90<? extends R> dw90VarApply = this.b.apply(objPoll);
                                yby.b(dw90VarApply, "The mapper returned a null SingleSource");
                                dw90<? extends R> dw90Var = dw90VarApply;
                                this.z = 1;
                                dw90Var.a(this.d);
                            } catch (Throwable th) {
                                qtg.a(th);
                                this.i.dispose();
                                lkd0Var.clear();
                                otg.a(z11Var, th);
                                kfyVar.onError(otg.b(z11Var));
                                return;
                            }
                        }
                    } else if (i == 2) {
                        R r = this.y;
                        this.y = null;
                        kfyVar.onNext(r);
                        this.z = 0;
                    }
                } else {
                    lkd0Var.clear();
                    this.y = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            lkd0Var.clear();
            this.y = null;
            kfyVar.onError(otg.b(z11Var));
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.w = true;
            this.i.dispose();
            C1286a<R> c1286a = this.d;
            c1286a.getClass();
            xse.a(c1286a);
            if (getAndIncrement() == 0) {
                this.e.clear();
                this.y = null;
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.w;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.v = true;
            a();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            z11 z11Var = this.c;
            z11Var.getClass();
            if (!otg.a(z11Var, th)) {
                o760.b(th);
                return;
            }
            if (this.f == rcg.a) {
                C1286a<R> c1286a = this.d;
                c1286a.getClass();
                xse.a(c1286a);
            }
            this.v = true;
            a();
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            this.e.offer(t);
            a();
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.i, pseVar)) {
                this.i = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public xcy(ady adyVar, dle0 dle0Var) {
        this.a = adyVar;
        this.b = dle0Var;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super R> kfyVar) {
        dw90 dw90Var;
        f2g f2gVar = f2g.a;
        dey deyVar = this.a;
        boolean z = deyVar instanceof Callable;
        dle0 dle0Var = this.b;
        if (!z) {
            deyVar.a(new a(kfyVar, dle0Var, this.d, this.c));
            return;
        }
        try {
            Object objCall = ((Callable) deyVar).call();
            if (objCall != null) {
                Object objApply = dle0Var.apply(objCall);
                yby.b(objApply, "The mapper returned a null SingleSource");
                dw90Var = (dw90) objApply;
            } else {
                dw90Var = null;
            }
            if (dw90Var != null) {
                dw90Var.a(new gw90.a(kfyVar));
            } else {
                kfyVar.onSubscribe(f2gVar);
                kfyVar.onComplete();
            }
        } catch (Throwable th) {
            qtg.a(th);
            kfyVar.onSubscribe(f2gVar);
            kfyVar.onError(th);
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class fey<T, R> extends j4<T, R> {
    public final zw4 b;
    public final int c;

    public static final class a<T, R> extends AtomicReference<pse> implements kfy<R> {
        public final b<T, R> a;
        public final long b;
        public final int c;
        public volatile lk90<R> d;
        public volatile boolean e;

        public a(b<T, R> bVar, long j, int i) {
            this.a = bVar;
            this.b = j;
            this.c = i;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.b == this.a.w) {
                this.e = true;
                this.a.b();
            }
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            b<T, R> bVar = this.a;
            bVar.getClass();
            if (this.b != bVar.w || !otg.a(bVar.d, th)) {
                o760.b(th);
                return;
            }
            bVar.i.dispose();
            bVar.e = true;
            this.e = true;
            bVar.b();
        }

        @Override // defpackage.kfy
        public final void onNext(R r) {
            if (this.b == this.a.w) {
                if (r != null) {
                    this.d.offer(r);
                }
                this.a.b();
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.d(this, pseVar)) {
                if (pseVar instanceof gb30) {
                    gb30 gb30Var = (gb30) pseVar;
                    int iB = gb30Var.b(7);
                    if (iB == 1) {
                        this.d = gb30Var;
                        this.e = true;
                        this.a.b();
                        return;
                    } else if (iB == 2) {
                        this.d = gb30Var;
                        return;
                    }
                }
                this.d = new lkd0(this.c);
            }
        }
    }

    public static final class b<T, R> extends AtomicInteger implements kfy<T>, pse {
        public static final a<Object, Object> y;
        public final kfy<? super R> a;
        public final faj<? super T, ? extends dey<? extends R>> b;
        public final int c;
        public volatile boolean e;
        public volatile boolean f;
        public pse i;
        public volatile long w;
        public final AtomicReference<a<T, R>> v = new AtomicReference<>();
        public final z11 d = new z11();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            y = aVar;
            xse.a(aVar);
        }

        public b(kfy kfyVar, zw4 zw4Var, int i) {
            this.a = kfyVar;
            this.b = zw4Var;
            this.c = i;
        }

        public final void a() {
            a<T, R> andSet;
            AtomicReference<a<T, R>> atomicReference = this.v;
            a<T, R> aVar = atomicReference.get();
            a<Object, Object> aVar2 = y;
            if (aVar == aVar2 || (andSet = atomicReference.getAndSet((a<T, R>) aVar2)) == aVar2 || andSet == null) {
                return;
            }
            xse.a(andSet);
        }

        /* JADX WARN: Code duplicated, block: B:92:0x00e2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x000e A[SYNTHETIC] */
        public final void b() {
            lk90<R> lk90Var;
            a030 a030VarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            kfy<? super R> kfyVar = this.a;
            AtomicReference<a<T, R>> atomicReference = this.v;
            int iAddAndGet = 1;
            while (!this.f) {
                if (this.e) {
                    boolean z = atomicReference.get() == null;
                    if (this.d.get() != null) {
                        kfyVar.onError(otg.b(this.d));
                        return;
                    } else if (z) {
                        kfyVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = atomicReference.get();
                if (aVar != null && (lk90Var = aVar.d) != null) {
                    if (aVar.e) {
                        boolean zIsEmpty = lk90Var.isEmpty();
                        if (this.d.get() != null) {
                            kfyVar.onError(otg.b(this.d));
                            return;
                        } else if (zIsEmpty) {
                            while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                            }
                        }
                    }
                    boolean z2 = false;
                    while (!this.f) {
                        if (aVar == atomicReference.get()) {
                            if (this.d.get() != null) {
                                kfyVar.onError(otg.b(this.d));
                                return;
                            }
                            boolean z3 = aVar.e;
                            try {
                                a030VarPoll = lk90Var.poll();
                            } catch (Throwable th) {
                                qtg.a(th);
                                otg.a(this.d, th);
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                                a();
                                this.i.dispose();
                                this.e = true;
                                z2 = true;
                                a030VarPoll = null;
                            }
                            boolean z4 = a030VarPoll == null;
                            if (z3 && z4) {
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                            } else if (!z4) {
                                kfyVar.onNext(a030VarPoll);
                            }
                            if (z2) {
                                continue;
                            }
                        }
                        z2 = true;
                        if (z2) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.i.dispose();
            a();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.f;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            b();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            if (this.e || !otg.a(this.d, th)) {
                o760.b(th);
                return;
            }
            a();
            this.e = true;
            b();
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            long j = this.w + 1;
            this.w = j;
            a<T, R> aVar = this.v.get();
            if (aVar != null) {
                xse.a(aVar);
            }
            try {
                dey<? extends R> deyVarApply = this.b.apply(t);
                yby.b(deyVarApply, "The ObservableSource returned is null");
                dey<? extends R> deyVar = deyVarApply;
                a<T, R> aVar2 = new a<>(this, j, this.c);
                while (true) {
                    a<T, R> aVar3 = this.v.get();
                    if (aVar3 == y) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.v;
                    do {
                        if (atomicReference.compareAndSet(aVar3, aVar2)) {
                            deyVar.a(aVar2);
                            return;
                        }
                    } while (atomicReference.get() == aVar3);
                }
            } catch (Throwable th) {
                qtg.a(th);
                this.i.dispose();
                onError(th);
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.i, pseVar)) {
                this.i = pseVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public fey(l830 l830Var, zw4 zw4Var, int i) {
        super(l830Var);
        this.b = zw4Var;
        this.c = i;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super R> kfyVar) {
        dey<T> deyVar = this.a;
        zw4 zw4Var = this.b;
        if (zdy.a(deyVar, kfyVar, zw4Var)) {
            return;
        }
        deyVar.a(new b(kfyVar, zw4Var, this.c));
    }
}

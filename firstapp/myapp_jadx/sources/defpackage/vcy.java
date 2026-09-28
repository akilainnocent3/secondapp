package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class vcy<T, R> extends ucy<R> {
    public final dey<? extends T>[] a;
    public final faj<? super Object[], ? extends R> b;
    public final int c;

    public static final class a<T, R> extends AtomicReference<pse> implements kfy<T> {
        public final b<T, R> a;
        public final int b;

        public a(b<T, R> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
        @Override // defpackage.kfy
        public final void onComplete() {
            b<T, R> bVar = this.a;
            int i = this.b;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.d;
                    if (objArr == null) {
                        return;
                    }
                    boolean z = objArr[i] == null;
                    if (z) {
                        bVar.i = true;
                    } else {
                        int i2 = bVar.y + 1;
                        bVar.y = i2;
                        if (i2 == objArr.length) {
                            bVar.i = true;
                        }
                    }
                    if (z) {
                        bVar.a();
                    }
                    bVar.c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            b<T, R> bVar = this.a;
            z11 z11Var = bVar.v;
            z11Var.getClass();
            if (!otg.a(z11Var, th)) {
                o760.b(th);
            } else {
                bVar.a();
                bVar.c();
            }
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
            boolean z;
            b<T, R> bVar = this.a;
            int i = this.b;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i];
                    int i2 = bVar.w;
                    if (obj == null) {
                        i2++;
                        bVar.w = i2;
                    }
                    objArr[i] = t;
                    if (i2 == objArr.length) {
                        bVar.e.offer((Object[]) objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        bVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            xse.d(this, pseVar);
        }
    }

    public static final class b<T, R> extends AtomicInteger implements pse {
        public final kfy<? super R> a;
        public final faj<? super Object[], ? extends R> b;
        public final a<T, R>[] c;
        public Object[] d;
        public final lkd0<Object[]> e;
        public volatile boolean f;
        public volatile boolean i;
        public final z11 v = new z11();
        public int w;
        public int y;

        public b(kfy kfyVar, faj fajVar, int i, int i2) {
            this.a = kfyVar;
            this.b = fajVar;
            this.d = new Object[i];
            a<T, R>[] aVarArr = new a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new a<>(this, i3);
            }
            this.c = aVarArr;
            this.e = new lkd0<>(i2);
        }

        public final void a() {
            for (a<T, R> aVar : this.c) {
                aVar.getClass();
                xse.a(aVar);
            }
        }

        public final void b(lkd0<?> lkd0Var) {
            synchronized (this) {
                this.d = null;
            }
            lkd0Var.clear();
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            lkd0<Object[]> lkd0Var = this.e;
            kfy<? super R> kfyVar = this.a;
            int iAddAndGet = 1;
            while (!this.f) {
                if (this.v.get() != null) {
                    a();
                    b(lkd0Var);
                    z11 z11Var = this.v;
                    z11Var.getClass();
                    kfyVar.onError(otg.b(z11Var));
                    return;
                }
                boolean z = this.i;
                Object[] objArrPoll = lkd0Var.poll();
                boolean z2 = objArrPoll == null;
                if (z && z2) {
                    b(lkd0Var);
                    z11 z11Var2 = this.v;
                    z11Var2.getClass();
                    Throwable thB = otg.b(z11Var2);
                    if (thB == null) {
                        kfyVar.onComplete();
                        return;
                    } else {
                        kfyVar.onError(thB);
                        return;
                    }
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rApply = this.b.apply(objArrPoll);
                        yby.b(rApply, "The combiner returned a null value");
                        kfyVar.onNext(rApply);
                    } catch (Throwable th) {
                        qtg.a(th);
                        z11 z11Var3 = this.v;
                        z11Var3.getClass();
                        otg.a(z11Var3, th);
                        a();
                        b(lkd0Var);
                        z11 z11Var4 = this.v;
                        z11Var4.getClass();
                        kfyVar.onError(otg.b(z11Var4));
                        return;
                    }
                }
            }
            b(lkd0Var);
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.e);
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.f;
        }
    }

    public vcy(dey[] deyVarArr, faj fajVar, int i) {
        this.a = deyVarArr;
        this.b = fajVar;
        this.c = i;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super R> kfyVar) {
        dey<? extends T>[] deyVarArr = this.a;
        deyVarArr.getClass();
        int length = deyVarArr.length;
        if (length == 0) {
            kfyVar.onSubscribe(f2g.a);
            kfyVar.onComplete();
            return;
        }
        b bVar = new b(kfyVar, this.b, length, this.c);
        a<T, R>[] aVarArr = bVar.c;
        int length2 = aVarArr.length;
        bVar.a.onSubscribe(bVar);
        for (int i = 0; i < length2 && !bVar.i && !bVar.f; i++) {
            deyVarArr[i].a(aVarArr[i]);
        }
    }
}

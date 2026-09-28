package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class l3i<T> extends r2i<T> {
    public final j3i b;
    public final int c = 1;
    public a d;

    public static final class a extends AtomicReference<pse> implements Runnable, pya<pse> {
        public final l3i<?> a;
        public long b;
        public boolean c;
        public boolean d;

        public a(l3i<?> l3iVar) {
            this.a = l3iVar;
        }

        @Override // defpackage.pya
        public final void accept(pse pseVar) {
            pse pseVar2 = pseVar;
            xse.c(this, pseVar2);
            synchronized (this.a) {
                try {
                    if (this.d) {
                        this.a.b.b(pseVar2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.m(this);
        }
    }

    public static final class b<T> extends AtomicBoolean implements n3i<T>, bee0 {
        public final zde0<? super T> a;
        public final l3i<T> b;
        public final a c;
        public bee0 d;

        public b(zde0<? super T> zde0Var, l3i<T> l3iVar, a aVar) {
            this.a = zde0Var;
            this.b = l3iVar;
            this.c = aVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.d, bee0Var)) {
                this.d = bee0Var;
                this.a.a(this);
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.d.cancel();
            if (compareAndSet(false, true)) {
                l3i<T> l3iVar = this.b;
                a aVar = this.c;
                synchronized (l3iVar) {
                    try {
                        a aVar2 = l3iVar.d;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j = aVar.b - 1;
                            aVar.b = j;
                            if (j == 0 && aVar.c) {
                                l3iVar.m(aVar);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.b.l(this.c);
                this.a.onComplete();
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                o760.b(th);
            } else {
                this.b.l(this.c);
                this.a.onError(th);
            }
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            this.d.request(j);
        }
    }

    public l3i(j3i j3iVar) {
        this.b = j3iVar;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        a aVar;
        boolean z;
        j3i.b<T> bVar;
        synchronized (this) {
            try {
                aVar = this.d;
                if (aVar == null) {
                    aVar = new a(this);
                    this.d = aVar;
                }
                long j = aVar.b + 1;
                aVar.b = j;
                if (aVar.c || j != this.c) {
                    z = false;
                } else {
                    aVar.c = true;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.h(new b(zde0Var, this, aVar));
        if (z) {
            j3i j3iVar = this.b;
            AtomicReference<j3i.b<T>> atomicReference = j3iVar.d;
            loop0: while (true) {
                bVar = atomicReference.get();
                if (bVar != null && !bVar.isDisposed()) {
                    break;
                }
                j3i.b<T> bVar2 = new j3i.b<>(atomicReference, j3iVar.c);
                do {
                    if (atomicReference.compareAndSet(bVar, bVar2)) {
                        bVar = bVar2;
                        break loop0;
                    }
                } while (atomicReference.get() == bVar);
            }
            AtomicBoolean atomicBoolean = bVar.c;
            boolean z2 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
            try {
                aVar.accept(bVar);
                if (z2) {
                    j3iVar.b.c(bVar);
                }
            } catch (Throwable th2) {
                qtg.a(th2);
                throw otg.c(th2);
            }
        }
    }

    public final void l(a aVar) {
        synchronized (this) {
            try {
                sf50 sf50Var = this.b;
                boolean z = sf50Var instanceof k3i;
                a aVar2 = this.d;
                if (z) {
                    if (aVar2 != null && aVar2 == aVar) {
                        this.d = null;
                    }
                    long j = aVar.b - 1;
                    aVar.b = j;
                    if (j == 0) {
                        if (sf50Var instanceof pse) {
                            ((pse) sf50Var).dispose();
                        } else if (sf50Var != null) {
                            sf50Var.b(aVar.get());
                        }
                    }
                } else if (aVar2 != null && aVar2 == aVar) {
                    long j2 = aVar.b - 1;
                    aVar.b = j2;
                    if (j2 == 0) {
                        this.d = null;
                        if (sf50Var instanceof pse) {
                            ((pse) sf50Var).dispose();
                        } else if (sf50Var != null) {
                            sf50Var.b(aVar.get());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(a aVar) {
        synchronized (this) {
            try {
                if (aVar.b == 0 && aVar == this.d) {
                    this.d = null;
                    pse pseVar = aVar.get();
                    xse.a(aVar);
                    sf50 sf50Var = this.b;
                    if (sf50Var instanceof pse) {
                        ((pse) sf50Var).dispose();
                    } else if (sf50Var != null) {
                        if (pseVar == null) {
                            aVar.d = true;
                        } else {
                            sf50Var.b(pseVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

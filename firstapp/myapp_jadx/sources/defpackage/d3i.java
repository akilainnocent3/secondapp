package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class d3i<T> extends e3<T, T> {
    public final long c;
    public final ib d;
    public final pt1 e;

    public static final class a<T> extends AtomicInteger implements n3i<T>, bee0 {
        public final zde0<? super T> a;
        public final ib b;
        public final pt1 c;
        public final long d;
        public final AtomicLong e = new AtomicLong();
        public final ArrayDeque f = new ArrayDeque();
        public bee0 i;
        public volatile boolean v;
        public volatile boolean w;
        public Throwable y;

        public a(zde0<? super T> zde0Var, ib ibVar, pt1 pt1Var, long j) {
            this.a = zde0Var;
            this.b = ibVar;
            this.c = pt1Var;
            this.d = j;
        }

        public static void b(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.i, bee0Var)) {
                this.i = bee0Var;
                this.a.a(this);
                bee0Var.request(Long.MAX_VALUE);
            }
        }

        public final void c() {
            boolean zIsEmpty;
            a03 a03Var;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f;
            zde0<? super T> zde0Var = this.a;
            int iAddAndGet = 1;
            do {
                long j = this.e.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.v) {
                        b(arrayDeque);
                        return;
                    }
                    boolean z = this.w;
                    synchronized (arrayDeque) {
                        a03Var = (Object) arrayDeque.poll();
                    }
                    boolean z2 = a03Var == null;
                    if (z) {
                        Throwable th = this.y;
                        if (th != null) {
                            b(arrayDeque);
                            zde0Var.onError(th);
                            return;
                        } else if (z2) {
                            zde0Var.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    zde0Var.onNext(a03Var);
                    j2++;
                }
                if (j2 == j) {
                    if (this.v) {
                        b(arrayDeque);
                        return;
                    }
                    boolean z3 = this.w;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.y;
                        if (th2 != null) {
                            b(arrayDeque);
                            zde0Var.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            zde0Var.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    ot1.e(this.e, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.v = true;
            this.i.cancel();
            if (getAndIncrement() == 0) {
                b(this.f);
            }
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.w = true;
            c();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.w) {
                o760.b(th);
                return;
            }
            this.y = th;
            this.w = true;
            c();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.w) {
                return;
            }
            ArrayDeque arrayDeque = this.f;
            synchronized (arrayDeque) {
                try {
                    z = false;
                    if (arrayDeque.size() == this.d) {
                        int iOrdinal = this.c.ordinal();
                        z2 = true;
                        if (iOrdinal == 1) {
                            arrayDeque.poll();
                            arrayDeque.offer(t);
                        } else if (iOrdinal == 2) {
                            arrayDeque.pollLast();
                            arrayDeque.offer(t);
                        }
                        z2 = false;
                        z = true;
                    } else {
                        arrayDeque.offer(t);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                if (!z2) {
                    c();
                    return;
                } else {
                    this.i.cancel();
                    onError(new sqv());
                    return;
                }
            }
            ib ibVar = this.b;
            if (ibVar != null) {
                try {
                    ibVar.run();
                } catch (Throwable th2) {
                    qtg.a(th2);
                    this.i.cancel();
                    onError(th2);
                }
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this.e, j);
                c();
            }
        }
    }

    public d3i(r2i r2iVar, ib ibVar) {
        super(r2iVar);
        this.c = 128L;
        this.d = ibVar;
        this.e = pt1.a;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(zde0Var, this.d, this.e, this.c));
    }
}

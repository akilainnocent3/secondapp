package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class c3i<T> extends e3<T, T> {
    public final int c;
    public final boolean d;
    public final taj.d e;

    public static final class a<T> extends m92<T> implements n3i<T> {
        public final zde0<? super T> a;
        public final gk90<T> b;
        public final ib c;
        public bee0 d;
        public volatile boolean e;
        public volatile boolean f;
        public Throwable i;
        public final AtomicLong v = new AtomicLong();
        public boolean w;

        public a(zde0 zde0Var, int i, boolean z, taj.d dVar) {
            this.a = zde0Var;
            this.c = dVar;
            this.b = z ? new lkd0<>(i) : new kkd0<>(i);
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.d, bee0Var)) {
                this.d = bee0Var;
                this.a.a(this);
                bee0Var.request(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            this.w = true;
            return 2;
        }

        public final boolean c(boolean z, boolean z2, zde0<? super T> zde0Var) {
            if (this.e) {
                this.b.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.i;
            if (th != null) {
                this.b.clear();
                zde0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            zde0Var.onComplete();
            return true;
        }

        @Override // defpackage.bee0
        public final void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.d.cancel();
            if (this.w || getAndIncrement() != 0) {
                return;
            }
            this.b.clear();
        }

        @Override // defpackage.lk90
        public final void clear() {
            this.b.clear();
        }

        public final void e() {
            if (getAndIncrement() == 0) {
                gk90<T> gk90Var = this.b;
                zde0<? super T> zde0Var = this.a;
                int iAddAndGet = 1;
                while (!c(this.f, gk90Var.isEmpty(), zde0Var)) {
                    long j = this.v.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f;
                        T tPoll = gk90Var.poll();
                        boolean z2 = tPoll == null;
                        if (c(z, z2, zde0Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        zde0Var.onNext(tPoll);
                        j2++;
                    }
                    if (j2 == j && c(this.f, gk90Var.isEmpty(), zde0Var)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.v.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.f = true;
            if (this.w) {
                this.a.onComplete();
            } else {
                e();
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            this.i = th;
            this.f = true;
            if (this.w) {
                this.a.onError(th);
            } else {
                e();
            }
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.b.offer(t)) {
                if (this.w) {
                    this.a.onNext(null);
                    return;
                } else {
                    e();
                    return;
                }
            }
            this.d.cancel();
            sqv sqvVar = new sqv("Buffer is full");
            try {
                this.c.run();
            } catch (Throwable th) {
                qtg.a(th);
                sqvVar.initCause(th);
            }
            onError(sqvVar);
        }

        @Override // defpackage.lk90
        public final T poll() {
            return this.b.poll();
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (this.w || !gee0.e(j)) {
                return;
            }
            ot1.a(this.v, j);
            e();
        }
    }

    public c3i(x2i x2iVar, int i) {
        super(x2iVar);
        this.c = i;
        this.d = true;
        this.e = taj.c;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(zde0Var, this.c, this.d, this.e));
    }
}

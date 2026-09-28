package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class g3i<T> extends e3<T, T> {

    public static final class a<T> extends AtomicInteger implements n3i<T>, bee0 {
        public final zde0<? super T> a;
        public bee0 b;
        public volatile boolean c;
        public Throwable d;
        public volatile boolean e;
        public final AtomicLong f = new AtomicLong();
        public final AtomicReference<T> i = new AtomicReference<>();

        public a(zde0<? super T> zde0Var) {
            this.a = zde0Var;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.b, bee0Var)) {
                this.b = bee0Var;
                this.a.a(this);
                bee0Var.request(Long.MAX_VALUE);
            }
        }

        public final boolean b(boolean z, boolean z2, zde0<?> zde0Var, AtomicReference<T> atomicReference) {
            if (this.e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.d;
            if (th != null) {
                atomicReference.lazySet(null);
                zde0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            zde0Var.onComplete();
            return true;
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            zde0<? super T> zde0Var = this.a;
            AtomicLong atomicLong = this.f;
            AtomicReference<T> atomicReference = this.i;
            int iAddAndGet = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.c;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (b(z, z2, zde0Var, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    zde0Var.onNext(andSet);
                    j++;
                }
                if (j == atomicLong.get()) {
                    if (b(this.c, atomicReference.get() == null, zde0Var, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    ot1.e(atomicLong, j);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // defpackage.bee0
        public final void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.b.cancel();
            if (getAndIncrement() == 0) {
                this.i.lazySet(null);
            }
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.c = true;
            c();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            this.d = th;
            this.c = true;
            c();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            this.i.lazySet(t);
            c();
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this.f, j);
                c();
            }
        }
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(zde0Var));
    }
}

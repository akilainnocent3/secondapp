package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class c9e0<T> extends AtomicInteger implements n3i<T>, bee0 {
    public final zde0<? super T> a;
    public final z11 b = new z11();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference<bee0> d = new AtomicReference<>();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    public c9e0(zde0<? super T> zde0Var) {
        this.a = zde0Var;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (this.e.compareAndSet(false, true)) {
            this.a.a(this);
            gee0.c(this.d, this.c, bee0Var);
        } else {
            bee0Var.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // defpackage.bee0
    public final void cancel() {
        if (this.f) {
            return;
        }
        gee0.a(this.d);
    }

    @Override // defpackage.zde0
    public final void onComplete() {
        this.f = true;
        zde0<? super T> zde0Var = this.a;
        z11 z11Var = this.b;
        if (getAndIncrement() == 0) {
            Throwable thB = otg.b(z11Var);
            if (thB != null) {
                zde0Var.onError(thB);
            } else {
                zde0Var.onComplete();
            }
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        this.f = true;
        zde0<? super T> zde0Var = this.a;
        z11 z11Var = this.b;
        if (!otg.a(z11Var, th)) {
            o760.b(th);
        } else if (getAndIncrement() == 0) {
            zde0Var.onError(otg.b(z11Var));
        }
    }

    @Override // defpackage.zde0
    public final void onNext(T t) {
        if (get() == 0 && compareAndSet(0, 1)) {
            zde0<? super T> zde0Var = this.a;
            zde0Var.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable thB = otg.b(this.b);
                if (thB != null) {
                    zde0Var.onError(thB);
                } else {
                    zde0Var.onComplete();
                }
            }
        }
    }

    @Override // defpackage.bee0
    public final void request(long j) {
        if (j > 0) {
            gee0.b(this.d, this.c, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(avg.a(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}

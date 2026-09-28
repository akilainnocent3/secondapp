package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class f3i<T> extends e3<T, T> {

    public static final class a<T> extends AtomicLong implements n3i<T>, bee0 {
        public final zde0<? super T> a;
        public bee0 b;
        public boolean c;

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

        @Override // defpackage.bee0
        public final void cancel() {
            this.b.cancel();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.onComplete();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            if (this.c) {
                o760.b(th);
            } else {
                this.c = true;
                this.a.onError(th);
            }
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.c) {
                return;
            }
            if (get() != 0) {
                this.a.onNext(t);
                ot1.e(this, 1L);
            } else {
                this.b.cancel();
                onError(new sqv("could not emit value due to lack of requests"));
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            if (gee0.e(j)) {
                ot1.a(this, j);
            }
        }
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        this.b.h(new a(zde0Var));
    }
}

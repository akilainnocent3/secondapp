package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ycy<T> extends ucy<T> {
    public final ydy<T> a;

    public static final class a<T> extends AtomicReference<pse> implements pse {
        public final kfy<? super T> a;

        public a(kfy<? super T> kfyVar) {
            this.a = kfyVar;
        }

        public final void a() {
            if (isDisposed()) {
                return;
            }
            try {
                this.a.onComplete();
            } finally {
                xse.a(this);
            }
        }

        public final void b(T t) {
            if (t != null) {
                if (isDisposed()) {
                    return;
                }
                this.a.onNext(t);
            } else {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (c(nullPointerException)) {
                    return;
                }
                o760.b(nullPointerException);
            }
        }

        public final boolean c(Throwable th) {
            if (isDisposed()) {
                return false;
            }
            try {
                this.a.onError(th);
                return true;
            } finally {
                xse.a(this);
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            xse.a(this);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return xse.b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return lx5.a(a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public ycy(ydy<T> ydyVar) {
        this.a = ydyVar;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        a aVar = new a(kfyVar);
        kfyVar.onSubscribe(aVar);
        try {
            this.a.a(aVar);
        } catch (Throwable th) {
            qtg.a(th);
            if (aVar.c(th)) {
                return;
            }
            o760.b(th);
        }
    }
}

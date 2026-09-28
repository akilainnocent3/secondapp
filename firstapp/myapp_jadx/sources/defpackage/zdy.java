package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class zdy {

    public static final class a<T> extends AtomicInteger implements gb30<T>, Runnable {
        public final kfy<? super T> a;
        public final T b;

        public a(kfy<? super T> kfyVar, T t) {
            this.a = kfyVar;
            this.b = t;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            lazySet(1);
            return 1;
        }

        @Override // defpackage.lk90
        public final void clear() {
            lazySet(3);
        }

        @Override // defpackage.pse
        public final void dispose() {
            set(3);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return get() == 3;
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // defpackage.lk90
        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // defpackage.lk90
        public final T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                T t = this.b;
                kfy<? super T> kfyVar = this.a;
                kfyVar.onNext(t);
                if (get() == 2) {
                    lazySet(3);
                    kfyVar.onComplete();
                }
            }
        }
    }

    public static final class b<T, R> extends ucy<R> {
        public final T a;
        public final faj<? super T, ? extends dey<? extends R>> b;

        public b(T t, faj<? super T, ? extends dey<? extends R>> fajVar) {
            this.a = t;
            this.b = fajVar;
        }

        @Override // defpackage.ucy
        public final void g(kfy<? super R> kfyVar) {
            f2g f2gVar = f2g.a;
            try {
                dey<? extends R> deyVarApply = this.b.apply(this.a);
                yby.b(deyVarApply, "The mapper returned a null ObservableSource");
                dey<? extends R> deyVar = deyVarApply;
                if (!(deyVar instanceof Callable)) {
                    deyVar.a(kfyVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) deyVar).call();
                    if (objCall == null) {
                        kfyVar.onSubscribe(f2gVar);
                        kfyVar.onComplete();
                    } else {
                        a aVar = new a(kfyVar, objCall);
                        kfyVar.onSubscribe(aVar);
                        aVar.run();
                    }
                } catch (Throwable th) {
                    qtg.a(th);
                    kfyVar.onSubscribe(f2gVar);
                    kfyVar.onError(th);
                }
            } catch (Throwable th2) {
                kfyVar.onSubscribe(f2gVar);
                kfyVar.onError(th2);
            }
        }
    }

    public static <T, R> boolean a(dey<T> deyVar, kfy<? super R> kfyVar, faj<? super T, ? extends dey<? extends R>> fajVar) {
        f2g f2gVar = f2g.a;
        if (!(deyVar instanceof Callable)) {
            return false;
        }
        try {
            a03 a03Var = (Object) ((Callable) deyVar).call();
            if (a03Var == null) {
                kfyVar.onSubscribe(f2gVar);
                kfyVar.onComplete();
                return true;
            }
            try {
                dey<? extends R> deyVarApply = fajVar.apply(a03Var);
                yby.b(deyVarApply, "The mapper returned a null ObservableSource");
                dey<? extends R> deyVar2 = deyVarApply;
                if (!(deyVar2 instanceof Callable)) {
                    deyVar2.a(kfyVar);
                    return true;
                }
                try {
                    Object objCall = ((Callable) deyVar2).call();
                    if (objCall == null) {
                        kfyVar.onSubscribe(f2gVar);
                        kfyVar.onComplete();
                        return true;
                    }
                    a aVar = new a(kfyVar, objCall);
                    kfyVar.onSubscribe(aVar);
                    aVar.run();
                    return true;
                } catch (Throwable th) {
                    qtg.a(th);
                    kfyVar.onSubscribe(f2gVar);
                    kfyVar.onError(th);
                    return true;
                }
            } catch (Throwable th2) {
                qtg.a(th2);
                kfyVar.onSubscribe(f2gVar);
                kfyVar.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            qtg.a(th3);
            kfyVar.onSubscribe(f2gVar);
            kfyVar.onError(th3);
            return true;
        }
    }
}

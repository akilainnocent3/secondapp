package defpackage;

import com.sportybet.android.data.GetBonusResult;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class taj {
    public static final h a = new h();
    public static final g b = new g();
    public static final d c = new d();
    public static final e d = new e();
    public static final j e = new j();
    public static final f f = new f();
    public static final k g = new k();

    public static final class a<T1, T2, R> implements faj<Object[], R> {
        public final k54<? super T1, ? super T2, ? extends R> a;

        public a(k54<? super T1, ? super T2, ? extends R> k54Var) {
            this.a = k54Var;
        }

        @Override // defpackage.faj
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 2) {
                dwi.a(objArr2.length, "Array of size 2 expected but got ");
                return null;
            }
            return this.a.apply(objArr2[0], objArr2[1]);
        }
    }

    public static final class b<T1, T2, T3, R> implements faj<Object[], R> {
        public final q23 a;

        public b(q23 q23Var) {
            this.a = q23Var;
        }

        @Override // defpackage.faj
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                dwi.a(objArr2.length, "Array of size 3 expected but got ");
                return null;
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            p23 p23Var = this.a.a;
            int i = BetSlipFooter.j0;
            obj.getClass();
            obj2.getClass();
            obj3.getClass();
            return (bxg0) p23Var.invoke(obj, obj2, obj3);
        }
    }

    public static final class c<T, U> implements faj<T, U> {
        @Override // defpackage.faj
        public final U apply(T t) {
            return (U) GetBonusResult.class.cast(t);
        }
    }

    public static final class f implements rjt {
    }

    public static final class i<T, U> implements Callable<U>, faj<T, U> {
        public final IllegalArgumentException a;

        public i(IllegalArgumentException illegalArgumentException) {
            this.a = illegalArgumentException;
        }

        @Override // defpackage.faj
        public final U apply(T t) {
            return (U) this.a;
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return (U) this.a;
        }
    }

    public static final class j implements pya<Throwable> {
        @Override // defpackage.pya
        public final void accept(Throwable th) {
            o760.b(new eoy(th));
        }
    }

    public static final class k implements nm20<Object> {
        @Override // defpackage.nm20
        public final boolean test(Object obj) {
            return true;
        }
    }

    public static final class d implements ib {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // defpackage.ib
        public final void run() {
        }
    }

    public static final class g implements Runnable {
        public final String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static final class e implements pya<Object> {
        public final String toString() {
            return "EmptyConsumer";
        }

        @Override // defpackage.pya
        public final void accept(Object obj) {
        }
    }

    public static final class h implements faj<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // defpackage.faj
        public final Object apply(Object obj) {
            return obj;
        }
    }
}

package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bm50 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "com.sporty.android.common.network.data.ResultsKt$waitResult$2", f = "Results.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a<T> extends tje0 implements Function2<lk50<? extends T>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Boolean> v1bVar) {
            return ((a) create((lk50) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!Intrinsics.g(lk50Var, lk50.b.a));
        }
    }

    @c0d(c = "com.sporty.android.common.network.data.ResultsKt", f = "Results.kt", l = {113}, m = "waitSuccessOrNull", v = 2)
    public static final class b<T> extends x1b {
        public /* synthetic */ Object a;
        public int b;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return bm50.q(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "com.sporty.android.common.network.data.ResultsKt$waitSuccessOrNull$result$1", f = "Results.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c<T> extends tje0 implements Function2<lk50<? extends T>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(2, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Boolean> v1bVar) {
            return ((c) create((lk50) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!Intrinsics.g(lk50Var, lk50.b.a));
        }
    }

    public static yzh a(lyh lyhVar) {
        ResourceUiText resourceUiText = vch0.b;
        lyhVar.getClass();
        resourceUiText.getClass();
        return new yzh(new xzh(new fl50(lyhVar), new il50(2, null)), new kl50(resourceUiText, null));
    }

    public static final yzh b(lyh lyhVar, ResourceUiText resourceUiText) {
        lyhVar.getClass();
        resourceUiText.getClass();
        return new yzh(new xzh(new ml50(lyhVar), new nl50(2, null)), new ol50(resourceUiText, null));
    }

    public static final yzh c(lyh lyhVar, ResourceUiText resourceUiText) {
        lyhVar.getClass();
        resourceUiText.getClass();
        return new yzh(new xzh(new pl50(lyhVar), new ql50(2, null)), new rl50(resourceUiText, null));
    }

    public static final sl50 d(lyh lyhVar) {
        lyhVar.getClass();
        return new sl50(lyhVar);
    }

    public static final wl50 e(wl50 wl50Var) {
        return new wl50(new tl50(wl50Var), new el50());
    }

    public static final vl50 f(lyh lyhVar) {
        lyhVar.getClass();
        return new vl50(new ul50(lyhVar));
    }

    public static final Integer g(lk50.a aVar) {
        aVar.getClass();
        SprThrowable sprThrowableH = h(aVar);
        if (sprThrowableH != null) {
            return Integer.valueOf(sprThrowableH.getD());
        }
        return null;
    }

    public static final SprThrowable h(lk50<?> lk50Var) {
        lk50Var.getClass();
        if (!(lk50Var instanceof lk50.a)) {
            return null;
        }
        Throwable th = ((lk50.a) lk50Var).a;
        if (th instanceof SprThrowable) {
            return (SprThrowable) th;
        }
        return null;
    }

    public static final <T> T i(lk50<? extends T> lk50Var) {
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    public static final SprThrowable j(lk50<?> lk50Var, int i) {
        lk50Var.getClass();
        SprThrowable sprThrowableH = h(lk50Var);
        if (sprThrowableH == null || sprThrowableH.getD() != i) {
            return null;
        }
        return sprThrowableH;
    }

    public static final <T> boolean k(lk50.c<? extends T> cVar, long j) {
        cVar.getClass();
        return j != 0 && System.currentTimeMillis() - cVar.b > j;
    }

    public static final <T, R> lk50<R> l(lk50<? extends T> lk50Var, Function1<? super T, ? extends R> function1) {
        lk50Var.getClass();
        if (lk50Var instanceof lk50.c) {
            try {
                return new lk50.c(function1.invoke(((lk50.c) lk50Var).a));
            } catch (Throwable th) {
                return new lk50.a(th);
            }
        }
        if (lk50Var instanceof lk50.a) {
            lk50.a aVar = (lk50.a) lk50Var;
            return new lk50.a(aVar.a, aVar.b);
        }
        lk50.b bVar = lk50.b.a;
        if (lk50Var.equals(bVar)) {
            return bVar;
        }
        uhc.a();
        return null;
    }

    public static final wl50 m(lyh lyhVar, Function1 function1) {
        lyhVar.getClass();
        return new wl50(lyhVar, function1);
    }

    public static final g1i n(yzh yzhVar, Function2 function2) {
        return new g1i(yzhVar, new xl50(function2, null));
    }

    public static or60 o(Function1 function1) {
        ResourceUiText resourceUiText = vch0.b;
        resourceUiText.getClass();
        return new or60(new am50(function1, resourceUiText, null));
    }

    public static final <T> Object p(lyh<? extends lk50<? extends T>> lyhVar, v1b<? super lk50<? extends T>> v1bVar) {
        return s0i.b(lyhVar, new a(2, null), v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object q(lyh<? extends lk50<? extends T>> lyhVar, v1b<? super T> v1bVar) {
        b bVar;
        if (v1bVar instanceof b) {
            bVar = (b) v1bVar;
            int i = bVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.b = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(v1bVar);
            }
        } else {
            bVar = new b(v1bVar);
        }
        Object objB = bVar.a;
        y5b y5bVar = y5b.a;
        int i2 = bVar.b;
        if (i2 == 0) {
            uj50.b(objB);
            c cVar = new c(2, null);
            bVar.b = 1;
            objB = s0i.b(lyhVar, cVar, bVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB);
        }
        lk50 lk50Var = (lk50) objB;
        if (lk50Var instanceof lk50.a) {
            return null;
        }
        lk50Var.getClass();
        return ((lk50.c) lk50Var).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(lyh lyhVar, Function1 function1, x1b x1bVar) throws Throwable {
        cm50 cm50Var;
        if (x1bVar instanceof cm50) {
            cm50Var = (cm50) x1bVar;
            int i = cm50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm50Var.c = i - Integer.MIN_VALUE;
            } else {
                cm50Var = new cm50(x1bVar);
            }
        } else {
            cm50Var = new cm50(x1bVar);
        }
        Object objB = cm50Var.b;
        y5b y5bVar = y5b.a;
        int i2 = cm50Var.c;
        if (i2 == 0) {
            uj50.b(objB);
            dm50 dm50Var = new dm50(2, null);
            cm50Var.a = function1;
            cm50Var.c = 1;
            objB = s0i.b(lyhVar, dm50Var, cm50Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function1 = cm50Var.a;
            uj50.b(objB);
        }
        lk50 lk50Var = (lk50) objB;
        if (!(lk50Var instanceof lk50.a)) {
            lk50Var.getClass();
            return ((lk50.c) lk50Var).a;
        }
        if (function1 != null) {
            throw ((Throwable) function1.invoke(((lk50.a) lk50Var).a));
        }
        throw ((lk50.a) lk50Var).a;
    }
}

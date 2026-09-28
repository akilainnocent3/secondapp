package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lzz implements r4w {
    public final r4w a;
    public final xqr b = new xqr();

    @c0d(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos")
    public static final class a<R> extends x1b {
        public Function1 a;
        public /* synthetic */ Object b;
        public int d;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return lzz.this.P(null, this);
        }
    }

    public lzz(r4w r4wVar) {
        this.a = r4wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.r4w
    public final <R> Object P(Function1<? super Long, ? extends R> function1, v1b<? super R> v1bVar) throws Throwable {
        a aVar;
        boolean z;
        Object objO;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            xqr xqrVar = this.b;
            aVar.a = function1;
            aVar.d = 1;
            synchronized (xqrVar.a) {
                z = xqrVar.d;
            }
            if (z) {
                objO = Unit.a;
            } else {
                bc6 bc6Var = new bc6(1, yzo.b(aVar));
                bc6Var.q();
                synchronized (xqrVar.a) {
                    xqrVar.b.add(bc6Var);
                }
                bc6Var.t(new wqr(xqrVar, bc6Var));
                objO = bc6Var.o();
                if (objO != y5bVar) {
                    objO = Unit.a;
                }
            }
            if (objO != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        function1 = aVar.a;
        uj50.b(obj);
        r4w r4wVar = this.a;
        aVar.a = null;
        aVar.d = 2;
        Object objP = r4wVar.P(function1, aVar);
        return objP == y5bVar ? y5bVar : objP;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke(r, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}

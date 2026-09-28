package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class e77<T> extends u67<T> {
    public final Iterable<lyh<T>> d;

    @c0d(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<T> b;
        public final /* synthetic */ rc80<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(lyh<? extends T> lyhVar, rc80<T> rc80Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = rc80Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.collect(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e77(Iterable<? extends lyh<? extends T>> iterable, CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        super(coroutineContext, i, pb5Var);
        this.d = iterable;
    }

    @Override // defpackage.u67
    public final Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar) {
        rc80 rc80Var = new rc80(ez20Var);
        Iterator<lyh<T>> it = this.d.iterator();
        while (it.hasNext()) {
            ej5.c(ez20Var, null, null, new a(it.next(), rc80Var, null), 3);
        }
        return Unit.a;
    }

    @Override // defpackage.u67
    public final u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new e77(this.d, coroutineContext, i, pb5Var);
    }

    @Override // defpackage.u67
    public final wf40<T> k(v5b v5bVar) {
        Function2 t67Var = new t67(this, null);
        pb5 pb5Var = pb5.a;
        a6b a6bVar = a6b.a;
        dz20 dz20Var = new dz20(g5b.b(v5bVar, this.a), d77.b(this.b, 4, pb5Var));
        dz20Var.n0(a6bVar, dz20Var, t67Var);
        return dz20Var;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class jv5<T> extends v67<T> {
    public final Function2<ez20<? super T>, v1b<? super Unit>, Object> e;

    @c0d(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class a extends x1b {
        public ez20 a;
        public /* synthetic */ Object b;
        public int d;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return jv5.this.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jv5(Function2<? super ez20<? super T>, ? super v1b<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        super(function2, coroutineContext, i, pb5Var);
        this.e = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.v67, defpackage.u67
    public final Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object obj = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            aVar.a = ez20Var;
            aVar.d = 1;
            if (super.f(ez20Var, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ez20Var = aVar.a;
            uj50.b(obj);
        }
        if (ez20Var.m()) {
            return Unit.a;
        }
        ib5.a("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.v67, defpackage.u67
    public final u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new jv5(this.e, coroutineContext, i, pb5Var);
    }
}

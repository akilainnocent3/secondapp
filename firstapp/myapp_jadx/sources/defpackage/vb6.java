package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {33}, m = "invokeSuspend")
public final class vb6 extends tje0 implements Function2<hk90<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e9p c;
    public final /* synthetic */ Function2<hk90<Object>, v1b<? super Unit>, Object> d;

    public static final class a extends qlr implements Function1<Throwable, Unit> {
        public final /* synthetic */ hk90<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hk90<Object> hk90Var) {
            super(1);
            this.a = hk90Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.a.k(null);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb6(e9p e9pVar, Function2 function2, v1b v1bVar) {
        super(2, v1bVar);
        this.c = e9pVar;
        this.d = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vb6 vb6Var = new vb6(this.c, this.d, v1bVar);
        vb6Var.b = obj;
        return vb6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hk90<Object> hk90Var, v1b<? super Unit> v1bVar) {
        return ((vb6) create(hk90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            hk90<Object> hk90Var = (hk90) this.b;
            this.c.invokeOnCompletion(new a(hk90Var));
            this.a = 1;
            if (this.d.invoke(hk90Var, this) == y5bVar) {
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

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.viewmodel.SocketViewModel$observeNonTopicMessages$1", f = "SocketViewModel.kt", l = {460}, m = "invokeSuspend", v = 1)
public final class ioa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ loa0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ loa0 a;

        public a(loa0 loa0Var) {
            this.a = loa0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.H.j((String) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioa0(loa0 loa0Var, v1b<? super ioa0> v1bVar) {
        super(2, v1bVar);
        this.b = loa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ioa0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((ioa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        loa0 loa0Var = this.b;
        b390 b390VarF = loa0Var.b.f();
        a aVar = new a(loa0Var);
        this.a = 1;
        b390VarF.collect(aVar, this);
        return y5bVar;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.ui.animation.AnimationViewModel$init$1", f = "AnimationViewModel.kt", l = {41}, m = "invokeSuspend", v = 1)
public final class dk0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gk0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ gk0 a;

        public a(gk0 gk0Var) {
            this.a = gk0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object objY1 = this.a.y1((yh0) obj, v1bVar);
            return objY1 == y5b.a ? objY1 : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(gk0 gk0Var, v1b<? super dk0> v1bVar) {
        super(2, v1bVar);
        this.b = gk0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dk0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((dk0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        gk0 gk0Var = this.b;
        b390 b390Var = gk0Var.c;
        a aVar = new a(gk0Var);
        this.a = 1;
        b390Var.collect(aVar, this);
        return y5bVar;
    }
}

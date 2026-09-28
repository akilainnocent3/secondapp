package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$confirm$4", f = "MySocialCreationViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class a1x extends tje0 implements Function2<k8a0, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d1x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1x(d1x d1xVar, v1b<? super a1x> v1bVar) {
        super(2, v1bVar);
        this.c = d1xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a1x a1xVar = new a1x(this.c, v1bVar);
        a1xVar.b = obj;
        return a1xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k8a0 k8a0Var, v1b<? super Unit> v1bVar) {
        return ((a1x) create(k8a0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        k8a0 k8a0Var = (k8a0) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.y;
            this.b = null;
            this.a = 1;
            wwd0Var.setValue(k8a0Var);
            if (Unit.a == y5bVar) {
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

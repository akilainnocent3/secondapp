package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$confirm$3", f = "MySocialCreationViewModel.kt", l = {125}, m = "invokeSuspend", v = 2)
public final class z0x extends tje0 implements Function2<myh<? super k8a0>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d1x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0x(d1x d1xVar, v1b<? super z0x> v1bVar) {
        super(2, v1bVar);
        this.b = d1xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z0x(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super k8a0> myhVar, v1b<? super Unit> v1bVar) {
        return ((z0x) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.b.y;
            k8a0.d dVar = k8a0.d.a;
            this.a = 1;
            wwd0Var.setValue(dVar);
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

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$create$1", f = "MySocialCreationViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class b1x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d1x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1x(v1b v1bVar, d1x d1xVar, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = d1xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b1x(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b1x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            d1x d1xVar = this.c;
            String toFollow = d1xVar.w.getToFollow();
            d1xVar.e.getClass();
            String str = this.b;
            k8a0.b bVar = new k8a0.b(str, toFollow, cb.a(str));
            wwd0 wwd0Var = d1xVar.y;
            this.a = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, bVar);
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

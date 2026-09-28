package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$3", f = "LNSearchViewModel.kt", l = {196}, m = "invokeSuspend", v = 2)
public final class gbr extends tje0 implements Function2<pz70, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xbr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbr(xbr xbrVar, v1b<? super gbr> v1bVar) {
        super(2, v1bVar);
        this.b = xbrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gbr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pz70 pz70Var, v1b<? super Unit> v1bVar) {
        return ((gbr) create(pz70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xbr xbrVar = this.b;
            wwd0 wwd0Var = xbrVar.e;
            uf00 uf00VarX1 = xbr.x1((qcn) xbrVar.d.a.getValue());
            this.a = 1;
            wwd0Var.setValue(uf00VarX1);
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

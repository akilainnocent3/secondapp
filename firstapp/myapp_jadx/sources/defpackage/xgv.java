package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initPopupCoordination$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xgv extends tje0 implements Function2<pfv, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgv(rhv rhvVar, v1b<? super xgv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xgv xgvVar = new xgv(this.b, v1bVar);
        xgvVar.a = obj;
        return xgvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pfv pfvVar, v1b<? super Unit> v1bVar) {
        return ((xgv) create(pfvVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        pfv pfvVar = (pfv) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.O;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cgv.a((cgv) value, false, null, null, null, null, null, 0, 0, pfvVar, null, null, false, false, null, 130047)));
        return Unit.a;
    }
}

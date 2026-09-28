package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$triggerResetPasswordFromSettings$1", f = "ResetPwdViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class of50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ nf50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of50(nf50 nf50Var, v1b<? super of50> v1bVar) {
        super(2, v1bVar);
        this.a = nf50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new of50(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((of50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, gxo.a((gxo) value, null, null, true, false, null, false, false, 503)));
        return Unit.a;
    }
}

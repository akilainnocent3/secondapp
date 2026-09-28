package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$onResume$1", f = "SpeiByStpWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gxa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zwa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxa0(zwa0 zwa0Var, v1b<? super gxa0> v1bVar) {
        super(2, v1bVar);
        this.a = zwa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gxa0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gxa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zwa0 zwa0Var = this.a;
        zwa0Var.f.g();
        zwa0Var.d.b(o8i0.d(zwa0Var), new ywa0(zwa0Var));
        zwa0Var.y1(xwa0.m.a);
        return Unit.a;
    }
}

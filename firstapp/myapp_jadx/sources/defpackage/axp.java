package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.balance.LNBalanceViewKt$LNBalanceView$1$1", f = "LNBalanceView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class axp extends tje0 implements gaj<v5b, ccr, v1b<? super Unit>, Object> {
    public /* synthetic */ ccr a;
    public final /* synthetic */ f8u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axp(f8u f8uVar, v1b<? super axp> v1bVar) {
        super(3, v1bVar);
        this.b = f8uVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, ccr ccrVar, v1b<? super Unit> v1bVar) {
        axp axpVar = new axp(this.b, v1bVar);
        axpVar.a = ccrVar;
        return axpVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ccr ccrVar = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.x1(ccrVar.a);
        return Unit.a;
    }
}

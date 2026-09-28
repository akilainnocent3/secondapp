package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.SportyLegendsSettlementViewModel$2", f = "SportyLegendsSettlementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bmc0 extends tje0 implements gaj<slc0, vlc0, v1b<? super zlc0>, Object> {
    public /* synthetic */ slc0 a;
    public /* synthetic */ vlc0 b;
    public final /* synthetic */ vu60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmc0(vu60 vu60Var, v1b<? super bmc0> v1bVar) {
        super(3, v1bVar);
        this.c = vu60Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(slc0 slc0Var, vlc0 vlc0Var, v1b<? super zlc0> v1bVar) {
        bmc0 bmc0Var = new bmc0(this.c, v1bVar);
        bmc0Var.a = slc0Var;
        bmc0Var.b = vlc0Var;
        return bmc0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        slc0 slc0Var = this.a;
        vlc0 vlc0Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.c.e(vlc0Var, "key_settlement_stage");
        return new zlc0(vlc0Var, slc0Var);
    }
}

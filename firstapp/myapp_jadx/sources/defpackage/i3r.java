package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$special$$inlined$flatMapLatest$2", f = "LNPlaceBetViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class i3r extends tje0 implements gaj<myh<? super xsq.a>, bxg0<? extends qxp, ? extends tsq, ? extends ssq>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f2r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3r(v1b v1bVar, f2r f2rVar) {
        super(3, v1bVar);
        this.d = f2rVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super xsq.a> myhVar, bxg0<? extends qxp, ? extends tsq, ? extends ssq> bxg0Var, v1b<? super Unit> v1bVar) {
        i3r i3rVar = new i3r(v1bVar, this.d);
        i3rVar.b = myhVar;
        i3rVar.c = bxg0Var;
        return i3rVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            bxg0 bxg0Var = (bxg0) this.c;
            qxp qxpVar = (qxp) bxg0Var.a;
            tsq tsqVar = (tsq) bxg0Var.b;
            ssq ssqVar = (ssq) bxg0Var.c;
            if (ssqVar != null) {
                f2r f2rVar = this.d;
                xsq xsqVar = f2rVar.z.get(ssqVar.d);
                gzhVar = xsqVar != null ? xsqVar.a(tsqVar, qxpVar, ssqVar, f2rVar.a0) : null;
                if (gzhVar == null) {
                    gzhVar = new gzh(null);
                }
            } else {
                gzhVar = new gzh(null);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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

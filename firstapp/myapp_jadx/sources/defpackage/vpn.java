package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballBetslipRecommendationAnTestHelper$init$lambda$0$$inlined$flatMapLatest$1", f = "InstantFootballBetslipRecommendationAnTestHelper.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class vpn extends tje0 implements gaj<myh<? super etm>, lk50<? extends etm>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super etm> myhVar, lk50<? extends etm> lk50Var, v1b<? super Unit> v1bVar) {
        vpn vpnVar = new vpn(3, v1bVar);
        vpnVar.b = myhVar;
        vpnVar.c = lk50Var;
        return vpnVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lk50 lk50Var = (lk50) this.c;
            if (lk50Var instanceof lk50.c) {
                gzhVar = new gzh(((lk50.c) lk50Var).a);
            } else if (lk50Var instanceof lk50.a) {
                gzhVar = new gzh(etm.CONTROL);
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                gzhVar = i2g.a;
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

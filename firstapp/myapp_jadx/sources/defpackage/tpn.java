package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballBetslipRecommendationAnTestHelper$init$$inlined$flatMapLatest$1", f = "InstantFootballBetslipRecommendationAnTestHelper.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class tpn extends tje0 implements gaj<myh<? super etm>, AccountInfo, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ypn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpn(v1b v1bVar, ypn ypnVar) {
        super(3, v1bVar);
        this.d = ypnVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super etm> myhVar, AccountInfo accountInfo, v1b<? super Unit> v1bVar) {
        tpn tpnVar = new tpn(v1bVar, this.d);
        tpnVar.b = myhVar;
        tpnVar.c = accountInfo;
        return tpnVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh gzhVar = ((AccountInfo) this.c) == null ? new gzh(etm.CONTROL) : r0i.f(this.d.a.j(z76.t), new vpn(3, null));
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

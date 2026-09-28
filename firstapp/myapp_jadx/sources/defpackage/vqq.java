package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$special$$inlined$requiredResource$4", f = "LNLobbyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class vqq extends tje0 implements gaj<myh<? super mmq>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ spq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqq(v1b v1bVar, spq spqVar) {
        super(3, v1bVar);
        this.d = spqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mmq> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        vqq vqqVar = new vqq(v1bVar, this.d);
        vqqVar.b = myhVar;
        vqqVar.c = bool;
        return vqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((Boolean) this.c).booleanValue()) {
                spq spqVar = this.d;
                gzhVar = new n1i(spqVar.F, spqVar.M, new tpq(3, null));
            } else {
                gzhVar = new gzh(mmq.d.a);
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

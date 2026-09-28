package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$favoritePage$lambda$0$$inlined$requiredResource$2", f = "LNLobbyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class vpq extends tje0 implements gaj<myh<? super mmq>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b8k d;
    public final /* synthetic */ nnb e;
    public final /* synthetic */ spq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpq(v1b v1bVar, nnb nnbVar, b8k b8kVar, spq spqVar) {
        super(3, v1bVar);
        this.d = b8kVar;
        this.e = nnbVar;
        this.f = spqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mmq> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        vpq vpqVar = new vpq(v1bVar, this.e, this.d, this.f);
        vpqVar.b = myhVar;
        vpqVar.c = bool;
        return vpqVar.invokeSuspend(Unit.a);
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
                l1i l1iVarA = this.d.a();
                nnb nnbVar = this.e;
                gzhVar = new n1i(l1iVarA, new fcq(r0i.f(((mgb0) nnbVar.b).isLoginFlow(), new ecq(null, nnbVar))), new upq(null, this.f));
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

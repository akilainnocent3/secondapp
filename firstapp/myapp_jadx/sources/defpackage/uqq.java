package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$special$$inlined$requiredResource$2", f = "LNLobbyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class uqq extends tje0 implements gaj<myh<? super mmq>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ spq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqq(v1b v1bVar, spq spqVar) {
        super(3, v1bVar);
        this.d = spqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mmq> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        uqq uqqVar = new uqq(v1bVar, this.d);
        uqqVar.b = myhVar;
        uqqVar.c = bool;
        return uqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh cqqVar = ((Boolean) this.c).booleanValue() ? new cqq(this.d.F) : new gzh(mmq.d.a);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, cqqVar, this) == y5bVar) {
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

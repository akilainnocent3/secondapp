package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$special$$inlined$flatMapLatest$3", f = "LNLobbyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class oqq extends tje0 implements gaj<myh<? super gsq>, lk50<? extends kmq>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ spq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqq(v1b v1bVar, spq spqVar) {
        super(3, v1bVar);
        this.d = spqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super gsq> myhVar, lk50<? extends kmq> lk50Var, v1b<? super Unit> v1bVar) {
        oqq oqqVar = new oqq(v1bVar, this.d);
        oqqVar.b = myhVar;
        oqqVar.c = lk50Var;
        return oqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh lyhVarA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lk50 lk50Var = (lk50) this.c;
            if (lk50Var instanceof lk50.a) {
                lyhVarA = new gzh(gsq.a.a);
            } else if (Intrinsics.g(lk50Var, lk50.b.a)) {
                lyhVarA = new gzh(gsq.b.a);
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                spq spqVar = this.d;
                lyhVarA = r1i.a(spqVar.L, spqVar.K, spqVar.O, new bqq(4, null));
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarA, this) == y5bVar) {
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

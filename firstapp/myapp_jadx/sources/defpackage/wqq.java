package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$state$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wqq extends tje0 implements jaj<hpq, lk50<? extends kmq>, y5q, Boolean, v1b<? super epq>, Object> {
    public /* synthetic */ hpq a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ y5q c;
    public /* synthetic */ boolean d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hpq hpqVar = this.a;
        lk50 lk50Var = this.b;
        y5q y5qVar = this.c;
        boolean z = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new epq(hpqVar, y5qVar, bm50.i(lk50Var) != null, z);
    }

    @Override // defpackage.jaj
    public final Object l(hpq hpqVar, lk50<? extends kmq> lk50Var, y5q y5qVar, Boolean bool, v1b<? super epq> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        wqq wqqVar = new wqq(5, v1bVar);
        wqqVar.a = hpqVar;
        wqqVar.b = lk50Var;
        wqqVar.c = y5qVar;
        wqqVar.d = zBooleanValue;
        return wqqVar.invokeSuspend(Unit.a);
    }
}

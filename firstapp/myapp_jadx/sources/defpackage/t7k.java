package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.GetLobbyDataUseCase$invoke$1", f = "GetLobbyDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t7k extends tje0 implements gaj<Unit, kmq, v1b<? super kmq>, Object> {
    public /* synthetic */ kmq a;

    @Override // defpackage.gaj
    public final Object invoke(Unit unit, kmq kmqVar, v1b<? super kmq> v1bVar) {
        t7k t7kVar = new t7k(3, v1bVar);
        t7kVar.a = kmqVar;
        return t7kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return kmqVar;
    }
}

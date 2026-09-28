package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$showRewardCenter$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lqq extends tje0 implements gaj<Boolean, kmq, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ kmq b;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, kmq kmqVar, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        lqq lqqVar = new lqq(3, v1bVar);
        lqqVar.a = zBooleanValue;
        lqqVar.b = kmqVar;
        return lqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        kmq kmqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(z && kmqVar.c);
    }
}

package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.virtuallobby.handler.VirtualLobbyGetStartedStatusHandlerImpl$init$1", f = "VirtualLobbyGetStartedStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nji0 extends tje0 implements gaj<uji0, Boolean, v1b<? super uji0>, Object> {
    public /* synthetic */ uji0 a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(uji0 uji0Var, Boolean bool, v1b<? super uji0> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        nji0 nji0Var = new nji0(3, v1bVar);
        nji0Var.a = uji0Var;
        nji0Var.b = zBooleanValue;
        return nji0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uji0 uji0Var = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z) {
            return uji0Var;
        }
        return null;
    }
}

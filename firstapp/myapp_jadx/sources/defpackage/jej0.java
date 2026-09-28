package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initTrackingEventCollector$2", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jej0 extends tje0 implements gaj<v1f, yfj0, v1b<? super String>, Object> {
    public /* synthetic */ v1f a;

    @Override // defpackage.gaj
    public final Object invoke(v1f v1fVar, yfj0 yfj0Var, v1b<? super String> v1bVar) {
        jej0 jej0Var = new jej0(3, v1bVar);
        jej0Var.a = v1fVar;
        return jej0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v1f v1fVar = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (v1fVar != null) {
            return "sr:sport:3";
        }
        return null;
    }
}

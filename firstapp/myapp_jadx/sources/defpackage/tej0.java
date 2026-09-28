package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$1", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tej0 extends tje0 implements gaj<v1f, Boolean, v1b<? super vbj0>, Object> {
    public /* synthetic */ v1f a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(v1f v1fVar, Boolean bool, v1b<? super vbj0> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        tej0 tej0Var = new tej0(3, v1bVar);
        tej0Var.a = v1fVar;
        tej0Var.b = zBooleanValue;
        return tej0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v1f v1fVar = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (v1fVar.c.compareTo(BigDecimal.ZERO) <= 0) {
            return vbj0.b.a;
        }
        return (v1fVar.f == null || z) ? new vbj0.c(v1fVar.c) : vbj0.a.a;
    }
}

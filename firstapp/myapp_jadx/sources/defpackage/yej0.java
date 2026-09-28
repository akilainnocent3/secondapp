package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$7", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yej0 extends tje0 implements Function2<rcj0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ afj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yej0(v1b v1bVar, afj0 afj0Var) {
        super(2, v1bVar);
        this.b = afj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yej0 yej0Var = new yej0(v1bVar, this.b);
        yej0Var.a = obj;
        return yej0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rcj0 rcj0Var, v1b<? super Unit> v1bVar) {
        return ((yej0) create(rcj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        rcj0 rcj0Var = (rcj0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.i;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, rcj0Var));
        return Unit.a;
    }
}

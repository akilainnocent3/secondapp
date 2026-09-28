package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$5", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xej0 extends tje0 implements Function2<yfj0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ afj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xej0(v1b v1bVar, afj0 afj0Var) {
        super(2, v1bVar);
        this.b = afj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xej0 xej0Var = new xej0(v1bVar, this.b);
        xej0Var.a = obj;
        return xej0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yfj0 yfj0Var, v1b<? super Unit> v1bVar) {
        return ((xej0) create(yfj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        yfj0 yfj0Var = (yfj0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        afj0 afj0Var = this.b;
        wwd0 wwd0Var = afj0Var.n;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, yfj0Var));
        wwd0 wwd0Var2 = afj0Var.j;
        do {
            value2 = wwd0Var2.getValue();
            ((Boolean) value2).getClass();
        } while (!wwd0Var2.g(value2, Boolean.valueOf(yfj0Var instanceof yfj0.a)));
        return Unit.a;
    }
}

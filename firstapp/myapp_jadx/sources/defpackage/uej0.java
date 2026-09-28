package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$2", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uej0 extends tje0 implements Function2<vbj0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ afj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uej0(v1b v1bVar, afj0 afj0Var) {
        super(2, v1bVar);
        this.b = afj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uej0 uej0Var = new uej0(v1bVar, this.b);
        uej0Var.a = obj;
        return uej0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vbj0 vbj0Var, v1b<? super Unit> v1bVar) {
        return ((uej0) create(vbj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        vbj0 vbj0Var = (vbj0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.m;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, vbj0Var));
        return Unit.a;
    }
}

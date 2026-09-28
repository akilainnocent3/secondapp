package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingStakeInputHandlerImpl$init$3", f = "WinningPopupDoubleOrNothingStakeInputHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hdj0 extends tje0 implements Function2<kdj0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ idj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdj0(idj0 idj0Var, v1b<? super hdj0> v1bVar) {
        super(2, v1bVar);
        this.b = idj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hdj0 hdj0Var = new hdj0(this.b, v1bVar);
        hdj0Var.a = obj;
        return hdj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kdj0 kdj0Var, v1b<? super Unit> v1bVar) {
        return ((hdj0) create(kdj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        kdj0 kdj0Var = (kdj0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, kdj0Var));
        return Unit.a;
    }
}

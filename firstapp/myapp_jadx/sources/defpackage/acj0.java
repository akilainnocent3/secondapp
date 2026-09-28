package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingActionRequestHandlerImpl$init$3", f = "WinningPopupDoubleOrNothingActionRequestHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class acj0 extends tje0 implements Function2<dcj0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ccj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acj0(ccj0 ccj0Var, v1b<? super acj0> v1bVar) {
        super(2, v1bVar);
        this.b = ccj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        acj0 acj0Var = new acj0(this.b, v1bVar);
        acj0Var.a = obj;
        return acj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(dcj0 dcj0Var, v1b<? super Unit> v1bVar) {
        return ((acj0) create(dcj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        dcj0 dcj0Var = (dcj0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, dcj0Var));
        return Unit.a;
    }
}

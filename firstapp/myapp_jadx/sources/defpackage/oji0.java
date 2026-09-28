package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.virtuallobby.handler.VirtualLobbyGetStartedStatusHandlerImpl$init$2", f = "VirtualLobbyGetStartedStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class oji0 extends tje0 implements Function2<uji0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ rji0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oji0(rji0 rji0Var, v1b<? super oji0> v1bVar) {
        super(2, v1bVar);
        this.b = rji0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oji0 oji0Var = new oji0(this.b, v1bVar);
        oji0Var.a = obj;
        return oji0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(uji0 uji0Var, v1b<? super Unit> v1bVar) {
        return ((oji0) create(uji0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        uji0 uji0Var = (uji0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, uji0Var));
        return Unit.a;
    }
}

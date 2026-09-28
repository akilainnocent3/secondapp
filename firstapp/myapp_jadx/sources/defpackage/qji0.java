package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.virtuallobby.handler.VirtualLobbyGetStartedStatusHandlerImpl$init$getStartedUiStateFlow$2", f = "VirtualLobbyGetStartedStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qji0 extends tje0 implements Function2<uji0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ rji0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qji0(rji0 rji0Var, v1b<? super qji0> v1bVar) {
        super(2, v1bVar);
        this.b = rji0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qji0 qji0Var = new qji0(this.b, v1bVar);
        qji0Var.a = obj;
        return qji0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(uji0 uji0Var, v1b<? super Unit> v1bVar) {
        return ((qji0) create(uji0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        uji0 uji0Var = (uji0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(uji0Var != null)));
        return Unit.a;
    }
}

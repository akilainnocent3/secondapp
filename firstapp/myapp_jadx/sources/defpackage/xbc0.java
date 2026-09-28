package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsConfirmDialogHandlerImpl$init$2", f = "SportyLegendsConfirmDialogHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xbc0 extends tje0 implements Function2<ysa, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ybc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbc0(ybc0 ybc0Var, v1b<? super xbc0> v1bVar) {
        super(2, v1bVar);
        this.b = ybc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xbc0 xbc0Var = new xbc0(this.b, v1bVar);
        xbc0Var.a = obj;
        return xbc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ysa ysaVar, v1b<? super Unit> v1bVar) {
        return ((xbc0) create(ysaVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ysa ysaVar = (ysa) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ysaVar));
        return Unit.a;
    }
}

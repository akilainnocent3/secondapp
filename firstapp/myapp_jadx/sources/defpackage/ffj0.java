package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupMyEventsHandlerImpl$init$2", f = "WinningPopupMyEventsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ffj0 extends tje0 implements Function2<mfj0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ v7k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffj0(v7k v7kVar, v1b<? super ffj0> v1bVar) {
        super(2, v1bVar);
        this.b = v7kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ffj0 ffj0Var = new ffj0(this.b, v1bVar);
        ffj0Var.a = obj;
        return ffj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mfj0 mfj0Var, v1b<? super Unit> v1bVar) {
        return ((ffj0) create(mfj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        mfj0 mfj0Var = (mfj0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = (wwd0) this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, mfj0Var));
        return Unit.a;
    }
}

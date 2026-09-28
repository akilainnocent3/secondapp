package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.speedcontroller.SpeedControllerHandlerImpl$initSpeedControllerHandler$2", f = "SpeedControllerHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fta0 extends tje0 implements Function2<tta0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ kta0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fta0(kta0 kta0Var, v1b<? super fta0> v1bVar) {
        super(2, v1bVar);
        this.b = kta0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fta0 fta0Var = new fta0(this.b, v1bVar);
        fta0Var.a = obj;
        return fta0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tta0 tta0Var, v1b<? super Unit> v1bVar) {
        return ((fta0) create(tta0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        tta0 tta0Var = (tta0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.h;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, tta0Var));
        return Unit.a;
    }
}

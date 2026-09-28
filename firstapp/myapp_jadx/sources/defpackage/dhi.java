package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.speedcontroller.FootballFamilySpeedControllerHandlerImpl$initFootballFamilySpeedControllerHandler$6", f = "FootballFamilySpeedControllerHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dhi extends tje0 implements Function2<tta0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ihi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhi(ihi ihiVar, v1b<? super dhi> v1bVar) {
        super(2, v1bVar);
        this.b = ihiVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dhi dhiVar = new dhi(this.b, v1bVar);
        dhiVar.a = obj;
        return dhiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tta0 tta0Var, v1b<? super Unit> v1bVar) {
        return ((dhi) create(tta0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        tta0 tta0Var = (tta0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, tta0Var));
        return Unit.a;
    }
}
